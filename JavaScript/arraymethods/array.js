const hobbies = ['Sleeping','Eating','Badminton','Traveling','Meme'];
console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies)
console.log('hobbies is ', isArrayOrNot)

const hasMeme = hobbies.includes('Meme')
console.log('Has Meme element ', hasMeme)

const pushingElement = hobbies.push('Teasing','Annoying')
console.log('New length ',pushingElement)

const removeLastElement = hobbies.pop();
console.log('Removed element ',removeLastElement)

const addingFirstElement = hobbies.unshift('Music','Dancing');
console.log('Adding elements at first index ', addingFirstElement)

const removeFirstElement = hobbies.shift();
console.log('Removing First element ',removeFirstElement)

const hobbies2 = ['Sleeping','Eating','Badminton','Traveling','Meme'];
console.log('Before splice method ',hobbies2)

hobbies2.splice(2,1,'Scrolling Insta')
console.log('After Splice method ',hobbies2);

const afterSlice = hobbies2.slice(3,4);
console.log('After Slice method ',afterSlice)

console.log('After slice method array is ',hobbies2)

const indexOfMeme = hobbies2.indexOf('Meme',1)
console.log('Index of Meme is ',indexOfMeme)

const joiningOfArrayElement = hobbies2.join('-')
console.log('After Join method: ',joiningOfArrayElement)


const numbers = [100,200,300,400];
const numbers1 = numbers.map(value => value+50);
console.log('New array = ',numbers1);

const num = numbers.filter(function(value,index){
    if(value>200){
        return true
    }else
        return false
    
})
console.log('New array = ',num)

const num1 = numbers.filter(value => value>200);
console.log('New array = ', num1)

console.log('==============================================================')

const items = [{
    item : 'Lipstick',
    id : 1,
    price : 850
},
{
    item : 'earrings',
    id : 2,
    price : 500
},
{
    item : 'kurti',
    id : 3,
    price : 2200
},
{
    item : 'Watch',
    id : 4,
    price : 5000
}];

const items2 = items.map(function(item,index){
    items.price = items.price + 300;
    return item
})
console.log('New price of items = ',items2)
console.log('==============================')


const items3 = items.map((value)=>{
    value.price = value.price + 300
    return value
})
console.log('New price of items = ',items3)
console.log('==================================')

const filteredItems = items.filter((items)=>items.price>1000)
console.log('Filtered items = ',filteredItems)