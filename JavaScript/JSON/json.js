const person = {
    name : 'Afreen',
    age : 22,
    color : 'fair',
    address : {
        city : 'Belgaum',
        state : 'Karnataka',
        pincode : 590010
    },
    hobbies : ['Sleeping','Eating','Scrolling Instagram']
}
console.log('JavaScript person Object ', person)
const jsonObject = JSON.stringify(person)
console.log('JSON person Object ', jsonObject)

const jsPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person Object after parse ',jsPersonObject)

localStorage.setItem('email','afreensahar44@gmail.com');
const emailId = localStorage.getItem('email');
console.log('Email Id ', emailId)
localStorage.clear();