import { Component, Input, Output, EventEmitter } from '@angular/core';

interface Employee {
  id: number;
  productName: string;
  price: number;
  discount: number;
  image: string;
  stock: number;
}

@Component({
  selector: 'app-center',
  templateUrl: './center.component.html',
  styleUrls: ['./center.component.css']
})
export class CenterComponent {
  fname: string = '';

  @Input() employee: Employee = { id: 0, productName: '', price: 0, discount: 0, image: '', stock: 0 };


  saveEmployee() {
    
  }

  updateEmployee() {
    
  }

  deleteEmployee() {
    
  }
}
