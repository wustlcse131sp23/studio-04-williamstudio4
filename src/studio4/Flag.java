package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	StdDraw.setCanvasSize(575, 575);
	StdDraw.setScale(0,575);
    StdDraw.setPenColor(Color.WHITE);
    StdDraw.filledRectangle(225, 300, 125, 125);
    StdDraw.setPenColor(0,0,127);
    StdDraw.filledRectangle(150, 300, 60, 125);
    StdDraw.setPenColor(255,0,0);
	StdDraw.filledRectangle(395, 300, 60, 125);
    StdDraw.show();
	    }
	}