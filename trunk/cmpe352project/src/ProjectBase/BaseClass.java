package ProjectBase;

public class BaseClass {

  public static void main (String args[])
  {
     System.out.println("Hello World from Basak");
//each person should modify this line with his/her name
  }

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

  public static boolean CheckNumberOfFollowers(int numberOfFollowers)
  {
    return (2000>numberOfFollowers);
  }  
}
