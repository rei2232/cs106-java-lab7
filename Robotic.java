
import java.awt.Color;

import acm.program.*;
import acm.graphics.*;

public class Robotic extends GraphicsProgram{
	private int HEAD_WIDTH = readInt("x: ");
	private int HEAD_HEIGHT = readInt("y:");
	private double MOUTH_WIDTH = (HEAD_WIDTH*3)/5;
	private double MOUTH_HEIGHT = HEAD_HEIGHT/5;
	private double EYE_RADIUS = HEAD_WIDTH/10;
	
	public void run() {
		
		double cx = getWidth()/2;
		double cy = getHeight()/2;
		addHead(cx - HEAD_WIDTH/2, cy - HEAD_HEIGHT/2);
		addEye(cx - HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
		addEye(cx + HEAD_WIDTH/4, cy - HEAD_HEIGHT/4);
		addMouth(cx - MOUTH_WIDTH/2, cy + HEAD_HEIGHT/4);
	} 

	
			
	
	
	
	private void drawRectangle(double x, double y, double width, double height, Color c){
		GRect rect = new GRect(x,y,width, height);
		rect.setFilled(true);
		rect.setColor(c);
		add(rect);
	}
	
	private void drawCircle(double cx, double cy, double r, Color c){
		double x = cx - r;
		double y = cy - r;
		GOval circle = new GOval(2*r, 2*r);
		circle.setColor(c);
		circle.setFilled(true);
		add(circle, x, y);
	}


	private void addHead(double x, double y){
		drawRectangle(x, y, HEAD_WIDTH, HEAD_HEIGHT, Color.GRAY);
	}
	

	private void addEye(double cx, double cy){
		drawCircle(cx, cy, EYE_RADIUS, Color.YELLOW);
	}
	
	
	private void addMouth(double x, double y){
		drawRectangle(x,y, MOUTH_WIDTH, MOUTH_HEIGHT, Color.WHITE);
	} 
	
}