// Given an array of integers, find and print the maximum number of integers you can select
// from the array such that the absolute difference between any two of the chosen integers is
// less than or equal to.For example, if your array is: a=[1,1,2,2,4,4,5,5,5], you can create two
// subarrays meeting the criterion: [1,1,2,2] and [4,4,5,5,5].The maximum length subarray has 5 elements.

let a = [4, 6, 5, 3, 3, 1];

let b = [];
let bCounter = 0;
let currentNum;
let nextNum;

// sort array
for (let t = 0; t < a.length; t++) {
  for (let s = 0; s < a.length; s++) {
    currentNum = a[s];
    nextNum = a[s + 1];

    if (nextNum < currentNum) {
      a[s] = nextNum;
      a[s + 1] = currentNum;
    }
  }
}

for (let i = 0; i < a.length; i++) {
  currentNum = a[i];
  b.push(currentNum);
  for (let j = i + 1; j < a.length; j++) {
    if (a[j] === currentNum) {
      b.push(currentNum);
    }

    if (a[j] === currentNum + 1) {
      b.push(a[j]);
    }
  }
  if (bCounter < b.length) {
    bCounter = b.length;
  }

  b = [];
}

return bCounter;
// console.log(bCounter);
