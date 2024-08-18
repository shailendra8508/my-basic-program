package array_programs;
interface Animal{
	abstract void dog();
}
abstract class City{
void delhi() {
	System.out.println("Kejriwal is cm of delhi");
}
}
public class Assignment111 extends City implements Animal {
	public void dog() {
		System.out.println("Dog is barking");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment111 ob= new Assignment111();
		ob.dog();
		ob.delhi();
	}

	
	

}
