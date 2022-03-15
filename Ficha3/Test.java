
public class Test {


    public static void testCirculo() {
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(2,4,6);
    
        c1.setX(10);
        c1.setY(30);
        c1.setRaio(6);

        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("c1 equals c2: " + c1.equals(c2));

        c1.alteraCentro(2,4);
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println("c1 equals c2: " + c1.equals(c2));   

        System.out.println("Area c1: " + c1.calculaArea());   
        System.out.println("Perimetro c1: " + c1.calculaPerimetro()); 


    }

    public static void testLinhaEncomenda() {
        LinhaEncomenda c1 = new LinhaEncomenda();
        LinhaEncomenda c2 = new LinhaEncomenda("001", "Arroz", 1.00, 2, 13, 8);
    }



}
