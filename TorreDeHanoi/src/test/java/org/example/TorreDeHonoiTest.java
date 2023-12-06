package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.geom.Arc2D;

import static org.junit.jupiter.api.Assertions.*;

class TorreDeHonoiTest {

    @Test
    @DisplayName("testa se o metodo de calculo da quantidade de movimento está certa")
    void TestecalculoQtMovimento() {
        TorreDeHonoi t1 = new TorreDeHonoi(5);
        double resultado = t1.calculoQtMovimento();
        Assertions.assertEquals(31, resultado);

    }

    @Test
    @DisplayName("testa os metodos get e set ")
    void TesteGetSetNumDiscos() {
        TorreDeHonoi t1= new TorreDeHonoi();
        t1.setNumDiscos(2);
        double resultado = t1.getNumDiscos();
        Assertions.assertEquals(2,resultado);

    }
}