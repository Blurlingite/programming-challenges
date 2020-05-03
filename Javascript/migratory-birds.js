// https://www.hackerrank.com/challenges/migratory-birds/problem
let arr = [1, 4, 2, 3, 2, 3, 4];
// let arr = [1, 4, 4, 4, 5, 3];

let seenBirds = {};

arr.forEach((bird) => {
  if (!seenBirds[bird]) {
    seenBirds[bird] = 1;
  } else {
    seenBirds[bird]++;
  }
});

let birdId = 999;
let total = 0;

for (let key in seenBirds) {
  // is it seen more?
  if (seenBirds[key] > total) {
    total = seenBirds[key];
    birdId = key;
  } else if (seenBirds[key] == total) {
    // is it the same?
    // is the bird's ID less than the current bird ID/
    if (birdId > key) {
      birdId = key;
    }
  }
}
console.log(birdId);
// return birdId;
