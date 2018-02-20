package org.usfirst.frc.team6758.robot.autonomous;

import org.usfirst.frc.team6758.robot.commands.ArmRelease;
import org.usfirst.frc.team6758.robot.commands.LiftArm;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class Pos2Switch extends CommandGroup {

    public Pos2Switch() {
        addSequential(new DriveForward(133, true));
        addParallel(new LiftArm());
        addSequential(new ArmRelease());
    }
}