# Project story

[All projects](../../README.md) · [Project home](README.md) · [Project story](build-log.md) · [Code images](photos.md) · [Checks](results.md) · [References](sources.md)

In late September 2026, my Principles of Engineering class at CTC got me interested in gear ratios and how they affect torque and speed. I wanted to understand what happens when you change gear sizes or connect several gears together, so I thought a simple calculator would be a fun project.

I knew there were websites that could already do this. My original goal was to try building something by hand and get more firsthand coding experience. The entirety of this project was hand made with no use of ai. Only Google and some Reddit discussions were used to help with code and math equations. 
## The idea

Choose between two and nine gears, enter their tooth counts or pitch diameters, and enter the input torque and RPM. The output shows the total ratio, speed, torque, and direction. It also lists the values at each gear.

## What is in the code

HTML puts the inputs and buttons on the page, CSS controls the layout, and JavaScript does the math. Arrays store the gear sizes and connection types. A loop goes through the connections and multiplies the individual ratios together.

External meshes reverse direction. Gears fixed to the same shaft rotate together, so that connection has a ratio of one. Chain connections keep the same direction and use tooth counts.

The number of gear rows changes when I select a different gear count. There are checks for empty fields, negative sizes, and tooth counts that are not whole numbers. The example button loads a compound train, and Reset returns to two gears.

## What made the ratios interesting

Adding gears does not automatically increase the final ratio. Intermediate gears on separate shafts cancel out of the ratio, although they affect direction. Different-sized gears on a shared shaft let you combine reductions.

For example, a 12-tooth gear driving a 36-tooth gear gives a 3:1 reduction. A 10-tooth gear on that second shaft driving a 40-tooth gear adds a 4:1 reduction. Together that makes 12:1: an input of 120 RPM becomes 10 RPM, with twelve times the input torque under ideal conditions.

## The result

The calculator is pretty janky. Some boxes do not line up, the spacing is uneven, and the buttons are basic. That is the rough appearance I wanted for this version. It works for trying combinations and checking the math, but a real mechanism will lose some power to friction.

[Download instructions and code](README.md#use-the-calculator)
