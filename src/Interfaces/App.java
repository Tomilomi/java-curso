package Interfaces;

public class App {
    public static void main(String[] args) throws Exception{
       
        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Gonzales", 8);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();
        System.out.println("============================");
        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();












    }
}
