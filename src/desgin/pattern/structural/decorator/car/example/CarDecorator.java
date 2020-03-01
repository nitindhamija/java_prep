package desgin.pattern.structural.decorator.car.example;
/* this is main decorator class where magic happens here you create a simple class which implements the functionality interface and use composition to delegate the call to interface's concrete implementations*/
public class CarDecorator implements Car {
	Car car;
	public CarDecorator(Car car) {
		this.car=car;
	}
	@Override
	public void assemble() {
		this.car.assemble();

	}

}
