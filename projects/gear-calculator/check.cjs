const fs = require('node:fs');
const vm = require('node:vm');
const assert = require('node:assert/strict');
const html = fs.readFileSync(__dirname + '/Gear_Calculator.html', 'utf8');
const script = html.match(/<script>([\s\S]*?)<\/script>/)[1];
const context = { module: { exports: {} } };
vm.runInNewContext(script, context);
const calculate = context.module.exports.calculateTrain;
const cases = [
  [[20,40], ['mesh'], 1,100, 2,2,50,-1],
  [[40,20], ['mesh'], 1,100, .5,.5,200,-1],
  [[20,80,40], ['mesh','mesh'], 1,100, 2,2,50,1],
  [[12,36,10,40], ['mesh','shaft','mesh'], 1,120, 12,12,10,1],
  [[40,20], ['chain'], 1,100, .5,.5,200,1],
  [Array(9).fill(20), Array(8).fill('mesh'), 1,100, 1,1,100,1],
  [[20,40], ['mesh'], 0,0, 2,0,0,-1]
];
for (const [sizes,links,t,r,ratio,torque,speed,direction] of cases) {
  const out = calculate(sizes,links,t,r).at(-1);
  for (const [key,expected] of Object.entries({ratio,torque,speed,direction})) assert.equal(out[key],expected);
}
console.log('7 calculation cases passed.');
