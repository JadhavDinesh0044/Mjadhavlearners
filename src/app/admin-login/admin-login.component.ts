import { Component } from '@angular/core';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent {
  adminData: any = {
    email: '',
    password: ''
  };
  loginSuccess = false;

  login(): void {
    // Assuming you have a backend service to handle admin authentication.
    // Replace the following code with actual API call to authenticate the admin.
    // For this example, we'll simulate a successful admin login after 2 seconds.

    setTimeout(() => {
      this.loginSuccess = true;
    }, 2000);
  }
}


