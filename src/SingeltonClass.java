class Singleton
{
    
    private static Singleton single_instance = null;
  
    
    public String s;
  
   
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
  
    
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();
  
        return single_instance;
    }
}


	
	
	


public class SingeltonClass {
	
	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
	}

}
