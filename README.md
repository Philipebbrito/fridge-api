🚀 Primeiros Passos com Spring Boot: Arquitetura e Estabilidade
Este projeto marca o meu primeiro contato prático com o ecossistema Spring Boot. O objetivo foi entender como uma aplicação Java moderna é estruturada e como as camadas de responsabilidade se comunicam para entregar uma API funcional.

🏗️ Estrutura do Projeto (Camadas)
Durante o desenvolvimento, explorei os conceitos fundamentais da arquitetura em camadas do Spring:

Application: O ponto de entrada da aplicação, onde a magia do Spring Boot começa com a anotação @SpringBootApplication.

Controller: A camada de exposição da API. Responsável por receber as requisições HTTP e retornar as respostas ao cliente.

Service: Onde reside a inteligência do projeto. Esta camada isola as regras de negócio, garantindo que o código seja testável e organizado.

Repository: A interface de comunicação com o banco de dados, utilizando o Spring Data JPA para abstrair a complexidade das consultas SQL.

⚠️ Lições Aprendidas: Versão vs. Estabilidade
Um ponto crucial deste aprendizado foi a configuração do ambiente. Inicialmente, tentei utilizar o Java 25 (versão mais recente/experimental), acreditando que teria acesso aos melhores recursos. No entanto, enfrentei:

Incompatibilidade de Plugins: Ferramentas de build não reconheciam certas flags da JDK.

Erros de Compilador: Falta de suporte de bibliotecas de terceiros para a versão mais atual.

Solução: Ao migrar para uma versão LTS (Long Term Support), como o Java 17 ou 21, o projeto fluiu com a robustez e estabilidade necessárias.

Insight: No desenvolvimento backend, "estar na última versão" nem sempre é o melhor caminho. A compatibilidade do ecossistema é o que garante a produtividade.

🛠️ Tecnologias Utilizadas
Java 17/21 (Versão estável escolhida)

Spring Boot 3.x

Spring Web (Rest API)

Spring Data JPA

Maven (Gerenciador de dependências)

🏁 Como Rodar o Projeto
Clone o repositório:

Bash
git clone https://github.com/seu-usuario/nome-do-repositorio.git
Importe na sua IDE favorita (IntelliJ, VS Code, Eclipse).

Certifique-se de que o JDK 17 ou 21 está configurado.

Execute a classe principal Application.java.

Próximos Passos
[ ] Adicionar tratamento de exceções customizado.

[ ] Implementar o Spring Security para proteção das rotas.

[ ] Criar testes unitários para a camada de Service.
