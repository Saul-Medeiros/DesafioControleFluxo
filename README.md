# DesafioControleFluxo

Desafio de Projeto da DIO - Santander Bootcamp 2023 - Backend Java

O desafio consiste em criar uma classe simples `Contador.java` que permita que números sejam inseridos no terminal pelo usuário, e que, dado a diferença entre esses dois números, é executado um loop mostrando uma contagem de 1 até o número máximo de ocorrências (a diferença entre os dois números):

```bash
Imprimindo o número 1
...
Imprimindo o número N
```

> Obs: Os colchetes representam as informações que o usuário colocar no terminal.

Caso o primeiro número informado seja maior que o segundo, o programa vai disparar uma exceção personalizada, oriundo da classe personalizada `ParametrosInvalidosException.java`:

```bash
O segundo parâmetro deve ser maior que o primeiro
```

O código se encontra disponível [aqui](./src/edu/model/Contador.java).
