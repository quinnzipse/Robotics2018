package org.usfirst.frc.team6758.robot.commands;

import org.usfirst.frc.team6758.robot.Robot;
import org.usfirst.frc.team6758.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LiftArm extends Command {

	boolean flag;
	
    public LiftArm() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.elevator);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	System.out.println(flag);
    	if(Robot.elevator.topLimit.get()) {
    		Robot.elevator.elevatorMotor.set(RobotMap.elevatorAutonSpeed);
    		flag = false;
    	}
    	else {
    		flag = true;
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return flag;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.elevator.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
