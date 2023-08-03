import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegistrationComponent } from './registration/registration.component';
import { LoginComponent } from './login/login.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { ApproveRequestComponent } from './approve-request/approve-request.component';
import { VerifyDuplicateRequestComponent } from './verify-duplicate-request/verify-duplicate-request.component';
import { DisplayIssuedCardsComponent } from './display-issued-cards/display-issued-cards.component';
import { DeleteDeceasedCitizenComponent } from './delete-deceased-citizen/delete-deceased-citizen.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ApplyForAadharComponent } from './apply-for-aadhar/apply-for-aadhar.component';
import { ViewAadharNumberComponent } from './view-aadhar-number/view-aadhar-number.component';

const routes: Routes = [
  { path: '', redirectTo: '/register', pathMatch: 'full' }, // Redirect to /register when accessing the home page
  { path: 'register', component: RegistrationComponent },
  { path: 'login', component: LoginComponent },
  { path: 'admin-login', component: AdminLoginComponent },
  { path: 'approve-request', component: ApproveRequestComponent },
  { path: 'verify-duplicate-request', component: VerifyDuplicateRequestComponent },
  { path: 'display-issued-cards', component: DisplayIssuedCardsComponent },
  { path: 'delete-deceased-citizen', component: DeleteDeceasedCitizenComponent },
  {
    path: 'dashboard',
    component: DashboardComponent,
    children: [
      { path: 'apply-for-aadhar', component: ApplyForAadharComponent },
      { path: 'view-aadhar-number', component: ViewAadharNumberComponent },
  
    ],
    
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }






