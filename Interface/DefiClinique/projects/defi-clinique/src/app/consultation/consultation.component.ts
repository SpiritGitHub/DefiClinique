import { Component } from '@angular/core';

@Component({
  selector: 'app-consultation',
  standalone: true,
  imports: [],
  templateUrl: './consultation.component.html',
  styleUrl: './consultation.component.css'
})
export class ConsultationComponent {
  search() {
    // Implement search logic here
    console.log('Search clicked');
    }
}