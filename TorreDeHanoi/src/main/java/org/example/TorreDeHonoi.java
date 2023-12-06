package org.example;

public class TorreDeHonoi {
    private int numDiscos;

    public TorreDeHonoi() {
    }

    public double calculoQtMovimento (){

        return Math.pow(2,getNumDiscos())- 1;
    }

    public TorreDeHonoi(int numDiscos) {
        this.numDiscos = numDiscos;
    }


    public int getNumDiscos() {
        return numDiscos;
    }

    public void setNumDiscos(int numDiscos) {
        this.numDiscos = numDiscos;
    }


}
