package exception;

public class AgeException extends Exception {

private String message=null;

	public AgeException() {
		message="Not Applicable";
	}
	public AgeException(String message) {
		this.message=message;
	}
	public void showError() {
		System.out.println(this.message);
	}

}
