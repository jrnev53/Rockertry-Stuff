package jakcan.airfoil ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Scanner;

public class AirfoilOperations
{
    public static void main(String[] args) {
        try {
			System.out.println("Hello World") ;

			// read a dat file that has the data for an airfoil
			File airfoilFile = new File("Z:\\3D Projects\\Airfoils", "sd7037.dat") ;
			Airfoil af = new Airfoil(airfoilFile) ;
			System.out.println(af) ;
			
			// scale up to 10 cm, multiple by 100.
			Airfoil saf = af.scale(100) ;
			System.out.println("scaling") ;
			System.out.println(saf) ;
			
			// write the resulting airfoil out
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}