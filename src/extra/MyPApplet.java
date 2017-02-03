package extra;

import processing.core.*;

public class MyPApplet extends PApplet {
	
	PImage webImg;
	
	public void setup() 
	{
		String url = "https://processing.org/img/processing-web.png";
		webImg = loadImage(url, "png");
		size(200, 200);
		
	}
	
	public void draw() 
	{	
		webImg.resize(0, height);
		image(webImg, 0, 0);
		fill(255, 209, 0);
		ellipse(width / 4, height / 5, width / 5, height / 5);
	}
	
}
