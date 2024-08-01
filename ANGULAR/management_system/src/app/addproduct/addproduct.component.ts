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
  selector: 'app-addproduct',
  templateUrl: './addproduct.component.html',
  styleUrl: './addproduct.component.css'
})
export class AddproductComponent {
 
    employees: Employee[] = [
      { id: 101,
        productName: 'Product1',
        price: 2000,
        discount: 10,
        image: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQV6-DQF2pBwNFV9KzPafu9RghrNF1tZ8J3AA&s',
        stock: 5 
      },
      { id: 102,
        productName: 'Product2',
        price: 3000,
        discount: 15,
        image: 'assets/images/example1.jpg',
        stock: 8 
      },
      { id: 103,
        productName: 'Product3',
        price: 2222,
        discount: 5,
        image: 'assets/images/example3.jpg',
        stock: 2
      }
    ];
    employee: Employee = { id: 0, productName: '', price: 0, discount: 0, image: '', stock: 0 };
    message: string = '';
  
    
  }
  
