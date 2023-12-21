# Arrays

Arrays são estruturas de dados em Java que permitem armazenar vários valores do mesmo tipo em uma única variável. Ao invés de criar várias variáveis para guardar valores diferentes, porém com o mesmo tipo de dado, os arrays são mais indicados já que guardam vários valores que possuem o mesmo tipo e ainda facilitam o acesso a cada um dos itens guardados por meio de index.

Eles podem ser listas comuns (chamados de unidimensionais) ou matrizes (chamados de multidimensionais, podendo ser bidimensionais, tridimensionais... dependendo exclusivamente da dimensão ser +1)

Imagine uma lista de números inteiros, mas quero acessar apenas o 5º número.

Para que isso aconteça, deve-se entender que mesmo que haja 5 numeros, as posições deles não começam pelo número 1, ou seja, na verdade, o primeiro número está na posição 0.

Há 5 números, 5 posições (quantidade de valores dentro dele) na lista, mas o array começa pelo 0:

| Valores do Array | 10 | 26 | 140 | 85 | 207 |
| --- | --- | --- | --- | --- | --- |
| Posições | 1º | 2º | 3º | 4º | 5º |
| index | 0 | 1 | 2 | 3 | 4 |

então se eu quero acessar o 4º número salvo na lista:

index 3 da lista = 4º número = 85

## Tamanho do Array:

O tamanho de um array em Java é fixo após a sua criação. Se precisar de um tamanho dinâmico, considere o uso de coleções como ArrayList.

## Utilização em Java:

Vetor "normal":

```java
int[] lista = {10, 26, 140, 85, 207};
System.out.println(lista[3]); //Resultado: 85
```

Matriz:

Para printar, primeiro especifica qual linha o item está, depois a coluna.

```java
int[] matriz = { {1, 2, 3} , {4, 5, 6} };
System.out.println(matriz[0][2]) 
//printa o item da coluna 2 (indíce 2) da primeira linha (indice 0)
//Resultado: 3
```
