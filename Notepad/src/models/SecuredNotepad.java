package models;

import java.util.Scanner;

import contracts.ISecuredNotepad;

public class SecuredNotepad extends SimpleNotepad implements ISecuredNotepad{
	
	private String password;
	
	public SecuredNotepad(String password) {
		super();
		if(this.isStrongPassword(password)){			
			this.password = password;
		}else{
			throw new IllegalArgumentException("The password is not strong !!!");
		}
		
	}

	@Override
	public void addTextToPage(String text, int pageNumber) {
		if(this.passWordValidation()){
			super.addTextToPage(text, pageNumber);
		}		
	}

	@Override
	public void clearPageAndAddText(String text, int pageNumber) {
		if(this.passWordValidation()){
			super.clearPageAndAddText(text, pageNumber);
		}		
	}

	@Override
	public void clearPage(int pageNumber) {
		if(this.passWordValidation()){
			super.clearPage(pageNumber);
		}		
	}

	@Override
	public void previewNotepad() {
		if(this.passWordValidation()){
			super.previewNotepad();
		}		
	}
	
	private boolean passWordValidation(){
		String pass = this.getPassword();
		return pass.equals(this.password);
	}
	
	private String getPassword(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the password");
		String pass = sc.nextLine();
		return pass;		
	}
	
	private boolean isStrongPassword(String password){
		//simple regex for password validation
		return password.matches("^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{5,10}$");	
		
	}
}
