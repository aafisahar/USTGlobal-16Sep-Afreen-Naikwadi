import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InputCommunicationComponent } from './input-communication.component';

describe('InputCommunicationComponent', () => {
  let component: InputCommunicationComponent;
  let fixture: ComponentFixture<InputCommunicationComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InputCommunicationComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InputCommunicationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
