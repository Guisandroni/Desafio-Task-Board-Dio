# TaskBoard

<div align="center"\>
<img src="[https://img.shields.io/badge/Status-Estável-green](https://www.google.com/search?q=https://img.shields.io/badge/Status-Est%C3%A1vel-green)" alt="Status do Projeto"\>
<img src="[https://img.shields.io/badge/Linguagem-Java](https://www.google.com/search?q=https://img.shields.io/badge/Linguagem-Java) 17+-blue" alt="Linguagem Java"\>
<img src="[https://img.shields.io/badge/Interface-Swing-informational](https://www.google.com/search?q=https://img.shields.io/badge/Interface-Swing-informational)" alt="Interface Swing"\>
<img src="[https://img.shields.io/badge/Banco\_de\_Dados-MySQL](https://www.google.com/search?q=https://img.shields.io/badge/Banco_de_Dados-MySQL) 8.0-orange" alt="Banco de Dados MySQL"\>
</div\>

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


## ⚙️ Configuração e Instalação

### Pré-requisitos

  * **☕ Java 17** ou superior.
  * **🗄️ MySQL Server 8.0+**.
  * **🖥️ Sistema Operacional:** Windows, Linux ou macOS.


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

