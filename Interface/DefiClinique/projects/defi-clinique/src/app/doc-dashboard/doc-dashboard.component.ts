import { Component } from '@angular/core';
import { MatDatepickerModule } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';

@Component({
  selector: 'app-doc-dashboard',
  standalone: true,
  imports: [MatDatepickerModule, MatNativeDateModule],
  templateUrl: './doc-dashboard.component.html',
  styleUrl: './doc-dashboard.component.css'
})
export class DocDashboardComponent {

  search() {
    // Implement search logic here
    console.log('Search clicked');
    }

}
