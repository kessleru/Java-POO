# 📚 Java POO - Exemplos Práticos

Este repositório contém exemplos práticos dos principais conceitos de **Programação Orientada a Objetos (POO)** em Java, organizados em 4 exemplos progressivos.

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
└── Exemplo04/          # Relacionamento entre classes
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

## 🏗️ Os 4 Pilares da POO Demonstrados

### 1. 🔒 Encapsulamento
- **Todos os exemplos**: Uso de `private`, `protected`, `public`
- **Destaque**: Exemplo 02 mostra diferentes níveis de visibilidade

### 2. 🎭 Abstração  
- **Exemplo 01**: Métodos públicos ocultam complexidade interna
- **Exemplo 03**: Interface define apenas o que é necessário conhecer

### 3. 🔄 Herança
- **Aplicado implicitamente**: Todas as classes herdam de `Object`
- **Override**: Sobrescrita de `toString()` no Exemplo 01

### 4. 🎯 Polimorfismo
- **Exemplo 03**: Implementação de interface permite polimorfismo
- **Potencial**: Classes podem implementar `Controlador` de formas diferentes

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

---

## 📖 Conceitos Aprendidos

- ✅ Definição de classes e criação de objetos
- ✅ Atributos e métodos (públicos e privados)
- ✅ Construtores e inicialização
- ✅ Getters e Setters (encapsulamento)
- ✅ Interfaces e implementação
- ✅ Relacionamento entre classes
- ✅ Validações e regras de negócio
- ✅ Boas práticas de POO em Java

---

## 🎓 Nível de Complexidade

| Exemplo | Dificuldade | Conceitos Principais |
|---------|-------------|---------------------|
| 01 - Caneta | ⭐ Básico | Classes, objetos, métodos |
| 02 - Conta Banco | ⭐⭐ Intermediário | Visibilidade, validações |
| 03 - Controle Remoto | ⭐⭐⭐ Intermediário+ | Interface, polimorfismo |
| 04 - Sistema de Lutas | ⭐⭐⭐⭐ Avançado | Relacionamentos, agregação |

---

## 👨‍💻 Autor

Projeto desenvolvido para estudos de Programação Orientada a Objetos em Java.

---

**🎯 Objetivo:** Demonstrar na prática como os conceitos de POO se aplicam em cenários reais de programação!
