package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "Guide - Servo Toggle", group = "Guides")
public class ServoToggle extends LinearOpMode {
    // Calibrate with linkage detached before widening travel.
    private static final double OPEN = 0.55;
    private static final double CLOSED = 0.45;

    @Override public void runOpMode() throws InterruptedException {
        Servo claw = hardwareMap.get(Servo.class, "claw");
        telemetry.addData("Ready", "Servo moves to CLOSED after PLAY; A toggles");
        telemetry.update();
        waitForStart();
        if (isStopRequested()) return;
        boolean open = false;
        boolean previousA = gamepad1.a;
        while (opModeIsActive()) {
            boolean aNow = gamepad1.a;
            if (aNow && !previousA) open = !open;
            previousA = aNow;
            claw.setPosition(open ? OPEN : CLOSED);
            telemetry.addData("Claw command", open ? "OPEN" : "CLOSED");
            telemetry.addData("Position command", open ? OPEN : CLOSED);
            telemetry.update();
            idle();
        }
    }
}
