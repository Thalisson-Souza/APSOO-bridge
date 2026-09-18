# Etapa 3 — Extensão do sistema

## Objetivo

O bar precisa agora vender Guaraná (nova marca) e também passar a oferecer 1
litro (novo tamanho). Adicione os dois sem modificar nenhuma classe ou interface
existente.

Commit da extensão: [ver commit](https://github.com/Thalisson-Souza/APSOO-bridge/commit/c7051add15d73161ca2d4f1cb51b7f7507dd1f9f)

## Classes criadas

Foi criada a classe `Guarana`, que representa a nova marca e estende
`Refrigerante`.

Também foi criada a classe `Tamanho1Litro`, que representa o novo tamanho e
implementa a interface `Tamanho`.

Foi criada a classe `MainEtapa3` para demonstrar a combinação entre Guaraná e 1
litro:

```java
Refrigerante guarana1Litro = new Guarana(new Tamanho1Litro());
guarana1Litro.servir();
```

## Padrão Bridge

O padrão é bom porque conseguimos separar dois mundos que facilitem nossa
estruturação do que estamos criando.

Nesse exemplo, foi bom no sentido de que nós temos marcas de refrigerante e
seus devidos tamanhos. Com esse padrão, conseguimos ter dois mundos: o da marca
do refrigerante e o do tamanho. Sem ele, por exemplo, teríamos que ter uma
classe para cada combinação de tamanho, como:

- CocaCola200ml
- CocaCola300ml
- CocaCola600ml
- Fanta200ml
- Fanta300ml
- ...

Se temos 4 marcas e 4 tamanhos diferentes e quiséssemos utilizar o padrão de
classe normal, seria:

```text
número de marcas * número de tamanhos = 16 classes
```

No Bridge, seria:

```text
número de marcas + número de tamanhos = 8 classes
```

Isso é ruim porque, quanto mais opções de tamanho, mais classes seriam criadas.
Com o Bridge, conseguimos separar as marcas e os tamanhos e combiná-los entre
si.

## Comparação com outras abordagens

Se o sistema tivesse uma classe para cada combinação, seria necessário criar
classes como:

```text
CocaCola200ml
CocaCola300ml
Fanta300ml
Guarana1Litro
```

Como dito acima, o cálculo das classes aumentaria muito. Cada nova marca
exigiria uma classe para cada tamanho, e cada novo tamanho exigiria uma classe
para cada marca, aumentando a quantidade de classes e repetindo código.

Se fosse utilizada uma classe única `if/else` por marca e tamanho, teria que
mexer nessa classe toda vez que eu quisesse colocar uma nova opção. Ela iria
aumentar muito e ficaria ruim de manter.

Com esse padrão podemos combinar diferentes combinações sem precisar criar
classes demais, ou mexer em código já existente.
