# ☁️ Nuvem – Sistemas Distribuídos

Este projeto é uma API desenvolvida com **Java + Spring Boot**, simulando um sistema de frete com arquitetura distribuída. Ele permite que **usuários se cadastrem, façam login e solicitem orçamentos de frete** entre cidades, armazenando os dados em um banco de dados relacional.

## 🎯 Funcionalidades

✅ Cadastro de usuário  
✅ Login com autenticação por senha  
✅ Solicitação de orçamento de frete entre cidades  
✅ Armazenamento de dados em banco de dados  
🔄 Integração com múltiplas APIs simulando serviços distribuídos  

> Em desenvolvimento: painel do usuário, histórico de orçamentos e autenticação com JWT

---

## 🧰 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot**
- **Spring Security** (para login/autenticação)
- **Spring Data JPA**
- **H2 / MySQL** (pode ser configurado)
- **Maven**
- **REST APIs**
- **Postman** (para testes de endpoints)
- **Git + GitHub**

---

## 📦 Estrutura do Projeto

```bash
📁 src
 └── 📁 main
     ├── 📁 java
     │    └── 📁 com.example
     │         ├── 📁 controllers     # Endpoints REST
     │         ├── 📁 services        # Lógica de negócio
     │         ├── 📁 models          # Entidades
     │         └── 📁 repositories    # Interfaces JPA
     └── 📁 resources
          └── 📄 application.properties
📄 pom.xml
