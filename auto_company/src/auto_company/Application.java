/*All concepts till abstract class like override and overload and what not has been used
  */


package auto_company;

import auto_company.Show_room;

import java.util.Scanner;

import auto_company.Automobile;;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String ch = "Y";
		do{
		
		System.out.println("Input 1 for maruti and 2 for Jaguar and 3 for Bike");
		
		int key = sc.nextInt();
		Show_room obj = new New_showroom();
		
		Automobile auto = obj.getModel(key);
		if(auto == null){
			System.out.println("Invalid choice");
		}
		else{
		obj.printQuote(auto);}
		System.out.println("Input Y to continue  and N to exit");
		ch = sc.next();
		}while(ch.equalsIgnoreCase("Y"));
sc.close();
	}

}
