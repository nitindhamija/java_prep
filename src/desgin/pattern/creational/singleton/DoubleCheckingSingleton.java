package desgin.pattern.creational.singleton;

import java.io.Serializable;

public class DoubleCheckingSingleton implements Serializable,Cloneable {
	
	/**
	 * singleton is useful like in keeping db prop in memory  
	 */
	private static final long serialVersionUID = 1L; //this is useful in determining class compatibility while jvm load/unloads class during serialization/desialization
	private static DoubleCheckingSingleton SINGLE_INSTANCE = null;
    private DoubleCheckingSingleton() {}
    public static DoubleCheckingSingleton getInstance() {
        if (SINGLE_INSTANCE == null) {
            synchronized (DoubleCheckingSingleton.class) {
                if (SINGLE_INSTANCE == null) {
                    SINGLE_INSTANCE = new DoubleCheckingSingleton();
                }
            }
        }
        return SINGLE_INSTANCE;
    }
    /* to avoid object cloning */
    @Override protected Object clone() throws CloneNotSupportedException {
    return SINGLE_INSTANCE;
    }
    // to avoid diff object creation using serialization/deserialization
    protected Object readResolve() {
        return SINGLE_INSTANCE;
    }
    
    
}
