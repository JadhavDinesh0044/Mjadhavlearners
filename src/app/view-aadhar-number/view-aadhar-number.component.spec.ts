import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewAadharNumberComponent } from './view-aadhar-number.component';

describe('ViewAadharNumberComponent', () => {
  let component: ViewAadharNumberComponent;
  let fixture: ComponentFixture<ViewAadharNumberComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [ViewAadharNumberComponent]
    });
    fixture = TestBed.createComponent(ViewAadharNumberComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
