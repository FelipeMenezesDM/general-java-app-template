# General Laravel App Template

## Informações gerais
### Descrição
{{ Informar a descrição detalhada da aplicação, resumindo seu propósito e suas principais características }}

### Escopo
{{ Informar o objetivo da aplicação, o que ela é e não é capaz de fazer, quais são seus principais recursos, sua abrangêcia e suas limitações }}

### Alvo
{{ Informar o tipo de público que é e não é target para consumo da aplicação }}

### Acesso
{{ Informar instruções para solicitações de acesso à aplicação por consumidores internos ou externos }}

### Características
{{ Informar lista não numerada das principais características desta aplicação, que esclareça o motivo que tornem interessante o seu consumo }}

## Contrato
### Composição

| Ambiente | URL                                               |
|:---------|:--------------------------------------------------|
| DEV      | {{ Informar url do ambiente de desenvolvimento }} |
| HOM      | {{ Informar url do ambiente de homologação }}     |
| PROD     | {{ informar url do ambiente de produção }}        |

### $\textcolor{violet}{\textsf{• POST}}$/end-points/{id}
{{ Informar breve descrição do endpoint e suas entradas e saídas correspondentes, removendo os que não são necessários }}

#### Entradas
<details>
<summary>Header</summary>

| Nome           | Descrição       |    Tipo    |  Obrigatório  | Exemplo       |
|:---------------|:----------------|:----------:|:-------------:|:--------------|
| **{{ NOME }}** | {{ DESCRIÇÃO }} | {{ TIPO }} | {{ SIM/NÃO }} | {{ EXEMPLO }} |

</details>
<details>
<summary>Path</summary>

| Nome           | Descrição       |    Tipo    |  Obrigatório  | Exemplo       |
|:---------------|:----------------|:----------:|:-------------:|:--------------|
| **{{ NOME }}** | {{ DESCRIÇÃO }} | {{ TIPO }} | {{ SIM/NÃO }} | {{ EXEMPLO }} |

</details>
<details>
<summary>Query</summary>

| Nome           | Descrição       |    Tipo    |  Obrigatório  | Exemplo       |
|:---------------|:----------------|:----------:|:-------------:|:--------------|
| **{{ NOME }}** | {{ DESCRIÇÃO }} | {{ TIPO }} | {{ SIM/NÃO }} | {{ EXEMPLO }} |

</details>
<details>
<summary>Body</summary>

| Nome           | Descrição       |    Tipo    |  Obrigatório  | Exemplo       |
|:---------------|:----------------|:----------:|:-------------:|:--------------|
| **{{ NOME }}** | {{ DESCRIÇÃO }} | {{ TIPO }} | {{ SIM/NÃO }} | {{ EXEMPLO }} |

</details>

#### Saídas
<details>
<summary>200 OK</summary>

```json
{
    "description": "Descrição do registro"
}
```
</details>
<details>
<summary>200 NO CONTENT</summary>

```
EMPTY
```
</details>

### $\textcolor{blue}{\textsf{• GET}}$/end-points/{id}
### $\textcolor{violet}{\textsf{• POST}}$/end-points/{id}
### $\textcolor{orange}{\textsf{• PUT}}$/end-points/{id}
### $\textcolor{gold}{\textsf{• PATCH}}$/end-points/{id}
### $\textcolor{orangered}{\textsf{• DELETE}}$/end-points/{id}
### $\textcolor{cyan}{\textsf{• HEAD}}$/end-points/{id}
### $\textcolor{lightcoral}{\textsf{• OPTIONS}}$/end-points/{id}

## Integrações
{{ Informar lista não numerada de todos os serviços externos ou internos utilizados pela aplicação }}

## Links úteis
- [Instalação](../README.md)
- [Testes integrados](../tests/README.md)
- [Cadastro de massas](.)
- [Collections do Insomnia](.)
- [Collections do Postman](.)
