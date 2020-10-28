import java.util.*;

public class Checkingemail {

	public static void main(String[] args) 
	{
       String str;
       Scanner s=new Scanner(System.in);
       str=s.nextLine();
       if(str.matches("\\w*@gmail.*"))
       {
       String name,email;
       name=str.substring(0, str.indexOf("@"));
       email=str.substring(str.indexOf("@")+1);
       System.out.println(name);
       System.out.println(email);
	}
       else
       System.out.println("Sorry invalid emailid");
	}

}
