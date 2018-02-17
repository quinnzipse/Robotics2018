package org.usfirst.frc.team6758.robot.subsystems;

import org.usfirst.frc.team6758.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ThorsHammer extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	public WPI_TalonSRX thorsHammer = new WPI_TalonSRX(RobotMap.mKristina);
	public Encoder encThor = new Encoder(RobotMap.encThorPortA, RobotMap.encThorPortB);

    public void initDefaultCommand() {
        //setDefaultCommand(new Hammer());
    }
}

