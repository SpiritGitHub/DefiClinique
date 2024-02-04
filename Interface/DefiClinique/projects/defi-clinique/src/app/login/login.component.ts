import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {

  username: string = '';
  password: string = '';

  constructor(private router: Router) {}

  authenticate() {
    // Remplacez cette vérification par une vérification côté serveur
    if (this.username === 'secretaire' && this.password === 'motdepasse1') {
      this.router.navigate(['/secretaire']); // Redirection vers la page de secrétaire
    } else if (this.username === 'docteur' && this.password === 'motdepasse2') {
      this.router.navigate(['/docteur']); // Redirection vers la page de docteur
    } else if (this.username === 'administrateur' && this.password === 'motdepasse3') {
      this.router.navigate(['/home-admin']); // Redirection vers la page de docteur
    } else if (this.username === 'patient' && this.password === 'motdepasse4') {
      this.router.navigate(['/home-P']); // Redirection vers la page de docteur
    } else {
      alert('Identifiant ou mot de passe incorrect.');
    }
  }

}
