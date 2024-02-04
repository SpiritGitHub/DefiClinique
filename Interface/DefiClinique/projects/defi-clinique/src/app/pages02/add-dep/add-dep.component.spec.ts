import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddDepComponent } from './add-dep.component';

describe('AddDepComponent', () => {
  let component: AddDepComponent;
  let fixture: ComponentFixture<AddDepComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [AddDepComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(AddDepComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
