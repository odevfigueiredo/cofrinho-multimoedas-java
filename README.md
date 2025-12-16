# cofrinho-multimoedas-java
Aplicação em Java (console) que simula um cofrinho multi-moedas, permitindo adicionar, remover, listar moedas e calcular o total convertido para Real (BRL) utilizando conceitos fundamentais de Programação Orientada a Objetos (POO).

## 📌 Descrição do Projeto

Este projeto foi desenvolvido com foco didático para demonstrar, na prática, os pilares da POO em Java:

* Abstração
* Herança
* Polimorfismo
* Encapsulamento

A aplicação permite ao usuário interagir via terminal com um menu intuitivo, gerenciando moedas de diferentes tipos e realizando a conversão automática para BRL.

---

## 🛠️ Tecnologias Utilizadas

* Java (JDK 21)
* Programação Orientada a Objetos
* Scanner (entrada via console)
* Collections (`ArrayList`)

---

## 🧠 Conceitos Aplicados

* Classe abstrata (`Moeda`)
* Herança (`Real`, `Dolar`, `Euro`)
* Polimorfismo (métodos `info()` e `converter()`)
* Encapsulamento de dados
* Uso de `switch` moderno
* Remoção de objetos por critério lógico

---

## 📂 Estrutura do Projeto

```
/src
 └── banco
     ├── Cofrinho.java
     ├── Moeda.java
     ├── Real.java
     ├── Dolar.java
     ├── Euro.java
     └── Principal.java
```

---

## ▶️ Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/odevfigueiredo/cofrinho-multimoedas-java.git
```

2. Compile os arquivos:

```bash
javac banco/*.java
```

3. Execute o programa:

```bash
java banco.Principal
```

---

## 📋 Funcionalidades

* Adicionar moedas (BRL, USD, EUR)
* Remover moedas por tipo e valor
* Listar todas as moedas armazenadas
* Calcular o total convertido para Real (BRL)
* Menu interativo via console

---

## 💱 Taxas de Conversão Utilizadas

> Valores fixos definidos no código para fins educacionais:

* USD → BRL: **5.31**
* EUR → BRL: **6.18**

---

## 🎯 Objetivo Educacional

Projeto voltado para:

* Prática de POO em Java
* Estruturação de aplicações de console
* Organização de código em pacotes
* Clareza, legibilidade e boas práticas iniciais

---

## 📄 Licença

Projeto de uso livre para fins educacionais e de estudo.

---

> Desenvolvido para aprendizado contínuo e consolidação dos fundamentos de Java.
