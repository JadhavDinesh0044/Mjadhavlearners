import { ComponentFixture, TestBed } from '@angular/core/testing';

import { VerifyDuplicateRequestComponent } from './verify-duplicate-request.component';

describe('VerifyDuplicateRequestComponent', () => {
  let component: VerifyDuplicateRequestComponent;
  let fixture: ComponentFixture<VerifyDuplicateRequestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [VerifyDuplicateRequestComponent]
    });
    fixture = TestBed.createComponent(VerifyDuplicateRequestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
