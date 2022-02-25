import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListEmployeFonctionComponent } from './list-employe-fonction.component';

describe('ListEmployeFonctionComponent', () => {
  let component: ListEmployeFonctionComponent;
  let fixture: ComponentFixture<ListEmployeFonctionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ListEmployeFonctionComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ListEmployeFonctionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
