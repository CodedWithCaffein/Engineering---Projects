# 03 · Hardware mapping and motor tests

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I connect a variable to the correct physical device?

## Before you start

Use [MotorCheck.java](examples/MotorCheck.java), one unloaded test motor, and an encoder cable if you want position feedback. Secure the robot with drive wheels clear before testing directions.

## Step by step

1. Open **Configure Robot** on the Driver Station. Select the actual hub and motor port.
2. Select the correct motor type, name it `testMotor`, save, and activate the configuration.
3. Map it in Java before `waitForStart()`:
   ```java
   DcMotor motor = hardwareMap.get(DcMotor.class, "testMotor");
   ```
4. Match capitalization exactly. The Java variable `motor` can have a different name; the quoted hardware string cannot.
5. Set zero power, `RUN_WITHOUT_ENCODER`, and the intended zero-power behavior during initialization.
6. Run the example. Hold A for +0.15 power or B for -0.15. Releasing the buttons commands zero.
7. Observe the shaft and encoder value. Change the motor direction only after establishing which physical motion should count as positive.

## What the settings mean

`FORWARD` and `REVERSE` describe the software direction. They do not mean the robot's physical forward direction automatically. Mirrored drivetrain motors often need different settings.

`BRAKE` resists motion at zero power; it does not actively hold a raised arm against gravity. `FLOAT` allows more coasting. `RUN_WITHOUT_ENCODER` still allows encoder readings; it simply does not use the hub's encoder speed controller for power commands.

## Try it

With the robot stopped, temporarily change `"testMotor"` in code to a name absent from the configuration. INIT should report a mapping error. Restore the name and redeploy. This makes a common error easier to recognize later.

## If it does not work

A mapping exception points to the selected configuration, name, or device type. A nonmoving motor with a nonzero command calls for power, cable, port, mode, and jam checks. A moving motor with unchanged ticks calls for an encoder cable and port check. Diagnose with an unloaded motor before attaching a mechanism.

## Read next

[Controls and servos](04-controls.md). References: [FIRST samples](https://github.com/FIRST-Tech-Challenge/FtcRobotController/tree/master/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples), [REV encoder basics](https://docs.revrobotics.com/duo-control/hello-robot-blocks/part-3/using-encoder).
