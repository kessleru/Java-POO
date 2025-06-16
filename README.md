# 📚 Java POO - Exemplos Práticos

Este repositório contém exemplos práticos dos principais conceitos de **Programação Orientada a Objetos (POO)** em Java, organizados em 7 exemplos progressivos.

## 🎯 Objetivos

- Demonstrar os 4 pilares da POO na prática
- Aplicar conceitos fundamentais como classes, objetos, atributos e métodos
- Mostrar a evolução da complexidade dos conceitos

---

## 📁 Estrutura do Projeto

```
src/
├── Exemplo01/          # Conceitos básicos de POO
├── Exemplo02/          # Encapsulamento e visibilidade
├── Exemplo03/          # Interface e polimorfismo  
├── Exemplo04/          # Relacionamento entre classes
├── Exemplo05/          # Herança e agregação
├── Exemplo06/          # Herança e polimorfismo
└── Exemplo07/          # Herança com classes abstratas
```

---

## 🔍 Exemplos e Princípios de POO

### 📝 Exemplo 01 - Caneta
**Arquivos:** `Caneta.java`, `Principal.java`

**Conceitos POO aplicados:**
- ✅ **Encapsulamento**: Atributos privados (`private`)
- ✅ **Abstração**: Métodos públicos que expõem funcionalidades
- ✅ **Classe e Objeto**: Definição da classe `Caneta` e criação de objetos
- ✅ **Construtor**: Inicialização de objetos com parâmetros
- ✅ **Getters e Setters**: Controle de acesso aos atributos
- ✅ **Override**: Sobrescrita do método `toString()`

**Funcionalidades:**
- Modelo de caneta com cor, ponta e estado (tampada/destampada)
- Métodos para tampar, destampar e escrever
- Controle de estado da caneta

---

### 🏦 Exemplo 02 - Conta Banco
**Arquivos:** `ContaBanco.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Encapsulamento**: Diferentes níveis de visibilidade
  - `public`: numConta
  - `protected`: tipo
  - `private`: titular, saldo, status
- ✅ **Abstração**: Interface simplificada para operações bancárias
- ✅ **Métodos**: Operações como sacar, depositar, abrir/fechar conta
- ✅ **Validação**: Regras de negócio nos métodos

**Funcionalidades:**
- Conta Corrente (CC) e Conta Poupança (CP)
- Operações de saque, depósito e pagamento de mensalidade
- Controle de status da conta
- Validações de saldo e estado

---

### 📺 Exemplo 03 - Controle Remoto
**Arquivos:** `Controlador.java`, `ControleRemoto.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Interface**: `Controlador` define contratos de métodos
- ✅ **Polimorfismo**: Implementação da interface `Controlador`
- ✅ **Encapsulamento**: Atributos privados e métodos de acesso
- ✅ **Abstração**: Interface simplifica o uso do controle
- ✅ **Implementação**: `ControleRemoto implements Controlador`

**Funcionalidades:**
- Controle de TV com volume, liga/desliga, menu
- Funcionalidades de mudo, play e pause
- Interface bem definida para controles

---

### 🥊 Exemplo 04 - Sistema de Lutas
**Arquivos:** `Lutador.java`, `Luta.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Relacionamento entre Classes**: `Luta` utiliza objetos `Lutador`
- ✅ **Encapsulamento**: Atributos privados em ambas as classes
- ✅ **Agregação**: `Luta` contém referências para `Lutador`
- ✅ **Métodos de Negócio**: Validações e regras complexas
- ✅ **Estado de Objeto**: Controle de categorias e estatísticas

**Funcionalidades:**
- Cadastro de lutadores com categorias por peso
- Sistema de lutas com validações
- Estatísticas de vitórias, derrotas e empates
- Geração aleatória de resultados

---

### 📖 Exemplo 05 - Sistema de Livros
**Arquivos:** `Pessoa.java`, `Publicação.java`, `Livro.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Agregação**: `Livro` contém uma referência para `Pessoa` (leitor)
- ✅ **Interface**: `Publicação` define contratos para publicações
- ✅ **Implementação**: `Livro implements Publicação`
- ✅ **Encapsulamento**: Atributos privados em todas as classes
- ✅ **Composição**: Relacionamento entre objetos
- ✅ **Polimorfismo**: Interface permite diferentes tipos de publicações

**Funcionalidades:**
- Cadastro de pessoas leitoras
- Sistema de livros com controle de páginas
- Operações de abrir, fechar, folhear livros
- Navegação entre páginas (avançar/voltar)
- Detalhamento completo de livros e leitores

---

