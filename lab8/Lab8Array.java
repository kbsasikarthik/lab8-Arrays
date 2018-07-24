
// @ Sasikaladevi Kumarasamy
// program that will recognize invalid inputs when the user requests information about students in a class
// used parallel arrays to hold the student data
// incorporated methods from the Validator class to validate user inputs
package lab8;

import java.util.Scanner;

public class Lab8Array {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		String studentInfo="";
		boolean choice = false;
		System.out.println("Welcome to our Java class!\n");
		int[] studentNumbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		String[] nameOfStudents = {"Amna","Andrew","Anesha","Arif","Brian","Cameron","David","Darby","Edward","Jasmine","JoRanda","Kari","Kris","Lauren","Louis","Sharde","Shontinique","Stan","Tim","Virginia"};
		String[] homeTowns = {"Detroit","Clawson","Sterling Heights","Flint","Royal Oak","Ann Arbor","Troy","Detroit","Troy","Clawson","Detroit",
							"Madison Heights","Clawson","Detroit","Royal Oak","Ann Arbor","Oak Park","Sterling Heights","Ann Arbor","Troy"};
		String[] favFoods = {"Pudding","Salad","Pulled Pork","Pasta","Cheese Pizza","Coffee","Corn Salsa","Beef Jerky","Biscuits","Cheesecake","Casear Salad","Egg rolls",
							"Sloppy Joe","Burger","Hot Dog","Cheese Burger","Pulled Pork","Pepperoni Pizza","Icecream","Hot Dog"};
			do {
				int studentNumber = Validator.getInteger(sc, "Which student would you like to learn more about? (Enter a number 1-20) : ", 1, 20);
				sc.nextLine();
				for(int i=0; i<studentNumbers.length;i++) {
					if(studentNumber==i+1) {
						studentInfo = Validator.getRegExString(sc, "What would you like to learn about "+nameOfStudents[i]+ "?(hometown or food): ","hometown|food");
						if (studentInfo.equalsIgnoreCase("hometown")) {
							System.out.println(nameOfStudents[i]+" is from "+homeTowns[i]);
						} else if (studentInfo.equalsIgnoreCase("food")) {
							System.out.println(nameOfStudents[i]+" likes "+favFoods[i]);
						}
					}	
	
				}// end of loop that goes through each entry in the studentNumber array 
				// validates and gets user choice to continue or not
				choice = Validator.continueOrNot(sc,"Would you like to know about more students? (y/n) :", "[yY]");
			}while(!choice); // continues only if the user agrees to
			
		//}
		//print concluding message
		System.out.println("\nThanks for knowing about students in our class!");
	}// end of main method
	
}// end of class
