package org.usfirst.frc.team6758.robot.commands;

import org.usfirst.frc.team6758.robot.OI;
import org.usfirst.frc.team6758.robot.Robot;
import org.usfirst.frc.team6758.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveRobot extends Command {

    public DriveRobot() {
    	requires(Robot.driveTrain);
    }

    protected void initialize() {}

    protected void execute() {
    	Robot.driveTrain.driveTrain.arcadeDrive(-OI.stick.getY(), OI.stick.getTwist()* RobotMap.twistSlowMultiplier);
    }
    
    protected boolean isFinished() {
        return false;
    }

    protected void end() {}

    protected void interrupted() {
    	System.out.println("FATAL ERROR - DriveRobot.java \nHELP ME!");
    }
}
