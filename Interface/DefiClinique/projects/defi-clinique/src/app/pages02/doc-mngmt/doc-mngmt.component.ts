import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule,FormBuilder, FormGroup } from '@angular/forms';
import { PersonnelService } from '../../services/personnel.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-doc-mngmt',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule,
  ],
  templateUrl: './doc-mngmt.component.html',
  styleUrl: './doc-mngmt.component.css'
})
export class DocMngmtComponent {

  userForm: FormGroup;

  constructor(
    private formBuilder: FormBuilder,
    private personnelService: PersonnelService, // Assurez-vous d'avoir le service correctement injecté
    private router: Router // Injectez le Router si vous souhaitez rediriger après l'ajout
  ) {
    this.userForm = this.formBuilder.group({
      nom: '',
      prenom: '',
      num: '',
      specialite: '',
      departement: '',
      motDePasse: ''
    });
  }

  onSubmit() {
    if (this.userForm.valid) {
      this.personnelService.addPersonnel(this.userForm.value)
        .subscribe(response => {
          // Gérez la réponse du service/backend ici si nécessaire
          console.log('Réponse du service :', response);

          // Réinitialise le formulaire après l'ajout
          this.userForm.reset();

          // Redirigez vers une page spécifique si nécessaire
          // this.router.navigate(['/votre-page-de-redirection']);
        }, error => {
          // Gérez les erreurs ici si nécessaire
          console.error('Erreur lors de l\'ajout de l\'utilisateur :', error);
        });
    }
  }


  



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
