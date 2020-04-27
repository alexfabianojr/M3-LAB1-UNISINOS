import java.util.Objects;

public class Cidade {

    private int codigo;
    private String descricao;
    private String uf;
    private int quantidadeDeAlunos = 0;

    public Cidade() {

    }

    public Cidade(int codigo, String descricao, String uf, int quantidadeDeAlunos) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.uf = uf;
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }

    public void exibeDados() {
        System.out.println("CODIGO: " + codigo);
        System.out.println("DESCRICAO: " + descricao);
        System.out.println("UF: " + uf);
    }

    public void adicionaNovoEstudante() {
        quantidadeDeAlunos += 1;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public int getQuantidadeDeAlunos() {
        return quantidadeDeAlunos;
    }

    public void setQuantidadeDeAlunos(int quantidadeDeAlunos) {
        this.quantidadeDeAlunos = quantidadeDeAlunos;
    }
}
