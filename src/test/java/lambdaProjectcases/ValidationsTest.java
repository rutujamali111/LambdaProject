package lambdaProjectcases;

import java.util.regex.Pattern;

public class ValidationsTest {
	public static void main(String[] args) {
		
	
	Validation FirstName=name->{
		return Pattern.matches("^[A-Z][A-Za-z]{2,}",name);
	};
	System.out.println(FirstName.isValid("Rutuja"));
	
	Validation LasttName=name->{
		return Pattern.matches("^[A-Z][A-Za-z]{2,}",name);
	};
	System.out.println(LasttName.isValid("Mali"));
	
	Validation Email=name->{
		return Pattern.matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+(?:\\.[a-zA-Z0-9_!#$%&'*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",name);
	};
	System.out.println(Email.isValid("abc@gmail.com"));
	

	Validation Mobile=name->{
		return Pattern.matches("^[0-9]{2}\\s{1}[0-9]{10}$",name);
	};
	System.out.println( Mobile.isValid("91 9309813565"));
	
	
	Validation Password=name->{
		return Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[#?!@$%^&*-])[0-9a-zA-Z#?!@$%^&*-]{8,}$",name);
	};	
	System.out.println(Password.isValid("Admin@1234"));
	}
}
