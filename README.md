# Aplicação de Reserva de Quartos

Este é um programa Java simples para gerenciar reservas de quartos aplicando o paradigma de oreintação a obojatos . Ele permite que você registre hóspedes em quartos específicos e visualize os quartos que estão ocupados.

## Funcionalidades

* Permite ao usuário informar quantos quartos podem ser alugados.
* Solicita o nome, e-mail e número do quarto para cada reserva.
* Armazena as informações de reserva em um vetor.
* Exibe os quartos que estão atualmente ocupados, juntamente com as informações do hóspede.

## Como Usar

1.  **Pré-requisitos:** Certifique-se de ter o Java Development Kit (JDK) instalado em seu sistema.
2.  **Compilação:** Navegue até o diretório onde o arquivo `Application.java` está salvo e compile o código usando o seguinte comando no terminal:

    ```bash
    javac Application.java
    ```

    Certifique-se de que a classe `Reserva.java` (mencionada no código) esteja no mesmo diretório ou em um local acessível pelo classpath.

3.  **Execução:** Após a compilação bem-sucedida, execute o programa com o seguinte comando:

    ```bash
    java Application
    ```

4.  **Interação:** O programa solicitará as seguintes informações:
    * O número total de quartos disponíveis para aluguel.
    * Para cada reserva:
        * Nome do hóspede.
        * E-mail do hóspede.
        * Número do quarto desejado.

5.  **Resultado:** Após inserir todas as reservas, o programa exibirá uma lista dos quartos ocupados, mostrando o número do quarto e as informações do hóspede (nome e e-mail).
