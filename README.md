# APP DIVIDE AÍ V.01
## Pra que serve?
 Divide Aí é um aplicativo feito em JavaFX, simples demais. Ele permite calcular o valor a ser pago por cada amigo ao dividir a conta de um restaurante.

## Estrutura do Projeto
O projeto é praticamente um resumo do material do Gustavo Guanabara.
O projeto em sí é muito "fácil":
Exemplo:

5 Amigos num bar, comem seus petiscos, tomam suas bebidas mais os 10% juntos gastando um saldo de R$233.57, quanto é esse valor dividio para 5 pessoas?
- Custo da noite = R$233.57
- Quantidade de amigos para dividir a conta= 5
- Calcular = R$46,71

Embora simples tive muita dificuldade de conseguir estruturar o Layout do projeto, por nao ter dominio em CSS.
O projeto está organizado da seguinte forma:

Usei o GPT para ajudar criar um passo a passo de como fui estruturando.

## Requisitos
- Java Development Kit (JDK) 11 ou superior
- JavaFX SDK 11 ou superior
- IntelliJ IDEA (ou outra IDE de sua escolha)

## Configuração

### Passo 1: Configurar JavaFX no IntelliJ IDEA

1. **Baixar o JavaFX SDK:**
    - Baixe o JavaFX SDK a partir de [Gluon](https://gluonhq.com/products/javafx/).

2. **Configurar o SDK:**
    - Extraia o arquivo baixado e copie o caminho da pasta `lib`.

3. **Adicionar o SDK ao Projeto:**
    - Vá para `File` -> `Project Structure...` -> `Modules` -> `Dependencies`.
    - Clique no ícone `+` e selecione `JARs or directories`.
    - Adicione todos os arquivos `.jar` da pasta `lib` do JavaFX SDK.

4. **Configurar VM options:**
    - Vá para `Run` -> `Edit Configurations...`
    - Selecione a configuração de execução do seu projeto ou crie uma nova configuração de aplicação Java.
    - Adicione o seguinte em `VM options`:
      ```
      --module-path /path/to/javafx-sdk-XX/lib --add-modules javafx.controls,javafx.fxml
      ```
    - Substitua `/path/to/javafx-sdk-XX/lib` pelo caminho real para a pasta `lib` do JavaFX SDK.

### Passo 2: Compilar e Executar o Projeto

- **Compilar** o projeto clicando em `Build` -> `Build Project`.
- **Executar** o projeto clicando em `Run` -> `Run 'DivideAiApp'`.


### DivideAiApp.java
###Desenvolvido por Markos Jhonathas