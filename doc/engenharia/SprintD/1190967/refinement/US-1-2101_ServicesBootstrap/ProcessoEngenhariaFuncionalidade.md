# [US-1-2101] Services Bootstrap
=======================================


# 1. Requisitos

**[US-1-2101]** Como Gestor de Projeto, eu pretendo que, para efeitos de 
demonstração, o sistema contemple a possibilidade de ser inicializado (bootstrap) 
com alguma informação relativa aos catálogos de serviços e serviços.

- [US-1-2101] Services Bootstrap

A interpretação feita deste requisito foi no sentido de melhorar a apresentação
da aplicação, sendo introduzido previamente valores referentes aos catálogos e aos serviços.

### Formato Completo

#### Ator principal

* Gestor de Projeto

#### Partes interessadas e seus interesses

* **Gestor de Projeto:** pretende o sistema seja inicializado com informação

#### Pré-condições

\-

#### Pós-condições

* A informação referente aos catálogos e aos serviços é registada na base e dados.

#### Requisitos especiais

\-

#### Lista de Variações de Tecnologias e Dados

\-

#### Frequência de Ocorrência

\-

#### Questões em aberto

\-

# 2. Design

## 2.1. Realização da Funcionalidade

###	Sequence Diagram

#### Catalogue Specification

![US-1-2101_SD_Catalogue](US-1-2101_SD_Catalogue.svg)

#### Draft Add Field

![US-1-2101_SD_DraftField](US-1-2101_SD_DraftField.svg)

#### Draft Add Form

![US-1-2101_SD_DraftForm](US-1-2101_SD_DraftForm.svg)

#### Save Draft

![US-1-2101_SD_SaveDraft](US-1-2101_SD_SaveDraft.svg)

## 2.2. Padrões Aplicados

* DDD (Domain-Driven Design)

# 3. Implementação

## 3.1. Provas de Implementação

![1](imgs/1190967_Implementation_1.PNG) 


## 3.2. Commits Mais Relevantes

* Analysis: 94ecae0
* Design: 682a331
* Implementation: 98c6ac9
* Review: a46566c


# 4. Integração/Demonstração

* Foram realizados esforços constantes para que todas as implementações sejam integradas da forma mais coerente, levando a que programa se apresente coeso. 
Isto foi possível através de imenso planeamento da equipa, reuniões e comunicação constantes.

# 5. Observações

## 5.1. Melhoramentos Futuros

* Adicionar Mais Informação



