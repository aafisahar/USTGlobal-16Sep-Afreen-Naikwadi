import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bike',
  templateUrl: './bike.component.html',
  styleUrls: ['./bike.component.css']
})
export class BikeComponent implements OnInit {
  selectedBike;

  Bikes = [
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg',
      name : 'BMW',
      model : 'Model : 1945',
      description : 'The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2019/03/15/09/09/bike-4056618__340.jpg',
      name : 'Suzuki',
      model : 'Model : 2015',
      description : 'The Suzuki has 1 kerosine Engine and 1 Diesel Engine on offer. The Diesel engine is 1248 cc while the kersine engine is 466 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Suzuki is a 5 seater Hatchback and has a length of 3840mm.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2014/10/24/08/31/motorcycle-500910__340.jpg',
      name : 'Kawasaki',
      model : 'Model : 2010',
      description : 'The Lamborghini Swift has 1 Lamborghini Engine and 1 Lamborghini Engine on offer. The Diesel engine is 5000 cc while the Petrol engine is 5000 cc. Depending upon the variant and fuel type the Swift has a mileage of 3.0 to 5.0 kmpl. The Swift is a 5 seater Hatchback and has a length of 5000.'
    },
    {
      imgUrl : 'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
      name : 'Royal Enfeild',
      model : 'Model : 2019',
      description : 'The Ferrari 812 Superfast, replacement for the F12berlinetta, is one of the few exotic cars still equipped with a V12. The front-mounted 6.5L engine produces 800 horsepower and 530 lb. ft of torque and barely weighs 1600 kilos. Performance is mind-blowing (0-100 km/h in 2.9 seconds) and the engine sound is exquisite.'
    }
  ];
  
  constructor() { }

  ngOnInit() {
  }
  sendBike(bike) {
    this.selectedBike = bike;
    console.log(bike);
  }

}
