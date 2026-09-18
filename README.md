# Etapa 2 — Implementação melhorada

Commit das melhorias: [ver commit](https://github.com/Thalisson-Souza/APSOO-bridge/commit/3b77caef118a9cd425cdaedda435624bd2a41a0c)

Foi criada uma classe `Estoque`, pra controle de quantidade de refrigerantes. Pra conseguir adicionar, consultar produtos ou quantidades, ver se disponível e remover quantidade quando um refrigerante é servido.

A interface `Tamanho` foi melhorada. Agora com volume em ml e tipo de embalagem. Tirando a representação só por texto.

A classe `Refrigerante` agora com método `descricao()`, que usa marca com o tamanho do produto pra ajudar na identificação no estoque de cada refrigerante.

Adição de validação no cadastro de quantidades, pra não deixar criar refrigerante sem tamanho.

Adição de testes para validar as combinações entre marca e tamanho, controle de estoque, validação de tamanho nulo. Antes isso não era de fato validado o comportamento, apenas era executado.

Tudo ainda mantendo o padrão Bridge. Mas fica claro o quão bom nesse cenário foi usar esse padrão.

## Próxima etapa

A extensão do sistema com a marca Guaraná e o tamanho de 1 litro está
em [v3 — extensão do sistema](https://github.com/Thalisson-Souza/APSOO-bridge/tree/v3).
