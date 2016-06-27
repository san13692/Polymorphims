package auto_company;

import auto_company.Automobile;

public class New_showroom extends Show_room {

	/* (non-Javadoc)
	 * @see auto_company.Show_room#getModel(int)
	 */
	@Override
	public Automobile getModel(int key) {
		// TODO Auto-generated method stub
		if(key==3){
			return new Bike();
		}
		
		return super.getModel(key);
	}

}
