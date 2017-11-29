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
import com.itsol.ex07.entity.Car;

/**
 * Servlet implementation class BuyInsurance
 */
@WebServlet("/buyInsurance")
public class BuyInsurance extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public BuyInsurance() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection conn = OracleConn.getConnection();
		String carId = (String)request.getParameter("carId");
		//String carId = "car#5";
		try {
			GetData.buyInsurance(conn, carId);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		List<Car> listCarHaveNotInsurance = null;
		try {
			listCarHaveNotInsurance = GetData.getListCarHaveNotInsurance(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		request.setAttribute("listCarHaveNotInsurance", listCarHaveNotInsurance);
		RequestDispatcher dispatcher = request.getServletContext()
				.getRequestDispatcher("/views/listCarHaveNotInsurance.jsp");
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
