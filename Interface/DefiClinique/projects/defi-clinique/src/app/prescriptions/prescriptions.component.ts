import { Component } from '@angular/core';

@Component({
  selector: 'app-prescriptions',
  standalone: true,
  imports: [],
  templateUrl: './prescriptions.component.html',
  styleUrl: './prescriptions.component.css'
})
export class PrescriptionsComponent {

  onButtonClick() {
    // Utiliser location.reload() pour actualiser la page
    location.reload();
  }

}
