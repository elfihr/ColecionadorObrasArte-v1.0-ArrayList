import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leiaString = new Scanner(System.in);
        Scanner leia = new Scanner(System.in);

        int menu = 1;
        String nome, ano;
        boolean valida;
        double vInicial,vFinal;
        float preco;
        Antiguidade objAntiguidade;

        while (menu != 0) {
            abreMenu();
            System.out.print("DIGITE A OPÇÂO >> ");
            menu = leia.nextInt();

            if (menu == 1) {

                System.out.println("===Adicionar Antiguidade a Coleção===\n");

                System.out.print("ANTIGUIDADE: ");
                nome = leiaString.nextLine();

                do {
                    System.out.print("ANO(ex:1950): ");
                    ano = leiaString.nextLine();
                    valida = ano.matches("[0-9]{4}");
                    if (!valida) {
                        System.out.println("Ano invalido, prencha igual ao exemplo: ");
                    }
                } while (!valida);

                System.out.print("PREÇO: ");
                preco = leia.nextFloat();

                objAntiguidade = new Antiguidade(nome,ano,preco);

                Colecao.adicionar(objAntiguidade);
            } else if (menu == 2) {
                System.out.println("===Remover Antiguidade a Coleção===\n");

                System.out.print("Digite o nome da Antiguidade a remover da Coleção: ");
                nome = leiaString.nextLine();
                if(! Colecao.getListaColecao().isEmpty()){
                    if (Colecao.remover(nome)){
                        System.out.println("Antiguidade removida com sucesso!");
                    }else {
                        System.out.println("Antiguidade não encontrada\n");
                    }

                }else {
                    System.out.println("Nao existe Antiguidade na coleção!\n");
                }
            } else if (menu == 3) {
                System.out.println("===Listar Coleção===\n");
                Colecao.listar();
            } else if (menu == 4) {
                System.out.println("===Quantidade de Antiguidades por faixa de preço===\n");

                System.out.println("Digite o Valor inicial >>");
                vInicial = leia.nextDouble();
                System.out.println("Digite o Valor Final >>");
                vFinal = leia.nextDouble();
                System.out.println("Na coleção tem "+Colecao.pesquisa(vInicial,vFinal)+" antiguidades com" +
                        "preço "+String.format("R$ %.2f e R$ %.2f",vInicial,vFinal));
//            }
//            else if (menu == 5) {
//                System.out.println("===Buscar Antiguidade por Nome===\n");
//
//                System.out.print("Digite o nome da Antiguidade >> ");
//                nome = leiaString.nextLine();
//
//                for(int i=0; i < Colecao.getListaColecao().size();i++){
//                    Colecao Temp = Colecao.getListaColecao().get(i);
//
//                }
//
            }
        }
    }

    private static void abreMenu() {
        System.out.println("==========MENU========");
        System.out.println("[1] - Adicionar Antiguidade a Coleção");
        System.out.println("[2] - Remover Antiguidade a Coleção");
        System.out.println("[3] - Listar Coleção");
        System.out.println("[4] - Quantidade de Antiguidades por faixa de preço");
        System.out.println("[5] - Buscar Antiguidade por Nome");
    }
}