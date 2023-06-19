import { Component, OnInit } from '@angular/core';
import {SignUpComponent} from '../sign-up/sign-up.component'

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

  
    fn='srihari';
    ln='meka';
    dob='23-3-1998';
    gender='male';
    email='srihari2198';
    password: String = "sruhaei";
    

}
