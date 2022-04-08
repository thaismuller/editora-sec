# editora-sec
Trabalho para a disciplina de Desenvolvimento Web 

Universidade Estadual de Ponta Grossa
07/04/2022

Alunos: Eduardo Sestren, Thais Muller Martins, Guilherme Klosowski
Engenharia de Computação 

Desenvolvimento de uma API de Editora, informando o Título do artigo, Resumo do artigo e se o mesmo foi publicado.
Utilizado o Amazon Cognito para realizar o login e manter segurança das informações exibidas dos artigos.
O Model recebe as informações para criação da tabela com os dados das colunas: título, publicado e resumo.
O Repository faz uma seleção das informações contidas na tabela.
O Controller realiza o processo de POST, GET, PUT, DELETE das informações dos artigos dentro do banco de dados.
POST: realiza a criação do artigo, preenchendo o título, resumo e se o mesmo foi publicado.
GET: realiza a listagem dos artigos, sendo todos os artigos dentro do banco de dados ou baseado no id do artigo.
PUT: realiza a atualização de um artigo selecionado baseado no ID do mesmo, editando as informações de título, resumo e se foi publicado.
DELETE: realiza a deleção de um artigo selecionado baseado no id ou exclui todos os artigos do banco de dados.

Foi utilizado o endereço: http://localhost:8080/secauth/ para acessar as informações, com adição de uma interface simples para realizar o login no SecAuth com o Amazon Cognito e Listar os Artigos, exibindo o título e embaixo os dados, ao lado o resumo e embaixo do resumo os dados no banco, ao lado de resumo a indicação de ele foi publicado e os dados baseado na linha do artigo adicionado no banco de dados, em cada linha dos dados um botão para realizar a edição e um botão para realizar a deleção do dado em questão. Abaixo um botão de adicionar um novo artigo, que permite inserir as informações dos artigos conforme solicitado.

Requisitos
MySql WorkBench
Visual Studio Code
Git
Bootstrap 4
Font-Awesome
Java 11
Apache Maven 3.8.4
XAMPP
