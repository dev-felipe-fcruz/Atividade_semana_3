import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Seja bem vindo ao COMEX!!" + "\n");

        int dataNascimento1 = 1980;
        int dataNascimento2 = 2000;

        System.out.println("""
                >>> Listagem dos Clientes
                _______________________________""" + "\n" +
                "Nome: Fulano" + "\n" + "Data nascimento: " + dataNascimento1 + "\n" +
                "______________________________" + "\n" +
                "Nome: Sicrano" + "\n" +  "Data nascimento: " + dataNascimento2);

        double precoProduto1 = 49.95;
        double precoProduto2 = 1470.76;

        System.out.println("""
                >>> Listagem dos Produtos
                _______________________________""" + "\n" +
                "Nome: Livro" + "\n" + "Preço: " + precoProduto1 + "\n" +
                "______________________________" + "\n" +
                "Nome: Celular" + "\n" +  "Preço: " + precoProduto2);

        String nomeCliente1 = "Fulano";
        String nomeCliente2 = "Sicrano";

        System.out.println("""
                >>> Listagem dos Clientes
                _______________________________""" + "\n" +
                "Nome: " + nomeCliente1 + "\n" + "Data nascimento: " + dataNascimento1 + "\n" +
                "______________________________" + "\n" +
                "Nome: " + nomeCliente2 +  "\n" +  "Data nascimento: " + dataNascimento2);

        int idadeFulano = 43;
        int idadeBeltrano = 23;

        if (idadeFulano <= 17) {
            System.out.println(""" 
                    >>> Listagem dos Clientes
                    Ano atual: 2023
                    ___________________________
                    Nome: Fulano
                    Data de Nascimento: 1980
                    Idade: 43
                    Característica Etária: Adolescente
                    ___________________________""");
        }
            else if (idadeFulano >= 18 && idadeFulano <=29) {
                System.out.println(""" 
                    >>> Listagem dos Clientes
                    Ano atual: 2023
                    ____________________________
                    Nome: Fulano
                    Data de Nascimento: 1980
                    Idade: 43
                    Característica Etária: Jovem
                    ___________________________""");
            }
            else if (idadeFulano >= 30 && idadeFulano <=59) {
                System.out.println(""" 
                        >>> Listagem dos Clientes
                        Ano atual: 2023
                        ____________________________
                        Nome: Fulano
                        Data de Nascimento: 1980
                        Idade: 43
                        Característica Etária: Adulto
                        ___________________________""");
            }
                else{
                    System.out.println(""" 
                    >>> Listagem dos Clientes
                    Ano atual: 2023
                    ____________________________
                    Nome: Fulano
                    Data de Nascimento: 1980
                    Idade: 43
                    Característica Etária: Idoso
                    ___________________________""");
                }

        if (idadeBeltrano <= 17) {
            System.out.println(""" 
                    ________________________
                    Nome: Beltrano
                    Data de Nascimento: 2000
                    Idade: 23
                    Característica Etária: Adolescente""");
        }
        else if (idadeBeltrano >= 18 && idadeBeltrano <=29) {
            System.out.println(""" 
                    Nome: Beltrano
                    Data de Nascimento: 2000
                    Idade: 23
                    Característica Etária: Jovem""");
        }
        else if (idadeBeltrano >= 30 && idadeBeltrano <=59) {
            System.out.println(""" 
                    Nome: Beltrano
                    Data de Nascimento: 2000
                    Idade: 23
                    Característica Etária: Adulto""");
        }
        else{
            System.out.println(""" 
                    Nome: Beltrano
                    Data de Nascimento: 2000
                    Idade: 23
                    Característica Etária: Idoso""");
        }

        for (int i = 0; i < 1; i++) {
            System.out.println("""
                    ********************
                    Bem vindo ao Comex
                    ********************
                    """);
            System.out.println("""
                    ****************************************
                    Bem vindo ao Comex
                    ****************************************
                    """);
        }
            }

        }

