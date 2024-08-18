package encapsulation_program;

class Google_Auth{
	private int otp=18; // This default age;

	public int getOtp() {
		return otp;
	}

	public void setOtp(int otp) {
		this.otp = otp;
	}
	private String un="contactgrotechminds@.com";
	public String getun() {
		return un;
	}
	public void setun(String un) {
		this.un=un;
	}
}

public class GrotechMinds_Encap // Auther:surya means surya has written
{

	public static void main(String[] args) {
		Google_Auth ob=new Google_Auth();
		ob.setOtp(8670);
		System.out.println(ob.getOtp());
		ob.setun("shailendra@123.com");
		System.out.println(ob.getun());

	}

}
