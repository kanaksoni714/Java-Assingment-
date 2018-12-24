import java.util.Scanner;
public class Average {
	public static void main(String args[]){
		int i=1;  
	    while(i<=3)
	    {
		System.out.println("Enter Marks of Main Three Subject:");
		Scanner in = new Scanner(System.in);
	     
 		int subjectOne = in.nextInt();
 		int subjectTwo = in.nextInt();
 		int subjectThree = in.nextInt();
 		double average= (subjectOne+subjectTwo+subjectThree)/3;
 		System.out.println("AVERAGE OF SUBJECT:"+average+i);
 		i++;
	    }
 		
 		}
	
}