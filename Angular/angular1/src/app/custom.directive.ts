import { ElementRef, Directive, HostBinding, HostListener } from '@angular/core';
@Directive ({
    selector : '[custDir]'
})


export class CustomDirective {
    constructor(public el: ElementRef) {
        this.el.nativeElement.style.color = 'yellow';
    }

    @HostBinding('style.backgroundColor') backgroundColor = 'pink';

     @HostListener('mouseover') mouseEnterEvent() {
         this.el.nativeElement.style.backgroundColor = 'green';
     }

     @HostListener('mouseleave') mouseLeaveEvent(){
        this.el.nativeElement.style.backgroundColor = 'pink';
        this.el.nativeElement.style.color = 'red';
    }
}
