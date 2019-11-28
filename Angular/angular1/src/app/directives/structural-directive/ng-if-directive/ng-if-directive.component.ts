import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ng-if-directive',
  templateUrl: './ng-if-directive.component.html',
  styleUrls: ['./ng-if-directive.component.css']
})
export class NgIfDirectiveComponent implements OnInit {
 showOrHide = false;
  constructor() {
    setTimeout(() => {
      this.showOrHide = true;
    }, 2000);
  }

  ngOnInit() {
  }

}
