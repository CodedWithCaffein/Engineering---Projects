# Checks and limits

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Blocks pictures](blocks.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

## Review scope

This is a written reference and set of teaching examples. It does not yet document physical robot results.

| Check | Status |
| --- | --- |
| Twelve subjects and eight standalone Java examples | Included |
| Twelve Blocks-style illustrations covering all eight examples and additional lesson fragments | Included; SVGs rendered and inspected for layout |
| Blocks editor imports or execution | Not performed; pictures are illustrations, not .blk programs |
| Project navigation, relative file links, and guide order | Checked before publication |
| Pedro API names and constructor order | Compared with current official docs and inspected upstream source |
| Robot-specific motor directions, servo range, and localization calibration | Must be configured on the actual robot |
| Android Studio build against the listed dependencies | Not performed in this session |
| Physical movement, STOP behavior, tracking accuracy, and repeatability | Not tested in this session |

## Robot verification sequence

1. Build TelemetryBasics and SequenceDemo first; neither commands hardware.
2. Confirm motor identity, direction, and encoder feedback with an unloaded motor.
3. Test the servo with linkage detached or verified clearance.
4. Test mecanum directions with wheels clear, then on the floor at low power.
5. Check IMU mounting and yaw sign before adding field-centric control.
6. Complete Pedro localization and follower tuning before running PedroFirstPath.
7. Test STOP, timeout, restart, and repeated successful runs.

Keep a record of the code revision, configuration, starting conditions, repeat count, and measured error. Report inches/degrees for path error and ticks for encoder error. A controller reporting completion is not an independent measurement of physical success.

## Current limits

These examples use generic hardware names and deliberately small demonstrations. They do not include a complete season-specific autonomous, homing system, lift controller, vision pipeline, or the team's match code. The Pedro example requires a real tuned Constants factory. Do not treat its sample coordinates as a competition route.
