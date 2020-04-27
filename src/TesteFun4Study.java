import java.util.Scanner;

public class TesteFun4Study {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        Cidade cidade1 = new Cidade();
        Cidade cidade2 = new Cidade();
        Cidade cidade3 = new Cidade();
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();

        String novaSenhaA0;
        String novaSenhaA1;
        String novaSenhaA2;
        String novaSenhaB0;
        String novaSenhaB1;
        String novaSenhaB2;

        System.out.println("------> CRIANDO ESTUDANTE UM <------");
        System.out.println("CODIGO ESTUDANTE: ");
            estudante1.setCodigo(sc.nextInt());
            sc.nextLine();
        System.out.println("NOME: ");
            estudante1.setNome(sc.nextLine());
        System.out.println("DATA DE NASCIMENTO: ");
            estudante1.setDataDeNascimento(sc.nextLine());
        System.out.println("EMAIL: ");
            estudante1.setEmail(sc.nextLine());
        System.out.println("SENHA: ");
            estudante1.setSenha(sc.nextLine());
        System.out.println("CIDADE: ");
            estudante1.setCidade(sc.nextLine());
        System.out.println("CODIGO CIDADE");
            cidade1.setCodigo(sc.nextInt());
            sc.nextLine();
        System.out.println("DESCRICAO: ");
            cidade1.setDescricao(sc.nextLine());
        System.out.println("UF: ");
            cidade1.setUf(sc.nextLine());

        cidade3.quantidadeDeAlunosSomatorio();

        System.out.println("INSIRA A SENHA ANTIGA: ");
            novaSenhaA0 = sc.nextLine();
                if (novaSenhaA0.compareTo(estudante1.getSenha()) == 0) {
                    System.out.println("INSIRA UMA NOVA SENHA");
                        novaSenhaA1 = sc.nextLine();
                    System.out.println("REPITA A NOVA SENHA");
                        novaSenhaA2 = sc.nextLine();
                            if (novaSenhaA2.compareTo(novaSenhaA1) == 0) {
                                estudante1.setSenha(novaSenhaA1);
                    } else {
                        System.out.println("SENHA REPETIDA ERRADA, NÃO HOUVE MODIFICAÇÃO");
                    }
                }
                else {
                    System.out.println("SENHA ERRADA, NÃO HOUVE MODIFICAÇÃO");
                }

        System.out.println("------> CRIANDO ESTUDANTE DOIS <------");
        System.out.println("CODIGO ESTUDANTE: ");
            estudante2.setCodigo(sc.nextInt());
            sc.nextLine();
        System.out.println("NOME: ");
            estudante2.setNome(sc.nextLine());
        System.out.println("DATA DE NASCIMENTO: ");
            estudante2.setDataDeNascimento(sc.nextLine());
        System.out.println("EMAIL: ");
            estudante2.setEmail(sc.nextLine());
        System.out.println("SENHA: ");
            estudante2.setSenha(sc.nextLine());
        System.out.println("CIDADE: ");
            estudante2.setCidade(sc.nextLine());
        System.out.println("CODIGO CIDADE");
            cidade2.setCodigo(sc.nextInt());
            sc.nextLine();
        System.out.println("DESCRICAO: ");
            cidade2.setDescricao(sc.nextLine());
        System.out.println("UF: ");
            cidade2.setUf(sc.nextLine());

        cidade3.quantidadeDeAlunosSomatorio();

        System.out.println("INSIRA A SENHA ANTIGA: ");
        novaSenhaB0 = sc.nextLine();
        if (novaSenhaB0.compareTo(estudante2.getSenha()) == 0) {
            System.out.println("INSIRA UMA NOVA SENHA");
            novaSenhaB1 = sc.nextLine();
            System.out.println("REPITA A NOVA SENHA");
            novaSenhaB2 = sc.nextLine();
            if (novaSenhaB2.compareTo(novaSenhaB1) == 0) {
                estudante2.setSenha(novaSenhaB1);
            } else {
                System.out.println("SENHA REPETIDA ERRADA, NÃO HOUVE MODIFICAÇÃO");
            }
        }
        else {
            System.out.println("SENHA ERRADA, NÃO HOUVE MODIFICAÇÃO");
        }

        System.out.println("------> MOSTRAR DADOS 1 <------");
            estudante1.exibeDados();
            cidade1.exibeDados();

        System.out.println("------> MOSTRAR DADOS 2 <------");
            estudante2.exibeDados();
            cidade2.exibeDados();

        System.out.println("------><------");

        System.out.println("QUANTIDADE TOTAL DE ESTUDANTES: " + cidade3.getQuantidadeDeAlunos());

        System.out.println("------> FIM <------");

    }
}
