package ProjectBase;

public class BaseClass {

  public static void main (String args[])
  {
     System.out.println("Hello World from Gul");
     System.out.println("Hello World from Semih");
     System.out.println("Hello Tuncay");
	 //hello Tuncay 
//each person should modify this line with his/her name
  }

	public static boolean testEmail(String email)
	{
	 	return email.contains("@");
  }

	public static boolean testPassword(String input, String password)
	{
		return input.equals(password);
  }

  public static boolean CheckNumberOfFollowers(int numberOfFollowers)
  {
    return (2000>numberOfFollowers);
  }  
}
