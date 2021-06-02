
public class cgitest_one implements cgietest
{

	public static void main(String[] args) {
		
		cgitest_one cgi = new cgitest_one();
		
		cgi.A();
	}

	@Override
	public void A() {
		// TODO Auto-generated method stub
		
		System.out.println("In class cgitest_one A");
	}

	@Override
	public void B() {
		// TODO Auto-generated method stub
		System.out.println("In class cgitest_one B");
	}

	@Override
	public void C() {
		// TODO Auto-generated method stub
		System.out.println("In class cgitest_one C");
		
	}
}
