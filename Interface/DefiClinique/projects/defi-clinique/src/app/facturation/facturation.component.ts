import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';

export type dataSource = {
  numero: number;
};

@Component({
  selector: 'app-facturation',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './facturation.component.html',
  styleUrl: './facturation.component.css'
})
export class FacturationComponent {

  dataSource = [{ numero: 'FT-005232'},]

  displayedColumns: string[] = ['nom', 'prenom', 'docNum', 'specialites', 'motDePasse', 'departements'];
  dataSource2 = [
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', motDePasse: 'abcd1234', departements: 'Chirurgie', selected: false },
  ];



}
