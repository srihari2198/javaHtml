package com.dependenciestest;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street = "1408 meadow st";
    private String state  = "Texas";
    private String Country = "US";

    public String getAddress(){
        return ""+this.street+" "+this.state+" "+this.Country;
    }


}
