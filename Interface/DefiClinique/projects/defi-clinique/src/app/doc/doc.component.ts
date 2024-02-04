import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatIconModule } from '@angular/material/icon';
import { MatDatepickerModule, matDatepickerAnimations } from '@angular/material/datepicker';
import { MatNativeDateModule } from '@angular/material/core';

@Component({
  selector: 'app-doc',
  standalone: true,
  imports: [CommonModule, FormsModule, MatIconModule,MatDatepickerModule,MatNativeDateModule],
  templateUrl: './doc.component.html',
  styleUrl: './doc.component.css'
})
export class DocComponent {
  displayedColumns: string[] = ['nom', 'prenom', 'docNum', 'specialites', 'motDePasse', 'departements'];
  dataSource = [
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'completed',  selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '456EFG', specialites: 'en cours',   selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'En cours',   selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '876', specialites: 'completed',  selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: 'OI87', specialites: 'En cours',   selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: 'QSD', specialites: 'completed',  selected: false },
  ];
  onEdit(data: any): void {
    // Logique pour éditer l'élément
  }

  onDelete(data: any): void {
    // Logique pour supprimer l'élément
  }
}
