# 📚 Java POO - Curso Gustavo Guanabara

Este repositório contém exemplos práticos dos principais conceitos de **Programação Orientada a Objetos (POO)** em Java, baseados no excelente **Curso de POO Java** do **Professor Gustavo Guanabara** do canal **Curso em Vídeo**.

## 🎓 Sobre o Curso

O **Curso de Programação Orientada a Objetos em Java** do Gustavo Guanabara é uma das melhores referências gratuitas para aprender POO em português. Com uma didática excepcional, o professor explica desde os conceitos mais básicos até os mais avançados de forma clara e prática.

### 📺 Canal Curso em Vídeo
- **Professor:** Gustavo Guanabara
- **Canal:** [Curso em Vídeo](https://www.youtube.com/cursoemvideo)
- **Curso:** Programação Orientada a Objetos (POO) em Java
- **Playlist:** [POO Java - Curso em Vídeo](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)

## 🎯 Objetivos do Repositório

- Implementar na prática todos os exemplos apresentados no curso do Guanabara
- Demonstrar os 4 pilares da POO através de casos reais
- Aplicar conceitos fundamentais como classes, objetos, atributos e métodos
- Mostrar a evolução da complexidade dos conceitos ao longo das aulas
- Servir como material de consulta e estudo complementar ao curso

---

## 📁 Estrutura do Projeto

Os exemplos estão organizados na pasta `Guanabara/`, seguindo a ordem das aulas do curso:

```
src/
└── Guanabara/
    ├── Exemplo01/          # Aula 04-05: Conceitos básicos de POO
    ├── Exemplo02/          # Aula 06-07: Encapsulamento e visibilidade  
    ├── Exemplo03/          # Aula 08-09: Interface e polimorfismo
    ├── Exemplo04/          # Aula 10-11: Relacionamento entre classes
    ├── Exemplo05/          # Aula 12-13: Herança e agregação
    ├── Exemplo06/          # Aula 14-15: Herança e polimorfismo
    └── Exemplo07/          # Aula 16-17: Herança com classes abstratas
```

Cada exemplo corresponde a uma ou mais aulas do curso, implementando os conceitos apresentados pelo professor Guanabara de forma progressiva e didática.

---

## 🔍 Exemplos do Curso Guanabara

### 📝 Exemplo 01 - Caneta (Aulas 04-05)
**Arquivos:** `Caneta.java`, `Principal.java`  
**Aulas correspondentes:** "Configurando o Ambiente" e "Criando Classes e Objetos"

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

### 🏦 Exemplo 02 - Conta Banco (Aulas 06-07)
**Arquivos:** `ContaBanco.java`, `Main.java`  
**Aulas correspondentes:** "Pilares da POO" e "Encapsulamento"

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

### 📺 Exemplo 03 - Controle Remoto (Aulas 08-09)
**Arquivos:** `Controlador.java`, `ControleRemoto.java`, `Main.java`  
**Aulas correspondentes:** "Relacionamento entre Classes" e "Exercício Prático"

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

### 🥊 Exemplo 04 - Sistema de Lutas (Aulas 10-11)
**Arquivos:** `Lutador.java`, `Luta.java`, `Main.java`  
**Aulas correspondentes:** "Herança Parte 1" e "Herança Parte 2"

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

### 📖 Exemplo 05 - Sistema de Livros (Aulas 12-13)
**Arquivos:** `Pessoa.java`, `Publicação.java`, `Livro.java`, `Main.java`  
**Aulas correspondentes:** "Polimorfismo Parte 1" e "Polimorfismo Parte 2"

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

### 👥 Exemplo 06 - Sistema de Pessoas (Aulas 14-15)
**Arquivos:** `Pessoa.java`, `Aluno.java`, `Professor.java`, `Funcionario.java`, `Main.java`  
**Aulas correspondentes:** "Classes Abstratas" e "Exercício de Herança"

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

### 🎓 Exemplo 07 - Sistema Acadêmico (Aulas 16-17)
**Arquivos:** `Pessoa.java`, `Aluno.java`, `Bolsista.java`, `Visitante.java`, `Main.java`  
**Aulas correspondentes:** "Projeto Final Parte 1" e "Projeto Final Parte 2"

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

## 👨‍💻 Sobre o Curso e o Autor

### 🎓 Professor Gustavo Guanabara
O Professor Gustavo Guanabara é referência no ensino de programação em português. Com mais de 20 anos de experiência em educação e tecnologia, criou o **Curso em Vídeo**, uma das maiores plataformas de ensino gratuito do Brasil.

### 📚 Curso de POO Java
- **Duração:** 17 aulas completas
- **Metodologia:** Teoria + Prática com exemplos reais
- **Público:** Iniciantes em POO com conhecimento básico de Java
- **Certificação:** Disponível no site Curso em Vídeo

### 📋 Cronograma do Curso
| Aula | Tópico | Exemplo Relacionado |
|------|--------|-------------------|
| 01 | O que é Programação Orientada a Objetos | - |
| 02 | O que são Classes e Objetos | - |
| 03 | Configurando o Ambiente (NetBeans) | - |
| 04-05 | Criando Classes e Objetos | 📝 Exemplo 01 - Caneta |
| 06-07 | Pilares da POO e Encapsulamento | 🏦 Exemplo 02 - Conta Banco |
| 08-09 | Relacionamento entre Classes | 📺 Exemplo 03 - Controle Remoto |
| 10-11 | Herança Parte 1 e 2 | 🥊 Exemplo 04 - Sistema de Lutas |
| 12-13 | Polimorfismo Parte 1 e 2 | 📖 Exemplo 05 - Sistema de Livros |
| 14-15 | Classes Abstratas | 👥 Exemplo 06 - Sistema de Pessoas |
| 16-17 | Projeto Final Parte 1 e 2 | 🎓 Exemplo 07 - Sistema Acadêmico |

### 🔗 Links Úteis
- **Canal no YouTube:** [Curso em Vídeo](https://www.youtube.com/cursoemvideo)
- **Site Oficial:** [cursoemvideo.com](https://www.cursoemvideo.com)
- **Playlist POO Java:** [Assista ao curso completo](https://www.youtube.com/playlist?list=PLHz_AreHm4dkqe2aR0tQK74m8SFe-aGsY)

---

## 👨‍💻 Implementação

Projeto desenvolvido como estudo prático dos conceitos apresentados no **Curso de POO Java do Gustavo Guanabara**. Todos os exemplos foram implementados seguindo fielmente as explicações e exercícios propostos nas aulas.

**Repositório criado para fins educacionais - baseado no excelente trabalho do Professor Gustavo Guanabara.**

---

**🎯 Objetivo:** Implementar na prática todos os conceitos de POO apresentados no excepcional curso do Professor Gustavo Guanabara, demonstrando como os fundamentos da Programação Orientada a Objetos se aplicam em cenários reais de programação!
