package oops.overriding;

/**
 * 
 * overriding... parent class function create in child class with same signature
 * it's called overr....
 * 
 * signature : access modifiers return type name of function param function
 * 
 * 
 */

class App {

	public String message() {

		return "hello";
	}

}

class WhatsApp extends App {

	public String message() {

		return "whatsapp";
	}
}

public class OverridingDemo {

	public static void main(String[] args) {

	}
}
