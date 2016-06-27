package auto_company;

import auto_company.Automobile;;

public class Show_room {
	
	public Automobile getModel(int key){
		
		switch (key) {
		case 1:
			return new maruti();
			
			
		case 2:
			return new Jaguar();
			
		default:
			return null;
		}
		
	}
	
	public void printQuote(Automobile auto){
		System.out.println(Automobile.SHOWROOM_NAME);
		
		System.out.println(auto.getModel());
		System.out.println(auto.getColor());
		System.out.println(auto.getprice());
	}

}
