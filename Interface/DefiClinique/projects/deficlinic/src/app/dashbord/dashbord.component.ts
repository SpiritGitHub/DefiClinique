import { Component } from '@angular/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';


@Component({
  selector: 'app-dashbord',
  standalone: true,
  imports: [MatDatepickerModule,MatNativeDateModule],
  templateUrl: './dashbord.component.html',
  styleUrl: './dashbord.component.css'
})
export class DashbordComponent {
  search() {
    // Implement search logic here
    console.log('Search clicked');
    }
}
