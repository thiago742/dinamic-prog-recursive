respostas

exercicio 1: Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua resposta.

Não.
Justificativa:  A recursão pura tem um limite de profundidade, que em Java geralmente é cerca de 1000 chamadas recursivas. 
Para números grandes, isso pode levar a um StackOverflowError (estouro de pilha). Além disso, a recursão consome muita memória, 
já que cada chamada mantém informações na pilha até que todas sejam resolvidas.


exercicio 2: Diferença entre Bottom-Up e Top-Down:

Bottom-Up: Resolve o problema iterativamente, começando dos casos menores e construindo a solução para casos maiores.

Top-Down: Usa recursão com memorização (armazenamento de resultados já calculados) para evitar recálculos.

Consegue calcular o fatorial de um número acima de 100 com uma solução recursiva? Justifique sua resposta.

Sim.
Justificativa: Ambas as abordagens evitam recálculos e são eficientes. A Bottom-Up é iterativa e não depende de recursão, 
enquanto a Top-Down usa recursão com memoização, mas sem exceder o limite de profundidade, vale ressaltar que, mesmo com
outra abordagem, ainda é necessário o uso do BigInteger para que o tipo consiga suportar o valor imenso que será gerado pelo
100!.



exercicio 3: Problema: calcule a complexidade de tempo das soluções da série de Fibonacci apresentadas no módulo e compare as duas.
Apenas com recursão: O(2n) exponencial.
Com iteração nos valores (bottom up): O(n) linear.

Por que a solução feita com programação dinâmica é melhor?
porque utilizando somente recursão o código fica exponencialmente mais pesado tendo que chamar a mesma função uma dentro
da outra até que o valor seja calculado pesando muito o código.
Com a Programação Dinamica essa exponencialização é mudada pra algo linear com iteração sobre os valores evitando
muitos recalculos redundantes
