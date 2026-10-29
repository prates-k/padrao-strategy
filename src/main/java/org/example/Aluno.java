package org.example;

public class Aluno {

    private float valorMensalidade;

    public float getValorMensalidade() {
        return valorMensalidade;
    }

    public void calcularPlanoMensal(float valorBase, float taxaInscricao) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, taxaInscricao);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoMensal());
    }

    public void calcularPlanoSemestral(float valorBase, float meses) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, meses);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoSemestral());
    }

    public void calcularPlanoAnual(float valorBase, float meses) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, meses);
        this.valorMensalidade = calculadora.calcular(new OperacaoPlanoAnual());
    }

    public void calcularDescontoEstudante(float valorBase, float percentualDesconto) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, percentualDesconto);
        this.valorMensalidade = calculadora.calcular(new OperacaoDescontoEstudante());
    }

    public void calcularDescontoFidelidade(float valorBase, float valorDesconto) {
        CalculadoraMensalidade calculadora = new CalculadoraMensalidade(valorBase, valorDesconto);
        this.valorMensalidade = calculadora.calcular(new OperacaoDescontoFidelidade());
    }
}