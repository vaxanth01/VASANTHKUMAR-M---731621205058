import { Component } from '@angular/core';
import { ProductService } from './product.service';
import { Product } from './model/Product';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'EMSProject';
  product: Product;
  result: string;
  productarr:Product[];
  flag:boolean;

  constructor(private service: ProductService) {
    this.product = new Product();
    this.result = '';
    this.productarr=[];
    this.flag=false;
  }

  insertProduct(data: any) {
    this.product.id = data.id;
    this.product.proName = data.proName;
    this.product.proPrice = data.proprice;
    this.product.proimg = data.proprice;
    this.product.procount = data.proprice;
    alert(data.id + ' ' + data.proName + ' ' + data.proPrice + ' ' + data.proimg + ' ' + data.procount);

    this.result = this.service.insertProduct(this.product);
  }

  updateProduct(data: any) {
    this.product.id = data.id;
    this.product.proName = data.proName;
    this.product.proPrice = data.proPrice;
    alert(data.id + ' ' + data.proName + ' ' + data.proPrice+ ' ' + data.procount + ' ' + data.proimg);

    this.result = this.service.updateProduct(this.product);
  }
  deleteProduct(data: any) {
    this.result = this.service.deleteProduct(data.id);
  }
  findProduct(data: any) {
    this.product=this.service.findProduct(data.id);
    this.result=this.product.id+" "+ this.product.proName +" "+this.product.proPrice+" "+this.product.procount+" "+this.product.proimg;
  }
  findAllProduct(){
    this.productarr=this.service.findAllProduct();
    this.flag=true;
  }
}