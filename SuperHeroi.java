package LigaDosHerois;

class SuperHeroi {
   protected String nm;
   protected int idd;
   protected String sp;
   protected int np;
   protected Endereco ed;
   public SuperHeroi() {
   }
   public SuperHeroi(String nm, int idd, String sp, int np, Endereco ed) {
       this.nm = nm;
       this.idd = idd;
       this.sp = sp;
       this.np = np;
       this.ed = ed;
   }
   public String getNm() { return nm; }
   public void setNm(String nm) { this.nm = nm; }

   public int getIdd() { return idd; }
   public void setIdd(int idd) { this.idd = idd; }

   public String getSp() { return sp; }
   public void setSp(String sp) { this.sp = sp; }

   public int getNp() { return np; }
   public void setNp(int np) { this.np = np; }

   public Endereco getEd() { return ed; }
   public void setEd(Endereco ed) { this.ed = ed; }

   public void exibirDados() {
       System.out.println("dados do superheroi");
       System.out.println("nome: " + nm);
       System.out.println("idade: " + idd);
       System.out.println("super poder: " + sp);
       System.out.println("nivel de poder: " + np);
       System.out.println("endereço: " + ed.exibirEndereco());
   }
}

