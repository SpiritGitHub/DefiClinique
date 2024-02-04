import { Component, OnInit } from '@angular/core';
import { Router, RouterModule } from '@angular/router';

@Component({
  selector: 'app-accueil',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './accueil.component.html',
  styleUrl: './accueil.component.css'
})
export class AccueilComponent  implements OnInit{

  width: number = 0; 
 
  constructor(private router: Router) { } // Injectez le Router ici 
 
  ngOnInit(): void { 
    let interval = setInterval(() => { 
      this.width++; 
      if (this.width >= 100) { 
        clearInterval(interval);
        this.router.navigate(['/login']);
        
      } 
    }, 100); // Le délai ici contrôle la vitesse de la barre de chargement 
  } 
}
