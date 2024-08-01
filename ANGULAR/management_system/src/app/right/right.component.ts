import { Component, Input } from '@angular/core';

interface Employee {
  id: number;
  productName: string;
  price: number;
  discount: number;
  image: string;
  stock: number;
}

@Component({
  selector: 'app-right',
  templateUrl: './right.component.html',
  styleUrls: ['./right.component.css']
})
export class RightComponent {
  @Input() employees: Employee[] = [];
}
