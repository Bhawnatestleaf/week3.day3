package week3.day3;

public class JavaConnection1 extends MySqlConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JavaConnection1 object= new JavaConnection1();
		object.connect();
		object.disconnect();
		object.executeupdate();
		

	}

}
