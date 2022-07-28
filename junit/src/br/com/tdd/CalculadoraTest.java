package br.com.tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CalculadoraTest {

    @Test
    public void deveriaSomarDoisNumeroPositivos() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(3, 7);
        Assertions.assertEquals(10, soma);

    }

}
