// Write a Javascript program that generates a multiplication table for a given number using a for loop  
let number = prompt("\n Enter a number :");
let container = document.getElementsByClassName("container")[0]
for (let i = 1; i <=10; i++) {
    const table = number*i;
    container.innerHTML = `${number} * ${i} = ${table}`
    // console.log(`${number} * ${i} = ${table}`)
}
console.log("\n The number is ", number)