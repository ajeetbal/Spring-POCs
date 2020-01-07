import java.util.List;

public class Triangle {
	private Point pointA;
	private Point pointB;
	private Point pointC;

	private List<Point> trianglePoints;

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public List<Point> getTrianglePoints() {
		return trianglePoints;
	}

	public void setTrianglePoints(List<Point> trianglePoints) {
		this.trianglePoints = trianglePoints;
	}

	void draw() {
		System.out.println("pointA [" + getPointA().getX() + "," + getPointA().getY() + " ]");
		System.out.println("pointB [" + getPointB().getX() + "," + getPointB().getY() + " ]");
		System.out.println("pointC [" + getPointC().getX() + "," + getPointC().getY() + " ]");
		System.out.println("points are " + getTrianglePoints().get(0).getY());
	}

}
