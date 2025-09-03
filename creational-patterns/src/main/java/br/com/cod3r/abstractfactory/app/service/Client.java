package br.com.cod3r.abstractfactory.app.service;

import br.com.cod3r.abstractfactory.app.service.factory.RestAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.factory.ServicesAbstractFactory;
import br.com.cod3r.abstractfactory.app.service.services.CarService;
import br.com.cod3r.abstractfactory.app.service.services.UserService;

public class Client {

	public static void main(String[] args) {
		ServicesAbstractFactory factory = new RestAbstractFactory();

		UserService userService = factory.getUserService();

		userService.save("Joao");
		userService.delete(1);

		CarService carService = factory.getCarService();

		carService.save("Carro");
		carService.update("Carro3");

	}
}
