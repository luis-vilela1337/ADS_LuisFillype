import { Injectable } from '@angular/core';
import Swal, { SweerAlertIcon } from 'sweetalert2';

@Injectable({
  providedIn: 'root'
})
export class AlertService {

  constructor() { }

  private showGenericAlert(
    title: string,
    message: string,
    icon: SweerAlertIcon): void {
    Swal.fire(title, message, icon);
  }

  public error(title: string, message: string): void {
    this.showGenericAlert(title, message, 'error');
  }

  public sucess(title: string, message: string): void {
    this.showGenericAlert(title, message, 'sucess');
  }
}


