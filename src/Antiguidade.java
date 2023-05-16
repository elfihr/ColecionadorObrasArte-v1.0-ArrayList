public class Antiguidade {

    private String antiguidade;
    private String ano;
    private float preco;

    public Antiguidade(String antiguidade, String ano, float preco) {
        this.antiguidade = antiguidade;
        this.ano = ano;
        this.preco = preco;
    }

    public String getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(String obra) {
        this.antiguidade = obra;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String imprimir(){
        return "Antiguidade: "+antiguidade+" ANO: "+ano+String.format("\nPREÇO R$ %.2f",preco);
    }
}
