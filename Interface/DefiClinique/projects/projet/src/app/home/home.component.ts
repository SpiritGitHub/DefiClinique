import { Component } from '@angular/core';
import {  CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Router } from '@angular/router';
//import { IonicModule } from '@ionic/angular';


@Component({
  selector: 'app-home',
  standalone: true,
  imports: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {
  search() {
    // Implement search logic here
    console.log('Search clicked');
    }
    home = [
      {
        specialty: 'Dentiste',
        startTime: '7h00',
        endTime: '12h00'
      },
      {
        specialty: 'Orthopédiste',
        startTime: '7h00',
        endTime: '12h00'
      },
    ]

    constructor(private router: Router) {}

    navigate(path: string) {
      this.router.navigate([path]);
    }
      // ... autres logiques du composant ...
}
  

