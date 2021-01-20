public class Caneta
{
    public String modelo;
    public String cor; 
    private float ponta;
    protected int carga;
    protected boolean tampada;

    void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }


    public void escrever()
    {
        System.out.println("Escrevendo...");
    }
    public void rabiscar()
    {
        if(this.tampada == true){
            System.out.println("Caneta Tampada");
        }
        else{
            System.out.println("Caneta destampada!");
        }
    }
    public void pintar()
    {
        System.out.println("Pintando...");
    }
    private void tampar()
    {
        this.tampada = true;
    }
    private void destampar()
    {
        this.tampada = false;
    }
}