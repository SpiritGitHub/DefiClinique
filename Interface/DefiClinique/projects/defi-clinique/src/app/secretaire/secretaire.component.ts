import { Component } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-secretaire',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './secretaire.component.html',
  styleUrl: './secretaire.component.css'
})
export class SecretaireComponent {
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