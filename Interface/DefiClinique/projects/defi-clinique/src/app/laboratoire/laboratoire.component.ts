import { Component } from '@angular/core';

@Component({
  selector: 'app-laboratoire',
  standalone: true,
  imports: [],
  templateUrl: './laboratoire.component.html',
  styleUrl: './laboratoire.component.css'
})
export class LaboratoireComponent {

  search() {
    // Implement search logic here
    console.log('Search clicked');
    }

}
