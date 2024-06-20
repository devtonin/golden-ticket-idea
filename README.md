# 🏆 Golden Ticket Idea App 🏆

- Esse projeto foi desenvolvido com propósitos educacionais apenas, para a disciplina de Sistemas Distribuídos 2021/2 do curso de Engenharia de Computação do Instituto Federal do Sul de Minas Gerais.
- O projeto conta com 3 microsserviços. Cada microsserviço sobe sua própria instância do H2 e todos os três se comunicam via APIs REST, gerenciadas pelo Eureka Server.

## 🚀 Como funciona

- O microsserviço Ticket funciona com um bilhete, podendo ser encontrado em todos os produtos. O que define se o bilhete é premiado ou não é seu status ("ATIVO" ou "INATIVO").
- O microsserviço Produto possui um bilhete, e os dois possuem o atributo 'produtoId' em comum.
- Por fim, o microsserviço Cliente também possui um bilhete com o atributo 'ticketId' em comum, podendo assim o Cliente ter tirado um bilhete premiado.

### 📋 Pré-requisitos

- JDK 11 ou superior
- Alguma IDE de desenvolvimento Java
- Postman com essa coleção feita para testes: https://www.getpostman.com/collections/af67577bd3dee035fff9

### 🔧 Instalação

- Rode cada um dos 4 projetos em paralelo (subir o eureka-server primeiro)
- Acessar a dashboard do Eureka pelo endereço 'localhost:8762' e visualizar os microsserviços
- Por fim abrir o Postman, File -> Import, selecionar a aba Link e colar o link disponibilizado acima
- O ms de ticket vai subir na porta 6060, o de produto na 6161 e o de cliente na 6262. Logo, para acessar o banco de dados de cada um, acessar a url 'localhost:6x6x/h2-console'
- No campo de url preencher com 'jdbc:h2:file:./data/xxx-ms' substituindo o nome do ms (se atente ao nome ser o mesmo da porta acessada)
- No campo usuário preencher 'amaral' e a senha deixar em branco
- Pode ser necessário inserir as tuplas em cada banco, e para isso, acesse a pasta 'properties' de cada ms, encontrando um arquivo 'data.sql'. Copiar esse código, colar no h2 e rodar, inserindo assim os dados no banco

## 🛠️ Construído com

* [Java 11](https://dev.java/)
* [Maven](https://maven.apache.org/)
* [Spring Boot](https://spring.io/projects/spring-boot)
* [Spring Cloud](https://spring.io/projects/spring-cloud)
* [H2 Database](https://www.h2database.com/html/main.html)

## ✒️ Autores

* **Antonio Amaral** - *Desenvolvimento e Documentação* - [devtonin](https://github.com/devtonin)
* **Mateus Nazaré** - *Desenvolvimento* - [MateusNazare](https://github.com/MateusNazare)

---
⌨️ com ❤️ por [devtonin](https://github.com/devtonin)
