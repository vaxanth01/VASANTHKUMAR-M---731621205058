import { Component } from '@angular/core';
import { CalculatorService } from '../calculator.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  add:number;
  sub:number;
  mul:number;
  div:number;

  constructor(private calc :CalculatorService){
    this.add = calc.getAddition(10,20);
    this.sub = calc.getSubtraction(40,20);
    this.mul = calc.getmultiplication(40,20);
    this.div = calc.getdivide(40,20);
  }
}