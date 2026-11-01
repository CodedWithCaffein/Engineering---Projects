# Sources and credits

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

Documentation and upstream source were checked on November 1, 2026. The lessons explain the concepts in their own sequence; official documentation remains the reference for API behavior and later changes.

## FIRST and REV

| Reference | Use |
| --- | --- |
| [FTC Robot Controller project](https://github.com/FIRST-Tech-Challenge/FtcRobotController) | Android Studio project and SDK baseline |
| [FIRST Android Studio OpMode guide](https://ftc-docs.firstinspires.org/en/latest/programming_resources/tutorial_specific/android_studio/creating_op_modes/Creating-and-Running-an-Op-Mode-%28Android-Studio%29.html) | TeamCode location, deployment, LinearOpMode, telemetry |
| [Official sample OpModes](https://github.com/FIRST-Tech-Challenge/FtcRobotController/tree/master/FtcRobotController/src/main/java/org/firstinspires/ftc/robotcontroller/external/samples) | Hardware and drivetrain API references |
| [FIRST universal IMU interface](https://ftc-docs.firstinspires.org/en/latest/programming_resources/imu/imu.html) | Hub mounting orientation, yaw units, reset behavior |
| [REV encoder basics and modes](https://docs.revrobotics.com/duo-control/hello-robot-blocks/part-3/using-encoder) | Encoder readings and motor run modes |

## Pedro Pathing

| Reference | Use |
| --- | --- |
| [Pinned Quickstart revision](https://github.com/Pedro-Pathing/Quickstart/tree/4f33ef5bbbd99ebfe978f0b86046ca43469e2df2) | FTC SDK 12.0.0, revhub 3.0.2, tuning 1.0.3; initially empty Constants/Tuning |
| [Installation](https://pedropathing.com/docs/pathing/installation) | Quickstart and manual dependency setup |
| [Mecanum tuning](https://pedropathing.com/docs/pathing/tuning/drivetrain/mecanum) | AutoTune entry point and drivetrain configuration |
| [Localization](https://pedropathing.com/docs/pathing/tuning/localization) | Choose and validate a supported localizer |
| [Foresight tuning](https://pedropathing.com/docs/pathing/tuning/foresight) | Robot-specific follower calibration |
| [Constants](https://pedropathing.com/docs/pathing/tuning/constants) | Localizer, drivetrain, algorithm construction |
| [Pose creation](https://pedropathing.com/docs/pathing/guide/pose-creation) | PoseFactory and starting pose |
| [Path creation](https://pedropathing.com/docs/pathing/guide/path-creation) | Line paths and heading interpolation |
| [Coordinates](https://pedropathing.com/docs/pathing/reference/coordinates) | Field axes, units, headings |
| [Follow states](https://pedropathing.com/docs/pathing/guide/follow-state) | Completion and pose telemetry |
| [Following paths](https://pedropathing.com/docs/pathing/guide/path-following) | Optional Ivy integration |
| [Inspected Follower source](https://github.com/Pedro-Pathing/PedroPathing/blob/cf4be31449a8963af3a7ce7951de09fd163bbb3d/core/src/main/java/com/pedropathing/follower/Follower.java) | Constructor order, follow, pose, isBusy, stop, and IDLE update |

## Versions and attribution

The Pedro example uses the Pedro 3 API. Examples for older versions may use different packages, constructors, and method names. Recheck dependencies before upgrading.

Michael requested and directed this collection. ChatGPT drafted the explanations and example code, with references to the sources above. These files are teaching examples; they are not presented as Michael's independently authored competition code or as tested team results.

The repository's [license](../../../LICENSE) covers its original documentation subject to third-party terms. FIRST's SDK, Pedro Pathing, REV materials, and other dependencies retain their own licenses and attribution requirements. No third-party project or library source distribution is included in this folder.
