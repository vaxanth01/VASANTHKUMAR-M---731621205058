import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
       name : string;
       age : number;
       department :string;
       imagepath:string;
       fname:string;

       constructor(){
        this.name = "vasanth"
        this.fname = "";
        this.age = 21
        this.department = "IT"
        this.imagepath = "data:image/jpeg;base64,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"
       }

  change_name(){
    this.name="sasikumar"
  }    
  change_age(){
    this.age=25
  }    
  change_department(){
    this.department="CSE"
  }    
  change_image(){
    this.imagepath="data:image/jpeg;base64,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"
  }    

}
