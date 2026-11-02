# FTC Programming — Blocks Illustrations

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Blocks illustrations](blocks.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

Pictures for all eight standalone Java examples, plus the reusable-function, field-centric, setup, and debugging lessons.

## Read the pictures

These are original **Blocks-style illustrations**, not screenshots exported from the FTC editor, importable `.blk` files, or robot-tested programs. The labels describe operations; long expressions are kept together for readability. In the editor, construct their Math/Logic value blocks and use each configured device's actual blocks.

Read top to bottom. Indentation shows nesting. Purple marks functions/calls, gold marks control/variables, green marks hardware, and slate marks conceptual actions. An **else** attaches to the immediately preceding **if**; it is not a separate standalone block.

The motor diagrams show ordinary loop-exit cleanup. The Java examples also use `finally` to clean up if an exception occurs; the illustrations do not claim to reproduce Java exception handling.

For Pedro, use the Java source and setup guide. Its pictures explain the logic and do not provide a native FTC Blocks implementation.

## Find a picture

| Example or subject | Picture |
| --- | --- |
| TelemetryBasics | [View](#telemetry) |
| MotorCheck | [View](#motor-check) |
| ServoToggle | [View](#servo-toggle) |
| MecanumTeleOp | [View](#mecanum) |
| EncoderMove | [View](#encoder) |
| ImuReadout | [View](#imu) |
| SequenceDemo | [View](#sequence) |
| PedroFirstPath | [View](#pedro) |
| Reusable claw actions | [View](#functions) |
| Field-centric input rotation | [View](#field-centric) |
| Pedro setup | [View](#pedro-setup) |
| Debug a motor command | [View](#debugging) |

<a id="telemetry"></a>

## TelemetryBasics

No hardware. ElapsedTime timer, start/stop lifecycle, and live Driver Station values. Decimal formatting and the Java telemetry transmission-interval customization are omitted.

![TelemetryBasics · Blocks-style equivalent](media/drawings/telemetry.svg)

[Open full-size picture](media/drawings/telemetry.svg)

<a id="motor-check"></a>

## MotorCheck

A/B momentary motor commands, encoder display, and normal-exit zero power.

![MotorCheck · Blocks-style equivalent](media/drawings/motor-check.svg)

[Open full-size picture](media/drawings/motor-check.svg)

<a id="servo-toggle"></a>

## ServoToggle

Button-edge detection, persistent toggle state, and conservative servo positions.

![ServoToggle · Blocks-style equivalent](media/drawings/servo-toggle.svg)

[Open full-size picture](media/drawings/servo-toggle.svg)

<a id="mecanum"></a>

## MecanumTeleOp

Forward/strafe/turn mixing with normalization. Grouped device operations must be expanded into one block per motor.

![MecanumTeleOp · Blocks-style equivalent](media/drawings/mecanum.svg)

[Open full-size picture](media/drawings/mecanum.svg)

<a id="encoder"></a>

## EncoderMove

Relative encoder target, RUN_TO_POSITION, an active/busy/timeout guard, and normal-exit cleanup.

![EncoderMove · Blocks-style equivalent](media/drawings/encoder.svg)

[Open full-size picture](media/drawings/encoder.svg)

<a id="imu"></a>

## ImuReadout

Mounting parameters, yaw reset on a button edge, and angle readout.

![ImuReadout · Blocks-style equivalent](media/drawings/imu.svg)

[Open full-size picture](media/drawings/imu.svg)

<a id="sequence"></a>

## SequenceDemo

A display-only state machine. Text states and an if/else-if chain replace the Java enum and switch.

![SequenceDemo · Blocks-style equivalent](media/drawings/sequence.svg)

[Open full-size picture](media/drawings/sequence.svg)

<a id="pedro"></a>

## PedroFirstPath

Conceptual execution order for the Pedro Java example. No native Pedro blocks or custom wrappers are supplied.

![PedroFirstPath · Conceptual block logic](media/drawings/pedro.svg)

[Open full-size picture](media/drawings/pedro.svg)

<a id="functions"></a>

## Reusable claw actions

Two reusable Blocks Functions give the open/close behavior of the Java Claw class. The caller is a loop fragment.

![Reusable claw actions · Blocks functions](media/drawings/functions.svg)

[Open full-size picture](media/drawings/functions.svg)

<a id="field-centric"></a>

## Field-centric input rotation

A drive-loop fragment that converts radians to degrees before using Blocks trigonometry.

![Field-centric input rotation · Blocks fragment](media/drawings/field-centric.svg)

[Open full-size picture](media/drawings/field-centric.svg)

<a id="pedro-setup"></a>

## Pedro setup

A conceptual setup workflow for Android Studio, robot configuration, and Pedro tuning.

![Pedro setup · Conceptual preparation steps](media/drawings/pedro-setup.svg)

[Open full-size picture](media/drawings/pedro-setup.svg)

<a id="debugging"></a>

## Debug a motor command

A small diagnostic-loop fragment showing input, requested motor power, and measured encoder feedback.

![Debug a motor command · Blocks example](media/drawings/debugging.svg)

[Open full-size picture](media/drawings/debugging.svg)
