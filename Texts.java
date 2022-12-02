package EA1;

public class Texts {

    public static void ingressoModalidadeText() {
        String ingressoModalidadeText = """
                                Informe a modalidade para seu ingresso:
                                [1]: Meia Entrada
                                [2]: Inteira
                                [3]: Meia Entrada(VIP)
                                [4]: Inteira(VIP)""";
        System.out.println(ingressoModalidadeText);
    }

    public static void IngressoText() {
        String ingressoText = "Informe a quantidade de ingressos que deseja comprar";
        System.out.println(ingressoText);
    }

    public static void vipText() {
        String vipText = "\nAdquira já sua categoria VIP para ter acesso à nossa maravilhosa lanchonete!";
        System.out.println(vipText);
    }

    public static void getMenu() {
        String menu = """
                \nEscolha a opção desejada:
                [1]: Compra rápida
                [2]: Ver os filmes disponíveis
                [3]: Comprar ingressos
                [4]: Escolher Filme
                [5]: Adquirir categoria VIP
                [6]: Escolher Sessão
                [7]: Encerrar
                """;
        System.out.println(menu);
    }
    public static int getMenu(int escolha) {
        return escolha;
    }

    public static void escolhaSessao() {
        String escolhaSessao = "Escolha a sessão desejada: ";
        System.out.println(escolhaSessao);
    }

    public static void presenting() {
        String presenting = "\nOlá, Bem vindo ao Mavel Cinema!";
        System.out.println(presenting);
    }

    public static void vipText2() {
        String vipText2 = """
                \nAdquirindo a categoria VIP você poderá ter acesso à nossa lanchonete!
                Além disso, você terá acesso a filmes 3D, trazendo muito mais emoção na sua experiência!
                \nAdquira já:
                [1]: Sim
                [2]: Não""";
        System.out.println(vipText2);
    }

    public static void getOpcaoInvalida() {
        String opcaoInvalida = "Opção inválida!\nTente novamente!";
        System.out.println(opcaoInvalida);
    }

    public static void titleSessao() {
        System.out.println("--------------------------");
        System.out.println("-----LISTA DE SESSÕES-----");
        System.out.println("--------------------------");
    }

    public static void titleEscolherFilme() {
        System.out.println("-------------------------");
        System.out.println("-----ESCOLHER FILME------");
        System.out.println("-------------------------");
    }

    public static void titleTipoIngresso() {
        System.out.println("--------------------------");
        System.out.println("ESCOLHA O TIPO DE INGRESSO");
        System.out.println("--------------------------");
    }
}
