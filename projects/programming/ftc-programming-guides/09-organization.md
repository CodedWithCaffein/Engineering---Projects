# 09 · Code organization

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I reuse robot code without duplicating everything?

## Before you start

Finish at least one working TeleOp. Save a working commit before refactoring. These steps organize your FTC project; the guide collection itself does not contain your team's robot source.

## Step by step

1. Group code by responsibility. An OpMode coordinates the match; a drivetrain class controls wheels; a claw class controls its servo.
2. Start by extracting one mechanism. Pass its required hardware into the constructor instead of inventing a second global hardware map.
3. Give that class small methods such as `open()` and `close()`.
4. Map hardware once during initialization and pass the object to the mechanism.
5. Keep calibration values in named constants. Use names that state purpose and units, such as `LIFT_SCORE_TICKS`.
6. Call the same mechanism methods from TeleOp and autonomous.
7. Verify behavior after each extraction. A refactor should preserve behavior before you add new features.

## A small reusable class

Create `Claw.java` in the teamcode package:
```java
package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.Servo;

public final class Claw {
    private final Servo servo;
    private final double openPosition;
    private final double closedPosition;

    public Claw(Servo servo, double openPosition, double closedPosition) {
        this.servo = servo;
        this.openPosition = openPosition;
        this.closedPosition = closedPosition;
    }

    public void open() { servo.setPosition(openPosition); }
    public void close() { servo.setPosition(closedPosition); }
}
```

Inside an OpMode, after mapping the servo:
```java
Claw claw = new Claw(hardwareMap.get(Servo.class, "claw"), 0.55, 0.45);
```
Call `claw.open()` from a button edge or autonomous state. The example positions still require physical calibration.

## Try it

Replace the direct servo commands in ServoToggle with this class. Keep the controls identical. Build and test the two positions before reorganizing anything else.

## If it does not work

A Java class is not automatically an OpMode and does not need a TeleOp annotation. Use `new` to create a mechanism instance. Avoid static hardware references that survive across OpMode runs, and do not have two independent classes fight over the same motor.

## Useful project habits

Commit a working baseline, use descriptive commit messages, and keep experiments separate from match code. Document hardware names and driver controls. Do not publish Wi-Fi passwords, private team records, or credentials with source code.

## Read next

[Pedro installation](10-pedro-setup.md).
