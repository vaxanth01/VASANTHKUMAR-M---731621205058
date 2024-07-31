import { Component } from '@angular/core';

interface Employee {
  id: number;
  
  productName: string;
  price: number;
  discount: number;
  image: string;
  
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employees: Employee[] = [
    { id: 101, productName: 'Product1', price: 2000, discount: 10, image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQV6-DQF2pBwNFV9KzPafu9RghrNF1tZ8J3AA&s' },
    { id: 102, productName: 'Product2', price: 3000, discount: 15, image: 'assets/images/example1.jpg'},
    { id: 103, productName: 'Product3', price: 2222, discount: 5, image: 'assets/images/example3.jpg'}
  ];
  employee: Employee = { id: 0, productName: '', price: 0, discount: 0, image: '' };
  message: string = '';

  saveEmployee() {
    const existingEmployee = this.employees.find(e => e.id === this.employee.id);
    if (!existingEmployee) {
      this.employees.push({ ...this.employee });
      this.message = `Record ${this.employee.id} Saved`;
    } else {
      this.message = `Record ${this.employee.id} already exists`;
    }
    this.clearEmployee();
  }

  updateEmployee() {
    const index = this.employees.findIndex(e => e.id === this.employee.id);
    if (index !== -1) {
      this.employees[index] = { ...this.employee };
      this.message = `Record ${this.employee.id} Updated`;
    } else {
      this.message = `Record ${this.employee.id} Not Found`;
    }
    this.clearEmployee();
  }

  deleteEmployee() {
    const index = this.employees.findIndex(e => e.id === this.employee.id);
    if (index !== -1) {
      this.employees.splice(index, 1);
      this.message = `Record ${this.employee.id} Deleted`;
    } else {
      this.message = `Record ${this.employee.id} Not Found`;
    }
    this.clearEmployee();
  }

  clearEmployee() {
    this.employee = { id: 0, productName: '', price: 0, discount: 0, image: '' };
  }
}
