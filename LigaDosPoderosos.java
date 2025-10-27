package LigaDosHerois;

import java.util.Scanner;

public class LigaDosPoderosos {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Cadastro de super heroi");
       System.out.print("nome: ");

       String nm = sc.nextLine();
       System.out.print("idade: ");

       int idd = Integer.parseInt(sc.nextLine());
       System.out.print("super poder: ");
       String sp = sc.nextLine();

       System.out.print("nivel de poder 1 a 100: ");
       int np = Integer.parseInt(sc.nextLine());

       System.out.print("rua: ");
       String rua = sc.nextLine();

       System.out.print("cidade: ");
       String cidade = sc.nextLine();

       System.out.print("país: ");
       String pais = sc.nextLine();

       Endereco ed = new Endereco(rua, cidade, pais);
       SuperHeroi sh = new SuperHeroi(nm, idd, sp, np, ed);
       System.out.println("\nInformaçoes informadas:");
       sh.exibirDados();
       System.out.println("\nCadastro do lider da liga");
       System.out.print("nome: ");
       String nmL = sc.nextLine();

       System.out.print("idade: ");
       int iddL = Integer.parseInt(sc.nextLine());

       System.out.print("super oder: ");
       String spL = sc.nextLine();

       System.out.print("nivel de poder 1 a 100: ");
       int npL = Integer.parseInt(sc.nextLine());

       System.out.print("tempo de liderança em anos: ");
       int tl = Integer.parseInt(sc.nextLine());

       System.out.print("rua: ");
       String ruaL = sc.nextLine();

       System.out.print("cidade: ");
       String cidadeL = sc.nextLine();

       System.out.print("país: ");
       String paisL = sc.nextLine();

       Endereco edL = new Endereco(ruaL, cidadeL, paisL);
       Lider ld = new Lider(nmL, iddL, spL, npL, edL, tl);
       System.out.println("\nApresentar informações informadas");
       ld.exibirDados();
       ld.liderar();
       sc.close();
   }
}

