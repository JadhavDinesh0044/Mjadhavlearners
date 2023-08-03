import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ApplyForAadharComponent } from './apply-for-aadhar.component';

describe('ApplyForAadharComponent', () => {
  let component: ApplyForAadharComponent;
  let fixture: ComponentFixture<ApplyForAadharComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ApplyForAadharComponent]
    });
    fixture = TestBed.createComponent(ApplyForAadharComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
