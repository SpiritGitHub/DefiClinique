import { Routes} from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AccueilComponent } from './accueil/accueil.component';
import { HeaderComponent } from './header/header.component';
import { DashbordComponent } from './dashbord/dashbord.component';

export const routes: Routes = [
    { path: 'acceuil', component: AccueilComponent},
    { path: 'login', component: LoginComponent },
    { path: 'header', component: HeaderComponent},
    { path: 'dashbord', component: DashbordComponent},
    { path: '', redirectTo: '/acceuil', pathMatch: 'full' },

];
export class AppComponent{}