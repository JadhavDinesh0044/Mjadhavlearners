import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeleteDeceasedCitizenComponent } from './delete-deceased-citizen.component';

describe('DeleteDeceasedCitizenComponent', () => {
  let component: DeleteDeceasedCitizenComponent;
  let fixture: ComponentFixture<DeleteDeceasedCitizenComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DeleteDeceasedCitizenComponent]
    });
    fixture = TestBed.createComponent(DeleteDeceasedCitizenComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
