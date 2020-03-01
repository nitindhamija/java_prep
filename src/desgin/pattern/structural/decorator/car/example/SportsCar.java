package desgin.pattern.structural.decorator.car.example;

public class SportsCar extends CarDecorator {

	public SportsCar(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void assemble() {
		super.assemble();
		System.out.print("Sports Car.");
	}

}
