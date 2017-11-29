package com.itsol.hibernate;

import java.util.List;
import java.util.Iterator;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.itsol.entity.Car;

import org.hibernate.SessionFactory;

public class App {

	private static SessionFactory factory;

	public static void main(String[] args) {
		try {
			factory = new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("Failed to create sessionFactory object." + ex);
			throw new ExceptionInInitializerError(ex);
		}
		App app = new App();
		app.listCar();
	}

	public void listCar() {
		Session session = factory.openSession();
		Transaction tx = null;

		try {
			tx = session.beginTransaction();
			List cars = session.createQuery("FROM Car").list();
			for (Iterator iterator = cars.iterator(); iterator.hasNext();) {
				Car car = (Car) iterator.next();
				System.out.print("Id: " + car.getId());
				System.out.print("  Type: " + car.getType());
				System.out.println("  NumberPlate: " + car.getNumberPlate());
			}
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
}
