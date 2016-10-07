package org.usfirst.frc.team2415.robot.subsystems;

import org.usfirst.frc.team2415.robot.RobotMap;
import org.usfirst.frc.team2415.robot.commands.DriveCommand;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveSubsystem extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	CANTalon backLeftTalon, backRightTalon, frontLeftTalon, frontRightTalon;

    public DriveSubsystem(){
    	backLeftTalon = new CANTalon(RobotMap.BACK_LEFT_TALON);
    	backRightTalon = new CANTalon(RobotMap.BACK_RIGHT_TALON);
    	frontLeftTalon = new CANTalon(RobotMap.FRONT_LEFT_TALON);
    	frontRightTalon = new CANTalon(RobotMap.FRONT_RIGHT_TALON);
    	
    	backLeftTalon.reverseOutput(false);
    	frontLeftTalon.reverseOutput(false);
    	backRightTalon.reverseOutput(true);
    	frontRightTalon.reverseOutput(true);
    	
    	
    }
	
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	
		setDefaultCommand(new DriveCommand());
    	
    }
	
	/**
	 * sets motors 
	 * @param left the speed that you want the left motors to go at
	 * @param right the speed that you want the right motors to go at
	 */
	public void setMotors(double left, double right){
		backLeftTalon.set(left);
		frontLeftTalon.set(left);
		backRightTalon.set(left);
		frontRightTalon.set(left);
	}
	
	/**
	 * stops the motors
	 */
	public void stopMotors(){
		setMotors(0,0);
	}
	
}

