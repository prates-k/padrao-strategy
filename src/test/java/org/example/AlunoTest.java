package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveCalcularPlanoMensalAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularPlanoMensal(80.0f, 20.0f);
        assertEquals(100.0f, aluno.getValorMensalidade());
    }

    @Test
    void deveCalcularDescontoFidelidadeAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularDescontoFidelidade(80.0f, 10.0f);
        assertEquals(70.0f, aluno.getValorMensalidade());
    }

    @Test
    void deveCalcularPlanoSemestralAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularPlanoSemestral(80.0f, 1.1f);
        assertEquals(88.0f, aluno.getValorMensalidade());
    }

    @Test
    void deveCalcularPlanoAnualAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularPlanoAnual(100.0f, 2.0f);
        assertEquals(50.0f, aluno.getValorMensalidade());
    }

    @Test
    void naoDeveCalcularPlanoAnualAlunoPorZero() {
        try {
            Aluno aluno = new Aluno();
            aluno.calcularPlanoAnual(100.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Divisão por zero", e.getMessage());
        }
    }

    @Test
    void deveCalcularDescontoEstudanteAluno() {
        Aluno aluno = new Aluno();
        aluno.calcularDescontoEstudante(70.0f, 80.0f);
        assertEquals(75.0f, aluno.getValorMensalidade());
    }

}