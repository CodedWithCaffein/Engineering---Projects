package org.firstinspires.ftc.teamcode;

import com.qualcomm.hardware.rev.RevHubOrientationOnRobot;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.IMU;
import org.firstinspires.ftc.robotcore.external.navigation.AngleUnit;

@TeleOp(name = "Guide - IMU", group = "Guides")
public class ImuReadout extends LinearOpMode {
    @Override public void runOpMode() throws InterruptedException {
        IMU imu = hardwareMap.get(IMU.class, "imu");
        // EDIT to match the real hub mounting.
        RevHubOrientationOnRobot orientation = new RevHubOrientationOnRobot(
                RevHubOrientationOnRobot.LogoFacingDirection.UP,
                RevHubOrientationOnRobot.UsbFacingDirection.FORWARD);
        imu.initialize(new IMU.Parameters(orientation));
        telemetry.addData("Ready", "Place at reference heading; PLAY zeros yaw; A rezeros");
        telemetry.update();
        waitForStart();
        if (isStopRequested()) return;
        imu.resetYaw();
        boolean previousA = gamepad1.a;
        while (opModeIsActive()) {
            boolean aNow = gamepad1.a;
            if (aNow && !previousA) imu.resetYaw();
            previousA = aNow;
            double yaw = imu.getRobotYawPitchRollAngles().getYaw(AngleUnit.RADIANS);
            telemetry.addData("Yaw (rad)", "%.3f", yaw);
            telemetry.addData("Yaw (deg)", "%.1f", Math.toDegrees(yaw));
            telemetry.update();
            idle();
        }
    }
}
