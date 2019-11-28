let myName : string = "Afreen";
console.log('My name is ', myName, typeof myName);

let age = 22;
console.log('age ', age, typeof age)

let mobileNumber : number;
console.log('mobile no ', mobileNumber, typeof mobileNumber);

let address;
console.log('Address ', address, typeof address);

let momName = function() : void{
    console.log('My mother name is Fatima');
}
momName();

class Person{
    constructor(public name : string, public age : number ){

    }
}
let person1 = new Person('Afreen', 22)
console.log(person1);

class Student extends Person{
    constructor(name : string, age : number, public rollNumber : number){
     super(name, age);
    }
}
let studengt1 = new Student('Afreen', 22, 72);
console.log(studengt1);