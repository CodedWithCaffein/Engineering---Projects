package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Guide - Motor Check", group = "Guides")
public class MotorCheck extends LinearOpMode {
    @Override public void runOpMode() throws InterruptedException {
        DcMotor motor = hardwareMap.get(DcMotor.class, "testMotor");
        motor.setPower(0);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        telemetry.addData("Ready", "Unloaded motor: hold A +0.15 or B -0.15");
        telemetry.update();
        waitForStart();
        try {
            while (opModeIsActive()) {
                double power = gamepad1.a ? 0.15 : (gamepad1.b ? -0.15 : 0);
                motor.setPower(power);
                telemetry.addData("Command", power);
                telemetry.addData("Position (ticks)", motor.getCurrentPosition());
                telemetry.update();
                idle();
            }
        } finally {
            motor.setPower(0);
        }
    }
}
