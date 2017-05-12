package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000)
		};
		
		for(SmartPhone a : s){
			System.out.println(a.toString());
			a.turnOn();
			a.pay();
			a.useSpecialFunction(a);
			a.turnOff();
			System.out.println();
		}

	}

}
