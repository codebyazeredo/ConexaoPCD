  <h1>Conexão PCD</h1>
    <h2>Descrição</h2>
    <p>
        O <strong>Conexão PCD</strong> é um sistema web que está sendo desenvolvido para o mapeamento de pessoas com deficiência. Este projeto visa fornecer as Prefeituras de Santa Catarina uma ferramenta eficiente para identificar e gerenciar informações sobre pessoas com deficiência na cidade.
    </p>
    <h2>Tecnologias Utilizadas</h2>
    <ul>
        <li><strong>Linguagem de Programação:</strong> Java</li>
        <li><strong>Framework:</strong> Spring</li>
        <li><strong>Arquitetura:</strong> MVC</li>
        <li><strong>Templating Engine:</strong> Thymeleaf</li>
        <li><strong>Biblioteca JavaScript:</strong> jQuery</li>
    </ul>
    <h2>Requisitos</h2>
    <p>Antes de executar o projeto, certifique-se de ter os seguintes requisitos instalados:</p>
    <ul>
        <li><a href="https://www.oracle.com/java/technologies/javase-jdk11-downloads.html" target="_blank">Java JDK 11 ou superior</a></li>
        <li><a href="https://maven.apache.org/download.cgi" target="_blank">Apache Maven</a></li>
        <li><a href="https://spring.io/projects/spring-boot" target="_blank">Spring Boot</a></li>
        <li><a href="https://www.postgresql.org/download/" target="_blank">Banco de Dados Relacional</a> (Configurável através do arquivo <code>application.properties</code>)</li>
    </ul>
    <h2>Configuração do Projeto</h2>
    <ol>
        <li><strong>Clone o Repositório</strong>
            <pre><code>git clone https://github.com/seu-usuario/conexao-pcd.git
cd conexao-pcd
            </code></pre>
        </li>
        <li><strong>Configure o Banco de Dados</strong>
            <p>Edite o arquivo <code>src/main/resources/application.properties</code> com as configurações do seu banco de dados:</p>
            <pre><code>spring.datasource.url=jdbc:postgresql://localhost:5432/seu_banco
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
            </code></pre>
        </li>
        <li><strong>Compile e Execute</strong>
            <p>Utilize Maven para compilar e executar o projeto:</p>
            <pre><code>mvn clean install
mvn spring-boot:run
            </code></pre>
            <p>O sistema estará acessível em <a href="http://localhost:8080" target="_blank">http://localhost:8080</a>.</p>
        </li>
    </ol>
    <h2>Contato</h2>
    <p>Para mais informações, entre em contato com:</p>
    <ul>
        <li><strong>Autor: </strong>Matheus Azeredo</li>
        <li><strong>Email: </strong> <a href="mailto:matheus.azeredo@hotmail.com">matheus.azeredo@hotmail.com</a></li>
        <li><strong>GitHub: </strong> <a href="https://github.com/codebyazeredo" target="_blank">codebyazeredo</a></li>
    </ul>
