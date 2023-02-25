package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() 
	{
		background(255, 0, 0);
	}
	
	/*public void draw()
	{	
		stroke(255);
		line(10, 10, 100, 100); // x1, y1, x2, y2
		fill(0, 255, 255);
		circle(300, 250, 70); // cx, cy, d
		fill(0, 255, 0);
		rect(10, 300, 20, 100); // tlx, tly, w, h
		stroke(127);
		fill(0, 0, 255);
		triangle(40, 90, 300, 20, 80, 70);
	}*/

	public void draw() // all seeing eye
	{
		fill(255, 255, 0);
		stroke(255, 255, 0);
		circle(250, 275, 450);
		fill(0, 255, 255);
		stroke(0, 255, 255);
		triangle(50, 475, 250, 0, 450, 475);
		fill(125, 125, 125);
		stroke(125, 125, 125);
		ellipse(250, 275, 225, 100);
		fill(0, 0, 0);
		stroke(0, 0, 0);
		float eyeSize = map(0, mouseY, width, 100, 150);
		circle(250, 275, eyeSize);
	}
}
