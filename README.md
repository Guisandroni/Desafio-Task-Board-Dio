
# TaskBoard



-----

## 🎯 Visão Geral

O **TaskBoard** é uma aplicação desktop robusta desenvolvida em **Java** que oferece um sistema completo de gerenciamento de tarefas no estilo **Kanban**. Inspirado no Trello, o sistema permite criar múltiplos boards personalizáveis, gerenciar cards através de colunas organizadas e monitorar o progresso com um sistema de logs otimizado.

-----

## ✨ Principais Funcionalidades

  * **🗂️ Múltiplos Boards:** Crie e gerencie vários boards simultaneamente.
  * **📋 Sistema Kanban Completo:** Interface visual com colunas personalizáveis.
  * **🔄 Fluxo de Trabalho Controlado:** Movimentação sequencial de cards entre colunas.
  * **🚫 Sistema de Bloqueio Avançado:** Bloqueie e desbloqueie cards com justificativas via interface.
  * **📊 Sistema de Logs Otimizado:** Logs essenciais para produção.
  * **💾 Persistência MySQL:** Dados seguros em um banco de dados robusto.

-----

## 🚀 Tecnologias e Arquitetura

### Stack Tecnológico

  * **Java 17+:** Linguagem principal com recursos modernos.
  * **Swing:** Interface gráfica nativa otimizada.
  * **MySQL 8.0:** Banco de dados robusto e confiável.
  * **JDBC:** Conectividade otimizada com o banco de dados.

### Arquitetura e Padrões de Design

  * **MVC Pattern:** Separação clara de responsabilidades entre Model, View e Controller.
  * **DAO Pattern:** Camada de acesso a dados isolada.
  * **Service Layer:** Lógica de negócio centralizada.
  * **Singleton:** Sistema de logs unificado e otimizado.

-----

## ⚙️ Configuração e Instalação

### Pré-requisitos

  * **☕ Java 17** ou superior.
  * **🗄️ MySQL Server 8.0+**.
  * **🖥️ Sistema Operacional:** Windows, Linux ou macOS.

### Configuração do Banco de Dados

O sistema cria o banco de dados e as tabelas automaticamente na primeira execução. Certifique-se de que o MySQL Server está em execução.

-----

### Execução

1.  **Clone o repositório:**
    ```bash
    git clone [URL_DO_SEU_REPOSITORIO]
    cd TaskBoard
    ```
2.  **Configure o Banco de Dados:**
    Antes de rodar a aplicação, abra o arquivo **`DatabaseConnection.java`** e edite as informações de conexão para corresponderem às suas credenciais do **MySQL** (usuário, senha, etc.).
3.  **Compile o projeto:**
    ```bash
    javac -cp "lib/mysql-connector-j-8.0.33.jar;." -d bin src/main/**/*.java
    ```
4.  **Execute a aplicação:**
    ```bash
    java -cp "lib/mysql-connector-j-8.0.33.jar;bin" main.Main
    ```
-----

## 📖 Guia de Uso

### 🎮 Menu Principal

O sistema inicia com um menu principal que oferece:

  * **📋 Criar Novo Board:** Cria um board personalizado.
  * **🎯 Selecionar Board:** Abre um board existente.
  * **🗑️ Excluir Board:** Remove um board (com confirmação).
  * **📊 Visualizar Logs:** Acesso ao sistema de monitoramento em tempo real.
  * **🚪 Sair:** Encerra a aplicação.

### 📋 Gerenciamento de Cards

  * **➕ Criar Card:** Título, descrição e coluna inicial.
  * **⬅️➡️ Mover Card:** Movimente entre colunas seguindo o fluxo.
  * **🚫 Bloquear/Desbloquear:** Com justificativas obrigatórias via menu de contexto.
  * **❌ Cancelar Card:** Move o card diretamente para a coluna "Cancelado".
  * **✏️ Editar Informações:** Atualize os dados do card.

