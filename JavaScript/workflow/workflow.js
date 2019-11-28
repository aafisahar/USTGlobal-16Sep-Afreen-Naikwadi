function first(callBack){
    setTimeout( function(){
        console.log('First Function Executed 1')
        callBack();
    },0)
}
function second(){
    console.log('Second Function Executed 1');
}
first(second);
// second();

// function first1(){
//     setTimeout( function(){
//         console.log('First Function Executed 2');
//     },0)
// }
// function second1(){
//     console.log('Second Function Executed 2');
// }
// first1();
// second1();

// function first2(){
//     setTimeout( function(){
//         console.log('First Function Executed 3');
//     },0)
//     console.log('Executed');
// }
// function second2(){
//     console.log('Second Function Executed 3');
// }
// first2();
//second2();
