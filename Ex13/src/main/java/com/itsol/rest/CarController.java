package com.itsol.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.itsol.dao.GetData;
import com.itsol.entity.Car;

@RestController
public class CarController {

	@RequestMapping(value = "/cars", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public static List<Car> listCar() {
		List<Car> listCar = new ArrayList<Car>();
		try {
			listCar = GetData.getListCar();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCar;
	}

	@RequestMapping(value = "cars/not", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public static List<Car> listCarHavaNotInsurance() {
		List<Car> listCar = new ArrayList<Car>();
		try {
			listCar = GetData.getListCarHaveNotInsurance();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listCar;
	}

	@RequestMapping(value = "/car/search", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public static Car getCar(@RequestParam(value = "carId") String carId) throws SQLException {
		Car car = GetData.getCar(carId);
		return car;
	}
}
