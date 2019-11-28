let element = document.getElementById('demo')
console.log('Element = ',element)
console.log('Element Text = ',element.textContent)
element.textContent = 'Good Evening'
console.log('==========================================')
let buttonElement = document.createElement('button');
buttonElement.textContent = 'Click here!!'
console.log('Buttin Element ',buttonElement)
document.body.appendChild(buttonElement)

let ulElement = document.createElement('ul')
let liElement = document.createElement('li')
let li2Element =document.createElement('li')
let li3Element = document.createElement('li')

liElement.textContent ='Java'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JavaScript'

ulElement.appendChild(liElement)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

element.style.color = 'blue'
element.style.fontSize = '20px'

function showMessage(){
    alert('Hi Welcome!!!')
}

function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'red'
}

function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black'
}

function printHello(){
   // console.log('Hello')
   let userName = document.getElementById('username').value
   document.getElementById('showusername').textContent = userName;
}

let name = 'Afreen'
let age = 22
let phoneno = 7892564632
console.log('Name is '+name+'Age is '+age+'Phone no is '+phoneno)

console.log(`Name is ${name} Age is ${age} phone no is ${phoneno}`)

console.log(`2 + 2 = ${2+2}`)

//document.getElementById('b1').disabled = false