import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-forms',
  templateUrl: './forms.component.html',
  styleUrls: ['./forms.component.css']
})
export class FormsComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }
  loginData(form: NgForm) {
    console.log(form.value);
  }

  details(forms: NgForm) {
    console.log(forms.value);
  }

  submitData(form1: NgForm) {
    console.log(form1.value);
  }

  requestData(form3: NgForm) {
    console.log(form3.value);
  }
}
