package desgin.pattern.structural.decorator.pizza.example;

abstract public class Pizza {

	String desc="unknown";

	public String getDesc() {
		return desc;
	}
	
	abstract int getCost();


	
}
