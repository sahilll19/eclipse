package my1stjavaproject;

class Box {
	double width;
	double height;
	double depth;

	Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public String toString() {
		return "Dimensions are " +width + " by " +height + " by " +depth + ".";
	}
}

public class ToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box box = new Box(15, 25, 20);
		System.out.println(box);

	}

}
