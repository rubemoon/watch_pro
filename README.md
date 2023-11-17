
# WATCHPRO 1.0.0


O Watchpro é um aplicativo web desenvolvido como parte do projeto da disciplina "Métodos de Desenvolvimento"  do Professor Elenilton. 
Ele oferece aos usuários a capacidade de criar e gerenciar listas personalizadas de filmes,proporcionando uma experiência de organização 
intuitiva e conectividade com a base de dados da OMDB para exibir avaliações dos filmes.


# Funcionalidades Principais

### Página Inicial (Home Page)

A página inicial é a vitrine do Watchpro, onde os usuários encontram suas listas de filmes organizadas em cards atrativos e bem alinhados. Cada card exibe informações essenciais sobre o filme, incluindo imagens e detalhes relevantes.

![image](https://github.com/rubemoon/watch_pro/assets/93041872/9e66bbd0-20fc-4c75-86a2-9da6f716f08c)

## Watchlist Page

A Watchlist Page é dedicada às listas de filmes do usuário. Nesta página, uma tabela apresenta detalhes mais aprofundados sobre cada filme na lista. Os usuários têm a capacidade de atualizar informações, proporcionando uma experiência de gerenciamento completa.

![image](https://github.com/rubemoon/watch_pro/assets/93041872/6bcb0842-c9af-4b65-b531-b3785955d045)

## Add List Page

A Add List Page é a área onde os usuários podem adicionar novos filmes às suas listas. Um formulário intuitivo facilita a inclusão de informações cruciais, permitindo uma experiência de cadastro fácil e eficiente.

![image](https://github.com/rubemoon/watch_pro/assets/93041872/49f94f07-b29a-43fd-87e8-d6db78884e3d)

# Integração com [OMDB API](https://www.omdbapi.com/)

O Watchpro se conecta à API da OMDB para fornecer avaliações de filmes. Isso enriquece a experiência do usuário, oferecendo informações adicionais sobre os filmes listados.

# Technologias Utilizadas

**Backend:** java, spring boot

**Frontend:** tailwindcss

# Usando o MVC e Three-tier architecture
## MVC
O padrão MVC se preocupa apenas em organizar a lógica na interface do usuário (camada de apresentação).
![image](https://github.com/rubemoon/watch_pro/assets/93041872/b15d83ba-2c0e-49ab-ba03-a567f6e18998)

## Three-tier architecture
A arquitetura de três camadas tem uma preocupação mais ampla. Trata-se de organizar o código em todo o aplicativo.
![image](https://github.com/rubemoon/watch_pro/assets/93041872/514b9d48-7cbe-4492-b1f4-f55a949c55d1)


Classes de controlador como camada de apresentação. Mantenha esta camada o mais fina possível e limitada à mecânica das operações MVC, por exemplo, receber e validar as entradas, manipular o objeto do modelo, retornar o objeto MovedAndView apropriado e assim por diante. Todas as operações relacionadas aos negócios devem ser realizadas em classes de serviço. As classes de controlador geralmente são colocadas em um pacote de controlador.

Classes de serviço como camada de lógica de negócios. Cálculos, transformações de dados, processos de dados e validações de registros cruzados (regras de negócios) geralmente são feitos nesta camada. Eles são chamados pelas classes do controlador e podem chamar repositórios ou outros serviços. As classes de serviço geralmente são incluídas em um pacote de serviços.

Classes de repositório como camada de acesso a dados. A responsabilidade desta camada é limitada às operações Criar, Recuperar, Atualizar e Excluir (CRUD) em uma fonte de dados, que geralmente é um banco de dados relacional ou não relacional. As classes de repositório geralmente são colocadas em um pacote de repositório.


## License

[MIT](https://github.com/rubemoon/watch_pro/blob/main/LICENSE)









 
