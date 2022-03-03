import java.util.*;

class Name{
 public static void main(String[] args){
     try (Scanner sc = new Scanner(System.in)) {
		String first=sc.nextLine();
		 String second=sc.nextLine();
		 String firstName=first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();
		 String lastName=second.toUpperCase();
		 System.out.println(firstName+" "+lastName);
	}
   }
 }