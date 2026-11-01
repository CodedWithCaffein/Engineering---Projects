# 05 · Mecanum TeleOp

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I combine forward, sideways, and turning inputs?

## Before you start

Use [MecanumTeleOp.java](examples/MecanumTeleOp.java), four correctly installed mecanum wheels, and these configuration names: `frontLeft`, `backLeft`, `frontRight`, `backRight`. Viewed from above, the roller layout should form the intended mecanum X pattern. Verify each motor separately first.

## Step by step

1. Map the four motors by their physical corners.
2. Set all four to `RUN_WITHOUT_ENCODER` and zero power. Use the example's left-side reversal only as a starting assumption; verify it on your robot.
3. Read forward as `-gamepad1.left_stick_y`, strafe right as `gamepad1.left_stick_x`, and turn clockwise as `gamepad1.right_stick_x`.
4. Mix the inputs:
   ```java
   double fl = forward + strafe + turn;
   double bl = forward - strafe + turn;
   double fr = forward - strafe - turn;
   double br = forward + strafe - turn;
   ```
5. Divide all four by `Math.max(1.0, Math.abs(forward) + Math.abs(strafe) + Math.abs(turn))`. This keeps values in range while preserving their proportions.
6. Multiply the normalized powers by the test speed scale, initially `0.30`.
7. Test forward, strafe, and turn separately with wheels raised. Then test on a clear floor at low speed.
8. Confirm that releasing the sticks commands zero and STOP ends movement.

## Why normalize?

Forward and strafe together can request a magnitude greater than one. If each motor independently clips its command, the wheel ratios change. Dividing every command by the same denominator retains the intended mix.

This lesson is robot-centric: forward on the stick means the robot's own front. Field-centric control is an extension in the IMU lesson.

## Try it

Drive a short square without rotation, then rotate in place. If forward works but strafing fails, investigate wheel installation, corner mapping, and the signs in the mix before adding correction multipliers.

## If it does not work

One incorrect motor direction can make the robot fight itself. Test corners independently. A swapped front/back mapping can look like a math error. Do not compensate for miswired or misidentified hardware by changing random signs.

## Read next

[Encoders](06-encoders.md). Reference: [FIRST drivetrain samples](https://github.com/FIRST-Tech-Challenge/FtcRobotController/tree/master/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples).
