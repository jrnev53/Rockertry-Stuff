/**
 * 
 */
package jakcan.airfoil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author jrnev
 *
 */
public class Airfoil {
	private String airfoilName ;
	private LinkedList<Point2DDouble> coords ; 

	public Airfoil()
	{
		coords = new LinkedList<>() ;
		airfoilName = "airfoil" ;
	}
	
	public Airfoil(File airfoilFile) throws FileNotFoundException {
		this() ;
		Scanner myReader = new Scanner(airfoilFile);
		myReader.useLocale(Locale.US);  
		myReader.useDelimiter(" |\\r?\\n") ;
		
		airfoilName = myReader.nextLine().trim() ;
		
		while (myReader.hasNextLine())
		{
			String line = myReader.nextLine().trim() ;
			String[] coordsStr = line.split(" +") ;
			double x = Double.parseDouble(coordsStr[0]) ;
			double y = Double.parseDouble(coordsStr[1]) ;
			Point2DDouble p = new Point2DDouble() ;
			p.setLocation(x, y);
			coords.add(p) ;
		}
		myReader.close();
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder() ;
		sb.append("Name: ").append(airfoilName).append(" has ").append(coords.size()).append(" sets of co-ordinates").append("\n") ;
		for (Point2DDouble p: coords)
		{
			sb.append("\t").append(p.x).append(",").append(p.x).append("\n") ;
		}
		return sb.toString();
	}

	/**
	 * Scale by the given factor
	 * 
	 * @param scale
	 * @return A copy of the Airfoil, scaled.
	 */
	public Airfoil scale(double scale) {
		Airfoil scaled = new Airfoil() ;
		scaled.airfoilName = this.airfoilName ;
		for (Point2DDouble p: coords)
		{
			Point2DDouble scaledP = new Point2DDouble() ;
			scaledP.setLocation(p.x * scale, p.y * scale);
			scaled.coords.add(scaledP) ;
		}
		return scaled;
	}

	public void write(File airfoilOutput) {
		// TODO Auto-generated method stub
		
	}
}
