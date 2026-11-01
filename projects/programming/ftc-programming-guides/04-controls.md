# 04 · Gamepads, buttons, and servos

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I make a button act once instead of every loop?

## Before you start

Use [ServoToggle.java](examples/ServoToggle.java) with a positional servo named `claw`. First detach its linkage or verify a clear, small travel range. A continuous-rotation servo needs power-style control and is not the device used here.

## Step by step

1. Configure the positional servo as `claw`.
2. Choose two conservative test positions, initially `0.45` and `0.55`. Servo numbers are normalized commands, not guaranteed degrees.
3. Keep a boolean `previousA` outside the loop so it remembers the preceding loop.
4. Inside the loop, read the current button once: `boolean aNow = gamepad1.a;`.
5. Detect a new press with `aNow && !previousA`. Toggle the desired state only when that condition is true.
6. Update `previousA = aNow;` after checking the edge.
7. Send the selected servo position and display the state.

## Why this matters

`if (gamepad1.a) open = !open;` flips the state on every loop while A is held. At normal loop speeds, the result seems random. Edge detection makes holding A count as one press; releasing and pressing again counts as the next.

For an intake that should run only while held, direct button logic is appropriate. Use `gamepad1` for the driver and `gamepad2` for the operator, then agree on a control map.

A small joystick deadband can remove center drift:
```java
double input = -gamepad1.left_stick_y;
if (Math.abs(input) < 0.05) input = 0;
```
This fragment makes a zero region; it does not rescale the remaining range.

## Try it

After PLAY, hold A for two seconds. The servo should move once. Release A and press again; it should return. Widen the position range only after checking the linkage's limits.

## If it does not work

If a held button toggles repeatedly, check that `previousA` is not declared inside the loop. If the servo buzzes against a stop, stop and reduce the travel. If it spins continuously, confirm that you are using a positional servo and the right configured device.

## Read next

[Mecanum TeleOp](05-mecanum.md). Reference: [FIRST sample OpModes](https://github.com/FIRST-Tech-Challenge/FtcRobotController/tree/master/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples).
