/** 
 * @author Sovichea Cheth
 * @version 1.0
 * @since 09/16/2016
 * @description 7-3 Closed Curve : Add a new class Rectangle having instance variables width and length of type
double to the good package. Rectangle should inherit from ClosedCurve.
Implement the computeArea method, as appropriate. Modify the Test class so that the
area of Rectangle instance is also computed.
 * */

package closedcurve.good;


public class Rectangle extends ClosedCurve {
	
	private double width;
	private double length;
	
	public Rectangle(double width, double length) {
		// TODO Auto-generated constructor stub
		this.width = width;
		this.length = length;
	}

	@Override
	double computeArea() {
		// TODO Auto-generated method stub
		return width * length;
	}

}
