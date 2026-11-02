# Gear Calculator — Sources

[All projects](../../README.md) · [Project home](README.md) · [Story](build-log.md) · [Code illustrations](photos.md) · [Results](results.md) · [Sources](sources.md) · [Portfolio](https://github.com/CodedWithCaffein/Michael-Polanczyk-Portfolio)

These are further-reading links checked on October 31, 2026, not a record of websites used during an earlier build.

| Reference | Related part of the calculator |
| --- | --- |
| [MDN: Arrays](https://developer.mozilla.org/en-US/docs/Learn_web_development/Core/Scripting/Arrays) | Keeping gear sizes and connections in lists |
| [MDN: Looping code](https://developer.mozilla.org/en-US/docs/Learn_web_development/Core/Scripting/Loops) | Working through the gear connections in order |

## Assumptions

- External gears must have compatible tooth size and geometry.
- Diameters mean pitch diameters, all in the same unit, not outside diameters.
- Chain-connected sprockets use tooth counts and an uncrossed chain.
- Torque calculations are ideal: no friction, efficiency, or strength limits.
- Same-shaft gears are rigidly connected. There are no branches, differentials, or planetary gears in this model.
- Chain length does not determine the speed ratio.
