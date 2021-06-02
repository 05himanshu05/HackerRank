
public class StaticBindingVsDynamicBinding {
	
	//javap -verbose ArrayRotation classfile C:\Workspace\HackerRank\bin\ArrayRotation.class
	
	public static class superclass {
        void print()
        {
            System.out.println("print in superclass.");
        }
    }
  
    public static class subclass extends superclass {
        @Override
        void print()
        {
        	super.print();
            System.out.println("print in subclass.");
        }
        
        void add(double d , double e) {
        	
        	double sum = d+e ;
        	
        	System.out.println("Value = " + sum );
        }
        
        void add(float a , float b) {
        	
        	float sum = a+b ;
        	System.out.println("Value = "  + sum );
        }
        
    }
    
	
	public static void main(String[] args) {
		
		{
	        superclass A = new superclass();
	        superclass B = new subclass();
	        subclass C = new subclass();
	        A.print();
	        B.print();
	        C.add(4.0, 5.0);
	    }
	}
}
