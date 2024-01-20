import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { MatSidenavModule } from '@angular/material/sidenav';

/*export type MenuItem = {
  icon: string;
  route: string;

};*/


@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [
    CommonModule,
    RouterModule,
    RouterOutlet,
    MatSidenavModule,


  ],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {
  search() {
    // Implement search logic here
    console.log('Search clicked');
  }

  /*menuItems: MenuItem[] = [
    { icon: 'ri-dashboard-line', route: 'dash-content'},
    { icon: 'ri-stethoscope-line', route: 'doc-mngmt'},
    { icon: 'ri-medicine-bottle-line', route: 'departement'},
  ];*/

  constructor(private router: Router) {}

  onItemClick(route: string): void {
    this.router.navigate([route]);
  }


}
