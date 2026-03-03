# 🧩 Desafio: Abstraindo um Bootcamp Usando POO em Java

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Java Study](https://img.shields.io/badge/Estudo-Java_Core-yellow?style=for-the-badge&logo=java)
![DIO](https://img.shields.io/badge/Origem-Digital_Innovation_One-EE2E5D?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Em_Estudo-green?style=for-the-badge)

Um simulador de portal educacional robusto desenvolvido em Java, que permite a gestão de cursos, mentorias e o acompanhamento do progresso de alunos em Bootcamps. O projeto foi construído com foco total nos pilares da **Programação Orientada a Objetos** e na manipulação eficiente de coleções com a **Stream API**.

| **Categoria** | **Detalhes** |
| :--- | :--- |
| **Autor** | [Thiago Cardoso](https://github.com/thnocard36) |
| **Professora** | [Camila Cavalcante](https://github.com/cami-la) |

---

## 🚀 Funcionalidades

* **Gestão de Conteúdos:** Criação dinâmica de Cursos (com carga horária) e Mentorias (com datas específicas).
* **Sistema de Inscrição:** Alunos podem se matricular em Bootcamps, que agregam diversos conteúdos.
* **Progressão Automática:** Sistema que move conteúdos da lista de "Inscritos" para "Concluídos" conforme o aluno avança.
* **Cálculo de XP:** Pontuação dinâmica baseada no tipo de conteúdo finalizado (Polimorfismo).
* **Regras de Domínio:** Controle de datas de início e fim dos Bootcamps (expiração automática em 50 dias).

---

## 🏗️ Estrutura do Projeto

O projeto segue a separação por pacotes para garantir a organização e escalabilidade do domínio:

* **br.com.thnocard.dio_bootcamp:** Contém as classes base (`Contents`), especializações (`CursosDIO`, `Mentorias`) e a gestão do `Bootcamp`.
* **br.com.thnocard.faculdade:** Entidade `Student`, responsável pela lógica de matrícula, progressão e histórico acadêmico.
* **br.com.thnocard.principal:** Classe `Main` que executa a simulação completa do portal.

---

## 🧠 Objetivos de Aprendizado (POO)

* **Abstração:** Criação de classes e métodos abstratos para padronizar comportamentos de diferentes conteúdos.
* **Herança e Polimorfismo:** Reuso de código base e implementações específicas para o cálculo de XP de acordo com o tipo de curso/mentoria.
* **Encapsulamento:** Proteção de dados sensíveis e uso rigoroso de métodos de acesso (Getters/Setters).
* **Collections:** Uso avançado de `LinkedHashSet` para evitar conteúdos duplicados mantendo a ordem cronológica de inserção.

---

## 🛠️ Como Executar

O projeto é uma aplicação Java SE. Para testar o fluxo de alunos no terminal:

1.  Clone o repositório.
2.  Navegue até o diretório raiz do projeto.
3.  Compile e execute via terminal ou sua IDE de preferência:

```bash
# Compilar o projeto
javac br/com/thnocard/principal/Main.java

# Executar a aplicação
java br.com.thnocard.principal.Main
```

---

## ⚖️ Licença

Este projeto está sob a licença MIT. Isso significa que você pode copiar, modificar e distribuir o código, desde que inclua o aviso de copyright original.