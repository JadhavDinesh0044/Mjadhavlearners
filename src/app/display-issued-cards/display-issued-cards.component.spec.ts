import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DisplayIssuedCardsComponent } from './display-issued-cards.component';

describe('DisplayIssuedCardsComponent', () => {
  let component: DisplayIssuedCardsComponent;
  let fixture: ComponentFixture<DisplayIssuedCardsComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DisplayIssuedCardsComponent]
    });
    fixture = TestBed.createComponent(DisplayIssuedCardsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
