// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.Drivetrain;
import frc.robot.subsystems.Pneumatics;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class AutoDriveRepeat extends SequentialCommandGroup {
  /** Creates a new AutoDriveRepeat. */
  public AutoDriveRepeat(Drivetrain drive, Pneumatics pneumatics) {
    // Add your commands in the addCommands() call, e.g.
    // addCommands(new FooCommand(), new BarCommand());
    addCommands(new AutoDrive(drive, pneumatics, 60, 0, -1, 10),
                new AutoDrive(drive, pneumatics, 60, 0, 1, 10),
                new AutoDrive(drive, pneumatics, 60, 0, -1, 10),
                new AutoDrive(drive, pneumatics, 60, 0, 1, 10));
  }
}
