import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent {
  userData: any = {
    email: '',
    password: ''
  };
  registrationSuccess = false;

  constructor(private router: Router) {}

  register(): void {
    // Assuming you have a backend service to handle user registration.
    // Replace the following code with actual API call to register the user.
    // For this example, we'll simulate a successful registration after 2 seconds.

    setTimeout(() => {
      this.registrationSuccess = true;

      // Redirect to login page after successful registration
      setTimeout(() => {
        this.router.navigate(['/login']);
      }, 2000);
    }, 2000);
  }
}


