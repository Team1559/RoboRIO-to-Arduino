
package org.usfirst.frc.team1559.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Timer;
/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
	Joystick joy;
	Arduino arduino;
	Timer timey;
    public void robotInit() {
    	joy = new Joystick(0);
    	arduino = new Arduino(4);
    	timey = new Timer();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void disabledPeriodic() {

    }
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopInit() {

    }
    public void teleopPeriodic() {
    	arduino.Write(1,2,3);
    	timey.delay(.5);
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
