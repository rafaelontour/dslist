# Backend Java com Spring

## Sobre o projeto

Este projeto é um backend que disponibiliza uma api para buscar uma lista de jogos previamente cadastrada, também busca por jogos individuais. Cada jogo tem uma descrição, plataforma, título, gênero e etc. Há uma funcionalidade de movimentar jogos na lista para mudar suas posições de ordem de exibição na tela, mas para fazer isso de forma mais amigável precisaria dessa função no front end, que ainda não foi feito.

## Tecnologias usadas

- Java 21
- Spring boot
- JPA (Java Persistence API) / Hibernate (Framework para ORM)
- Maven
- Banco de dados PostgreSQL
- Docker

> [!TIP]
> Na pasta resource tem arquivos aplication.properties com nomes diferentes, indicando perfis de teste __(application-test.properties)__, desenvolvimento __(application-dev.properties)__ e de produção __(application-prod.properties)__. Cada arquivo correspondente contém configurações para rodar o backend pra teste, desenvolvimento e produção e para isso basta ir no __application.properties__ e alterar "__spring.profiles.active=${APP_PROFILE:perfil}__" colando o nome do perfil depois dois dois pontos. Ex: ...APP_PROFILE:test ou ...APP_PROFILE:dev

## Modelo

![image](https://github.com/user-attachments/assets/6fe273c6-c749-45df-8b39-29170c756cef)
