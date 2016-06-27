package auto_company;

import auto_company.Automobile;;


public class Bike implements Automobile {

	@Override
	public double getprice() {
		// TODO Auto-generated method stub
		return 3000000.0;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "green";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "NINJA";
	}

}
