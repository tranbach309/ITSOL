package com.itsol.ex10.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.itsol.ex10.database.GetData;
import com.itsol.ex10.entity.Car;
import com.itsol.ex10.entity.Insurance;

@Path("/CarService")
public class Get {

	@GET
	@Path("/cars")
	@Produces(MediaType.APPLICATION_JSON)
	public static List<Car> listCar() {
		List<Car> listCar = new ArrayList<>();
		try {
			listCar = GetData.getListCar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		// Car car = new Car("car1", null, null, 0, "brand", false, false, false, 10);
		return listCar;
	}

	@POST
	@Path("/car/id")
	@Produces(MediaType.APPLICATION_JSON)
	public Car getCar(@FormParam("carId") String carId) throws SQLException {
		
		/*Car car = new Car();
		Car c1 = new Car("car_1", "modern", "12345", 1999, "toyota", true, true, true, 10);
		Car c2 = new Car("car_2", "modern", "12345", 1999, "toyota", true, true, true, 10);
		List<Car> list = new ArrayList<Car>();
		list.add(c1);
		list.add(c2);
		for(Car c: list) {
			if(carId.equals(car.getId())) return c;
		}*/
		Car car = GetData.getCar(carId);
		return car;
	}
	
	@GET
	@Path("/insurances")
	@Produces(MediaType.APPLICATION_JSON)
	public static List<Insurance> lisInsurance() throws SQLException{
		List<Insurance> listInsurance = new ArrayList<>();
		listInsurance = GetData.getListInsurance();
		return listInsurance;
	}
	
	@GET
	@Path("cars/not")
	@Produces(MediaType.APPLICATION_JSON)
	public static List<Car> listInsurance() throws SQLException{
		List<Car> listCar = new ArrayList<>();
		listCar = GetData.getListCarHaveNotInsurance();
		return listCar;
	}
	
	@PUT
	@Path("/buyinsurance/{carid}")
	public static void buyInsurance(String carId) throws SQLException {
		GetData.buyInsurance(carId);

	}
}

	
	