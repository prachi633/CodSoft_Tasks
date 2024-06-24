
public class CalculateTotal {

	  
	public static double totalmarks(double totalmarks, int marks) {
	        totalmarks += marks;
	        return totalmarks;
	  }

	  public static double percentage(double totalmarks) {
		// TODO Auto-generated method stub
		return totalmarks/6;
	}
	  public static String garde(double percentage) {
		// TODO Auto-generated method stub
		if(percentage>=90) {
			return"A";
		}
		else if(percentage>=80)
		{
			return "B";
		}
		else if(percentage>=70)
		{
			return "C";
		}
		else if(percentage>=60)
		{
			return "D";
		}
		else if(percentage>=50)
		{
			return "E";
		}
		
		return "F";
	}

}
