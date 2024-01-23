import { Component } from '@angular/core';
import {  CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';

@Component({
  selector: 'app-patient-dashboard',
  standalone: true,
  imports: [],
  schemas: [CUSTOM_ELEMENTS_SCHEMA],
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




