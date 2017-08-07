package liskov;

public class TestArea {

	public static void main(String[] args) {
		Rectangulo r = new Cuadrado();
		r.setWidth(5);
		r.setHeight(4);
		System.out.println(20==r.calculateArea());
	}

}
