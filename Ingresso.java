package EA1;

import java.util.ArrayList;
import java.util.Scanner;

public class Ingresso implements Lanchonete {
    Scanner scanner = new Scanner(System.in);
    boolean decision;
    Filme filmes = new Filme();
    ArrayList <String> relatorio = new ArrayList<>();
    private String filme = "Nenhum";
    private double valorAtual;
    private String sessao = "Nenhuma";
    private boolean vip;
    private final double [] ingresso = {12, 24};
    private double valorTotal;
    private double escolhaMeiaOuInteira;
    private double totalQtdIngressos;

    void setEscolhaMeiaOuInteira(double escolha) {
        if (escolha <= 2) {
            this.escolhaMeiaOuInteira = escolha;
            Texts.IngressoText();
            double quantia = scanner.nextDouble();
            qtdIngressos(quantia);
            setTotalQtdIngressos(quantia);
            decision = false;
        }else{
            decision = true;
        }
    }

    void qtdIngressos(double quantia) {
        if (escolhaMeiaOuInteira == 1) {
            valorTotal += ingresso[0] * quantia;
            valorAtual = ingresso[0] * quantia;
        } else {
            valorTotal += ingresso[1] * quantia;
            valorAtual = ingresso[1] * quantia;
        }
    }

    public double getTotalQtdIngressos() {
        return totalQtdIngressos;
    }

    public void setTotalQtdIngressos(double totalQtdIngressos) {
        this.totalQtdIngressos += totalQtdIngressos;
    }

    public String getSessao() {
        return "Sessão: "+sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao.substring(5);
    }

    public void setVip (boolean vip) {
        if (vip) {
            this.vip = true;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public String getVip() {
        String Vip;
        if (vip) Vip = "Vip adquirido!";
        else Vip = "Vip não adquirido!";
        return Vip;
    }

    public boolean getBoolVip() {
        return vip;
    }

    public void setFilme(String Filme) {
        this.filme = Filme;
    }

    String getFilmeEscolhido() {
        return this.filme;
    }

    public boolean getDecision() {
        return decision;
    }

    public void relatorio() {
        relatorio.add("Seu comprovante: \n"+getFilmeEscolhido()+"\n" +getVip()+"\n"+getSessao());
        relatorio.add("Quantidade total de ingressos comuns adquiridos: "+ getTotalQtdIngressos());
    }

    @Override
    public void ingressoTipo() {
        System.out.println("A categoria do ingresso não permite acesso à lanchonete.");
    }

    @Override
    public void acessoLanchonete() {
         if (!getBoolVip()) {
             System.out.println("\nIngressos comuns: sem acesso à lanchonete.");
         }else {
             IngressoVip ingressoVip = new IngressoVip();
             ingressoVip.acessoLanchonete();
         }

    }
}
