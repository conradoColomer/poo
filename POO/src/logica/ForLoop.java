package logica;

public class ForLoop {

	public static void main(String[] args) {
		 int [] grades = {10,10,7};
		 int sum = 0; 
		 int avg = 0; 
		 
		 for (int grade : grades) {
			 System.out.println("current grade is: " + grade);
			 sum = sum + grade; 
			 avg = sum/grades.length; 
 
		 }
		 
		 System.out.println("The actual grade is:" + avg);

	}

}
