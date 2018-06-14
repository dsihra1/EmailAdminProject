package emailApp;
//https://www.youtube.com/watch?v=U3Ibvu0htNs
public class EmailApp {

	public static void main(String[] args) {
		Email em1 = new Email("John", "Walker");
		
		//em1.setAlternateEmail("jwalker@gmail.com");
		//System.out.println(em1.getAltEmail());
		
		System.out.println(em1.showInfo());
	}

}
