//Promise
const message = new Promise(function(resolve,reject){
    if(30>20){
        resolve([{
            name : 'Bill Gates',
            age : 67
        },
        {
            name : 'Mark Zukerburge',
            age : 38
        },
        {
            name : 'Jeff Bezos',
            age : 45

        }])
    }else{
        reject('Failed')
    }
})
message.then(function(msg){
    console.log('Success Massege : ',msg)
}).catch(function(error){
    console.log('Failure Massege : ',error)
})


const details = new Promise(function(success,failed){
    if(30<20){
        success([{
            name : 'Sadiya',
            age : 23,
            empId : 75
        },
        {
            name : 'Shafiya',
            age : 22,
            empId : 004
        }])
    }else{
        failed('Detailes not found')
    }
})
details.then(function(msg){
    console.log('Employee details : ',msg)
}).catch(function(error){
    console.log('Failure Massege : ',error)
})

// Closures
function outerFunction(counter){
    function innerFunction(){
        let  count;
        count = counter + 10;
        return count
    }
    return innerFunction;
}

let innerFunction = outerFunction(20)
let counter = innerFunction()
console.log('Counter value : ',counter)