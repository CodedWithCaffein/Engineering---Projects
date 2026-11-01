# 11 · Pedro Pathing autonomous

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Blocks pictures](blocks.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I follow a path and add mechanism actions?

## Before you start

Complete [installation and tuning](10-pedro-setup.md). Use [PedroFirstPath.java](examples/PedroFirstPath.java) only inside the configured Pedro 3 project. Its `Constants` import assumes `org.firstinspires.ftc.teamcode.pedro.Constants`.

## Step by step

1. Add the Java example to the TeamCode package.
2. Choose a clear test area and a deliberate starting location. The sample uses a pose at `(24, 24, 0)` and ends at `(36, 24, 0)`; replace these with measured coordinates appropriate to your field.
3. Use `PoseFactory.degrees()` so the pose headings you type are degrees. Pedro's pose getters return heading in radians.
4. During INIT, call `Constants.create(hardwareMap)` and `follower.setPose(startPose)`. This sets the estimated starting pose; it does not move or physically locate the robot.
5. Create a straight path with `Paths.line(startPose, endPose).linear(startPose, endPose)`.
6. Call `follower.follow(path)` once after PLAY. Calling it each loop restarts the path.
7. Call `follower.update()` every active loop. Show pose, mode, busy state, and elapsed time.
8. Wait for `!follower.isBusy()`, with a timeout fallback. The example calls `follower.stop()` and updates once before finishing.
9. Test short paths before curves or mechanisms. The sample length is short, but it does not impose a special low-speed power limit: tune appropriate motion constraints first.

## Understand coordinates

Pedro's standard field coordinates use inches, with the origin at the lower-left in its field diagram. Positive X goes right, positive Y goes up, heading zero faces +X, and positive rotation is counterclockwise. This diagram convention differs from saying "robot forward" or using the official FTC field origin. Use the [official coordinate diagram](https://pedropathing.com/docs/pathing/reference/coordinates) to choose placement.

Do not copy an entire autonomous's coordinates and assume they match your alliance, starting side, robot dimensions, or field obstacles.

## Add a mechanism after a path

Use a small state sequence: FOLLOW → ACTUATE → DONE.

1. Start the path once when entering FOLLOW.
2. Keep `follower.update()` running in the main loop.
3. When the follower finishes, enter ACTUATE and send a servo command once.
4. Wait with a state timer if needed, continuing subsystem and follower updates.
5. Enter DONE and stop or intentionally hold the drivetrain.

Use your mechanism class from lesson 09. Do not place blocking sleeps inside follower updates. If you choose Ivy instead, install it separately and follow Pedro's official scheduler example; this collection's standalone path example does not require it.


## Block-style logic picture

This is a conceptual diagram of the Java workflow, not native FTC Blocks.

![PedroFirstPath logic block-style diagram](media/drawings/pedro.svg)

[Open full-size picture](media/drawings/pedro.svg) · [Blocks picture guide](blocks.md#pedro)

## Try it

Repeat the same path from the same marked start several times. Record final position error in inches, heading error in degrees, battery voltage, and failures. Completion reports alone do not prove physical accuracy.

## If it does not work

A robot that thinks it is already at the end may have the wrong start pose. A correct-looking curve with wrong motion suggests localization, directions, or coordinate assumptions. For missing methods like `followPath` or `getPose`, check version mixing: this baseline uses `follow` and `pose`.

References: [Poses](https://pedropathing.com/docs/pathing/guide/pose-creation), [Paths](https://pedropathing.com/docs/pathing/guide/path-creation), [Follower states](https://pedropathing.com/docs/pathing/guide/follow-state).
