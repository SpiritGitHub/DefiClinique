import { Routes} from '@angular/router';
import { LoginComponent } from './login/login.component';
import { AccueilComponent } from './accueil/accueil.component';
import { HeaderComponent } from './header/header.component';
import { DashbordComponent } from './dashbord/dashbord.component';
import { ConsultationComponent } from './consultation/consultation.component';
import path from 'path';
import { PrincipalComponent } from './principal/principal.component';
import { DocComponent } from './doc/doc.component';
import { SecretaireComponent } from './secretaire/secretaire.component';

export const routes: Routes = [
    { path: 'acceuil', component: AccueilComponent},
    {path: 'principal', component:PrincipalComponent, children:[
        {path: 'consultation', component: ConsultationComponent},
        {path: 'dashbord', component: DashbordComponent}
    ]},
    { path: 'login', component: LoginComponent },
    { path: 'header', component: HeaderComponent},
    {path: 'consultation', component:ConsultationComponent},
    { path: 'dashbord', component: DashbordComponent},
    {path: 'doc', component: DocComponent},
    {path:'secretaire', component: SecretaireComponent, children:[
        {path: 'doc',component:DocComponent}
    ]}
    
    
   //{ path: '', redirectTo: '/acceuil', pathMatch: 'full' },

];
export class AppComponent{}