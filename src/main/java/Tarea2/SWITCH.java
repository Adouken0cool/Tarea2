package Tarea2;

public class SWITCH {
    public static void main(String[] args) {
        var ESTACION = "OTOÑO";

        switch (ESTACION){
            case "VERANO":
                System.out.println("Es Verano");
                break;
            case "INVIERNO":
                System.out.println("Es Invierno");
                break;
            case "OTOÑO":
                System.out.println("Es Otoño");
                break;
           case "PRIMAVERA":
              System.out.println("Es Primavera");
                break;
            default:
                System.out.println("ESTA NO ES UNA ESTACION");

        }
    }
}
