import { Component } from '@angular/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';

@Component({
  selector: 'app-dash-content',
  standalone: true,
  imports: [
    MatNativeDateModule,
    MatDatepickerModule,
  ],
  templateUrl: './dash-content.component.html',
  styleUrl: './dash-content.component.css'
})
export class DashContentComponent {

}
