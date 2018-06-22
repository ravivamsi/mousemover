/**
 * 
 */
package com.devasset;

import java.awt.MouseInfo;
import java.awt.PointerInfo;
import java.awt.Robot;

import com.devasset.constants.ConstantValues;

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
		
		Integer delayInMilliSec = 0;
		if(args.length == 0 && delayInMilliSec == 0){
			delayInMilliSec = ConstantValues.FIVE_SECONDS;
		}else{
			String delayInSec = args[0];
			delayInMilliSec = Integer.parseInt(delayInSec)*1000;
			
		}
		
		
		
        Robot robot = new Robot();
        while (true) {
        	
        	PointerInfo pointerInfo = MouseInfo.getPointerInfo();
        	
            robot.mouseMove(pointerInfo.getLocation().x,pointerInfo.getLocation().y);
            
            Thread.sleep(delayInMilliSec);
            
            robot.mouseMove(pointerInfo.getLocation().x-1, pointerInfo.getLocation().y-1);
            
        }
    }
}
