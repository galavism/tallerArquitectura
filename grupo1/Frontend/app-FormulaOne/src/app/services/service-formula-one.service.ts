import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root',
})



export class Company {


  id!: number;
  name!: string;
  url_image!: string;
  team_chief!: string;
  technical_chief!: string;
  points!: number;
  base!: string;
}

export class Employee {
  ID!: number;

  FirstName!: string;

  Country!: string;

  Position!: string;

  BirthDate!: string;

}

const employee: Employee = {
  ID: 1,
  FirstName: 'John',
  Country: 'Heart',
  Position: 'CEO',
  BirthDate: '1964/03/16',
 
};



@Injectable()
export class Service {
  API_URL = 'http://localhost:8081';

  constructor(private http: HttpClient) { }

  getCompanies(){
    const respuesta  = this.http.get(`${this.API_URL}/F1Teams/teams`);
    return 
    
  }

  getEmployee() {
    return employee;
  }



}
