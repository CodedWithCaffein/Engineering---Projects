package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

@TeleOp(name = "Guide - Mecanum", group = "Guides")
public class MecanumTeleOp extends LinearOpMode {
    @Override public void runOpMode() throws InterruptedException {
        DcMotor fl = hardwareMap.get(DcMotor.class, "frontLeft");
        DcMotor bl = hardwareMap.get(DcMotor.class, "backLeft");
        DcMotor fr = hardwareMap.get(DcMotor.class, "frontRight");
        DcMotor br = hardwareMap.get(DcMotor.class, "backRight");
        DcMotor[] motors = {fl, bl, fr, br};
        // Starting assumption only: verify directions on the actual robot.
        fl.setDirection(DcMotorSimple.Direction.REVERSE);
        bl.setDirection(DcMotorSimple.Direction.REVERSE);
        fr.setDirection(DcMotorSimple.Direction.FORWARD);
        br.setDirection(DcMotorSimple.Direction.FORWARD);
        for (DcMotor motor : motors) {
            motor.setPower(0);
            motor.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
            motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        }
        telemetry.addData("Ready", "Verify wheel directions; speed scale 0.30");
        telemetry.update();
        waitForStart();
        try {
            while (opModeIsActive()) {
                double forward = -gamepad1.left_stick_y;
                double strafe = gamepad1.left_stick_x;
                double turn = gamepad1.right_stick_x;
                double denominator = Math.max(1.0,
                        Math.abs(forward) + Math.abs(strafe) + Math.abs(turn));
                double scale = 0.30;
                fl.setPower((forward + strafe + turn) / denominator * scale);
                bl.setPower((forward - strafe + turn) / denominator * scale);
                fr.setPower((forward - strafe - turn) / denominator * scale);
                br.setPower((forward + strafe - turn) / denominator * scale);
                telemetry.addData("Forward / strafe / turn", "%.2f / %.2f / %.2f",
                        forward, strafe, turn);
                telemetry.update();
                idle();
            }
        } finally {
            for (DcMotor motor : motors) motor.setPower(0);
        }
    }
}
