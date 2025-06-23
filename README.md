# Voll_Med_Estoque
# Voll Med Estoque 🏥📦

Sistema de controle de estoque, desenvolvido com **Java + Spring Boot**, seguindo boas práticas de segurança, arquitetura e versionamento de banco de dados. O projeto inclui autenticação via JWT, validação de dados e organização por camadas (Controller, Service, DTO, Repository).

---

## 🚀 Funcionalidades

- ✅ Cadastro, listagem, atualização e inativação de **produtos**
- ✅ Relacionamento com **fornecedores**
- ✅ Autenticação via **JWT**
- ✅ Senhas criptografadas com **BCrypt**
- ✅ Filtros de segurança com **Spring Security**
- ✅ Validação de campos com **Bean Validation**
- ✅ Versionamento de banco de dados com **Flyway**

---

## 🛠️ Tecnologias utilizadas

- **Java 17**
- **Spring Boot 3**
- **Spring Security**
- **Spring Data JPA**
- **Flyway**
- **MySQL**
- **JWT**
- **Maven**
- **Lombok**

---

## 🔐 Segurança

- Tokens JWT com expiração de 2 horas
- Senhas criptografadas com `BCryptPasswordEncoder`
- CSRF desabilitado por uso de token
- Dados sensíveis como a chave do token são lidos via **variáveis de ambiente**

---

## 🗃️ Modelagem

- Produto:
  - `id`, `descricao`, `validade`, `ativo`, `fornecedorId`
- Fornecedor:
  - `id`, `nome`, `cnpj`, `telefone`, `email`, `endereço`
- Usuário:
  - `id`, `login`, `senha` (criptografada), `ativo`

---

## ▶️ Como rodar o projeto

### Pré-requisitos:
- Java 17+
- Maven
- MySQL rodando localmente
- IntelliJ, VS Code ou Spring Tool Suite

 Clone o repositório:

```bash
git clone https://github.com/0246808642/Voll_Med_Estoque.git

