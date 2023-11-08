package week3.day3;

public class OverloadingMethod {
	
	//with 2 parameters
	public void reportStep(String msg,String status) {
		
		System.out.println(msg+" "+status);
		
	}
	
	public void reportStep(String msg,String status,boolean snap) {
		System.out.println(msg+" "+status+" "+snap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingMethod object= new OverloadingMethod();

		object.reportStep("Hi", "Alive");
		object.reportStep("Msg","Status", false);
		
		

	}

}
