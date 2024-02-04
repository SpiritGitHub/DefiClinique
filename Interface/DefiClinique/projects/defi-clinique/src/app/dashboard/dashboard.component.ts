import { Component,NgModule } from '@angular/core';
import { Router, RouterModule, RouterOutlet } from '@angular/router';
import { CommonModule } from '@angular/common';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatDialogModule } from '@angular/material/dialog';



@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [
    RouterModule,
    RouterOutlet,
    CommonModule,
    MatSidenavModule,
    MatDialogModule,
  ],
  templateUrl: './dashboard.component.html',
  styleUrl: './dashboard.component.css'
})
export class DashboardComponent {

// Définissez une variable pour suivre l'état actif
boutonActif: boolean = false;

constructor(private router: Router) {}

// Méthode appelée lorsque le bouton est cliqué
onClickBouton(route: string): void {
  // Utilisez la route fournie pour déterminer l'état actif
  this.boutonActif = this.router.isActive(route, true);
}

search() {
  // Implement search logic here
  console.log('Search clicked');
}

// Méthode pour déterminer si la route est active
isActive(route: string): boolean {
  return this.router.isActive(route, true);
}

}
