import { Router, RouterModule } from '@angular/router';
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MatListModule } from '@angular/material/list';
import { MatIconModule } from '@angular/material/icon'


export type MenuItem = {
  icon: string;
  route: string;
  label: string;
};

@Component({
  selector: 'app-custom-sidenav',
  standalone: true,
  imports: [ CommonModule, MatListModule, MatIconModule, RouterModule],
  templateUrl: './custom-sidenav.component.html',
  styleUrl: './custom-sidenav.component.css'
})

export class CustomSidenavComponent {
  menuItems: MenuItem[] = [
    { icon: 'ri-home-4-line', route: 'menu', label: 'Accueil' },
    { icon: 'ri-settings-3-line', route: 'settings', label: 'Paramètres' },
  ];

  constructor(private router: Router) {}

  onItemClick(route: string): void {
    this.router.navigate([route]);
  }
}
