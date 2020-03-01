package desgin.pattern.structural.decorator.pizza.example;

public class FarmHouse extends Pizza  {
	public FarmHouse() {
		desc = "FarmHouse";
	}

	public int getCost() {
		return 200;
	}
}
