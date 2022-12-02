package EA1;

import java.util.Scanner;

public class IngressoVip extends Ingresso implements Lanchonete {
    Scanner scanner = new Scanner(System.in);
    double [] ingresso = {24, 48};
    private double escolhaMeiaOuInteira;
    private double valorTotalVip;
    private double totalQtdIngressosVip;
    private double valorAtual;
    void qtdIngressos(double quantia) {
        if (quantia == 1) {
            valorTotalVip += ingresso[0] * quantia;
            valorAtual = ingresso[0] * quantia;
        } else {
            valorTotalVip += ingresso[1] * quantia;
            valorAtual = ingresso[1] * quantia;
        }
        totalQtdIngressosVip += quantia;
    }

    String setEscolhaMeiaOuInteiraVip(double escolha) {
        this.escolhaMeiaOuInteira = escolha;
        Texts.IngressoText();
        double quantia = scanner.nextDouble();
        qtdIngressos(quantia);
        setTotalQtdIngressosVip(quantia);
        return "Valor da compra atual: "+valorAtual;
    }

    public double getValorTotalVip() {
        return valorTotalVip;
    }

    public double getTotalQtdIngressosVip() {
        return totalQtdIngressosVip;
    }

    public void setTotalQtdIngressosVip(double totalQtdIngressosVip) {
        this.totalQtdIngressosVip = totalQtdIngressosVip;
    }

    @Override
    public void acessoLanchonete() {
        System.out.println("\nIngresso categoria Vip: acesso à lanchonete liberado!");
    }
}
