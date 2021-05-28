package br.com.alura.rh.model;

import java.math.BigDecimal;

public class Terceirizados {

    // No lugar de extender a Classe Funcionario, a gente cria uma classe Dados Pessoais, ou seja, faz uma composicao
    // Tanto Funcionarios e Terceirizados terão acesso aos dados pessoais, evitando duplicação de códigos.
    // Se eu extendo a classe Funcionario eu herdo os métodos de reajuste salarial e de promoção que não é comum aos
    // Terceirizados.
    // Deve-se favorecer a composição no lugar da herança.
    // É importante ter cuidado com a herança para não gerar efeito colateral.

    private DadosPessoais dadosPessoais;
    private String empresa;

    public Terceirizados(String nome, String cpf, Cargo cargo, BigDecimal salario) {
        this.dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
        this.empresa = empresa;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
