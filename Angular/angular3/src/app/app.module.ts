import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { BikeComponent } from './bike/bike.component';
import { HomeComponent } from './home/home.component';
import { CarComponent } from './car/car.component';
import { CarChildComponent } from './car-child/car-child.component';
import { BikeChildComponent } from './bike-child/bike-child.component';
import { LaptopsComponent } from './laptops/laptops.component';
import { LaptopschildComponent } from './laptopschild/laptopschild.component';
import { MobilesComponent } from './mobiles/mobiles.component';
import { MobileschildComponent } from './mobileschild/mobileschild.component';
import { MoviesComponent } from './movies/movies.component';
import { MovieschildComponent } from './movieschild/movieschild.component';
import { CommentComponent } from './comment/comment.component';
import { CommentDetailsComponent } from './comment-details/comment-details.component';
import { RegisterComponent } from './register/register.component';
import { from } from 'rxjs';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BikeComponent,
    HomeComponent,
    CarComponent,
    CarChildComponent,
    BikeChildComponent,
    MoviesComponent,
    MovieschildComponent,
    LaptopsComponent,
    LaptopschildComponent,
    MobilesComponent,
    MobileschildComponent,
    CommentComponent,
    CommentDetailsComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path : 'home', component : HomeComponent},
      {path : 'car', component : CarComponent},
      {path : 'bike', component : BikeComponent},
      {path : 'movie', component : MoviesComponent},
      {path : 'laptop', component : LaptopsComponent},
      {path : 'mobile', component : MobilesComponent},
      {path : 'comment', component : CommentDetailsComponent},
      {path : 'register', component : RegisterComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
