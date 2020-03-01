package desgin.pattern.structural.decorator.pizza.example;

public class FreshTomatoToppings extends ToppingsDecorator {
	public FreshTomatoToppings(Pizza pizza) throws Exception {
		super(pizza);
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc() + ", FreshTomato ";
	}
	@Override
	public int getCost() {
		return 40 + super.getCost();
	}
}
