package check_staticdatatmember;

public class WaysToCheckStaticDatamember {
	int x=10;
	static int y=20;
	
	public void show() {
		System.out.println(x);
		
	}
   static public void display() {
	System .out.println(WaysToCheckStaticDatamember.y);
		
	}
	public static void main (String []args) {
		WaysToCheckStaticDatamember ob = new WaysToCheckStaticDatamember();
		ob.show();
	
		
		
		
	}

}
