import { RouterModule, Routes } from '@angular/router';
import { PatientDashboardComponent } from './patient-dashboard/patient-dashboard.component';
import { NgModule } from '@angular/core';
import { HomeComponent } from './home/home.component';
import { PrescriptionsComponent } from './prescriptions/prescriptions.component';
import { LaboratoireComponent } from './laboratoire/laboratoire.component';
import { AppointmentComponent } from './appointment/appointment.component';

export const routes: Routes = [
    { path: '', redirectTo: '/home', pathMatch: 'full'},
    {path: 'patientDashboard', component: PatientDashboardComponent},
    {path: 'home', component: HomeComponent},
    {path: 'prescriptions', component: PrescriptionsComponent},
    {path: 'laboratoire', component: LaboratoireComponent},
    {path: 'appointment', component: AppointmentComponent,},
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule],
   
})
export class AppRoutingModule {
}
