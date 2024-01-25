import { Injectable } from "@angular/core";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class DataService {
    readonly apiUrl = 'URL_DE_VOTRE_API';

    constructor(){}

   // getData(): Observable<any[]> {
        //return this.http.get<any[]>(this.apiUrl);
    //}
}