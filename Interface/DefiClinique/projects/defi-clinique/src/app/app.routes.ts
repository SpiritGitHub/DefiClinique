import { Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { LoginComponent } from './login/login.component';
import { HomePatientComponent } from './home-patient/home-patient.component';
import { PatientDashboardComponent } from './patient-dashboard/patient-dashboard.component';
import { PrescriptionsComponent } from './prescriptions/prescriptions.component';
import { LaboratoireComponent } from './laboratoire/laboratoire.component';
import { AppointmentComponent } from './appointment/appointment.component';
import { MenuComponent } from './pages/menu/menu.component';
import { HomeAdministrateurComponent } from './home-administrateur/home-administrateur.component';
import { SettingsComponent } from './pages/settings/settings.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { DashContentComponent } from './pages02/dash-content/dash-content.component';
import { DocMngmtComponent } from './pages02/doc-mngmt/doc-mngmt.component';
import { UrgencesComponent } from './pages02/urgences/urgences.component';
import { PhysioComponent } from './pages02/physio/physio.component';
import { PsychoComponent } from './pages02/psycho/psycho.component';
import { AdministrationComponent } from './pages02/administration/administration.component';
import { RadiologieComponent } from './pages02/radiologie/radiologie.component';
import { DepartementComponent } from './pages02/departement/departement.component';
import { DepLaboratoireComponent } from './pages02/dep-laboratoire/dep-laboratoire.component';
import { PrincipalComponent } from './principal/principal.component';
import { ConsultationComponent } from './consultation/consultation.component';
import { DocDashboardComponent } from './doc-dashboard/doc-dashboard.component';
import { HeaderComponent } from './header/header.component';
import { DocComponent } from './doc/doc.component';
import { SecretaireComponent } from './secretaire/secretaire.component';
import { FacturationComponent } from './facturation/facturation.component';
import path from 'path';
import { Component } from '@angular/core';
import { AddDepComponent } from './pages02/add-dep/add-dep.component';


export const routes: Routes = [
    { path: '', redirectTo: '/accueil', pathMatch: 'full'},
    { path: 'accueil', component: AccueilComponent},
    { path: 'principal', component:PrincipalComponent, children:[
        { path: 'consultation', component: ConsultationComponent},
        { path: 'doc-dash', component: DocDashboardComponent}
    ]},
    { path: 'login', component: LoginComponent},
    { path: 'header', component: HeaderComponent},
    { path: 'consultation', component:ConsultationComponent},
    { path: 'home-P', component: HomePatientComponent},
    { path: 'dashboard-P', component: PatientDashboardComponent},
    { path: 'prescriptions', component: PrescriptionsComponent},
    { path: 'labo', component: LaboratoireComponent},
    { path: 'appointment', component: AppointmentComponent},
    { path: 'home-admin', component: HomeAdministrateurComponent, children: [
        { path: 'menu', component: MenuComponent },
        { path: 'settings', component: SettingsComponent}
    ]},
    {path:'secretaire', component: SecretaireComponent, children:[
        { path: 'doc',component:DocComponent },
        { path: 'facture', component: FacturationComponent}
    ]},
    { path: 'dashboard', component: DashboardComponent, children: [
        { path: 'dash-content', component: DashContentComponent },
        { path: 'doc-mngmt', component: DocMngmtComponent },
        { path: 'departement', component: DepartementComponent, children:[
            { path: 'add-dep', component: AddDepComponent }, 
        ]},
        { path: 'settings', component: SettingsComponent },
        { path: 'urgences', component: UrgencesComponent},
        { path: 'radiologie', component: RadiologieComponent},
        { path: 'laboratoire', component: DepLaboratoireComponent},
        { path: 'physio', component: PhysioComponent},
        { path: 'psycho', component: PsychoComponent},
        { path: 'administration', component: AdministrationComponent}

    ]},

];
