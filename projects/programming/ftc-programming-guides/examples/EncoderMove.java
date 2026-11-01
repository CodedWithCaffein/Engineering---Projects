package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Guide - Encoder Move", group = "Guides")
public class EncoderMove extends LinearOpMode {
    @Override public void runOpMode() throws InterruptedException {
        // UNLOADED MOTOR DEMO. Not a lift controller.
        DcMotor motor = hardwareMap.get(DcMotor.class, "testMotor");
        motor.setPower(0);
        motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        telemetry.addData("Ready", "After PLAY: +100 ticks, 0.20 power, 2 s timeout");
        telemetry.update();
        waitForStart();
        if (isStopRequested()) return;
        ElapsedTime timer = new ElapsedTime();
        try {
            motor.setTargetPosition(100);
            motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
            timer.reset();
            motor.setPower(0.20);
            while (opModeIsActive() && motor.isBusy() && timer.seconds() < 2.0) {
                telemetry.addData("Target (ticks)", motor.getTargetPosition());
                telemetry.addData("Position (ticks)", motor.getCurrentPosition());
                telemetry.addData("Elapsed (s)", "%.2f", timer.seconds());
                telemetry.update();
                idle();
            }
            String result = isStopRequested() ? "Stopped" :
                    (motor.isBusy() ? "Timeout" : "Controller reports target reached");
            telemetry.addData("Result", result);
            telemetry.addData("Final position (ticks)", motor.getCurrentPosition());
            telemetry.update();
        } finally {
            motor.setPower(0);
            motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
        }
        // Retain the result on screen until STOP.
        while (opModeIsActive()) idle();
    }
}
