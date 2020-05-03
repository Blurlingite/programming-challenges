// https://www.hackerrank.com/challenges/migratory-birds/problem
// let arr = [1, 4, 2, 3, 2, 3, 4];
let arr = [1, 4, 4, 4, 5, 3];

let seenBirds = {};

arr.forEach((bird) => {
  // if the current num in array (bird) is not in object yet...
  if (!seenBirds[bird]) {
    // Add it to the object using that num as the key. Then assign it a 1 which represents the amount of times that num appears in the array
    seenBirds[bird] = 1;
  }
  // Otherwise, if it does exist in the object as a key already...
  else {
    seenBirds[bird]++; // add 1 to it's value (adds 1 to the amount of times it appears in the array). So if we already had seenBirds[2] and an amount of appearances equal to 1, it looks like this: "2":1. Then after incrementing, seenBirds[2]++, we get "2":2
  }
});

let birdId = 999;
let total = 0;

// go thru keys in object
for (let key in seenBirds) {
  // is it seen more?
  // access value of key and see if it's greater than total
  if (seenBirds[key] > total) {
    // set total to the value of that key (amount of appearances)
    total = seenBirds[key];
    // also set the birdId to that key
    birdId = key;
  } else if (seenBirds[key] == total) {
    // is it the same?
    // is the bird's ID less than the current bird ID/
    if (key < birdId) {
      birdId = key;
    }
  }
}
console.log(birdId);
// return birdId;
