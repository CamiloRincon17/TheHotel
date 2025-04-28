import java.util.*;
public class hotel{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int habitacion = 5;
        String[] Users = new String[habitacion];
        int[] Habitaciones =new int[habitacion];
        double[] nightNumber =new double[habitacion];
        boolean[] habitacionOcupadas = new boolean[habitacion];
        double Money = 50;
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
                        System.out.println("La habitacion "+(i+1)+(habitacionOcupadas[i] ? " Ocupada" : " Libre"));
                       
                  
                    }
                }

                System.out.println("Que habitacion quieres para la reserva del (1- 5):");
                    int numHabitacion=in.nextInt() -1 ;
                if(numHabitacion>=5 || numHabitacion<0 ){
                        System.out.println("Habitacion invalida");
                        break;     
                }
                if(Habitaciones[numHabitacion]!=0){
                    System.out.println("Habitacion ya ocupada");
                    break;
                }
           
                    if(Habitaciones[numHabitacion]>0 || Habitaciones[numHabitacion]<=5){

                    System.out.println("Ingrese su nombre");
                    in.nextLine();
                    String NombrePersona=in.nextLine();
                    System.out.println("Cuantos dias se quedara en el Hotel");
                   int DiasStay=in.nextInt();
               
                    System.out.println("\nResumen de reserva:");
                    System.out.println("Habitación: " + (numHabitacion+1));
                    System.out.println("Cliente: " + NombrePersona);
                    System.out.println("Noches: " + DiasStay);
                    System.out.println("Confirme si esta todo bien");
                    System.out.println("ingrese si o no");
                    in.nextLine();
                    String confirmar = in.nextLine().toLowerCase();

                if(confirmar.equals("si")){
                    System.out.println("Gracias por su reserva señor"+NombrePersona);
                    Users[numHabitacion]=NombrePersona;
                    Habitaciones[numHabitacion]= numHabitacion;
                    nightNumber[numHabitacion]= DiasStay;
                    habitacionOcupadas[numHabitacion]=true;


                }else{
                    System.out.println("Cancelacion de reserva");
                    break;
                }
            
                 }
                


                break;
                case 2:
                for (int i = 0; i < habitacion; i++) {
                    
                
                if(Habitaciones[i] == 0){
                    System.out.println("La habitacion "+(i+1)+(habitacionOcupadas[i] ? " Ocupada" : " Libre"));
              
                }
               
                }

                    break;
                case 3:
                boolean HayReserva = false;
                for(String Cliente : Users){
                    if(Cliente!= null){
                        HayReserva= true;
                        break;
                    }
                    
                    }
                if(!HayReserva){
                        System.out.println(" No Hay Reservas para cancelar");
                        break;
                }
                System.out.println("Las Reservas que hay son :");
                for (int i = 0; i < habitacion; i++) {
                    if (Users[i]!=null) {
                        System.out.println("La habitacion "+(Habitaciones[i]+1)+" es de "+Users[i]+ "y va estar "+nightNumber[i]+" Noches");
                        System.out.println("Que reserva quieres cancelar");
                         numHabitacion=in.nextInt() -1;
                    if(numHabitacion<=0 || numHabitacion>=5){
                        System.out.println("Numero de habitacion equivocado");
                        break;
                    }
                    if(!habitacionOcupadas[numHabitacion]){
                        System.out.println("la habitacion que acaba de ingresar no esta Ocupada");
                        break;
                    }
                    if (habitacionOcupadas[numHabitacion]){
                        nightNumber[numHabitacion] = 0;
                        Users[numHabitacion] = null;
                        habitacionOcupadas[numHabitacion]=false;
                        Habitaciones[numHabitacion]=0;
                    }
                    }
                   
                }
                    
                    break;
                case 4:
                for (int i = 0; i < habitacion; i++) {
                    
                        if (habitacionOcupadas[i]) {
                        System.out.println("La habitacion "+((Habitaciones[i])+1)+" es de "+Users[i]+ "y va estar "+nightNumber[i]);
                        }
                        else{
                            System.out.println("No se han hecho Reservas");
                            break;
                        }
                    }
            
                
                    
                    break;
                case 5:
                System.out.println("Saliendo del sistema ......");
                    
                    break;
                    default:
                    System.out.println("Opcion invalida");
            }
            
        } while (opcion!=5);

        
    }
}