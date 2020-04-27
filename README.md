# M3-LAB1-UNISINOS

M3 | Resposta ao desafio
Neste módulo, você foi desafiado a desenvolver uma parte de um software para a startup: Fun4Study. Esta startup vem trabalhando com soluções criativas para possibilitar aos interessados em educação utilizarem a tecnologia para estudar a qualquer hora em qualquer lugar.
 
Depois estudar e exercitar os conteúdos abordados no módulo, é possível resolver o desafio proposto abaixo. A contextualização do desafio está descrita aqui.
 
Descrição da Tarefa
A primeira atividade da equipe de desenvolvimento está especificada nas instruções abaixo:

    Crie um novo projeto no BlueJ, chamado: Desafio_Modulo_1

    Crie a classe: Cidade com os seguintes atributos:
        Código = tipo de dados número inteiro
        Descrição = tipo de dados texto
        UF = tipo de dados texto;
        Quantidade de estudantes = tipo de dados número inteiro.

    Crie os seguintes métodos na classe Cidade:
        Construtor que receba como parâmetro os valores dos atributos:
            Código, Descrição e UF
        Métodos de acesso (GET) para os atributos:
            Código, Descrição e UF
        Métodos de configuração (SET) para os atributos:
            Descrição e UF
        Método adicionaNovoEstudante que deverá somar +1 estudante no atributo que representa a quantidade de estudantes, toda vez que o método for executado.
        Método exibeDados para apresentar os dados da classe.

    Crie a classe: Estudante com os seguintes atributos:
        Código = tipo de dados inteiro
        Nome = tipo de dados texto
        Data de nascimento = tipo de dados texto
        Email = tipo de dados texto
        Senha = tipo de dados texto
        Cidade = tipo de dados Cidade

    Crie os seguintes métodos na classe Estudante:
        Construtor que receba como parâmetro os valores dos atributos:
            Código
            Nome
            Data de nascimento
            Email
            Senha
            Cidade
        (o método construtor deve fazer uso também do método adicionaNovoEstudante da classe Cidade, para que, a cada novo estudante cadastrado para um determinado curso (associação simples entre classes), seja calculada e armazenada a quantidade de estudantes para a cidade selecionada)
        Métodos de acesso (GET) para todos os atributos
        Métodos de configuração (SET) para todos os atributos
        Método exibeDados para apresentar todos os dados da classe

    Crie uma classe de Teste chamada: TesteFun4Study
        A classe de teste deve criar 2 cidades e 2 estudantes para cada cidade criada. Utilize a classe Teclado para solicitar os dados do teclado.
        Para cada estudante criado, atualize a senha. Utilize a classe Teclado para solicitar os dados do teclado. Para atualizar a senha, o usuário deve digitar (nesta ordem):
            senha anterior (cadastrada na criação do objeto)
            nova senha
            repetir a nova senha
            A senha deve ser atualizada apenas se o usuário digitar corretamente a senha anterior e digitar duas vezes a nova senha. Informe com uma mensagem o sucesso ou não da alteração da senha.
        Depois da criação das cidades e seus estudantes, o sistema deverá exibir os dados destes objetos na tela.

 
Importante:

    Durante o desenvolvimento, procure utilizar ao máximo os conceitos praticados
    Inclusive, utilize comentários no código para indicar qual e onde um conceito foi utilizado
    Você ainda pode criar métodos e/ou atributos auxiliares caso necessite e/ou ache interessante, desde que não fuja da ideia principal da atividade.

 

Desta forma, você deve entregar, na tarefa abaixo, seu projeto do BlueJ compactado no formato ZIP. Você deve compactar toda a pasta do projeto, não apenas os arquivos-fonte.
