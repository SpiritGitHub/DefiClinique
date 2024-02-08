// src/app/services/departement.service.ts
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { AddDepComponent } from '../pages02/add-dep/add-dep.component';

@Injectable({
  providedIn: 'root'
})
export class DepartementService {
  private apiUrl = 'http://localhost:8080/addDepartements'; // Ajustez selon votre configuration

  constructor(private http: HttpClient) { }

  addDepartement(departement: AddDepComponent): Observable<AddDepComponent> {
    return this.http.post<AddDepComponent>(this.apiUrl, departement);
  }
}

