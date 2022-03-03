import java.util.Scanner;


public class Cricket{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the team name:\r");
        String tname = sc.nextLine();
        System.out.println("Enter session:\r");
        String sess=sc.nextLine();
        System.out.println("Enter runs:\r");
        int run=sc.nextInt();
	String scon=sess.toUpperCase();
        if(scon.equals("FIRST"))
        {
            ++run;
            System.out.println("Name:" + tname);
            System.out.println("Scored:" + sess);
            System.out.println("Need " + run + " to win");
        }
       else if(scon.equals("SECOND")){
           System.out.println("Name:" + tname);
           System.out.println("Scored:" + run);
           System.out.println("Matched Ended.");
       }
       else{
        System.out.println("Invalid Input.");
       }
       sc.close();
    }

}
