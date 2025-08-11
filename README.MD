<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=00494c&height=120&section=header"/>

# Projeto: Consulta CNPJ

## Descrição

Este projeto é uma aplicação Java simples desenvolvida para consultar dados de empresas utilizando o CNPJ e, posteriormente, obter informações de endereço a partir do CEP retornado pela consulta inicial. Ele demonstra a integração com APIs externas para recuperação de dados.

## Funcionalidades

- Consulta de dados de empresas por CNPJ.
- Extração do CEP da resposta da consulta CNPJ.
- Consulta de dados de endereço utilizando o CEP.
- Exibição dos dados da empresa e do endereço no console.

## Tecnologias Utilizadas

- **Java**: Linguagem de programação principal.
- **Maven**: Ferramenta de automação de build e gerenciamento de dependências.
- **Bibliotecas Java**: `json-simple`, `org.json`, `jackson-databind` para manipulação de JSON.

## Estrutura do Projeto

O projeto segue uma estrutura Maven padrão:

```
consultaCNPJ/
├── api/
│   ├── pom.xml
│   └── src/
│       ├── main/
│       │   ├── java/
│       │   │   └── org/
│       │   │       └── aplicacao/
│       │   │           ├── Main.java
│       │   │           ├── dto/
│       │   │           │   ├── AndressDTO.java
│       │   │           │   └── EnterpriseDTO.java
│       │   │           └── servico/
│       │   │               ├── ApiServiceAndress.java
│       │   │               └── ApiServiceEnterprise.java
│       │   └── resources/
│       └── test/
└── README.md
```

- `Main.java`: Ponto de entrada da aplicação, orquestra as chamadas às APIs.
- `dto/`: Contém as classes de Data Transfer Object (DTO) para mapear as respostas das APIs (`AndressDTO.java` e `EnterpriseDTO.java`).
- `servico/`: Contém as classes de serviço responsáveis por interagir com as APIs externas (`ApiServiceAndress.java` e `ApiServiceEnterprise.java`).
- `pom.xml`: Arquivo de configuração do Maven, listando as dependências do projeto.

## Como Executar

Para executar este projeto, você precisará ter o Java Development Kit (JDK) versão 24 ou superior e o Maven instalados em sua máquina.

1.  **Clone o repositório (se aplicável) ou descompacte o projeto:**
    ```bash
    # Exemplo de clone
    git clone <URL_DO_REPOSITORIO>
    cd consultaCNPJ/api
    ```

2.  **Compile o projeto usando Maven:**
    Navegue até o diretório `api` (onde o arquivo `pom.xml` está localizado) e execute:
    ```bash
    mvn clean install
    ```

3.  **Execute a aplicação:**
    Após a compilação, você pode executar a aplicação a partir do diretório `api`:
    ```bash
    mvn exec:java -Dexec.mainClass="org.aplicacao.Main"
    ```
    Ou, se preferir executar o JAR gerado (encontrado em `target/`):
    ```bash
    java -jar target/api-1.0-SNAPSHOT.jar
    ```

## Exemplo de Uso

Ao executar a aplicação, ela fará uma consulta para o CNPJ `02.828.446/0001-34` (LITORAL LOCADORA) e exibirá os dados da empresa e do endereço no console, conforme o exemplo fornecido:

```
--- Dados da Empresa ---
CNPJ: 02.828.446/0001-34
Nome: 0001A LITORAL LOCADORA LTDA
Fantasia: LITORAL LOCADORA
Situação: BAIXADA (Extinção Por Encerramento Liquidação Voluntária)
Data da Situação: 08/04/2014
Tipo: MATRIZ
Porte: MICRO EMPRESA
Natureza Jurídica: 206-2 - Sociedade Empresária Limitada
Abertura: 21/07/1998
Última Atualização: 2025-08-07T17:53:29.976Z
Capital Social: 0.00
E-mail: litoralrentacar@ig.com.br
Telefone: (71) 3240-6044/ (71) 3243-4775
Endereço: RUA OSWALDO CRUZ, 211 - LOJA TERREO
Bairro: RIO VERMELHO
Município: SALVADOR/BA
CEP: 41.940-000
Atividade Principal: [org.aplicacao.dto.EnterpriseDTO$Atividade@762ef0ea]
Atividades Secundárias: [org.aplicacao.dto.EnterpriseDTO$Atividade@31f9b85e]
QSA: [org.aplicacao.dto.EnterpriseDTO$Qsa@424e1977, org.aplicacao.dto.EnterpriseDTO$Qsa@10d68fcd]
Simples: false
Simei: false
Billing: Free=true, Database=true
-------------------------

--- Dados do Endereço ---
CEP: 41940-000
Logradouro: Rua Oswaldo Cruz
Número: 
Complemento: 
Bairro: Rio Vermelho
Cidade: Salvador/BA
Estado: Bahia
Região: Nordeste
IBGE: 2927408
GIA: 
DDD: 71
SIAFI: 3849
-------------------------
```

## APIs Utilizadas

O projeto interage com as seguintes APIs (presumindo endpoints públicos ou mockados, pois não há configuração de URL explícita no código fornecido):

- **API de Consulta CNPJ**: Utilizada para obter dados de empresas. (Ex: `ApiServiceEnterprise`)
- **API de Consulta de Endereço (CEP)**: Utilizada para obter dados de endereço. (Ex: `ApiServiceAndress`)

**Nota**: As URLs das APIs não estão configuradas no código-fonte fornecido, o que sugere que elas podem ser injetadas antes do tempo de execução ou que o projeto é parte de um sistema maior onde essas configurações são gerenciadas. Para um ambiente de produção, é crucial configurar corretamente os endpoints das APIs.


<img width=100% src="https://capsule-render.vercel.app/api?type=waving&color=00494c&height=120&section=footer"/>

