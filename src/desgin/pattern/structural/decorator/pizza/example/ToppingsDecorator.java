package desgin.pattern.structural.decorator.pizza.example;

/*this is toppings decorator class this has both is-a and has-a pizza relation to Pizza 
 * */
public class ToppingsDecorator extends Pizza{

	Pizza pizza;
	public ToppingsDecorator(Pizza pizza) throws Exception{
		if(pizza==null)
			throw new Exception("a pizza must be selected for a topping to be added");
		this.pizza=pizza;
	}
	@Override
	public int getCost() {
		return pizza.getCost();
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc();
	}
	

}
