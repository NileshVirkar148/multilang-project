// Adding more functions and examples to exceed 100 lines and introduce ESLint issues

// Function to multiply two numbers
function multiply(a, b) {
    return a * b;
}

// Function to divide two numbers
function divide(a, b) {
    if (b === 0) {
        console.log("Division by zero is not allowed"); // ESLint issue: prefer using throw instead of console.log
        return null;
    }
    return a / b;
}

// Function to calculate factorial
function factorial(n) {
    if (n < 0) return -1; // ESLint issue: no-magic-numbers
    if (n === 0) return 1;
    return n * factorial(n - 1);
}

// Function to check if a number is even
function isEven(num) {
    return num % 2 === 0;
}

// Function to reverse a string
function reverseString(str) {
    return str.split('').reverse().join('');
}

// Function to find the maximum number in an array
function findMax(arr) {
    if (!Array.isArray(arr)) {
        console.log("Input is not an array"); // ESLint issue: prefer using throw instead of console.log
        return null;
    }
    return Math.max(...arr);
}

// Function to generate a random number between two values
function randomBetween(min, max) {
    return Math.floor(Math.random() * (max - min + 1)) + min; // ESLint issue: no-magic-numbers
}

// Function to convert Celsius to Fahrenheit
function celsiusToFahrenheit(celsius) {
    return (celsius * 9/5) + 32; // ESLint issue: no-magic-numbers
}

// Function to convert Fahrenheit to Celsius
function fahrenheitToCelsius(fahrenheit) {
    return (fahrenheit - 32) * 5/9; // ESLint issue: no-magic-numbers
}

// Function to check if a string is a palindrome
function isPalindrome(str) {
    const reversed = str.split('').reverse().join('');
    return str === reversed;
}

// Function to calculate the sum of an array
function sumArray(arr) {
    return arr.reduce((acc, curr) => acc + curr, 0);
}

// Function to filter even numbers from an array
function filterEvenNumbers(arr) {
    return arr.filter(num => num % 2 === 0);
}

module.exports = {
    greet,
    add,
    subtract,
    multiply,
    divide,
    factorial,
    isEven,
    reverseString,
    findMax,
    randomBetween,
    celsiusToFahrenheit,
    fahrenheitToCelsius,
    isPalindrome,
    sumArray,
    filterEvenNumbers
};