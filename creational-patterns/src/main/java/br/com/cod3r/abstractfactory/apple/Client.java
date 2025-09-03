package br.com.cod3r.abstractfactory.apple;

import br.com.cod3r.abstractfactory.apple.factory.IPhone11Factory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneFactory;
import br.com.cod3r.abstractfactory.apple.factory.IPhoneXFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.BrazilianRulesAbsctractFactory;
import br.com.cod3r.abstractfactory.apple.factory.abstractFactory.CountryRulesAbstractFactory;
import br.com.cod3r.abstractfactory.apple.model.iphone.IPhone;

public class Client {
	
	public static void main(String[] args) {
		CountryRulesAbstractFactory rules = new BrazilianRulesAbsctractFactory();
		IPhoneFactory genXFactory = new IPhoneXFactory(rules);
		IPhoneFactory gen11Factory = new IPhone11Factory(rules);

		System.out.println("### Ordering an iPhone X");
		IPhone iphoneX = genXFactory.orderIPhone("standard");
		System.out.println(iphoneX);

		System.out.println("### Ordering an iPhone 11");
		IPhone iphone11 = gen11Factory.orderIPhone("standard");
		System.out.println(iphone11);

	}
}
