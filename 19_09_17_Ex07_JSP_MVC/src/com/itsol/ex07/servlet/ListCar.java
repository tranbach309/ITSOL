package com.itsol.ex07.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.itsol.ex07.database.GetData;
import com.itsol.ex07.database.OracleConn;
import com.itsol.ex07.entity.*;

@WebServlet(urlPatterns = { "/listCar" })
public class ListCar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListCar() {
		super();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException{

		Connection conn = OracleConn.getConnection();
		List<Car> listCar = null;
		try {
			listCar = GetData.getListCar(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listCar", listCar);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/views/listCar.jsp");
		dispatcher.forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	
	}

}
