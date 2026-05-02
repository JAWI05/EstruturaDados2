# 📚 Estrutura de Dados II - Engenharia de Computação

Este repositório reúne o conhecimento teórico e prático consolidado durante a disciplina de **Estrutura de Dados II**. O foco principal é a análise de algoritmos, a implementação de estruturas dinâmicas avançadas e a aplicação de Programação Orientada a Objetos para otimização de sistemas complexos.

---

## 🔬 1. Análise de Algoritmos e Complexidade
Fundamentação matemática para medir a eficiência de um código em termos de tempo e espaço.

*   **Notação Big O ($O$):** Define o limite superior de crescimento, representando o **pior caso** de execução.
*   **Notações $\Omega$ e $\Theta$:** Representam, respectivamente, o limite inferior (melhor caso) e o comportamento exato (médio).
*   **Inventário de Funções:** De $O(1)$ (constante) e $O(\log n)$ (muito eficiente) até $O(n^2)$ e $O(n!)$ (ineficientes para grandes entradas).

---

## 🔍 2. Algoritmos de Busca e Ordenação
Técnicas para manipulação eficiente de dados em arrays e coleções.

*   **Busca Sequencial:** Varredura item a item em listas não ordenadas.
*   **Busca Binária:** Algoritmo de alta performance ($O(\log n)$) exclusivo para vetores ordenados.

---

## 🛠️ 3. Estruturas de Dados Dinâmicas
Implementações baseadas em nós e ponteiros que permitem o gerenciamento flexível da memória.

### 📋 Listas
*   **Lista Encadeada Simples:** Sequência de nós onde cada um aponta para o próximo.
*   **Lista Duplamente Encadeada:** Cada nó possui referências para o `anterior` e o `proximo`, permitindo navegação bidirecional e reversa.
*   **Lista Circular:** O último nó aponta de volta para o primeiro, criando um ciclo contínuo ideal para buffers e agendamentos cíclicos.

### 🚶 Filas e Pilhas (FIFO & LIFO)
*   **Fila (Queue):** Estrutura de atendimento por ordem de chegada (*First In, First Out*).
*   **Pilha (Stack):** Estrutura baseada no último a entrar (*Last In, First Out*), essencial para históricos, funções "undo" e recursão.

---

## 🌳 4. Estruturas Não-Lineares (Árvores)
Gerenciamento hierárquico de dados para buscas e remoções otimizadas.

*   **Árvore Binária de Busca (BST):** Organização recursiva onde valores menores ficam à esquerda e maiores à direita.
*   **Travessias (Percursos):** Métodos sistemáticos de visita aos nós: Inorder, Preorder, Postorder e BFS (Busca em Nível).
*   **Árvore AVL:** Árvore binária auto-balanceada que utiliza rotações (LL, RR, LR, RL) para manter sua altura controlada em $O(\log n)$.

---

## 🏗️ 5. Princípios de POO Aplicados
A disciplina foca no uso profissional de Java para implementar essas estruturas.

*   **Abstração e Herança:** Uso de classes abstratas (`Usuario`, `Pessoa`) e especializações via herança.
*   **Polimorfismo:** Sobrescrita de métodos (`@Override`) para comportamentos específicos em classes filhas.
*   **Encapsulamento:** Proteção de atributos e uso de métodos acessores para integridade dos dados.

---
<div align="center">
  <sub>Repositório de Portfólio - Engenharia de Computação</sub>
</div>
