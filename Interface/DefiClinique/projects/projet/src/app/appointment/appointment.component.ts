import { Component,OnInit } from '@angular/core';
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

export class AppointmentComponent implements OnInit{
  currentMonth: Date = new Date();
  calendarDays: any[] = [];
  dayNames = ['Dim', 'Lun', 'Mar', 'Mer', 'Jeu', 'Ven', 'Sam'];

  ngOnInit() {
    this.generateCalendar();
  }

  generateCalendar(): void {
    const startDay = new Date(this.currentMonth.getFullYear(), this.currentMonth.getMonth(), 1);
    const endDay = new Date(this.currentMonth.getFullYear(), this.currentMonth.getMonth() + 1, 0);
    this.calendarDays = [];

    for (let day = startDay; day <= endDay; day.setDate(day.getDate() + 1)) {
      this.calendarDays.push({
        date: new Date(day),
        isToday: day.toDateString() === new Date().toDateString()
      });
    }
  }

  previousMonth(): void {
    this.currentMonth.setMonth(this.currentMonth.getMonth() - 1);
    this.generateCalendar();
  }

  nextMonth(): void {
    this.currentMonth.setMonth(this.currentMonth.getMonth() + 1);
    this.generateCalendar();
  }
  
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
  

  selectDate(): void {
    // Code pour la sélection de la date
    console.log('Date selection clicked');
  }

  selectTime(): void {
    // Code pour la sélection de l'heure
    console.log('Time selection clicked');
  }

}
