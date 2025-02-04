<p align="center">
  <img align="center" alt="Java" height="40" src="https://github.com/alanfsales/assets/blob/main/Java.png">
</p>

## Projeto
Api em Java SpringBoot para Gerenciar candidatos de vagas de emprego, Feito para manter a gestão em RH

## Descrição
Desenvolver um Conversor de Moedas que ofereça interação textual (via console) com os usuários, proporcionando no mínimo 6 opções distintas de conversões de moedas em um menu. A taxa de conversão não será estática, mas sim dinamicamente obtida por meio de uma API (Exchangerate), garantindo dados precisos e em tempo real para uma experiência mais atualizada e eficaz.

- Java 17 ou superior
- Maven
- Banco de dados (Postgres)

  ## Configuração

1. Clone o repositório:

   ```shell
   git clone https://github.com/danileao/gestao_vagas_rocket.git
   ```

2. Configure o banco de dados editando o arquivo application.properties e fornecendo as configurações necessárias:

    ```properties
    spring.datasource.url=jdbc:postgresql://localhost:5432/database
    spring.datasource.username=admin
    spring.datasource.password=admin
    ```

3. Construa a aplicação:

    ```shell
    mvn clean install
    ```

4. Inicie a aplicação
    ```shell
        mvn spring-boot:run
    ```

A aplicação agora deve estar em execução em http://localhost:8080.


##  Documentação
Acesse a documentação completa da API para obter informações detalhadas sobre os endpoints e como usá-los <a href="https://www.apidog.com/apidoc/shared-fade4710-ac0c-4454-8025-845b9ec61bef">aqui</a>.



## Endpoints

#### Criar candidato
```shell
curl --location --request POST 'http://localhost:8080/candidate/' \
--header 'Content-Type: application/json' \
--data-raw '{
    "username": "jose",
    "name": "Jose de Souza",
    "email": "jose@gmail.com",
    "password": "1234567890",
    "description": "Desenvolvedora Java Junior em busca da primeira oportunidade."
}'
```

![imagem](https://github.com/alanfsales/assets/blob/main/DesafioOne/conversor-de-moedas.png)
