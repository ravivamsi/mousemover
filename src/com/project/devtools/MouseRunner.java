/**
 * 
 */
package com.project.devtools;

import java.awt.Robot;
import java.util.Random;

import com.project.devtools.constants.ConstantValues;

/**
 * @author Vamsi Ravi
 *
 */
public class MouseRunner {

	public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();
        while (true) {
            robot.mouseMove(random.nextInt(ConstantValues.MAX_X), random.nextInt(ConstantValues.MAX_Y));
            Thread.sleep(ConstantValues.FIVE_SECONDS);
        }
    }
}
