package desgin.pattern.creational.singleton;

import java.lang.reflect.Constructor;

/*reflect can destroy doublechecking and bill pugh singletom impl to overcome this we use enum to create singleton*/
public class ReflectionDestroySingleton {
	 public static void main(String[] args) {
	        BillPughSingleton instanceOne = BillPughSingleton.getInstance();
	        BillPughSingleton instanceTwo = null;
	        try {
	            Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
	            for (Constructor constructor : constructors) {
	                //Below code will destroy the singleton pattern
	                constructor.setAccessible(true);
	                instanceTwo = (BillPughSingleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOne.hashCode());
	        System.out.println(instanceTwo.hashCode());
	        
	        
	        EnumSingleton instanceOneEnum = EnumSingleton.INSTANCE;
	        EnumSingleton instanceTwoEnum = null;
	        try {
	            Constructor[] constructors = EnumSingleton.class.getDeclaredConstructors();// it will throw errors as enum can't be created using reflection
	            for (Constructor constructor : constructors) {
	               
	                constructor.setAccessible(true);
	                instanceTwoEnum = (EnumSingleton) constructor.newInstance();
	                break;
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        System.out.println(instanceOneEnum.hashCode());
	        System.out.println(instanceTwoEnum.hashCode());
	    }
	 
	 public enum EnumSingleton {

		    INSTANCE;
		    
		    public static void doSomething(){
		        //do something
		    }
	 }
}
