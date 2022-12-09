package ada.viana.banco.model;

import java.math.BigDecimal;

public class Conta {
    private static int ContadordeConta = 1;
    private ModalidadeConta tipo;
    private BigDecimal saldo;
    private int numeroConta;
    private String agencia;
    private Pessoa titular;


    public Conta(ModalidadeConta tipo, Pessoa titular) {
        this.tipo = tipo;
        this.titular = titular;
        numeroConta = ContadordeConta++;
        agencia = "0001";
        saldo = BigDecimal.ZERO;
    }

    public ModalidadeConta getTipo() {
        return tipo;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void saque(BigDecimal saldo) {
        this.saldo = saldo;
    }
    public void deposito(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConta() {
        return numeroConta;
    }


    public String getAgencia() {
        return agencia;
    }


    public Pessoa getTitular() {
        return titular;
    }


}
