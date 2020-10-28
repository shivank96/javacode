
class RegularExpression 
{

	public static void main(String[] args)
 {
		        String str;
        //checking whether a number is binary or not using regular expressions
//        int a=1031011;
//        str=String.valueOf(a);
//        if(str.matches("[01]+"))
//        {
//        	System.out.println("binary");
//        }
//        else
//        	System.out.println("Not binary");
        //checking whether a number is hexadecimal or not using regular expressions
//        String a="A29Bz";
//        str=String.valueOf(a);
//      if(str.matches("[0-9A-Fa-f]+"))
//      {
//      	System.out.println("hexadecimal");
//      }
//      else
//      	System.out.println("Not hexadecimal");
     //checking whether a input is date or not using regular expressions  ex-:(01//11//2019)
        str="31/12/1999";
        if(str.matches("[0][1-9]|[12][0-9]|[3][01]/[01][0-2]/[0-9]{4}"))
        		{
        	      System.out.println("It is a valid date");
        		}
        else
        System.out.println("It is not a valid date");
	}

}
