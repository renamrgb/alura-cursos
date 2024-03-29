package br.com.alura.tdd.service;

import br.com.alura.tdd.modelo.Funcionario;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BonusServiceTest {





    @Test
    void bonusDeveriaSerZeroParaFuncionarioComSalarioAlto() {
        BonusService bonusService = new BonusService();

        assertThrows(IllegalArgumentException.class,
                () -> bonusService.calcularBonus(new Funcionario("Teste",
                                LocalDate.now(),
                                new BigDecimal("10001"))));
    }

    @Test
    void bonusDeveriaSer10PorCentoDoSalario() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Teste",
                LocalDate.now(),
                new BigDecimal("2500")));

        assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    void bonusDeveriaSer10PorCentoParaOSalarioDeExatamene10000() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calcularBonus(new Funcionario("Teste",
                LocalDate.now(),
                new BigDecimal("10000")));
        assertEquals(new BigDecimal("1000.00"), bonus);
    }

}
