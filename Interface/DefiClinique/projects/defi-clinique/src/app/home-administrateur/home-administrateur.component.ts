import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterOutlet } from '@angular/router';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSidenavModule } from '@angular/material/sidenav';
import { MatButtonModule } from '@angular/material/button';
import { CustomSidenavComponent } from "../components/custom-sidenav/custom-sidenav.component";
import { MenuComponent } from "../pages/menu/menu.component";


@Component({
  selector: 'app-home-administrateur',
  standalone: true,
  imports: [
    CommonModule,
    RouterOutlet,
    MatToolbarModule,
    MatSidenavModule,
    MatButtonModule,
    CustomSidenavComponent,
    MenuComponent
  ],
  templateUrl: './home-administrateur.component.html',
  styleUrl: './home-administrateur.component.css'
})
export class HomeAdministrateurComponent {

}
