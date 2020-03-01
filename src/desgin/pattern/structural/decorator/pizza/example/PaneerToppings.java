package desgin.pattern.structural.decorator.pizza.example;

public class PaneerToppings extends ToppingsDecorator {

	public PaneerToppings(Pizza pizza) throws Exception {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc() + ", Paneer ";
	}
	@Override
	public int getCost() {
		return 70 + super.getCost();
	}
}
