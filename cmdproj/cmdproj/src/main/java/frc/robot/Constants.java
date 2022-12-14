// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class IntakeConstants {
        public static final int kLeftMotorPort = 3;
        public static final int kRightMotorPort = 4;
        public static final double kOpenSpeed = -1;
        public static final double kCloseSpeed = 1;
        public static final int kIndexSpeed = 3;
    }
    public static final class ClimbConstants {
        public static final int kLeftClimbMotorPort = 18;
        public static final int kRightClimbMotorPort = 17;
    }
    public static final class FlywheelConstants {
        public static final int kFlywheelMotorPort = 9 ;
        public static final int kFlywheelSlavePort = 10 ;

        public static double kP = 0.1;
        public static double kI = 0;
        public static double kD = 0;
        public static double kFF = 0.000188;
        public static double kV = 0.0075;

    }
}

