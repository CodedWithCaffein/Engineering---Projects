# 02 · Telemetry

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Blocks illustrations](blocks.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I see what the robot thinks it is doing?

## Before you start

Use [TelemetryBasics.java](examples/TelemetryBasics.java). No motors or sensors are required. Telemetry sends labeled information to the Driver Station; it does not make hardware move.

## Step by step

1. Add a message during initialization: `telemetry.addData("Status", "Ready");`.
2. Call `telemetry.update();` to send the pending information. In a LinearOpMode, adding data alone is not enough.
3. After `waitForStart()`, put changing values inside `while (opModeIsActive())`.
4. Add one useful value at a time: joystick input, requested power, encoder position, target, sensor reading, or autonomous state.
5. Call `telemetry.update()` once after adding that loop's values.
6. Use `telemetry.setMsTransmissionInterval(100);` for roughly ten display transmissions per second. This limits display transmission; it is not a delay and should not set the control loop's speed.

## A small example

```java
double requestedPower = -gamepad1.left_stick_y;
telemetry.addData("Requested power", "%.2f", requestedPower);
telemetry.addData("A pressed", gamepad1.a);
telemetry.update();
```

This is a fragment for your active loop. For a complete file, use the linked example.

`"%.2f"` formats a number to two decimal places. A caption should describe both the value and its units: **Position (ticks)** is more useful than **Number**.

## Use telemetry to answer a question

Suppose an intake will not move. Show both the trigger value and requested power. If both stay zero, investigate the controller input or condition. If requested power changes but the motor does not, inspect mapping, wiring, mode, and the mechanism. A reported power is a command, not proof of rotation.


## Blocks-style picture

This illustration shows the equivalent control logic. Recreate it with FTC Blocks; expand the written expressions into Math and Logic blocks.

![TelemetryBasics block-style diagram](media/drawings/telemetry.svg)

[Open full-size picture](media/drawings/telemetry.svg) · [Blocks picture guide](blocks.md#telemetry)

## Try it

Run the complete example. With the left stick centered, its Y value should be near zero. Press A and confirm the boolean changes. Add `gamepad1.right_trigger` yourself, rebuild, and compare partial and full trigger presses.

## If it does not work

Check for `update()`, confirm the code is reached, and make sure the OpMode is running. Default telemetry is generally rebuilt each transmission, so add live values repeatedly. Avoid dozens of expensive sensor reads just for display. Read a sensor once per loop and reuse its value.

## Read next

[Hardware mapping](03-hardware.md). Reference: [FIRST Java OpMode tutorial](https://ftc-docs.firstinspires.org/en/latest/programming_resources/tutorial_specific/android_studio/creating_op_modes/Creating-and-Running-an-Op-Mode-%28Android-Studio%29.html).
