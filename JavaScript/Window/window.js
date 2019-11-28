console.log('Window Object ',window)
console.log('This keyword ',this)
console.log(this==window)

window.alert('Welcome to world')
alert('Welcome to this world')

let confirmDelete = confirm('Are you sure you want to delete')
console.log('Confirm Delete',confirmDelete)

let usename = prompt('What is your name','Afreen')
console.log('Username ', usename)

const person = {
    firstName : 'Afreen',
    age : 22,
    lastName : 'Sahar',
    getName : function(){
        console.log('This keyword ',this)
        return this.firstName+' '+this.lastName
    }
}
let fullName = person.getName()
console.log('Full Name = ',fullName);