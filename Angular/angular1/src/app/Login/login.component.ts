import { Component } from '@angular/core';


@Component({
    selector : 'app-login',
    templateUrl : './login.component.html',
    styleUrls : ['./login.component.css']
})



export class LoginComponent {
    constructor() {}

    loginData(form) {
        console.log(form.value);
    }
}
