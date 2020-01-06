
public class Drawing {

	private Shape shape;

	public Drawing(Shape shape) {
		super();
		this.shape = shape;
	}

	public void draw() {
		this.shape.draw();
		;
	}

}
