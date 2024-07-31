import { Injectable } from '@angular/core';

@Injectable()
export class CalculatorService {

  getAddition(a: number , b: number){
    return a+b;
  }
  getSubtraction(a: number , b: number){
    return a-b;
  }
  getmultiplication(a: number , b: number){
    return a*b;
  }
  getdivide(a: number , b: number){
    return a/b;
  }
  // constructor() { }
}
