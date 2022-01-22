# Microsserviços Java com Spring Cloud

- Esse projeto foi desenvolvido com propósitos de estudos apenas, para a disciplina de Sistemas Distribuídos 2021/1 IFSULDEMINAS Poços de Caldas.
- O projeto conta com 3 microsserviços, sendo o microsserviço de Produtos um CRUD completo. Cada microsserviço sobe sua própria instância do banco de dados H2 e todos os três se comunicam via REST através do Eureka Server.

## 🚀 Começando

- O microsserviço Ticket funciona com um bilhete, podendo ser encontrado em um produto.
- O microsserviço Produto possui um bilhete, que pode estar ATIVO ou INATIVO.
- O microsserviço Cliente também possui um bilhete, podendo assim o Cliente ter tirado a sorte grande com seu bilhete premiado.

### 📋 Pré-requisitos

- JDK 11 ou superior devidamente instalada.
- Alguma IDE de desenvolvimento Java, recomendado IntelliJ.
- Postman e essa coleção de testes (https://www.getpostman.com/collections/af67577bd3dee035fff9).

### 🔧 Instalação

- Clone esse repositório na sua máquina
- Abra o IntelliJ e importe os 4 projetos em paralelo (quatro instâncias do IntelliJ)
- Suba cada uma das 4 pelo botão de play no IntelliJ. (suba o eureka-server primeiro)
- Já é possivel acessar a dashboard do Eureka pelo endereço: localhost:8762 e ver todos os microsserviços subindo
- Por fim abra o Postman, importe a coleção anexada nesse projeto e se divirta!

## 🛠️ Construído com

* [Java](http://www.dropwizard.io/1.0.2/docs/) - Linguagem de programação usada.
* [Maven](https://maven.apache.org/) - Gerenciador de dependências.
* [Spring Boot](https://spring.io/projects/spring-boot) - Projeto do Spring Framework utilizado para construir uma aplicação Web REST.
* [Spring Cloud](https://spring.io/projects/spring-cloud) - Projeto do Spring para comunicação dos microsserviços.
* [H2 Database](https://www.h2database.com/html/main.html) - Banco de dados local para aplicações Java.

## 📌 Versão

Nós usamos [GitHub](http://github.com) para controle de versão. Para as versões disponíveis, observe as [tags neste repositório](https://github.com/oamaraldev/springCloudMicroservices). 

## ✒️ Autores

* **Antonio Amaral** - *Desenvolvimento e documentação* - [oamaraldev](https://github.com/oamaraldev)
* **Mateus Nazaré** - *Desenvolvimento* - [MateusNazare](https://github.com/MateusNazare)

---
⌨️ com ❤️ por [Antonio Amaral](https://github.com/oamaraldev)
