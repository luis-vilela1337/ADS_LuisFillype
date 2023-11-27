import { Component, OnInit } from '@angular/core';
import { BookService } from 'src/app/services/book.service';
import { IBook } from 'src/app/models/i-book';
import { AlertService } from 'src/app/services/alert.service';

@Component({
  selector: 'app-book-table',
  templateUrl: './book-table.component.html',
  styleUrls: ['./book-table.component.css']
})

export class BookTableComponent implements OnInit {
  books: IBook[] = [];

  constructor(private service: BookService,
    private alertService: AlertService) { }

  ngOnInit(): void {
    this.service.findAll().subscribe({
      next: (data) => {
        this.books = data;

        for (let b of this.books) {
          console.log(b.id);
          console.log(b.title);
          console.log(b.category);
        }
      },
      error: (err) => {
        const tit = 'Erro buscando livros';
        const msg = err.message;
        this.alertService.error(tit, msg);
      }
    });
  }
}
