let array1 = [3, 6, 4, 7, 2, 1, 9];
let searchNum = 1;

function getIndexInArray(arr, searchNum) {
    for (let i = arr.length; i >= 0; i--) {
        if (arr[i] === searchNum) {
            return i;
        }
    }
    return -1;
}

console.log(getIndexInArray(array1, searchNum)) // => 5


/*------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------*/
/*------------------------------------------------------------------------------------------------*/


let array2 = [3, 6, 4, 7, 2, 1, 9];

function arrPow(arr) {
    let sum = 0;
    for (let el of arr) {
        sum += el ** 2;
    }

    return sum;
}

console.log(arrPow(array2)); // => 196