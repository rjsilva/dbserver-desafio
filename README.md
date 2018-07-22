# dbserver-desafio

Manual Para Execução dos Testes - Web

Ferramentas

IDE(Eclipse, NetBeans ou IntelliJ)
Tecnologias

Java 8
Cucumber
Selenium
Junit
JavaFaker
Rodar os Testes

Pré-Requisito: Atualizar o Projeto Web antes de rodar os testes, para baixar as dependências do maven

- Dentro da IDE
- Clicar botão direto no projeto
- Selecionar opção "Maven"
- Selecionar opção "Update maven project"
1 - Opção IDE(Eclipse, Netbeans ou IntelliJ)

- Run -> JU Run Test
2 - Opção Maven

Pré Requisito

- Maven Instalado na máquina

----------Aplicação Web-----------------

Sistema Operacional Mac OSX
- Abrir Terminal
- Entra dentro do projeto
- Executar o camando "mvn test"

Sistema Operacional Windows
- Pré requisito
- Abrir as features no pacotes src/test/resources -> features -> 
- Retirar a tag -> @chrome
- Inserir em todas as features a tag -> @chrome_windows
- abrir cmd 
- Entra dentro do projeto
- Executar o camando "mvn test"

------------Reports do Testes -----------------------

- Dentro do projeto
- Pasta target -> surefire--reports -> cucumber.html -> index.html

- clicar no "index.html" ou abrir com seu browser de preferência

obs: futuramente esse report, estará no jenkins
