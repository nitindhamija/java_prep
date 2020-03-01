package desgin.pattern.structural.decorator.car.example;
//Decorator pattern dynamically changes the functionality of an object at run-time without impacting the existing functionality of the objects.

public class DecoratorPattern {
	public static void main(String[] args) {
		Car sportsCar = new SportsCar(new BasicCar()); //this sports car having only basic and sports car feature
		sportsCar.assemble();
		System.out.println("\n*****");
		/*The Decorator Pattern is used for adding additional functionality to a particular object as opposed to a class of objects.here in below example without decorator pattern if i wanted to have
		a sports car with feature from both basic and luxury car then my sports car would have to be child of luxury using inheritance and that would mean for every sports car instance will have luxury 
		car feature as well however using this pattern applies to instance not class so one instance of sports car can have only sports car feature and other can have both luxry and sports car feature. */
		Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));  //this sports car having only basic,sports and luxury car feature
		/*The decorator pattern can be used to make it possible to extend (decorate) the functionality of a certain object at runtime.
The decorator pattern is an alternative to subclassing. Subclassing adds behavior at compile time, and the change affects all instances of the original class; decorating can provide new behavior at runtime for individual objects.
Decorator offers a pay-as-you-go approach to adding responsibilities. Instead of trying to support all foreseeable features in a complex, customizable class, you can define a simple class and add functionality incrementally with Decorator objects.*/
		sportsLuxuryCar.assemble();
	}
}
