class Pen{
    String colour;
    String Type ;

    public void write(){
        System.out.println("writing");
    }

    public void printColour(){
        System.out.println(this.colour);
    }
}


public class OOPS {
    public static void main(String[] args) {
            Pen pen1= new Pen();
            pen1.colour="Red";
            pen1.Type="ballpen";
            pen1.write();

        Pen pen2= new Pen();
        pen2.colour="Black";
        pen1.Type="ballpen";
        pen1.printColour();
        pen2.printColour();
    }

}
