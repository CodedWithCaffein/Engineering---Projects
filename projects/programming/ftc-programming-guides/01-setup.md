# 01 · Robot setup and your first OpMode

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Blocks pictures](blocks.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** Where does Java code go, and how do I run it?

## Before you start

You need Android Studio, an FTC Robot Controller project, a powered Control Hub or compatible Robot Controller, and a Driver Station. Use the SDK version required for your season. The examples here use SDK 12.0.0 as their reference baseline.

## Step by step

1. Download or clone the [official FTC Android Studio project](https://github.com/FIRST-Tech-Challenge/FtcRobotController). Open its top-level folder in Android Studio, not just TeamCode.
2. Let Gradle sync. Follow the project's supported Android Studio/JDK setup; resolve sync errors before adding robot code.
3. In `TeamCode/src/main/java/org/firstinspires/ftc/teamcode/`, add [TelemetryBasics.java](examples/TelemetryBasics.java). Keep its package line and class name.
4. Connect the Control Hub to the computer using the supported USB or wireless deployment procedure. Choose the robot device in Android Studio.
5. Build and run the TeamCode application configuration. This installs the Robot Controller application with your OpModes; editing a file alone does not update the robot.
6. Connect the Driver Station. Select TeleOp **Guide - Telemetry** and press INIT. Check for **Ready**.
7. Press PLAY. Move a stick and press A. The displayed values should change. Press STOP to end.

## Understand the structure

| Code | Purpose |
| --- | --- |
| `package ...;` | Places the class in a Java package |
| `import ...;` | Lets the file refer to SDK classes |
| `@TeleOp(name = "...")` | Registers a driver-controlled OpMode |
| `extends LinearOpMode` | Runs your `runOpMode()` sequence |
| `waitForStart()` | Waits for PLAY |
| `while (opModeIsActive())` | Repeats while running and permits STOP to end the loop |

An iterative `OpMode` instead provides `init()`, `start()`, `loop()`, and `stop()` methods. Do not paste a LinearOpMode's outer while loop into iterative `loop()`.


## Blocks-style picture

This illustration shows the equivalent control logic. Recreate it with FTC Blocks; expand the written expressions into Math and Logic blocks.

![First OpMode and telemetry block-style diagram](media/drawings/telemetry.svg)

[Open full-size picture](media/drawings/telemetry.svg) · [Blocks picture guide](blocks.md#telemetry)

## Try it

Change the TeleOp display name, redeploy, and verify the new name appears. This checks that you are running the version you just edited.

## If it does not work

An absent OpMode usually means a failed build, wrong device/project, `@Disabled`, or missing annotation. A red Java name usually means a missing import, typo, or dependency. Match filename, class name, and package location before debugging hardware.

## Read next

[Telemetry](02-telemetry.md). Reference: [FIRST Android Studio OpModes](https://ftc-docs.firstinspires.org/en/latest/programming_resources/tutorial_specific/android_studio/creating_op_modes/Creating-and-Running-an-Op-Mode-%28Android-Studio%29.html).
