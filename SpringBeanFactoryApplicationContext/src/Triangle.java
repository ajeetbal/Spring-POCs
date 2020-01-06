
public class Triangle {
	private String type;
	private int height;

	// DI with Constructor
	public Triangle(String type, int height) {
		this.type = type;
		this.height = height;
	}

	public String getType() {
		return type;
	}

	public int getHeight() {
		return height;
	}

//	DI with setter
//	public void setType(String type) {
//		this.type = type;
//	}

	void draw() {
		System.out.println(getType() + " drawing Triangle with hieght " + getHeight());
	}
}
