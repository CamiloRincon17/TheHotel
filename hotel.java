import java.util.*;
public class hotel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int habitacion = 5;
        int numHabitacion=0;
        int Name=0;
        String[] Users = new String[habitacion];
        int[] Habitaciones =new int[habitacion];
        double[] nightNumber =new double[habitacion];
        double Money = 50;
        int contador=0;
        int opcion=0;
        System.out.println("Hi there, welcome to my hotel");
        System.out.println("i'll show you my opcions");
        do {

            System.out.println("1: Hacer reserva");
            System.out.println("2: Disponibilidad");
            System.out.println("3: Cancelar reserva");
            System.out.println("4: Mostrar reservas");
            System.out.println("5: Salir del menu");
            opcion=in.nextInt();
            switch (opcion) {
                case 1:
                for (int i = 0; i < habitacion; i++) {

                    if(Habitaciones[i] == 0){
                        System.out.println("La habitacion "+(i+1)+" esta libre");
                       
                  
                    }
                    else{
                        System.out.println("la habitacion "+(i+1)+" esta ocupada");
                    }
                }

                System.out.println("Que habitacion quieres para la reserva");
                    Habitaciones[numHabitacion]=in.nextInt() -1;
                if(Habitaciones[numHabitacion]>6 || Habitaciones[numHabitacion]<0){
                    System.out.println("Habitacion invalida");
                    System.out.println("Ingrese nuevamente el numero de habitacion");
                    Habitaciones[numHabitacion]=in.nextInt() -1;

                }
                    if(Habitaciones[numHabitacion]>0 || Habitaciones[numHabitacion]<=5){
                    System.out.println("Ingrese su nombre");
                    in.nextLine();
                    Users[numHabitacion]=in.nextLine();
                    System.out.println("Cuantos dias se quedara en el Hotel");
                    nightNumber[numHabitacion]=in.nextInt();
                    System.out.println("Señor "+Users[numHabitacion]+" EL numero de su habitacion es "+Habitaciones[numHabitacion]+" el total ha pagar es "+((nightNumber[numHabitacion])*Money)+"");
                    System.out.println("Confirme si esta todo bien");
                    System.out.println("ingrese si o no");
                    String confirmar="";
            
                 }
                


                break;
                case 2:
                for (int i = 0; i < habitacion; i++) {
                    
                
                if(Habitaciones[i] == 0){
                    System.out.println("la habitacion "+(i+1)+" esta libre");                   
              
                }
                else{
                    System.out.println("la habitacion "+(i+1)+" esta ocupada");
                }
                }

                    break;
                case 3:
                System.out.println("que reserva quiere cancelar");
                for (int i = 0; i < habitacion; i++) {
                    if (Habitaciones[i]!=0) {
                    System.out.println("La habitacion "+Habitaciones[i]+" es de "+Users[i]+ "y va estar "+nightNumber[i]);
                    }
                    else{
                        System.out.println();
                    }
                }
                    
                    break;
                case 4:
                for (int i = 0; i < habitacion; i++) {
                    
                        if (Habitaciones[i]!=0) {
                        System.out.println("La habitacion "+Habitaciones[i]+" es de "+Users[i]+ "y va estar "+nightNumber[i]);
                        }
                        else{
                            System.out.println();
                        }
                    }
            
                
                    
                    break;
                case 5:
                    
                    break;
            }
            
        } while (opcion!=5);

        
    }
}