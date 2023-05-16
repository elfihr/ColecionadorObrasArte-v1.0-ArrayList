import java.util.ArrayList;

public class Colecao{

    private static ArrayList<Antiguidade> listaColecao = new ArrayList<>();

    public static ArrayList<Antiguidade>getListaColecao (){
        return listaColecao;
    }

    //adiciona
    static public void adicionar(Antiguidade A){
        listaColecao.add(A);
    }

    //lista
    static public String listar (){
        String saida = "";
        int i = 1;
        for(Antiguidade A:listaColecao ){
            saida += "Nº"+(i++)+" Obra"+"\n";
            saida += A.imprimir();
        } return saida;
    }

    //Remove
    static public boolean remover(String obra){
        for(Antiguidade A:listaColecao){
            if(A.getAntiguidade().equalsIgnoreCase(obra)){
                listaColecao.remove(A);
                return true;
            }
        }return false;
    }

    //Total preço
    static public double calcular (){
        double total = 0;
        for(Antiguidade A: listaColecao){
            total += A.getPreco();
        }return total;
    }

    //Total de antiguidade por faixa
    static public int pesquisa(double vInicial,double vFinal){
        int qtd = 0;
        for(Antiguidade A:listaColecao){
            if(A.getPreco() >= vInicial && A.getPreco() <= vFinal){
                qtd++;
            }
        }return qtd;
    }



}
