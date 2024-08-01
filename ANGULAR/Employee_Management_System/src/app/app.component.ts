import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee : Employee;
  v:string;
  result:string;
  

  constructor(private service:EmployeeService){
    this.employee = new Employee;
    this.v="";
    this.result="";
  }

  insertEmployee(data: any){
    this.employee.id = data.id;
    this.employee.empName = data.empName;
    this.employee.empSalary = data.empSalary;
    
    this.service.insertEmployee(this.employee);
    this.result=this.service.insertEmployee(this.employee);
    this.v = data.id+" "+data.empName+" "+data.empSalary+" ";
    alert(data.id+" "+data.empName+" "+data.empSalary+" ");
    
  }
}
