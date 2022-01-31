# Microsserviços Java com Spring Boot e Spring Cloud

- Esse projeto foi desenvolvido com propósitos educacionais apenas, para a disciplina de Sistemas Distribuídos 2021/1 do curso de Engenharia de Computação do Instituto Federal do Sul de Minas Gerais.
- O projeto conta com 3 microsserviços, sendo o microsserviço de Produto um CRUD completo. Cada microsserviço sobe sua própria instância do banco H2 e todos os três se comunicam via REST, com as facilidades do Eureka Server.

## 🚀 Começando

- O microsserviço Ticket funciona com um bilhete, podendo ser encontrado em todos os produtos. O que define se o bilhete é premiado ou não é seu status ("ATIVO" ou "INATIVO").
- O microsserviço Produto possui um bilhete, e os dois possuem o atributo "produtoId" em comum.
- Por fim, o microsserviço Cliente também possui um bilhete com o atributo "ticketId" em comum, podendo assim o Cliente ter tirado um bilhete premiado.

### 📋 Pré-requisitos

- JDK 11 ou superior devidamente instalada com suas variáveis de ambiente;
- Alguma IDE de desenvolvimento Java, recomendado o IntelliJ IDEA;
- Postman rodando minha coleção feita para testes: https://www.getpostman.com/collections/af67577bd3dee035fff9;

### 🔧 Instalação

- Clonar o repositório na máquina;
- Abrir o IntelliJ IDEIA e importar os 4 projetos em paralelo (quatro instâncias do IntelliJ abertas);
- Rode cada uma das 4 pelo botão de play no IntelliJ (suba o eureka-server primeiro);
- Com o eureka-server up já é possivel acessar a dashboard pelo endereço localhost:8762 e visualizar os microsserviços;
- Por fim abrir o Postman, File -> Import e selecionar a aba Link; 
- Colar o link disponibilizado acima e se divertir!
- Perceba que foi mantido um padrão de url: o ms de ticket vai subir na porta 6060, o de produto na 6161 e o de cliente na 6262. Para acessar o banco de dados H2 de cada um, acessar a url localhost:6x6x/h2-console.
- No campo de url substituir por "jdbc:h2:file:./data/xxxms";
- No campo usuário preencher "amaral" e a senha deixar em branco;

## 🛠️ Construído com

* [Java 11](https://dev.java/) - Linguagem de programação usada;
* [Maven](https://maven.apache.org/) - Gerenciador de dependências;
* [Spring Boot](https://spring.io/projects/spring-boot) - Projeto do Spring utilizado para construir as aplicações REST com facilidade;
* [Spring Cloud](https://spring.io/projects/spring-cloud) - Projeto do Spring para comunicação de serviços;
* [H2 Database](https://www.h2database.com/html/main.html) - Banco de dados local para aplicações Java.

## ✒️ Autores

* **Antonio Amaral** - *Desenvolvimento, Arquitetura e Documentação* - [oamaraldev](https://github.com/oamaraldev)
* **Mateus Nazaré** - *Desenvolvimento* - [MateusNazare](https://github.com/MateusNazare)

---
⌨️ com ❤️ por [Antonio Amaral](https://github.com/oamaraldev)
