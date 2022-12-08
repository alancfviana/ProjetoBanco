package ada.viana.banco;

import ada.viana.banco.model.Pessoa;
import ada.viana.banco.utils.LerTeclado;


import java.time.LocalDate;
import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
        System.out.println("Bem vindo ao banco Ada.");
        //LerTeclado teclado = new LerTeclado();
        int numero = LerTeclado.getNumero();
        Pessoa pessoa1 = new Pessoa("Bruno", "12345678922",LocalDate.parse("2002-03-11"));
        //Pessoa pessoa2 = new Pessoa("Eduardo", "000000000000", "2002", "11968399600");
        System.out.println("O nome da pessoa1 é " + pessoa1.getnome());
        System.out.println("O cpf da pessoa1 é " + pessoa1.getcpf());
        System.out.println("O dataNascimento da pessoa1 é " + pessoa1.getDataNascimento());
        System.out.println("O telefone da pessoa1 é " + pessoa1.gettelefone());

//        System.out.println("O nome da pessoa2 é " + pessoa2.getnome());
//        System.out.println("O cpf da pessoa2 é " + pessoa2.getcpf());
//        System.out.println("O dataNascimento da pessoa2 é " + pessoa2.getDataNascimento());
//        System.out.println("O telefone da pessoa2 é " + pessoa2.gettelefone());

        System.out.println(pessoa1.toString());
        //System.out.println(pessoa2.toString());
    }



    public static String getNome() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome da pessoa");
        return scan.next();
    }
}
