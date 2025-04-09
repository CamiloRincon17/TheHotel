import java.util.*;
public class hotel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int habitacion = 0;
        int Name=0;
        String[] Users = new String[5];
        int[] Habitaciones =new int[5];
        int nightNumber = 0;
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
                for (int i = 0; i < Habitaciones.length; i++) {

                    if(Habitaciones[habitacion] == 0){
                        System.out.println("La habitacion 10"+(i+1)+" esta libre");
                       
                  
                    }
                    else{
                        System.out.println("la habitacion 10"+(i+1)+" esta ocupada");
                    }
                }
                System.out.println("Que habitacion quieres para la reserva");
                Habitaciones[habitacion]=in.nextInt();
                System.out.println("Cual es tu nombre");
                in.nextLine();
                Users[habitacion]=in.nextLine();
                System.out.println("señor "+ Users[habitacion]+" su habitacion es "+Habitaciones[habitacion]);
                Habitaciones[habitacion]=-1;

                    break;
                case 2:
                for (int i = 0; i < Habitaciones.length; i++) {
                    
                
                if(Habitaciones[i] == 0){
                    System.out.println("La habitacion 10"+(i+1)+" esta libre");
                   
              
                }
                else{
                    System.out.println("la habitacion 10"+(i+1)+" esta ocupada");
                }
            }
            Habitaciones[habitacion]=-1;

                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
            }
            
        } while (opcion!=5);

        
    }
}