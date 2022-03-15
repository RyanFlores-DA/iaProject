/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.da.iaproject;

/**
 *
 * @author Ryan Flores
 */
public class algumaCoisa {
    String city;
    int dist;
    
    public algumaCoisa(String city, int dist){
        this.city = city;
        this.dist = dist;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDist() {
        return dist;
    }

    public void setDist(int dist) {
        this.dist = dist;
    }
}
