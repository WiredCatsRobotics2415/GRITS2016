package org.usfirst.frc.team2415.robot.commands;

import org.usfirst.frc.team2415.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FireCatapultCommand extends Command {

	double openingTime = 0.6;
	
    public FireCatapultCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.catapultSubsystem);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.catapultSubsystem.close();
    	long startTime = System.currentTimeMillis();
    	while((System.currentTimeMillis() - startTime)*1000 < openingTime){
    		Robot.catapultSubsystem.fire();
    	}
    	Robot.catapultSubsystem.close();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
