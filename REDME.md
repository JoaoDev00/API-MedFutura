# API MedFutura

Esta é uma API desenvolvida em Java 17. A API permite gerenciar informações de pessoas, incluindo cadastro, consulta e atualização de dados.

# Abaixo está o que exatamente fiz para chegar em tal resultado.
# Vale lembrar que eu usei o Insomnia para testar todas as requisições e aparentemente está tudo correto :)
# O que eu fiz foi usar os métodos GET, POST, PUT e DELETE para criar, ler, atualizar e deletar dados e com isso também usando comandos como @GetMapping, @PostMapping, @PutMapping e @DeleteMapping para criar as rotas para cada método. Abaixo tem uma explicação mais detalhada e uma pequena consideração final  

## Objetivo
O objetivo desta implementação foi criar uma API para o gerenciamento de pessoas, permitindo realizar operações de criação, leitura, atualização e exclusão (CRUD) com os dados das pessoas. As informações sobre cada pessoa incluem nome, apelido, email, telefone e tipo de pessoa (Física ou Jurídica).

### Tecnologias Utilizadas
- **Spring Boot**: Framework utilizado para construir a API.
- **JPA (Java Persistence API)**: Para interação com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para armazenamento temporário de dados.
- **Postman/Insomnia**: Ferramentas utilizadas para testar as requisições HTTP.

## Estrutura da API

A API foi estruturada de forma a expor os seguintes endpoints:

1. **POST /pessoas**: Criação de uma nova pessoa.
2. **GET /pessoas**: Listagem de todas as pessoas.
3. **GET /pessoas/{id}**: Consulta de uma pessoa pelo seu ID.
4. **PUT /pessoas/{id}**: Atualização de uma pessoa existente.
5. **DELETE /pessoas/{id}**: Exclusão de uma pessoa.

## Implementação

### 1. **Modelos de Dados**

#### **PessoaModel**
Este modelo representa a entidade `Pessoa` no banco de dados. A classe `PessoaModel` possui os seguintes atributos:
- `id`: Identificador único da pessoa.
- `nome`: Nome completo da pessoa.
- `apelido`: Apelido ou nome popular da pessoa.
- `email`: Email da pessoa.
- `telefone`: Telefone da pessoa.
- `tipoPessoa`: Tipo da pessoa (Física ou Jurídica).

```java
@Entity
public class PessoaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String apelido;
    private String email;
    private String telefone;
    private TipoPessoa tipoPessoa;
}
```

<!-- Muito obrigado pela oportunidade e pelo desafio. -->
