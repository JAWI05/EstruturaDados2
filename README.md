# 📚 Estrutura de Dados II - Engenharia de Computação

Este repositório reúne o conhecimento teórico e as implementações práticas desenvolvidas durante a disciplina de **Estrutura de Dados II**. O conteúdo abrange desde a análise rigorosa de algoritmos até a aplicação de estruturas de dados dinâmicas e balanceadas para otimização de sistemas.

---

## 🔬 1. Análise de Algoritmos e Complexidade
Fundamentação para medir a eficiência de códigos em termos de tempo e espaço.

*   **Notação Big O ($O$):** Define o limite superior de crescimento, representando o **pior caso** de execução.
*   **Comportamentos Assintóticos:** Estudo das notações $\Omega$ (limite inferior/melhor caso) e $\Theta$ (comportamento médio/exato).
*   **Inventário de Funções:** Escala de eficiência partindo de $O(1)$ (constante) e $O(\log n)$ (logarítmico) até $O(n^2)$ (quadrático) e $O(n!)$ (fatorial).

---

## 🔍 2. Algoritmos de Busca e Ordenação
Técnicas essenciais para a manipulação e organização de grandes volumes de dados.

*   **Busca Sequencial:** Varredura item a item em listas, com complexidade $O(n)$.
*   **Busca Binária:** Algoritmo de alta performance ($O(\log n)$) exclusivo para vetores ordenados, baseado em divisões sucessivas.
*   **Quick Sort:** Método de ordenação eficiente que utiliza a estratégia de "Dividir e Conquistar" através de pivôs e partição.

---

## 🛠️ 3. Estruturas de Dados Dinâmicas
Implementações baseadas em nós e ponteiros para gerenciamento flexível da memória.

### 📋 Listas
*   **Lista Encadeada Simples:** Sequência de nós onde cada elemento aponta para o próximo[cite: 13].
*   **Lista Duplamente Encadeada:** Permite navegação bidirecional (anterior e próximo), essencial para históricos e navegação reversa.
*   **Lista Circular:** O último nó aponta para o primeiro, criando um ciclo contínuo ideal para agendamentos cíclicos e buffers.

### 🚶 Filas e Pilhas (FIFO & LIFO)
*   **Fila (Queue):** Atendimento por ordem de chegada (*First In, First Out*).
*   **Pilha (Stack):** Operações no topo (*Last In, First Out*), fundamental para recursão e históricos de busca.

---

## 🌳 4. Estruturas Hierárquicas (Árvores)
Organização de dados que permite buscas e remoções otimizadas em tempo logarítmico.

*   **Árvore Binária de Busca (BST):** Estrutura onde valores menores ficam à esquerda e maiores à direita.
    *   **Travessias:** Implementação de percursos Pré-Ordem, Em Ordem e Pós-Ordem.
    *   **Gestão de Nós:** Lógica recursiva para inserção e remoção (tratando casos de 0, 1 ou 2 filhos).
*   **Árvore AVL:** Evolução da BST que utiliza rotações (LL, RR, LR, RL) para manter o balanceamento automático e garantir performance $O(\log n)$.

---

## 🏗️ 5. Princípios de POO Aplicados
O desenvolvimento de todas as estruturas utiliza conceitos avançados de Java.

*   **Encapsulamento:** Uso de atributos privados/protegidos e métodos acessores (Getters/Setters).
*   **Herança e Polimorfismo:** Especialização de classes (ex: `UsuarioComum` e `UsuarioVerificado`) e sobrescrita de métodos.
*   **Abstração:** Criação de classes base abstratas para padronização de comportamentos.

---
<div align="center">
  <sub>Repositório de Portfólio - Engenharia de Computação</sub>
</div>
