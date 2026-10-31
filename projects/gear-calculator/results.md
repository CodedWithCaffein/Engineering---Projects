# Checks and limitations

[All projects](../../README.md) · [Project home](README.md)

Calculation checks run on the JavaScript extracted from the downloadable HTML file.

| Case | Input | Expected output |
| --- | --- | --- |
| Reduction | 20 → 40 teeth, 1 N·m, 100 RPM | 2:1, 2 N·m, 50 RPM, opposite direction |
| Speed increase | 40 → 20 teeth, 1 N·m, 100 RPM | 0.5:1, 0.5 N·m, 200 RPM, opposite direction |
| Intermediate gear | 20 → 80 → 40 teeth, 1 N·m, 100 RPM | 2:1, 2 N·m, 50 RPM, same direction |
| Compound example | 12 → 36 / 10 → 40, shared middle shaft, 1 N·m, 120 RPM | 12:1, 12 N·m, 10 RPM, same direction |
| Chain | 40 → 20 teeth, 1 N·m, 100 RPM | 0.5:1, 0.5 N·m, 200 RPM, same direction |
| Nine equal gears | Nine 20-tooth gears, eight meshes, 1 N·m, 100 RPM | 1:1, 1 N·m, 100 RPM, same direction |
| Zero input | 20 → 40 teeth, 0 N·m, 0 RPM | 0 N·m, 0 RPM |

Run the repeatable checks with `node check.cjs` from this folder. Node is only needed for these checks, not to use the calculator.

Browser interaction and appearance have not been verified because the available browser capture tool was blocked. These automated checks validate the calculation function, not every browser control. No physical torque or speed measurements have been made for this version.
