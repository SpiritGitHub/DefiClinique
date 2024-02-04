import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import baseUrl from './helper';

@Injectable({
  providedIn: 'root'
})
export class DepartementService {
  constructor(private http: HttpClient) { }

  
  addDepartment(departmentData: { departmentName: string; departmentAddress: string; departmentDescription: string; }) {
    throw new Error('Method not implemented.');
  }

 


  getDepartments(): Observable<string[]> {
    return this.http.get<string[]>(`${baseUrl}/departments`);
  }
}
