public class Guitar implements Tool{
    boolean el;
    int skokostrun;
    Guitar(boolean el, int skokostrun){
        this.el = el;
        this.skokostrun = skokostrun;
    }
    @Override
    public void play() {
        if(el == true)
            System.out.println("Играет электрогитара у неё "+ skokostrun + " струн");
        else
            System.out.println("Играет гитара у неё "+ skokostrun + " струн");
    }
}
