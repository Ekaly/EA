package EA1;

import java.util.Scanner;

public class MenuController {
    static Scanner scanner = new Scanner(System.in);
    Ingresso ingresso = new Ingresso();
    IngressoVip ingressoVip = new IngressoVip();
    Filme filme = new Filme();
    boolean procedural;
    static int escolha;
    static double any;

    void verFilmes() {
        System.out.println("-------------------------");
        System.out.println("-----LISTA DE FILMES-----");
        System.out.println("-------------------------");
        filme.filmesDisponiveis();
    }

    void ingressoTipo() {
        Texts.ingressoModalidadeText();
        any = scanner.nextDouble();
        ingresso.setEscolhaMeiaOuInteira(any);

        if (!ingresso.getDecision()) System.out.println("Valor total: " +(ingresso.getValorTotal()+ingressoVip.getValorTotalVip()));

        if (ingresso.getDecision() & ingresso.getBoolVip()) {
            System.out.println(ingressoVip.setEscolhaMeiaOuInteiraVip(any) + "\nValor total: "+ (ingresso.getValorTotal() + ingressoVip.getValorTotalVip()));
        }else if (ingresso.getDecision() & !ingresso.getBoolVip()) {
            System.out.println("Identificamos que você ainda não possui a categoria Vip...");
            adquirirVip();
        }
    }

    void escolherFilme() {
        Texts.titleEscolherFilme();
        ingresso.setFilme(filme.escolherFilme());
    }

    void adquirirVip() {
        if (!ingresso.getBoolVip()) {
            Texts.vipText2();
            ingresso.setVip(filme.setfilme3D(scanner.nextInt()));
            ingresso.getVip();

            if (procedural) {
                ingressoTipo();
            }
        }else{
            System.out.println("Você já possui a categoria Vip!");
        }
    }

    void escolherSessao() {
        Texts.titleSessao();
        ingresso.setSessao(filme.getSessoes());
    }

    void procedural () {
        procedural = true;
        verFilmes();
        ingressoTipo();
        escolherFilme();
        escolherSessao();
        escolha = 7;
        procedural = false;
    }

    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        Texts.presenting();
        Texts.vipText();

        do{
            Texts.getMenu();
            escolha = Texts.getMenu(scanner.nextInt());

            switch (escolha) {
                case 1 -> menuController.procedural();
                case 2 -> menuController.verFilmes();
                case 3 -> menuController.ingressoTipo();
                case 4 -> menuController.escolherFilme();
                case 5 -> menuController.adquirirVip();
                case 6 -> menuController.escolherSessao();
                case 7 -> menuController.ingresso.getSessao();
                default -> Texts.getOpcaoInvalida();
            }
        }while(escolha != 7);

        menuController.ingresso.relatorio();
        System.out.println("Seu resumo:\n\nFilme: "+menuController.ingresso.getFilmeEscolhido() +"\n"+menuController.ingresso.getSessao()+
                            "\nIngressos Comuns: "+menuController.ingresso.getTotalQtdIngressos()+
                            "\nIngressos Vip: "+menuController.ingressoVip.getTotalQtdIngressosVip());
        System.out.println("Valor total: "+(menuController.ingresso.getValorTotal()+menuController.ingressoVip.getValorTotalVip()));

        if (menuController.ingresso.getValorTotal() != 0) menuController.ingresso.acessoLanchonete();
        else System.out.println("\nCompra incompleta.\n\n" +
                "É necessário adquirir ao menos um ingresso e selecionar sua sessão e filme.\nTente novamente!");
    }
}