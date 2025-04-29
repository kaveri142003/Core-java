package exception;

import java.util.Scanner;

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String userNamedemo = "aaaa" , passworddemo = "bbbb";
		
		try {
			
			System.out.print("Enter username : ");
			String userName = sc.nextLine();
			System.out.print("Enter password : ");
			String password = sc.nextLine();
			
			if(userName=="" || userName==null) {
				throw new LoginException("Enter username");
			}
			else if(password==""||password==null) {
				throw new LoginException("Enter password");
			}
			else if(userNamedemo.equals(userName)==false) {
				throw new LoginException("Enter correct username");
			}
			else if(passworddemo.equals(password)==false) {
				throw new LoginException("Enter correct password");
			}
			else if(userNamedemo.equals(userName)==true  &&  passworddemo.equals(password)==true) {
				throw new LoginException("Login successfull!!");
			}
			
		}catch(LoginException e) {
			e.showError();
		}
	}

}
