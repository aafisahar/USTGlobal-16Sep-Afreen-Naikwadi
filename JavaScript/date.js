var todayDate = new Date();
console.log('Todays Date ',todayDate);
console.log('Day ',todayDate.getDay());
console.log('Year ',todayDate.getFullYear());
console.log('Month ',todayDate.getMonth());
console.log('Date ',todayDate.getDate());
var constMilli = new Date(0);
console.log('Date String Constructor ',constMilli);
var constString = new Date('Nov 10');
console.log('Date String Constructor ',constString);
var constYear = new Date(2018,10);
console.log('Date year Constructor ',constString);