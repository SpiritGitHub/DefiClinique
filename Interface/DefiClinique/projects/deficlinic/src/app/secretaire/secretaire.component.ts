import { Component } from '@angular/core';
import { RouterModule } from '@angular/router';

@Component({
  selector: 'app-secretaire',
  standalone: true,
  imports: [RouterModule],
  templateUrl: './secretaire.component.html',
  styleUrl: './secretaire.component.css'
})
export class SecretaireComponent {
  search() {
    // Implement search logic here
    console.log('Search clicked');
    }
}
