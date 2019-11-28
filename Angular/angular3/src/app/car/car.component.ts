import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-car',
  templateUrl: './car.component.html',
  styleUrls: ['./car.component.css']
})
export class CarComponent implements OnInit {

  selectedCar;

Cars = [
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2015/01/19/13/51/car-604019__340.jpg',
    name : 'Audi',
    model : 'Model : 2015',
    description : 'Audi A3 Variants & Price: The Audi A3 is available in two variants: Premium Plus and Technology, priced from Rs 28.99 lakh to 31.99 lakh (ex-showroom pan-India). Audi A3 Engines: The A3 comes with a 1.4-litre TFSI turbocharged petrol engine that makes 150PS of power and 250Nm.'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2012/04/12/23/47/car-30984__340.png',
    name : 'Lamberghini',
    model : 'Model : 2015',
    description : 'The Petrol engine is 6498 cc. It is available with the Automatic transmission. Depending upon the variant and fuel type the Aventador has a mileage of 5.0 to 7.69 kmpl. The Aventador is a 2 seater Coupe and has a length of 4843 mm, width of 2273 mm and a wheelbase of 2700mm.' 
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220__340.jpg',
    name : 'Mercidies',
    model : 'Model : 2015',
    description : 'The Mercedes-Benz E-Class has 2 Diesel Engine and 2 Petrol Engine on offer. ... Depending upon the variant and fuel type the E-Class has a mileage of 10.98 to 18.0 kmpl. The E-Class is a 5 seater Sedan and has a length of 4988mm, width of 1907mm and a wheelbase of 2939mm.'
  },
  {
    imgUrl : 'https://cdn.pixabay.com/photo/2018/02/21/03/15/bmw-m4-3169357__340.jpg',
    name : 'BMW',
    model : 'Model : 2010',
    description : 'BMW cars price starts at Rs. 35.20 lakh for the cheapest car X1 and goes up to Rs. 2.43 crore for the top model BMW 7 Series. BMW offers 14 new car models in India. X1 (Rs. 35.20 lakh), Z4 (Rs. 64.90 lakh) and 3 Series GT (Rs. 47.70 lakh) are among the popular cars from BMW.'
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
