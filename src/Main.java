public class Main {
    public static void main(String[] args) {
        Carro car1=new Carro();
        Carro car2=new Carro("Fiat", "Sedan", "Cinza", "ABC123");

//        car1.cor="Prata";
//        car1.marca="Fiat";
//        car1.modelo="Sedan";
//        car1.placa="ABC123";
//
//        System.out.println(car1.cor);
//        System.out.println(car1.marca);
//        System.out.println(car1.modelo);
//        System.out.println(car1.placa);


//        System.out.println(car1.getMarca());
//        System.out.println(car1.getModelo());
//        System.out.println(car1.getCor());
//        System.out.println(car1.getPlaca());
//
//        System.out.println(car2.getMarca());
//        System.out.println(car2.getModelo());
//        System.out.println(car2.getCor());
//        System.out.println(car2.getPlaca());
        car1.printCar();
        car2.printCar();
    }

}