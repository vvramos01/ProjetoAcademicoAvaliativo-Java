package LigaDosHerois;

class Lider extends SuperHeroi {
   private int tl; // tempo de liderança em anos
   public Lider() { // construtor
       super();
   }
   public Lider(String nm, int idd, String sp, int np, Endereco ed, int tl) {
       super(nm, idd, sp, np, ed);
       this.tl = tl;
   }
   public int getTl() { return tl; }
   public void setTl(int tl) { this.tl = tl; }
   public void liderar() {
       System.out.println(nm + " esta liderando a equipe com sabedoria");
   }
   @Override
   public void exibirDados() {
       System.out.println("sobrescrita de método");
       System.out.println("informaçoes do lider");
       System.out.println("nome: " + nm);
       System.out.println("idade: " + idd);
       System.out.println("super poder: " + sp);
       System.out.println("nivel de ppder: " + np);
       System.out.println("endereço: " + ed.exibirEndereco());
       System.out.println("tempo de liderança: " + tl + " anos");
   }
}
