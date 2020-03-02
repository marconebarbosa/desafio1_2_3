public class Filme {

    private int id;
    private String nome;
    private String genero;
    private Double valor;

    public Filme(String nome, String genero, Double valor) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
}
