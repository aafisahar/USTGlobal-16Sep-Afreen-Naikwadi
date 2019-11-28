var colors = ['Black','Pink','Red','Blue','Green','White']
console.log('For of Loop')
for(var ele of colors){
    console.log('Colors = ',ele);
}

console.log('========================================')
var flowers = ['Rose','Lily','Jasmine','Lotus'];
console.log('For in Loop')
for(var ind in flowers){
    console.log('Flowers ',ind,flowers[ind])
}

console.log('========================================')
var girl = {
    name : 'Sufi',
    age : 13,
    color : 'white'
}
for(var key in girl){
    console.log('value = ',girl[key]);
}

console.log('========================================')
var movies = ['3 idiots','Chennai Express','Avengers','Harry Potter'];
movies.forEach(function(value,index){
    console.log('movies = ',value);
});

console.log('========================================')
var items = [{
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
items.forEach(function(item,index){
    console.log('Item = ',item);
    console.log('Index of item = ',index);
})
console.log('========================================')

for(var i=0;i<5;i++)
{
    console.log('Inside for loop ', i)
}
console.log('Outside for loop ', i);


for(let j=0;j<5;j++)
{
    console.log('Inside for  ', j)
}
console.log('Outside for loop ', j);