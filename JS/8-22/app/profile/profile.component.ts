import { Component, OnInit } from '@angular/core';
import {SignUpComponent} from '../sign-up/sign-up.component'
import { Router } from '@angular/router';
import { AuthService } from '../auth.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  fn='srihari';
    ln='meka';
    dob='23-3-1998';
    gender='male';
    email='srihari2198';
    password: String = "sruhaei";
    isLoggedIn: boolean = false;

  constructor(private router: Router, private authService: AuthService) { 
    

  }

 
  ngOnInit() {
  }

  
    
    

}
