import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DocMngmtComponent } from './doc-mngmt.component';

describe('DocMngmtComponent', () => {
  let component: DocMngmtComponent;
  let fixture: ComponentFixture<DocMngmtComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [DocMngmtComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DocMngmtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
