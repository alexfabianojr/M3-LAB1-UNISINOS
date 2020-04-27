import java.util.Objects;

public class Estudante {

    private int codigo;
    private String nome;
    private String dataDeNascimento;
    private String email;
    private String senha;
    private String cidade;

    public Estudante() {

    }

    public Estudante(int codigo, String nome, String dataDeNascimento, String email, String senha, String cidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataDeNascimento = dataDeNascimento;
        this.email = email;
        this.senha = senha;
        this.cidade = cidade;
    }

    public void exibeDados() {
        System.out.println("CODIGO: " + codigo);
        System.out.println("NOME: " + nome);
        System.out.println("DATA DE NASCIMENTO: " + dataDeNascimento);
        System.out.println("EMAIL: " + email);
        System.out.println("SENHA: " + senha);
        System.out.println("CIDADE: " + cidade);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudante)) return false;
        Estudante estudante = (Estudante) o;
        return getSenha().equals(estudante.getSenha());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSenha());
    }
}
