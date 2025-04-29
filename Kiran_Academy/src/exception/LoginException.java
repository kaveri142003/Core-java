package exception;

public class LoginException extends Exception{
	
	String message = null;
	
	public LoginException() {
		message="Not Applicable";
	}
	
	public LoginException(String message) {
		this.message=message;
	}
	public void showError() {
		System.out.println(this.message);
	}

}
