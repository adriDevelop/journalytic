import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaginaPrincipalAdministracion } from './pagina-principal-administracion';

describe('PaginaPrincipalAdministracion', () => {
  let component: PaginaPrincipalAdministracion;
  let fixture: ComponentFixture<PaginaPrincipalAdministracion>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PaginaPrincipalAdministracion],
    }).compileComponents();

    fixture = TestBed.createComponent(PaginaPrincipalAdministracion);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
