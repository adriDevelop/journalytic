import { Component } from '@angular/core';
import { Analitica } from '../../core/models/Analitica';
import { CardAnaliticas } from '../../components/card-analiticas/card-analiticas';

@Component({
  selector: 'app-pagina-principal-administracion',
  imports: [CardAnaliticas],
  templateUrl: './pagina-principal-administracion.html',
  styleUrl: './pagina-principal-administracion.css',
})
export class PaginaPrincipalAdministracion {
  analiticas: Array<Analitica> = [
    { titulo: 'Hoy has tenido', numeroVisitas: 0, subtitulo: 'visitas' },
    { titulo: 'Hoy has tenido', numeroVisitas: 0, subtitulo: 'visitas en país seleccionado' },
    { titulo: 'Tienes', numeroVisitas: 0, subtitulo: 'visitas totales' },
  ];
}
