package testJava;

class Point {
	int x;
	int y;
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	void printPoints() {
		System.out.println(this.x + " - x, " + this.y + " - y.");
	}
	Point center(Point other) {
		return new Point((x + other.x)/2, (y + other.y)/2);
	}
	void scale() {
		this.x = this.x/2;
		this.y = this.y/2;
	}
}
