# 08 · Autonomous and state machines

[All projects](../../../README.md) · [Project home](README.md) · [Guides](guides.md) · [Examples](examples/README.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

**Question:** How do I run a sequence without freezing the loop?

## Before you start

Use [SequenceDemo.java](examples/SequenceDemo.java). It has no moving hardware: it displays a simulated sequence. This lets you understand timing before attaching actuators.

## Step by step

1. List your sequence: begin movement, wait for completion, operate a mechanism, finish.
2. Give each action a state name, such as `APPROACH`, `ACTUATE`, and `DONE`.
3. Create one state variable and one `ElapsedTime` timer outside the loop.
4. Enter the first state after PLAY and reset its timer.
5. On each loop, use `switch (state)` to inspect only the current state's condition.
6. Change state and reset the timer once when a condition is met.
7. Continue telemetry and other subsystem updates every loop.
8. Include a timeout for any action that might never complete. On failure, stop the affected hardware and move to a clear failure/finished state.

## What makes this nonblocking?

A state machine checks a condition and returns to the main loop immediately. It does not sit inside `while (motor.isBusy())` or `sleep(2000)` while other tasks need updates. A simple isolated encoder test can use a guarded wait; a combined autonomous needs regular updates to every active subsystem.

In a real routine, replace the demo's time-based transition with a sensor, encoder, or follower completion condition. Start an action once when entering a state; do not repeatedly reset its target or restart its path every loop.

## Try it

Run **Guide - Sequence**. APPROACH should last about one second, ACTUATE about half a second, and DONE should persist. Press STOP during either active state to check responsiveness. Change only one duration and rerun.

## If it does not work

If a state never finishes, display its completion condition and elapsed time. If a timer never advances, it may be reset every loop. If later states run immediately, check the `break` statements and transition logic.

## Extend it

After this display-only demo works, add one mechanism at a time. Keep drivetrain and mechanism updates separate. A command framework can organize larger sequences; Pedro's official guide recommends Ivy. The Pedro lesson here uses a small explicit state sequence to expose the basic lifecycle without adding that dependency.

## Read next

[Organization](09-organization.md), then [Pedro setup](10-pedro-setup.md).
