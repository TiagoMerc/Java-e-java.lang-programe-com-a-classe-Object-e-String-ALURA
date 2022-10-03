## Java e java.lang: programe com a classe Object e String

**Faça esse curso de Java e:**

- Use imports e organize o seu código através de packages

- Saiba o significado de todos os modificadores de visibilidade tratamento de exceções

- Documente e distribuia a sua biblioteca

- Conheça o java.lang

- Entenda a imutabilidade e a classe String

- Aprenda para que existe a classe java.lang.Object

Instrutor: 
[Nico Steppat](https://github.com/steppat)

### 01. Organizando as classes com Pacotes

**O que aprendemos?**

- packages servem para organizar o nosso código

- packages fazem parte do FQN (Full Qualified Name) da classe

- o nome completo da classe (FQN) é composto de: **PACKAGE.NOME_SIMPLES_CLASSE**

- a definição do package deve ser a primeira declaração no código fonte

- para facilitar o uso de classes de outros packages podemos importá-los

- os imports ficam logo após da declaração do **package**

- a nomenclatura padrão é usar o nome do domínio na web ao contrário junto com o nome do projeto, por exemplo:

**br.com.caelum.geradornotas**

**br.com.alura.gnarus**

**br.gov.rj.notas**

**de.adidas.lager**

Uma vez organizado as nossas classes podemos revisar o modificadores de visibilidades que dependem dos pacotes. 

![Organizando as classes com Pacotes](./imgs/prints/OrganizandoClassesComPacotes.png)

### 02. Todos os modificadores de acesso

**Nessa aula falamos novamente sobre visibilidade e aprendemos:**

- existem 3 palavras chaves relacionado com a visibilidade: **private**, **protected**, **public**

- existem 4 níveis de visibilidade (de menor para maior):
 - private (visível apenas na classe)

 - **<<package private>>** (visível na classe E em qualquer outro membro do mesmo pacote, podendo ser chamado de default)

- **protected** (visível na classe E em qualquer outro membro do mesmo pacote E para qualquer filho)

- **public** (visível em qualquer pacote)

- os modificadores podem ser usados na definição da classe, atributo, construtor e método

![ModificadoresDeAcesso](./imgs/prints/ModificadoresDeAcesso.png)

### 03. Distribuição do seu código