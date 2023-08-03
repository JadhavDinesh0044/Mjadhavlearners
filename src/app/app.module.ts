import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule } from '@angular/forms'; // Import FormsModule

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ApproveRequestComponent } from './approve-request/approve-request.component';
import { VerifyDuplicateRequestComponent } from './verify-duplicate-request/verify-duplicate-request.component';
import { DisplayIssuedCardsComponent } from './display-issued-cards/display-issued-cards.component';
import { DeleteDeceasedCitizenComponent } from './delete-deceased-citizen/delete-deceased-citizen.component';
import { ApplyForAadharComponent } from './apply-for-aadhar/apply-for-aadhar.component';
import { ViewAadharNumberComponent } from './view-aadhar-number/view-aadhar-number.component';
import { DashboardComponent } from './dashboard/dashboard.component';

@NgModule({
  declarations: [
    AppComponent,
    RegistrationComponent,
    LoginComponent,
    AdminLoginComponent,
    ApproveRequestComponent,
    VerifyDuplicateRequestComponent,
    DisplayIssuedCardsComponent,
    DeleteDeceasedCitizenComponent,
    ApplyForAadharComponent,
    ViewAadharNumberComponent,
    DashboardComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule // Add FormsModule to the imports array
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

