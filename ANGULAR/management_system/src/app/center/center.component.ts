import { Component, Input, Output, EventEmitter } from '@angular/core';

interface Employee {
  id: number;
  productName: string;
  price: number;
  discount: number;
  image: string;
}

@Component({
  selector: 'app-center',
  templateUrl: './center.component.html',
  styleUrls: ['./center.component.css']
})
export class CenterComponent {
  // Two-way data binding property
  fname: string = '';

  @Input() employee: Employee = { id: 0, productName: '', price: 0, discount: 0, image: '', };
  @Input() message: string = '';

  @Output() saveEmployeeEvent = new EventEmitter<void>();
  @Output() updateEmployeeEvent = new EventEmitter<void>();
  @Output() deleteEmployeeEvent = new EventEmitter<void>();

  saveEmployee() {
    this.saveEmployeeEvent.emit();
  }

  updateEmployee() {
    this.updateEmployeeEvent.emit();
  }

  deleteEmployee() {
    this.deleteEmployeeEvent.emit();
  }
}
