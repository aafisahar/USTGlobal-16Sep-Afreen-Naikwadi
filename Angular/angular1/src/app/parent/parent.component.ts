import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-parent',
  templateUrl: './parent.component.html',
  styleUrls: ['./parent.component.css']
})
export class ParentComponent implements OnInit {

  selectedCar;

Cars = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    name : 'Audi'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
    name : 'Lamberghini'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
    name : 'Mercidies'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/02/21/03/15/bmw-m4-3169357__340.jpg',
    name : 'BMW'
  }
];

  constructor() { }

  ngOnInit() {
  }

  sendCar(car) {
    this.selectedCar = car;
    console.log(car);
  }

}
