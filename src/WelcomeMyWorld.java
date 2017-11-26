
public class WelcomeMyWorld {
	
	public static void   add(int x , int y) {
		
		int z;
		z=x+y;
		System.out.println("add value---->" + z);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=7;
		//char obj;
		System.out.println("welcome to WelcomeMyWorld ");
		WelcomeMyWorld obj=new WelcomeMyWorld();
		obj.add(a,b);
		
	}

}
