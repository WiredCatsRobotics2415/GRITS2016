package org.usfirst.frc.team2415.robot.subsystems;

import org.usfirst.frc.team2415.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class CatapultSubsystem extends Subsystem {
    
	Solenoid solenoid1, solenoid2, solenoid3, solenoid4;
	boolean firing = false;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public CatapultSubsystem(){
		solenoid1 = new Solenoid(RobotMap.PCM_ID, RobotMap.SOLENOID_1);
		solenoid2 = new Solenoid(RobotMap.PCM_ID, RobotMap.SOLENOID_2);
		solenoid3 = new Solenoid(RobotMap.PCM_ID, RobotMap.SOLENOID_3);
		solenoid4 = new Solenoid(RobotMap.PCM_ID, RobotMap.SOLENOID_4);
	}

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void fire(){
    	solenoid1.set(true);
    	solenoid2.set(true);
    	solenoid3.set(true);
    	solenoid4.set(true);
    }
    
    public void close(){
    	solenoid1.set(false);
    	solenoid2.set(false);
    	solenoid3.set(false);
    	solenoid4.set(false);
    }
    
    public boolean getState(Solenoid solenoid){
    	return solenoid.get();
    }
}

