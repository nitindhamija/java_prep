package desgin.pattern.structural.decorator.pizza.example;

public class BarbequeToppings extends ToppingsDecorator {

	public BarbequeToppings(Pizza pizza) throws Exception {
		super(pizza);
	}
	
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc() + ", Barbeque ";
	}
	@Override
	public int getCost() {
		return 90 + super.getCost();
	}

}
