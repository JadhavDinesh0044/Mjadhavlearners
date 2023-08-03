import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  userData: any = {
    email: '',
    password: ''
  };
  loginSuccess: boolean = false;

  constructor(private router: Router) {}

  login(): void {
    // Assuming you have a login service that validates user credentials.
    // Check user credentials and set loginSuccess to true upon successful login.
    // For this example, let's assume successful login always.
    this.loginSuccess = true;

    // Redirect to the dashboard after successful login.
    this.router.navigateByUrl('/dashboard');
  }
}

