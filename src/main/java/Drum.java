public class Drum implements Tool{
    double size;
    Drum(double size){
        this.size = size;
    }
    @Override
    public void play() {
        System.out.println("Играет барабан с размером "+ size);
    }
}
