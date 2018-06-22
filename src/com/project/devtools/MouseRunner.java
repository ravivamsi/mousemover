/**
 * 
 */
package com.project.devtools;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;

import com.project.devtools.constants.ConstantValues;

/**
 * @author Vamsi Ravi
 *
 */
public class MouseRunner {

	static Double xPosition = MouseInfo.getPointerInfo().getLocation().getX();
	static Double yPosition = MouseInfo.getPointerInfo().getLocation().getY();
	static int x = Integer.valueOf(xPosition.intValue())+1;
	static int y = Integer.valueOf(yPosition.intValue())+1;
	
	public static void main(String... args) throws Exception {
		
//		String timeInMinutes = args[0];
//		
//		Integer time = Integer.parseInt(timeInMinutes);
		
		
		
        Robot robot = new Robot();
        while (true) {
        	
        	PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        	
            robot.mouseMove(pointerInfo.getLocation().x,pointerInfo.getLocation().y);
            
            Thread.sleep(ConstantValues.FIVE_SECONDS);
            
            robot.mouseMove(pointerInfo.getLocation().x-1, pointerInfo.getLocation().y-1);
            
        }
    }
}
