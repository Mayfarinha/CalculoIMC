# 💼 Sistema de Folha de Pagamento

Sistema desenvolvido em Java para gerenciar e calcular a folha de pagamento de diferentes tipos de funcionários.

## 📋 Descrição

O sistema permite cadastrar três tipos de colaboradores e gerar automaticamente a folha de pagamento com os respectivos salários calculados de acordo com cada categoria.

## 👥 Tipos de Funcionários

| Tipo | Descrição |
|------|-----------|
| **Funcionário Padrão** | Recebe apenas o salário base fixo |
| **Funcionário Comissionado** | Recebe salário base + comissão sobre vendas |
| **Funcionário de Produção** | Recebe salário base + bônus por peças produzidas |

## 🗂️ Estrutura do Projeto

```
FolhaPagamento/
├── Colaborador.java               # Classe base (salário base: R$ 2000,00)
├── FuncionarioPadrao.java         # Funcionário com salário fixo
├── FuncionarioComissionado.java   # Funcionário com comissão por vendas
├── FuncionarioProducao.java       # Funcionário com bônus por produção
└── Main.java                      # Menu principal e execução do sistema
```

## ▶️ Como Executar

**Pré-requisito:** ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.

```bash
# Compilar
javac *.java

# Executar
java Main
```

## 🖥️ Funcionalidades

- Cadastrar funcionário padrão
- Cadastrar funcionário comissionado
- Cadastrar funcionário de produção
- Gerar folha de pagamento completa com total

## 💡 Conceitos Aplicados

- Orientação a Objetos (POO)
- Herança e Polimorfismo
- Sobrescrita de métodos (`@Override`)
- Encapsulamento
- Coleções (`ArrayList`)

## 👩‍💻 Autora

**Mayara Farinha** — [GitHub](https://github.com/Mayfarinha)
