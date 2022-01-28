/**
 * 
 */
package jakcan.airfoil;

import java.awt.geom.Point2D;
import java.text.DecimalFormat;

/**
 * @author jrnev
 *
 */
public class Point2DDouble extends Point2D {
	
	double x, y ;
	DecimalFormat df = new DecimalFormat("0.00"); 
	
	public Point2DDouble() {
		x = 0.0 ;
		y = 0.0 ;
	}

	@Override
	public double getX() {
		return x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public void setLocation(double x, double y) {
		this.x = x ;
		this.y = y ;
	}

	@Override
	public String toString() {
		return "(" + df.format(x) + "," + df.format(y) + ")" ; 
	}
}
