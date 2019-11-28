import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ngfor-directive',
  templateUrl: './ngfor-directive.component.html',
  styleUrls: ['./ngfor-directive.component.css']
})
export class NgforDirectiveComponent implements OnInit {
  Products = [
    {
      img : 'https://cdn.pixabay.com/photo/2017/09/07/22/31/lipstick-2726989__340.jpg',
      name : 'Lipstick',
      price : 'Rs.499/-'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2013/07/10/21/26/perfume-144546__340.jpg',
      name : 'Perfume',
      price : 'Rs.1500/-'
    },
    {
      img : 'https://cdn.pixabay.com/photo/2017/01/16/14/17/make-up-1984115__340.jpg',
      name : 'Eye Shadow',
      price : 'Rs.2599/-'
    },
  ];
  constructor() { }

  ngOnInit() {
  }

}
