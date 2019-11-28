//Named funtion
function add(num1,num2)
{
    console.log('Sum = ',num1+num2);
}
add(10,30);
//No method overloading in JS
function add(num1,num2,num3)
{
    console.log('Sum = ',num1+num2+num3);
}
//Funtion expression
var sub = function(num1,num2){
    var subValue=num1-num2;
    return subValue;
}
var value = sub(20,10);
console.log('Sub = ',value);
//Self Invoked Function
(function(n1,n2){
    console.log('value = ',n1*n2);
})(10,30)
//Fat Arrow Funtions
//1.with paranthesis(because more than 1 parameter)
var div=(n1,n2)=>{
    console.log('value = ',n1/n2);
}
div(10,5);
//2.without paranthesis(because single parameter)
var div2=n1=>{
    console.log('value = ',n1);
}
div2(10,5);
//3.without brackets(because single line code)
var div2=n1=>console.log('value = ',n1);
div2(10,5);
//4.No return statement(because single line code,compiler returns the result)
var add1=(num1,num2)=>num1+num2;
var val=add1(5,3);
console.log('value = ',val);
console.log('-------------------------------------');
//calling a function before declaring
greeting('Afreen');
function greeting(name){
    console.log('Hello ',name);
}
//calling a function expression before declaring
greet('Sufi');
var greet = function(msg){
    console.log('Hello ',msg);
}
//calling a fat arrow function before declaring
greets('Sufi');
var greets = (msg)=>{
    console.log('Hello ',msg);
}
