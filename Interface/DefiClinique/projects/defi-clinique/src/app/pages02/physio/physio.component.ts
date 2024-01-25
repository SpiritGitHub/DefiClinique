import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { MatIconModule } from '@angular/material/icon';
import { ChartData, ChartType } from 'chart.js';
import { NgChartsModule } from 'ng2-charts';

export type dataSource = {
  nom: string;
  prenom: string;
};

@Component({
  selector: 'app-physio',
  standalone: true,
  imports: [CommonModule, FormsModule, NgChartsModule,MatIconModule],
  templateUrl: './physio.component.html',
  styleUrl: './physio.component.css'
})
export class PhysioComponent {

  dataSource = [{ nom: 'Dupont', prenom: 'Jean'},]
  dataSource2 = [    
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', selected: false },
    { nom: 'Dupont', prenom: 'Jean', docNum: '123', specialites: 'Cardiologie', selected: false },
  ]


  public chartType: ChartType = 'doughnut';
  public chartData: ChartData<'doughnut'> = {
    datasets: [{
      data: [30, 90, 50], // Vos données ici
      backgroundColor: ['#B10000', '#000921', '#FFD700'], // Couleurs de chaque segment
      hoverBackgroundColor: ['#B10000', '#000921', '#FFD700'], // Couleurs lors du survol
    }]
  };
  public chartOptions: any = {
    responsive: true,
    maintainAspectRatio: false,
    cutoutPercentage: 1,
    rotation: 0 * Math.PI,
    circumference: 120 * Math.PI,
  };

  stars = [1, 2, 3, 4, 5];
  currentRate = 0;

  rate(rating: number): void {
    this.currentRate = rating;
  }


}
