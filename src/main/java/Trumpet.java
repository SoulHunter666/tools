public class Trumpet implements  Tool{
    double diameter;
    Trumpet(double diameter){
        this.diameter = diameter;
    }
    @Override
    public void play() {
        System.out.println("Играет труба с диметром "+diameter);
    }
}
