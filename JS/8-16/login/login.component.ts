import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  email!: string;
  password!: string;

  login() {
   
    console.log('Email:', this.email);
    console.log('Password:', this.password);
   
  }

}
