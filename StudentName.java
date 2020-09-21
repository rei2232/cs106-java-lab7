import java.awt.Color;

import acm.program.*;
import acm.graphics.*;


public class StudentName extends GraphicsProgram{
 public void run(){
	
	 GRect rect = new GRect(75,45,210,55);
	 rect.setFilled(true);
	 rect.setFillColor(Color.YELLOW);
	 add(rect);
	 
	 GLabel label= new GLabel("КУ-2 Б.Дашжамц",100,85);
	 label.setFont("Arial-20");
	 label.setColor(Color.BLUE);
	// label.setBackgroundColor(Color.YELLOW);
	 add(label);
}
}