import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ConfiguracionUsuario } from './configuracion-usuario';

describe('ConfiguracionUsuario', () => {
  let component: ConfiguracionUsuario;
  let fixture: ComponentFixture<ConfiguracionUsuario>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [ConfiguracionUsuario],
    }).compileComponents();

    fixture = TestBed.createComponent(ConfiguracionUsuario);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
