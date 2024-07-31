import { Component } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginFunction(data: { email: string; password: string }) {
    alert(`Email: ${data.email}\nPassword: ${data.password}`);
  }
}
