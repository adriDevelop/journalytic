import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CardAnaliticas } from './card-analiticas';

describe('CardAnaliticas', () => {
  let component: CardAnaliticas;
  let fixture: ComponentFixture<CardAnaliticas>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [CardAnaliticas],
    }).compileComponents();

    fixture = TestBed.createComponent(CardAnaliticas);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
