import { Component } from '@angular/core';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  myFunction(data: any) {
    alert(
      `Name: ${data.name}\n` +
      `Email: ${data.email}\n` +
      `Age: ${data.age}\n` +
      `Mobile Number: ${data.mobileNo}\n` +
      `Country: ${data.country}`
    );
  }

}
