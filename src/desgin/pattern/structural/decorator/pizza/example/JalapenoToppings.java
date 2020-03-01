package desgin.pattern.structural.decorator.pizza.example;

public class JalapenoToppings extends ToppingsDecorator {

	public JalapenoToppings(Pizza pizza) throws Exception {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return super.getDesc() + ", Jalapeno ";
	}
	@Override
	public int getCost() {
		return 50 + super.getCost();
	}
}
