package auto_company;

public interface Automobile {
	
	public static final String SHOWROOM_NAME="ANAND CARS";
	
	
	//Either write public abstract or not it's automatically added
	//So these three ways are to explain that we can write in any way
	
	public abstract double getprice();  
	public String getColor();
	String getModel();

}
