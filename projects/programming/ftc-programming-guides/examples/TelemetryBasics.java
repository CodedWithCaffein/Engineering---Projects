package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name = "Guide - Telemetry", group = "Guides")
public class TelemetryBasics extends LinearOpMode {
    @Override public void runOpMode() throws InterruptedException {
        ElapsedTime timer = new ElapsedTime();
        telemetry.setMsTransmissionInterval(100);
        telemetry.addData("Status", "Ready");
        telemetry.update();
        waitForStart();
        if (isStopRequested()) return;
        timer.reset();
        while (opModeIsActive()) {
            telemetry.addData("Runtime (s)", "%.1f", timer.seconds());
            telemetry.addData("Left stick Y", "%.2f", gamepad1.left_stick_y);
            telemetry.addData("A pressed", gamepad1.a);
            telemetry.update();
            idle();
        }
    }
}
