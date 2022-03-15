/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.da.teste.logic;

/**
 *
 * @author Ryan Flores
 */
public class State {
    private String cd_inicial;
    private String cd_final;

    public State(String cd_inicial, String cd_final){
        this.cd_inicial = cd_inicial;
        this.cd_final = cd_final;
    }
    
    public String getCd_inicial() {
        return cd_inicial;
    }

    public void setCd_inicial(String cd_inicial) {
        this.cd_inicial = cd_inicial;
    }

    public String getCd_final() {
        return cd_final;
    }

    public void setCd_final(String cd_final) {
        this.cd_final = cd_final;
    }
}
