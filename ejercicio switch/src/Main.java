public class Main {
    public static void main(String[] args) {
        var estacion = "invierno";

        switch (estacion){
            case "verano":
                System.out.println("Es verano");
                break;
            case "invierno":
                System.out.println("Es invierno");
                break;
            case "otoño":
                System.out.println("Es otoño");
                break;
            case "primavera":
                System.out.println("Es primavera");
                break;
            default:
                System.out.println("no ha introducido una de las estaciones");
        }
    }
}