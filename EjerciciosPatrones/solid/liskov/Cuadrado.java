package liskov;

public class Cuadrado extends Rectangulo {
	 @Override 
	 public void setWidth(int width) {
	        super.setWidth(width);
	        super.setHeight(width);
	   }
	 
	 @Override 	
	 public void setHeight(int height) {
	        super.setHeight(height);
	        super.setWidth(height);
	    }
}
