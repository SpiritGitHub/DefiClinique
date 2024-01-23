import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatNativeDateModule } from '@angular/material/core';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatCardModule} from '@angular/material/card';
import {provideNativeDateAdapter} from '@angular/material/core';


@Component({
  selector: 'app-appointment',
  standalone: true,
  imports: [CommonModule,  
    MatDatepickerModule,
    MatCardModule,
    MatNativeDateModule],
  providers: [provideNativeDateAdapter()],
  templateUrl: './appointment.component.html',
  styleUrl: './appointment.component.css'
})

export class AppointmentComponent{
  
  search() {
    // Implement search logic here
    console.log('Search clicked');
  }
  selectedSlot: string | null = null;
  
  // Define the method
  selectSlot(time: string) {
    this.selectedSlot = time;
  }
  
  // Add your arrays of times if needed
  morningSlots: string[] = ['07h00', '08h00', '09h00', '10h00', '11h00', '12h00'];
  afternoonSlots: string[] = ['13h00', '14h00', '15h00', '16h00', '17h00', '18h00'];
  
  onCancel() {
    // Your logic to handle the cancel action
    console.log('Annuler clicked');
  }
  selected: Date | null = null;

}
