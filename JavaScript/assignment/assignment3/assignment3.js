//Array1
var fruits = ['Orange','Mango','Apple','Banana'];
                        
//Array2
var vegitable = ['Carrot','Onion','Ladyfinger','Patato'];
                
//Array3
var cartoon = ['PokeMon','DigiMon','MixMaster','IronMan'];
                
//Array4
var company = ['UST','Wipro','Infosys','Test Yantra'];

//Array5
var socialSite = ['Facebook','WhatsApp','Hike','Tweeter'];

//Array6
var color = new Array('Red','Blue','Yellow','Green');

//Array7
var laptop = new Array('hp','Dell','Sony','Lenevo');

//Array8
var country1 = new Array('India','Nepal','USA','UK');

//Array9
var bird = new Array('Parrot','Crow','Pigeon','Peacock');

//Array10
var tree = new Array('Banyan','Bamboo','Mango','Coconut');
//Loop through Arrays Using For Loop
console.log('Using For Loop');
//Array1
for(var i=0;i<fruits.length;i++)
{
  console.log('Fruits = ',fruits[i]);
}
console.log('=============');
//Array2
for(var i=0;i<vegitable.length;i++)
{
  console.log('Vegitable = ',vegitable[i]);
}
console.log('=============');
//Array3
for(var i=0;i<cartoon.length;i++)
{
  console.log('Cartoon = ',cartoon[i]);
}
console.log('=============');
//Array4
for(var i=0;i<company.length;i++)
{
  console.log('Company = ',company[i]);
}
console.log('=============');
//Array5
for(var i=0;i<socialSite.length;i++)
{
  console.log('SocialSites = ',socialSite[i]);
}
console.log('=============');
//Array6
for(var i=0;i<color.length;i++)
{
  console.log('Color = ',color[i]);
}
console.log('=============');
//Array7
for(var i=0;i<laptop.length;i++)
{
  console.log('Laptop = ',laptop[i]);
}
console.log('=============');
//Array8
for(var i=0;i<country1.length;i++)
{
  console.log('Country1 = ',country1[i]);
}
console.log('=============');
//Array9
for(var i=0;i<bird.length;i++)
{
  console.log('Bird = ',bird[i]);
}
console.log('=============');
//Array10
for(var i=0;i<tree.length;i++)
{
  console.log('Tree = ',tree[i]);
}
console.log('=============');
console.log('Using For of');
//Array1
for(var ele of fruits)
{
  console.log('Fruits = ',ele);
}
console.log('=============');
//Array2
for(var ele1 of vegitable)
{
  console.log('Vegitable = ',ele1);
}
console.log('=============');
//Array3
for(var ele2 of cartoon)
{
  console.log('Cartoon = ',ele2);
}
console.log('=============');
//Array4
for(var ele3 of company)
{
  console.log('Company = ',ele3);
}
console.log('=============');
//Array5
for(var ele4 of socialSite)
{
  console.log('SocialSites = ',ele4);
}
console.log('=============');
//Array6
for(var ele5 of color)
{
  console.log('Color = ',ele5);
}
console.log('=============');
//Array7
for(var ele6 of laptop)
{
  console.log('Laptop = ',ele6);
}
console.log('=============');
//Array8
for(var ele7 of country1)
{
  console.log('Country1 = ',ele7);
}
console.log('=============');
//Array9
for(var ele8 of bird)
{
  console.log('Bird = ',ele8);
}
console.log('=============');
//Array10
for(var ele9 of tree)
{
  console.log('Tree = ',ele9);
}
console.log('=============');
console.log('Using forEach Method');
//Array1
fruits.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array2
vegitable.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array3
cartoon.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array4
company.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array5
socialSite.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array6
color.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array7
laptop.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array8
country1.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array9
bird.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
//Array10
tree.forEach(function(val,index){
    console.log('Value = ',val);
    console.log('Index = ',index);
})
console.log('=============');
console.log('Using For in loop in Array');
//Array1
for(var i in fruits)
{
  console.log('Fruits = ',fruits[i]);
}
console.log('=============');
//Array2
for(var j in vegitable)
{
  console.log('Vegitable = ',vegitable[j]);
}
console.log('=============');
//Array3
for(var k in cartoon)
{
  console.log('Cartoon = ',cartoon[k]);
}
console.log('=============');
//Array4
for(var l in company)
{
  console.log('Company = ',company[l]);
}
console.log('=============');
//Array5
for(var m in socialSite)
{
  console.log('SocialSites = ',socialSite[m]);
}
console.log('=============');
//Array6
for(var n in color)
{
  console.log('Color = ',color[n]);
}
console.log('=============');
//Array7
for(var o in laptop)
{
  console.log('Laptop = ',laptop[o]);
}
console.log('=============');
//Array8
for(var p in country1)
{
  console.log('Country1 = ',country1[p]);
}
console.log('=============');
//Array9
for(var q in bird)
{
  console.log('Bird = ',bird[q]);
}
console.log('=============');
//Array10
for(var r in tree)
{
  console.log('Tree = ',tree[r]);
}
console.log('=============');
console.log('Using For in loop for Objects');
//Object1
var player = {
    name : 'Gautam Gambhir',
    age : 37,
    jersyno : 5,
  }
for (var key in player){
    console.log('Value = ',player[key])
}
console.log('=============');
//Object2
var train = {
    name : 'Gatiman',
    coaches : 12,
    number : 12215,
  }
for (var key in train){
    console.log('Value = ',train[key])
}
console.log('=============');
//Object3
var fan = {
    name : 'Orient',
    price : 7500,
    color : 'Grey',
  }
for (var key in fan){
    console.log('Value = ',fan[key])
}
console.log('=============');
//Object4
var shoes = {
    brand : 'Reebok',
    color : 'Black and Red',
    size : 9,
  }
for (var key in shoes){
    console.log('Value = ',shoes[key])
}
console.log('=============');
//Object5
var car = {
    name : 'Honda City',
    price : 1400000,
    color : 'Black',
  }
for (var key in car){
    console.log('Value = ',car[key])
}
console.log('=============');
//Object6
var flower = {
    name : 'Rose',
    color : 'Red',
  }
for (var key in flower){
    console.log('Value = ',flower[key])
}
console.log('=============');
//Object7
var country = {
    name : 'India',
    states : 29,
    flag : 'TriColor',
  }
for (var key in country){
    console.log('Value = ',country[key])
}
console.log('=============');
//Object8
var shirt = {
    name : 'PeterEngland',
    price : 1200,
    color : 'Blue',
  }
for (var key in shirt){
    console.log('Value = ',shirt[key])
}
console.log('=============');
//Object9
var mobile = {
    name : 'Galaxy S Duos 2',
    price : 10000,
    color : 'Black',
  }
for (var key in mobile){
    console.log('Value = ',mobile[key])
}
console.log('=============');
//Object10
var animal = {
    name : 'Lion',
    legs : 4,
    color : 'Yellow',
  }
for (var key in animal){
    console.log('Value = ',animal[key])
}