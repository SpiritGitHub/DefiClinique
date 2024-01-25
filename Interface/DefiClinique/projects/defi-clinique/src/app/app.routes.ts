// app.route.ts
import { Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { MenuComponent } from './pages/menu/menu.component';
import { SettingsComponent } from './pages/settings/settings.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DashContentComponent } from './pages02/dash-content/dash-content.component';
import { DocMngmtComponent } from './pages02/doc-mngmt/doc-mngmt.component';
import { DepartementComponent } from './pages02/departement/departement.component';
import { UrgencesComponent } from './pages02/urgences/urgences.component';
import { RadiologieComponent } from './pages02/radiologie/radiologie.component';
import { LaboratoireComponent } from './pages02/laboratoire/laboratoire.component';
import { PhysioComponent } from './pages02/physio/physio.component';
import { PsychoComponent } from './pages02/psycho/psycho.component';
import { AdministrationComponent } from './pages02/administration/administration.component';

export const routes: Routes = [
    { path: '', pathMatch: 'full', redirectTo: 'menu' },
    { path: 'home', component: HomeComponent, children: [
        { path: 'menu', component: MenuComponent },
        { path: 'settings', component: SettingsComponent },
    ]},
    { path: 'dashboard', component: DashboardComponent, children:[
        { path: 'dash-content', component: DashContentComponent },
        { path: 'doc-mngmt', component: DocMngmtComponent },
        { path: 'departement', component: DepartementComponent },
        { path: 'settings', component: SettingsComponent },
        { path: 'urgences', component: UrgencesComponent},
        { path: 'radiologie', component: RadiologieComponent},
        { path: 'laboratoire', component: LaboratoireComponent},
        { path: 'physio', component: PhysioComponent},
        { path: 'psycho', component: PsychoComponent},
        { path: 'administration', component: AdministrationComponent}

    ]}
];
