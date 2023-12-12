import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { IBook } from '../models/i-book';

@Injectable({
  providedIn: 'root'
})

export class BookService {
  private readonly URI_BOOKS = 'api/book';

  constructor(private http: HttpClient) { }

  public findAll(): Observable<IBook[]> {
    return this.http.get<IBook[]>(this.URI_BOOKS);
  }
}
