package ProjectBase;

public class BaseClass {
	
	public static boolean testEmail(String email)
	{
		boolean retval = email.contains("@");
		return false;
	}
	public static boolean testPassword(String input, String password)
	{
		boolean retval = input.equals(password);
		return false;
	}

}
