package desgin.pattern.structural.decorator.pizza.example;

public class PizzaStore {
	public static void main(String args[]) throws Exception 
    { 
        // create new margherita pizza 
        Pizza pizza = new Margherita(); 
        System.out.println( pizza.getDesc() + 
                         " Cost :" + pizza.getCost()); 
  
        // create new FarmHouse pizza 
        Pizza pizza2 = new FarmHouse(); 
  
        // decorate it with freshtomato topping 
        pizza2 = new FreshTomatoToppings(pizza2); 
  
        //decorate it with paneer topping 
        pizza2 = new PaneerToppings(pizza2); 
  
        System.out.println( pizza2.getDesc() + 
                         " Cost :" + pizza2.getCost()); 
      //  Pizza pizza3 = new BarbequeToppings(null);    //no specific pizza throw expception 
       // System.out.println( pizza3.getDesc() + "  Cost :" + pizza3.getCost()); 
   } 
}
