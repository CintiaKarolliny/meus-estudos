# Tipos primitivos e variáveis

Uma variável é uma área designada na memória do computador que armazena dados com um tipo e valor específicos. Cada variável é associada a um escopo, determinando sua visibilidade e acessibilidade. 

O tipo de uma variável indica o conjunto de valores que ela pode armazenar e as operações que podem ser realizadas sobre ela. Esta abordagem de tipagem reforça a rigorosa verificação de tipos durante a compilação, prevenindo erros comuns e promovendo uma execução mais segura. Exemplos de tipos primitivos:

- Integers: int, byte, short
- Floating - point: float, double
- Booleans: bool
- Character: char

| Tipos | Tamanho | Valor min | Valor max |
| --- | --- | --- | --- |
| byte | 1 bytes | -128 | 127 |
| short | 2 bytes | -32.768 | 32.767 |
| int | 4 bytes | -2.147,463,648 | 2.147,463,647 |
| long | 8 bytes | -9.223,372,036,854,755,808 | 9.223,372,036,854,755,807 |
| float | 4 bytes | 1.175494351 E - 38 | 3,402823466 E + 38 |
| double | 8 bytes | 2.2250738585072014 E - 308 | 1,7976931348623158 E + 308 |
| boolean | Depende da Máquina Virtual | True / False | False / True |
| char | 2 bytes | 0 | 65.535 |

Ao serem inicializadas, elas podem ter valor definido ou não:

byte b1 = 1;
byte b2;