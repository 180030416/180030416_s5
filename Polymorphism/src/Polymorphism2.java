
class Shape {
	public void draw() {
		System.out.println("Drawing Shape");
	}
	
	public void erase() {
		System.out.println("Erasing Shape");
	}
}

class Square extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Square");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Square");
	}

}
class Triangle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Triangle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Triangle");
	}

}
class Circle extends Shape {
	@Override
	public void draw() {
		System.out.println("Drawing Circle");
	}
	
	@Override
	public void erase() {
		System.out.println("Erasing Circle");
	}

}

public class Polymorphism2 {
	public static void main(String[] args) {
		Shape c = new Circle();
		Shape t = new Triangle();
		Shape s = new Square();
		
		c.draw();
		c.erase();
		
		t.draw();
		t.erase();
		
		s.draw();
		s.erase();
	}
}
