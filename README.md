# ForumHub

Descrição 

    ForumHub é um sistema proposto no desafio One da Oracle, onde teve como objetivo criar um fórum online que permite aos usuários interagirem e compartilharem informações em diferentes tópicos de discussão.

Configuração e Execução

    - Certifique-se de ter o JDK e o Maven instalados.
    - Clone este repositório Git.
    - Importe o projeto em sua IDE preferida como um projeto Maven existente.
    - Configure as propriedades do banco de dados em src/main/resources/application.properties.
    - Execute o projeto usando a classe ForumHubApplication.java.
    
Como utilizar

    Para este projeto é necessario fazer uso dessas tecnologias:
        - Java 17
        - Spring boot 3.3.0
        - Mysql
     
    - Crie um banco de dados com o nome "forumhub"
    - Crie uma variavel de ambiente com o nome `JWT_SECRET`
    
    Após iniciar o servidor, você pode interagir com o sistema através dos endpoints REST disponíveis. 

    Por exemplo:
        POST /usuarios: Endpoint para criar um novo usuário no sistema.
        POST /login: Endpoint para autenticar um usuário e obter um token JWT.
    

  

