import java.util.*;
import java.lang.*;
import java.io.*;

public class Case  {
  public static String upperCaseFirst(String val) {
      char[] arr = val.toCharArray();
      arr[0] = Character.toUpperCase(arr[0]);
      return new String(arr);
   }
  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the first name:");
    	String firstname=sc.nextLine();
		System.out.println("Enter the second name:");
		String secondname=sc.nextLine();
        String output1 = upperCaseFirst(firstname);
		String output2 = secondname.toUpperCase();
		System.out.print(output1 + " " + output2);
    
    }  
}
