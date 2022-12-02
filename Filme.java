package EA1;

import java.util.Scanner;

public class Filme {
    Scanner scanner = new Scanner(System.in);
    private boolean filme3D;

    private final String [] sessoes = {"[1]: 14:00h", "[2]: 17:00h", "[3]: 20:00h", "[4]: 23:00h"};
    private final String [] adaoNegro = {"[1]: 3D", "Nome: Adão Negro", "Diretor: Robert Pattinson", "Descrição: O filme tem o The Rock, pô.", "Gênero: Ação", "Duração: 01h59min"};
    private final String [] terminator = {"[2]: 3D", "Nome: Exterminador do Futuro", "Diretor: James Cameron", "Descrição: Máquina assassina do futuro. É isto.", "Gênero: Ação, Ficção Científica", "Duração: 01h47min"};
    private final String [] avatar = {"[3]: 3D", "Nome: Avatar", "Diretor: James Cameron", "Descrição: Índio azul gigante", "Gênero: Ação, Ficcção Científica", "Duração: 02h30min"};
    private final String [] thor = {"[4]: 3D", "Nome: Thor", "Diretor: Sim", "Descrição: Deus do Trovão", "Gênero: Fantasia, Ficcção Científica", "Duração: 01h59min"};
    private final String [] ben10 = {"[5]: 3D", "Nome: Ben 10: O Segredo do Ominitrix", "Diretor: Duncan Roleau, Joe Casey", "Descrição: Ben tenison é possuído por mais de 10 aliens diferentes!", "Gênero: Realidade, Ação", "Duração 03h43min"};

    private final String [][] todos = {adaoNegro, terminator, avatar, thor, ben10};

    boolean setfilme3D(int Filme3D){
        if (Filme3D == 1) {
            filme3D = true;
            System.out.println("Parabéns! Você agora é um VIP!");
        }else{
            filme3D = false;
            System.out.println("Uma pena...\nRetornaremos ao menu.");
        }
        return filme3D;
    }

    String getSessoes() {
        Texts.escolhaSessao();
        for (String num:sessoes) {
            System.out.println(num);
        }
        int sessao = scanner.nextInt()-1;
        return sessoes[sessao];
    }

    String escolherFilme() {
        int x;
        int escolha;
        do {
             if (filme3D) {
                 for (int i = 0; i < todos.length; i++) {
                     for (int j = 0; j < todos.length; j++) {
                         if (j == 1) {
                             System.out.println(todos[i][0] + " " + todos[i][j].substring(6));
                         }
                     }
                 }
             } else {
                 for (int i = 0; i < todos.length; i++) {
                     for (int j = 0; j < todos.length; j++) {
                         if (j == 0) {
                             System.out.println(todos[i][j].substring(0, 4) + " " + todos[i][1].substring(6));
                         }
                     }
                 }
             }
             escolha = scanner.nextInt()-1;
             if (escolha > 5) {
              Texts.getOpcaoInvalida();
              escolha = 0;
             }else {
                 x = 0;
                 for (String[] ignored : todos) {
                     x++;
                     if (x > 5) break;
                     System.out.println(todos[escolha][x]);
                 }
             }
             System.out.println("\nDeseja confirmar sua escolha? \n\nDigite [1] para confirmar ou [2] para mostrar novamente");
             x = scanner.nextInt() * 10;
         }while (x != 10);
    return todos[escolha][1].substring(6);
    }

    void filmesDisponiveis () {
        if (!filme3D) {
            for (int i = 0;i < todos.length;i++){
                for (int j = 0;j < todos.length; j++){
                    if (j == 1) {
                        System.out.println(todos[i][j].substring(6));
                    }
                }
            }
            System.out.println("");
        }else{
            for (int i = 0;i < todos.length;i++) {
                for (int j = 0; j < todos.length; j++) {
                    if (j == 0) {
                        System.out.println(todos[i][j].substring(5)+" "+todos[i][1].substring(6));
                    }
                }
            }
            System.out.println("");
        }
    }
}
