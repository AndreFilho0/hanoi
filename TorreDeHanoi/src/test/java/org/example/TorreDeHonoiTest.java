package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;

class TorreDeHonoiTest {
    

    @Test
    @DisplayName("teste quantidade de movimentos ")
    void TestecalculoQtMovimento() {
        TorreDeHonoi t1 = new TorreDeHonoi(5);
        double resultado = t1.calculoQtMovimento();
        Assertions.assertEquals(31, resultado);

    }

    @Test
    @DisplayName("testa o construtor sem argumento ")
    void TesteConstruturoSemArg() {
        TorreDeHonoi t1= new TorreDeHonoi();
        t1.setNumDiscos(2);
        double resultado = t1.getNumDiscos();
        Assertions.assertEquals(2,resultado);

    }
    @Test
    @DisplayName("testa construtor com argumento")
    void  TesteConstrutorComArg(){
        TorreDeHonoi t1 = new TorreDeHonoi(5);
        double resultado = t1.getNumDiscos();
        Assertions.assertEquals(5,resultado);

    }
}