import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { DepartementService } from '../../services/departement.service'; // Vérifiez que le chemin est correct
import { Departement } from '../../models/departement.model'; // Importez le modèle

@Component({
  selector: 'app-add-dep',
  templateUrl: './add-dep.component.html',
  styleUrls: ['./add-dep.component.css'],
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ]
})
export class AddDepComponent {
  departmentData: Departement = {
    departmentName: '',
    departmentAddress: '',
    departmentDescription: ''
  };

  constructor(private departementService: DepartementService) {}

  onSubmit() {
    // Assurez-vous que les champs requis ne sont pas vides
    if (this.departmentData.departmentName && this.departmentData.departmentAddress) {
      // Utilisez le nom correct de la méthode telle que définie dans le service
      this.departementService.addDepartement(this.departmentData).subscribe({
        next: (data) => {
          console.log('Département ajouté', data);
          // Optionnel: Réinitialiser le formulaire ou gérer la navigation après succès
        },
        error: (error) => console.error('Erreur', error)
        // Gérer les erreurs potentielles
      });
    }
  }
}
