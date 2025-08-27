package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {
	
	public static void main(String[] args) {
		System.out.println("### Ordering an iPhone X");
		IPhone iphone1 = IPhoneFactory.ordeIPhone("X","standard");
		System.out.println(iphone1);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iphone2 = IPhoneFactory.ordeIPhone("11","highEnd");
		System.out.println(iphone2);
	}
}
