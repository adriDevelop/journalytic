import { Component, input } from '@angular/core';
import { Analitica } from '../../core/models/Analitica';

@Component({
  selector: 'app-card-analiticas',
  imports: [],
  templateUrl: './card-analiticas.html',
  styleUrl: './card-analiticas.css',
})
export class CardAnaliticas {
  analitica = input<Analitica>();
}
