import { Component } from '@angular/core';

interface Employee {
  id: number;
  productName: string;
  price: number;
  discount: number;
  image: string;
  stock: number;
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  employees: Employee[] = [
    { id: 101, productName: 'Product1', price: 2000, discount: 10, image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQV6-DQF2pBwNFV9KzPafu9RghrNF1tZ8J3AA&s', stock: 5 },
    { id: 102, productName: 'Product2', price: 3000, discount: 15, image: 'assets/images/example1.jpg', stock: 8 },
    { id: 103, productName: 'Product3', price: 2222, discount: 5, image: 'assets/images/example3.jpg', stock: 2 }
  ];
  employee: Employee = { id: 0, productName: '', price: 0, discount: 0, image: '', stock: 0 };
  message: string = '';

  saveEmployee(employee: Employee) {
    const existingEmployee = this.employees.find(e => e.id === employee.id);
    if (!existingEmployee) {
      this.employees.push({ ...employee });
      this.message = `Record ${employee.id} Saved`;
    } else {
      this.message = `Record ${employee.id} already exists`;
    }
    this.clearEmployee();
  }

  updateEmployee(employee: Employee) {
    const index = this.employees.findIndex(e => e.id === employee.id);
    if (index !== -1) {
      this.employees[index] = { ...employee };
      this.message = `Record ${employee.id} Updated`;
    } else {
      this.message = `Record ${employee.id} Not Found`;
    }
    this.clearEmployee();
  }

  deleteEmployee(employeeId: number) {
    const index = this.employees.findIndex(e => e.id === employeeId);
    if (index !== -1) {
      this.employees.splice(index, 1);
      this.message = `Record ${employeeId} Deleted`;
    } else {
      this.message = `Record ${employeeId} Not Found`;
    }
    this.clearEmployee();
  }

  clearEmployee() {
    this.employee = { id: 0, productName: '', price: 0, discount: 0, image: '', stock: 0 };
  }
}
