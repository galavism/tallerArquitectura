import { Component, NgModule } from '@angular/core';
import {Employee, Company, Service } from '../../services/service-formula-one.service';
import { DxTabPanelModule, DxCheckBoxModule, DxTemplateModule } from 'devextreme-angular';
import { BrowserModule } from '@angular/platform-browser';

@Component({
  templateUrl: 'home.component.html',
  styleUrls: [ './home.component.scss' ],
  providers: [Service],
  preserveWhitespaces: true,
})

export class HomeComponent {
  employee: Employee;
  step =0;
  companies: any;
 

  itemCount: number;

  constructor(private service: Service) {
    service.getCompanies().subscribe((data: any): void => {
      this.companies = data;
    });
    this.itemCount = this.companies.length;
    this.employee = service.getEmployee();

  }

}

