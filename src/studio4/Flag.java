package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color green = new Color(81, 137, 34);
		Color pink = new Color(255, 182, 193);
		StdDraw.setPenColor(pink);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.25);
		StdDraw.setPenColor(green);
		StdDraw.rectangle(0.5, 0.5, 0.5, 0.25);
		double[] xr1 = {0,0.25,1,1} ;
		double[] yr1 = {0.25,0.25, 0.65,0.75};
		StdDraw.setPenColor(green);
		StdDraw.filledPolygon(xr1,yr1);
		double[] xr2 = {0.5,0.6,1,1} ;
		double[] yr2 = {0.75,0.75, 0.45,0.3};
		StdDraw.filledPolygon(xr2,yr2);
		StdDraw.setPenColor(Color.white);
		
		double[] xt2 = {0.6,0.8,0.9} ;
		double[] yt2 = {0.25,0.35, 0.25};
		StdDraw.filledPolygon(xt2, yt2);
		StdDraw.setPenColor(green);
		StdDraw.polygon(xt2, yt2);
		StdDraw.setPenColor(Color.white);
		
		double[] xt1 = {0.5,0.65,0.75} ;
		double[] yt1 = {0.25,0.35, 0.25};
		StdDraw.filledPolygon(xt1, yt1);
	
		StdDraw.setPenColor(green);
		StdDraw.polygon(xt1, yt1);
	}
}