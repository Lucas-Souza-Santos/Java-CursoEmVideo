public class App {

    public static void main(String[] args) throws Exception {
    
        Caneta c1 = new Caneta();

        c1.modelo = "BIC-CRISTAL";
        c1.cor = "Azul";
        c1.carga = 80;
        c1.status();
        System.out.println(c1.modelo);


        
    }
}
