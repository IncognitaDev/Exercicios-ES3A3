package modelo;

import java.time.LocalDate;

public class ContaComum {
    private long numeroConta;
    private LocalDate aberturaConta;
    private LocalDate fechamentoConta;
    private int situacaoConta;
    private int senhaConta;
    private double saldoConta;

    public long getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(long numeroConta) {
        this.numeroConta = numeroConta;
    }

    public LocalDate getAberturaConta() {
        return aberturaConta;
    }

    public void setAberturaConta(LocalDate aberturaConta) {
        this.aberturaConta = aberturaConta;
    }

    public LocalDate getFechamentoConta() {
        return fechamentoConta;
    }

    public void setFechamentoConta(LocalDate fechamentoConta) {
        this.fechamentoConta = fechamentoConta;
    }

    public int getSituacaoConta() {
        return situacaoConta;
    }

    public void setSituacaoConta(int situacaoConta) {
        this.situacaoConta = situacaoConta;
    }

    public int getSenhaConta() {
        return senhaConta;
    }

    public void setSenhaConta(int senhaConta) {
        this.senhaConta = senhaConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
