package inheritance;
interface b{
	void URL();
}

class a
{
	void URL() {
		System.out.println("www.google.com");
	}
}
public class Multilevel_inheritance_by_interfaceClass extends a implements b
{
public void URL() {
	System.out.println("Amazzon.com");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Multilevel_inheritance_by_interfaceClass ob = new Multilevel_inheritance_by_interfaceClass();
		ob.URL();
	}
	

}
