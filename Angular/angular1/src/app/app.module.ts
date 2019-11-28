import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './Header/header.component';
import { HomeComponent } from './Home/home.component';
import { AboutComponent } from './About/about.component';
import { HelpComponent } from './Help/help.component';
import { RouterModule } from '@angular/router';
import { LoginComponent } from './Login/login.component';
import { FooterComponent } from './footer/footer.component';
import { DataBindingComponent } from './data-binding/data-binding.component';
import { PropertyBindingComponent } from './data-binding/property-binding/property-binding.component';
import { EventBindingComponent } from './data--binding/event-binding/event-binding.component';
import { TwoWayBindingComponent } from './data-binding/data-binding/two-way-binding/two-way-binding.component';
import { StructuralDirectiveComponent } from './directives/structural-directive/structural-directive.component';
import { NgIfDirectiveComponent } from './directives/structural-directive/ng-if-directive/ng-if-directive.component';
import { NgforDirectiveComponent } from './directives/structural-directive/ngfor-directive/ngfor-directive.component';
import { NgSwitchDirectiveComponent } from './directives/structural-directive/ng-switch-directive/ng-switch-directive.component';
import { CustomDirective } from './custom.directive';
import { FormsComponent } from './forms/forms.component';
import { RegisterPageComponent } from './register-page/register-page.component';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    HomeComponent,
    AboutComponent,
    HelpComponent,
    LoginComponent,
    FooterComponent,
    DataBindingComponent,
    PropertyBindingComponent,
    EventBindingComponent,
    TwoWayBindingComponent,
    StructuralDirectiveComponent,
    NgIfDirectiveComponent,
    NgforDirectiveComponent,
    NgSwitchDirectiveComponent,
    CustomDirective,
    FormsComponent,
    RegisterPageComponent,
    ParentComponent,
    ChildComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'about', component : AboutComponent},
      {path : 'help', component : HelpComponent},
      {path : 'property-binding', component : PropertyBindingComponent},
      {path : 'event-binding', component : EventBindingComponent},
      {path : 'two-way-binding', component : TwoWayBindingComponent},
      {path : 'ng-if', component : NgIfDirectiveComponent},
      {path : 'ng-for', component : NgforDirectiveComponent},
      {path : 'ng-switch', component : NgSwitchDirectiveComponent},
      {path : 'form', component : FormsComponent},
      {path : 'reactive-form', component : RegisterPageComponent},
      {path : 'parent', component : ParentComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
