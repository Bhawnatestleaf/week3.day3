package week3.day3;

public class LoginPage extends BasePage {
	public void performCommonTasks() {

	System.out.println("To perform the task from Login page");
	}

	public static void main(String[] args) {
	LoginPage lp=new LoginPage();
	lp.performCommonTasks();
	lp.findElement();
	lp.clickElement();
	lp.enterText();
	

	}

}
