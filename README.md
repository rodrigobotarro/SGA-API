# Sistema Gerenciador de Aeronaves - SGA-API

Single Page Application - Modulo RESTful

## Getting Started

Certifique-se que seu servidor MySQL está instalado e funcionando.
Crie um esquema no MYSQL chamado "sga".
Com o esquema criado, a nossa API fará construção das entidades automaticamente.
Faça o download da aplicação SGA-API.
O MySQL está configurado para rodar localmente, com a configuração padrão de instalação: mysql://localhost:3306.
Se houver necessidade de trocar as configurações de acesso, em SGA-API/src/main/resources/application.properties você poderá fazê-lo.
Importe o projeto em sua IDE como projeto maven.
Rode sua aplicação como projeto Spring Boot.
Volte ao Mysql e execute o arquivo sga.sql, localizado no diretório raiz do SGA-API para povoar as entidades e ter uma melhor experiência de navegação.
Seu Serviço RESTful poderá ser acessado na url da sua aplicação web Ex: http://localhost:8080/

### Prerequisites

Java

MySQL

Eclipse IDE ( ou outra IDE de sua escolha )

## Deployment

Acesse o terminal e na raiz da aplicação rode a função ">mvn package", isto criará um arquivo ".war" que possuirá todas as dependências necessárias para fazer o deploy de sua aplicação.
## Built With

* [Spring Tools](https://spring.io/tools) - Framework utilizado para agilizar o desenvolvimento Java. 
* [Maven](https://maven.apache.org/) - Dependency Management
* [Eclipse](https://www.eclipse.org) - IDE usada para codificar.

## Authors

* **Rodrigo Parente Botarro** - *Initial work* - [rodrigobotarro](https://github.com/rodrigobotarro)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for detail.
