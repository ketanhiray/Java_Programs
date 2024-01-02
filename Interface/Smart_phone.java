package Interface;

public abstract class Smart_phone implements GPS,Radio{
	 public void getCoordinates() {
	       System.out.println("Coordinates: 41°24'12.2\'N 2°10'26.5\'E;"); 
	    }
	 public void getFrequency() {
		 System.out.println("Radio Frequency: MHZ");
	}
	 
}