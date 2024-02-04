import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-add-dep',
  standalone: true,
  imports: [
    CommonModule,
    FormsModule
  ],
  templateUrl: './add-dep.component.html',
  styleUrl: './add-dep.component.css'
})
export class AddDepComponent {

  departmentData = {
    departmentName: '',
    departmentAddress: '',
    departmentDescription: ''
    // Ajoutez d'autres propriétés si nécessaire
  };

  selectedFile: File | null = null;

  onFileSelected(event: any): void {
    const file: File = event.target.files[0];
    this.selectedFile = file;
  }

  onSubmit() {
    // Ici, vous pouvez envoyer les données du formulaire au service ou au backend
    // pour enregistrement en base de données. Assurez-vous d'injecter le service requis.
    // Par exemple, vous pouvez utiliser un service Angular pour effectuer une requête HTTP.

    // Envoie des données au service ou backend, y compris le fichier
   // console.log('Envoi des données :', this.departmentData);
    //console.log('Fichier sélectionné :', this.selectedFile);

    // Réinitialise les données après l'envoi
    this.resetForm();
  }

  resetForm() {
    // Réinitialise les données du formulaire après soumission
    this.departmentData = {
      departmentName: '',
      departmentAddress: '',
      departmentDescription: ''
      // Réinitialisez d'autres propriétés si nécessaire
    };
    this.selectedFile = null;
  }

}
