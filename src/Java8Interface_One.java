
public interface Java8Interface_One {
	
	default void newMethod(){  
        System.out.println("Newly added default method");  
    } 
	
	static void addingStaticMethod() {
		
		System.out.println("Static method is added");
	}
	void existingMethod(String str);
}
