import { Routes } from '@angular/router';
import { CreateUserScreen } from './pages/create-user-screen/create-user-screen';
import { ConfiguracionUsuario } from './pages/configuracion-usuario/configuracion-usuario';
import { PaginaPrincipalAdministracion } from './pages/pagina-principal-administracion/pagina-principal-administracion';

export const routes: Routes = [
  {
    path: '',
    component: PaginaPrincipalAdministracion,
  },
  {
    path: 'configuration/createUser',
    component: CreateUserScreen,
  },
  {
    path: 'configuration',
    component: ConfiguracionUsuario,
  },
];
