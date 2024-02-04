import { Component } from '@angular/core';

@Component({
  selector: 'app-patient-dashboard',
  standalone: true,
  imports: [],
  templateUrl: './patient-dashboard.component.html',
  styleUrl: './patient-dashboard.component.css'
})
export class PatientDashboardComponent {

  search() {
    // Implement search logic here
    console.log('Search clicked');
    }
    section1Active: boolean = false;

  toggleSection1() {
    this.section1Active = !this.section1Active;
  }

}
