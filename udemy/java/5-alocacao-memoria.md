# Alocação em Memória

Para entender como as variáveis são salvas em memória, precisa-se ter em mente que:

Java há duas áreas distintas de memória usadas para diferentes propósitos durante a execução de um programa: “Heap” e “Stack”:

- Stack (Pilha) é uma região de memória reservada para armazenar dados temporários, como variáveis locais e referências de método. Vale lembrar que, diferentemente de “fila”, as pilhas salvam seus últimos números no primeiro lugar:
    - Fila → Método First in First out (Primeiro a entrar é o primeiro a sair)
        
        ```java
        Fila queue = nova Fila()
		queue.enqueue(1)
		queue.enqueue(2)
		queue.enqueue(3)
		
        // Fila: 1, 2, 3
        ```
        
    - Pilha → Método Last in First out (Último a entrar é o primeiro a sair)
        
        ```java
        Pilha stack = nova Pilha()
        stack.push(1)
        stack.push(2)
        stack.push(3)
        
        // Pilha: 3, 2, 1
        ```
        
- Heap (Monte) é uma região de memória dinâmica que é compartilhada por todos os threads em um programa. Ele é usado para armazenar objetos e Arrays que têm uma vida mais longa do que o escopo de um método específico.

    A principal diferença entre esses dois termos é:

    > A Stack é usada para armazenar dados temporários e informações de controle de fluxo relacionadas a métodos, enquanto o Heap é usado para armazenar objetos e Arrays com uma vida útil mais longa.
>