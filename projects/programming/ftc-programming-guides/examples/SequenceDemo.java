package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.util.ElapsedTime;

@Autonomous(name = "Guide - Sequence", group = "Guides")
public class SequenceDemo extends LinearOpMode {
    private enum State { APPROACH, ACTUATE, DONE }

    @Override public void runOpMode() throws InterruptedException {
        telemetry.addData("Ready", "Display-only sequence; no actuators");
        telemetry.update();
        waitForStart();
        if (isStopRequested()) return;
        State state = State.APPROACH;
        ElapsedTime stateTimer = new ElapsedTime();
        stateTimer.reset();
        while (opModeIsActive()) {
            switch (state) {
                case APPROACH:
                    if (stateTimer.seconds() >= 1.0) {
                        state = State.ACTUATE;
                        stateTimer.reset();
                    }
                    break;
                case ACTUATE:
                    if (stateTimer.seconds() >= 0.5) {
                        state = State.DONE;
                        stateTimer.reset();
                    }
                    break;
                case DONE:
                    break;
            }
            telemetry.addData("State", state);
            telemetry.addData("State time (s)", "%.2f", stateTimer.seconds());
            telemetry.update();
            idle();
        }
    }
}
