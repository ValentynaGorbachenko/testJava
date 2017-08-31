package testJava;

class Point {
	int x;
	int y;
	// default constructor 
	Point(){
		this(0,0);
	}
	// constructor
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	//getters
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//setters
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	// toString method 
	@Override
	public String toString() {
		return "x=" + x + ", y=" + y;
	}
	// center between current object and other one
	Point center(Point other) {
		return new Point((x + other.x)/2, (y + other.y)/2);
	}
	// scale closer to (0,0)
	void scale() {
		this.x = this.x/2;
		this.y = this.y/2;
	}
}
