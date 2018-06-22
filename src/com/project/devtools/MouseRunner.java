/**
 * 
 */
package com.project.devtools;

import java.awt.MouseInfo;
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
        Robot robot = new Robot();
        while (true) {
            robot.mouseMove(x,y);
            
            Thread.sleep(ConstantValues.FIVE_SECONDS);
            
            robot.mouseMove(x-1, y-1);
            
        }
    }
}
