import java.util.Scanner;

public class Maincalculator {

	public static void main(String[] args) {
		
	    double totalmarks =0;
		int marks = 0;		
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=6;i++) {
		System.out.println("Enter a name of Subjects:" +i);
		String number=sc.next();
		
		for(int j=i;j<=i;j++) {	
			
		System.out.println("Enter a marks obtain in subject "  + (number) +  " (out of 100)");
		 marks=sc.nextInt();
		totalmarks= CalculateTotal.totalmarks(totalmarks, marks);
	     }
     }
		System.out.println(" total "+totalmarks);
		double percentage ;
		
		percentage=CalculateTotal.percentage(totalmarks);
		System.out.printf("Aaverage Percentage: "+percentage);
		
		Object grade = CalculateTotal.garde(percentage);
		System.out.printf("\nGarde: "+grade);	
			
		}	
}
	
