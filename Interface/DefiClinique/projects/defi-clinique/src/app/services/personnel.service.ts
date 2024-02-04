import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class PersonnelService {

  constructor(private http: HttpClient) { }

  public personnels() {
    return this.http.get(`${baseUrl}/personnel`)
  }

  public addPersonnel( personnel: { nom: string; prenom: string; docnum: number; specialite: string; departement: string; motdepasse: string}) {
    return this.http.post(`${baseUrl}/personnel`, personnel)
  }

}
