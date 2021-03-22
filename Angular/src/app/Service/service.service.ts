import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import {Empleado} from '../Modelo/Empleado';

@Injectable({
  providedIn: 'root'
})

export class ServiceService {

  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/Angular/personas';

  getEmpleado(){
    return this.http.get<Empleado[]>(this.Url)
  }
}
