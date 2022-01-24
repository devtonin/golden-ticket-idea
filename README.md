# Microsserviços Java com Spring Cloud

- Esse projeto foi desenvolvido com propósitos educacionais apenas, para a disciplina de Sistemas Distribuídos 2021/1 do curso de Engenharia de Computação do Instituto Federal do Sul de Minas.
- O projeto conta com 3 microsserviços, sendo o microsserviço de Produto um CRUD completo. Cada microsserviço sobe sua própria instância do banco H2 e todos os três se comunicam via REST, com as facilidades do Eureka Server.

## 🚀 Começando

- O microsserviço Ticket funciona com um bilhete, podendo ser encontrado em um produto. O que define se ele está premiado ou não é seu status.
- O microsserviço Produto possui um bilhete. Os dois tem o atributo "produtoId" em comum.
- O microsserviço Cliente também possui um bilhete, com o atributo "ticketId" em comum, podendo assim o Cliente ter tirado um bilhete premiado.

### 📋 Pré-requisitos

- JDK 11 ou superior devidamente instalada.
- Alguma IDE de desenvolvimento Java, recomendado IntelliJ.
- Postman e essa coleção de testes (https://www.getpostman.com/collections/af67577bd3dee035fff9).

### 🔧 Instalação

- Clone esse repositório na sua máquina
- Abra o IntelliJ e importe os 4 projetos em paralelo (quatro instâncias do IntelliJ)
- Suba cada uma das 4 pelo botão de play no IntelliJ (suba o eureka-server primeiro)
- Já é possivel acessar a dashboard do Eureka pelo endereço localhost:8762
- Por fim abra o Postman, importe a coleção anexada nesse projeto e se divirta!

## 🛠️ Construído com

* [Java](https://dev.java/) - Linguagem de programação usada;
* [Maven](https://maven.apache.org/) - Gerenciador de dependências;
* [Spring Boot](https://spring.io/projects/spring-boot) - Projeto do Spring utilizado para construir as aplicações REST com facilidade;
* [Spring Cloud](https://spring.io/projects/spring-cloud) - Projeto do Spring para comunicação de serviços;
* [H2 Database](https://www.h2database.com/html/main.html) - Banco de dados local para aplicações Java.

## ✒️ Autores

* **Antonio Amaral** - *Desenvolvimento, Arquitetura e documentação* - [oamaraldev](https://github.com/oamaraldev)
* **Mateus Nazaré** - *Desenvolvimento* - [MateusNazare](https://github.com/MateusNazare)

---
⌨️ com ❤️ por [Antonio Amaral](https://github.com/oamaraldev)
