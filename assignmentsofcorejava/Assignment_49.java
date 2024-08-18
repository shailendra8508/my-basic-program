package assignmentsofcorejava;
abstract class Login{
	abstract void loginByMobile();
}
public class Assignment_49 extends Login {

	void loginByMobile() {
	System.out.println("login by mobile");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment_49 ob= new Assignment_49();
		ob.loginByMobile();
	}
	

}
