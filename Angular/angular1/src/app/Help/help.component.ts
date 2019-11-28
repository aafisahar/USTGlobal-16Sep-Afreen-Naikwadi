import { Component } from '@angular/core';


@Component({
    selector : 'app-help',
    templateUrl : './help.component.html',
    styleUrls : ['./help.component.css']
})



export class HelpComponent {
isActive = true;

    constructor() {
        setInterval(() => {
       this.isActive = !this.isActive;
        }, 3000);
    }
}
