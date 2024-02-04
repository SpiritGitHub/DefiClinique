import { Component } from '@angular/core';
import {  CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home-patient',
  standalone: true,
  imports: [],
  templateUrl: './home-patient.component.html',
  styleUrl: './home-patient.component.css'
})
export class HomePatientComponent {

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
    

}
