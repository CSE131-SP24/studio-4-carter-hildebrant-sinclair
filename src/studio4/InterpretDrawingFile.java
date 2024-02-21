package studio4;

import java.awt.Color;
import java.io.File;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		boolean isfilled = in.nextBoolean();

		
		Color given = new Color(r,g,b);
		System.out.println(r + g + b);
		
		if(shape.equals("rectangle")) {
			double[] parameter = new double[4];
			for (int i=0; i<4; i++) {
				parameter[i]= in.nextDouble();
		}
			StdDraw.setPenColor(given);
			StdDraw.rectangle(parameter[0], parameter[1], parameter[2], parameter[3]);
		
		}
		
		
	}
}
