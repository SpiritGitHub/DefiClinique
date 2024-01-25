import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-doc-mngmt',
  standalone: true,
  imports: [CommonModule, FormsModule,],
  templateUrl: './doc-mngmt.component.html',
  styleUrl: './doc-mngmt.component.css'
})
export class DocMngmtComponent {
  displayedColumns: string[] = ['nom', 'prenom', 'docNum', 'specialites', 'motDePasse', 'departements'];
  dataSource = [
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
  ];

}
