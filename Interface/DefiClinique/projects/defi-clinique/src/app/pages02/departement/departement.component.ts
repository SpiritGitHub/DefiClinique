import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { AddDepComponent } from '../add-dep/add-dep.component';
import { DepartementService } from '../../services/departement.service';


@Component({
  selector: 'app-departement',
  standalone: true,
  imports: [AddDepComponent],
  templateUrl: './departement.component.html',
  styleUrl: './departement.component.css'
})
export class DepartementComponent {

  constructor(public dialog: MatDialog) {}

  openPopupForm(): void {
    const dialogRef = this.dialog.open(AddDepComponent, {
      width: '900px', // Définissez la largeur souhaitée pour votre pop-up
    });

    dialogRef.afterClosed().subscribe((result) => {
      // Traitez les données du formulaire après la fermeture du pop-up
      console.log('The dialog was closed', result);
    });
  }

}