### 👥 Exemplo 06 - Sistema de Pessoas (Herança)
**Arquivos:** `Pessoa.java`, `Aluno.java`, `Professor.java`, `Funcionario.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Herança**: Classes `Aluno`, `Professor` e `Funcionario` herdam de `Pessoa`
- ✅ **Superclasse**: `Pessoa` como classe base com atributos e métodos comuns
- ✅ **Especialização**: Cada subclasse adiciona atributos e métodos específicos
- ✅ **Encapsulamento**: Atributos privados e métodos de acesso
- ✅ **Reutilização de Código**: Aproveitamento da classe base
- ✅ **Override**: Possibilidade de sobrescrita em subclasses

**Funcionalidades:**
- Cadastro de pessoas com informações básicas
- Especialização para alunos com matrícula e curso
- Professores com especialidade e salário
- Funcionários com setor e status de trabalho
- Demonstração prática da hierarquia de classes

---

### 🎓 Exemplo 07 - Sistema Acadêmico (Classes Abstratas)
**Arquivos:** `Pessoa.java`, `Aluno.java`, `Bolsista.java`, `Visitante.java`, `Main.java`

**Conceitos POO aplicados:**
- ✅ **Classe Abstrata**: `Pessoa` como classe abstrata (não pode ser instanciada)
- ✅ **Herança Multinível**: `Bolsista` herda de `Aluno` que herda de `Pessoa`
- ✅ **Classe Final**: `Bolsista` como classe final (não pode ser herdada)
- ✅ **Override Obrigatório**: Métodos abstratos devem ser implementados
- ✅ **Polimorfismo**: Diferentes implementações de métodos abstratos
- ✅ **Modificadores**: `protected`, `abstract`, `final`

**Funcionalidades:**
- Sistema acadêmico com diferentes tipos de pessoas
- Alunos com pagamento de mensalidade
- Bolsistas com tratamento especial para pagamentos
- Visitantes com acesso limitado
- Demonstração de hierarquia complexa e classes abstratas

---

## 🏗️ Os 4 Pilares da POO Demonstrados

### 1. 🔒 Encapsulamento
- **Todos os exemplos**: Uso de `private`, `protected`, `public`
- **Destaque**: Exemplo 02 mostra diferentes níveis de visibilidade

### 2. 🎭 Abstração  
- **Exemplo 01**: Métodos públicos ocultam complexidade interna
- **Exemplo 03**: Interface define apenas o que é necessário conhecer

### 3. 🔄 Herança
- **Exemplo 01**: Override de `toString()` (herança implícita de `Object`)
- **Exemplo 06**: Herança simples com `Aluno`, `Professor` e `Funcionario` herdando de `Pessoa`
- **Exemplo 07**: Herança multinível e classes abstratas (`Bolsista` > `Aluno` > `Pessoa`)

### 4. 🎯 Polimorfismo
- **Exemplo 03**: Implementação de interface permite polimorfismo
- **Exemplo 05**: Interface `Publicação` permite polimorfismo com diferentes tipos
- **Potencial**: Classes podem implementar interfaces de formas diferentes

---

## 🚀 Como Executar

### Pré-requisitos
- Java JDK 8 ou superior
- IDE Java (IntelliJ IDEA, Eclipse, VS Code, etc.)

### Executando os exemplos
1. Clone o repositório
2. Abra o projeto na sua IDE
3. Execute a classe `Main` ou `Principal` de cada exemplo:
   - `Exemplo01.Principal`
   - `Exemplo02.Main`  
   - `Exemplo03.Main`
   - `Exemplo04.Main`
   - `Exemplo05.Main`
   - `Exemplo06.Main`
   - `Exemplo07.Main`

---

## 📖 Conceitos Aprendidos

- ✅ Definição de classes e criação de objetos
- ✅ Atributos e métodos (públicos e privados)
- ✅ Construtores e inicialização
- ✅ Getters e Setters (encapsulamento)
- ✅ Interfaces e implementação
- ✅ Relacionamento entre classes (agregação e composição)
- ✅ **Herança simples e multinível**
- ✅ **Classes abstratas e métodos abstratos**
- ✅ **Classes finais (final)**
- ✅ **Modificadores de acesso (protected)**
- ✅ Validações e regras de negócio
- ✅ Polimorfismo através de interfaces e herança
- ✅ Override de métodos
- ✅ Boas práticas de POO em Java

---

## 🎓 Nível de Complexidade

| Exemplo | Dificuldade | Conceitos Principais |
|---------|-------------|---------------------|
| 01 - Caneta | ⭐ Básico | Classes, objetos, métodos |
| 02 - Conta Banco | ⭐⭐ Intermediário | Visibilidade, validações |
| 03 - Controle Remoto | ⭐⭐⭐ Intermediário | Interface, polimorfismo |
| 04 - Sistema de Lutas | ⭐⭐⭐ Intermediário+ | Relacionamentos, agregação |
| 05 - Sistema de Livros | ⭐⭐⭐ Intermediário+ | Agregação, composição, interfaces |
| 06 - Sistema de Pessoas | ⭐⭐⭐⭐ Avançado | Herança, especialização |
| 07 - Sistema Acadêmico | ⭐⭐⭐⭐ Avançado | Classes abstratas, herança multinível |

---

## 👨‍💻 Autor

Projeto desenvolvido para estudos de Programação Orientada a Objetos em Java.

---

**🎯 Objetivo:** Demonstrar na prática como os conceitos de POO se aplicam em cenários reais de programação!
