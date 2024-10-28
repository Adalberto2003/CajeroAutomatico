import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
        Implementacion cajeroOperaciones = new Implementacion();
        
        
        System.out.println("Hola Mundo");
        System.out.println("Se feliz");
        System.out.println("Copyrigth @2017");
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        
        int numCuenta, opcion = 0 ;

        Scanner lectura = null;
       do {
    	   
    	   System.out.println("MENU BANCOMER BIENVENIDO");
           System.out.println("1. Alta cliente");
           System.out.println("2. Consultar saldo");
           System.out.println("3. Deposito en efectivo");
           System.out.println("4. Retiro en efectivo");
           System.out.println("5. Salir");

           try {
               System.out.print("Seleccione una opción: ");
               lectura = new Scanner(System.in);
               opcion = lectura.nextInt();

               switch (opcion) {
                   case 1:
                       try {
                           System.out.print("Ingrese el número de cuenta: ");
                           lectura = new Scanner(System.in);
                          numCuenta = lectura.nextInt();
                           cajeroOperaciones.altaCliente(numCuenta);
                       } catch (Exception e) {
                           System.out.println("Error: Debe ingresar un número entero válido para el número de cuenta.");
                           scanner.next(); // Limpiar el buffer del escáner
                       }
                       break;

                   case 2:
                       System.out.print("Ingrese el número de cuenta: ");
                       lectura = new Scanner(System.in);
                       numCuenta = lectura.nextInt();
                       cajeroOperaciones.consultarSaldo(numCuenta);
                       break;

                   case 3:
                       System.out.print("Ingrese el número de cuenta: ");
                       lectura = new Scanner(System.in);
                       numCuenta = lectura.nextInt();
                       System.out.print("Ingrese el monto a depositar: ");
                       double deposito = scanner.nextDouble();
                       cajeroOperaciones.deposito(numCuenta, deposito);
                       break;

                   case 4:
                       System.out.print("Ingrese el número de cuenta: ");
                       lectura = new Scanner(System.in);
                       numCuenta = lectura.nextInt();
                       System.out.print("Ingrese el monto a retirar: ");
                       double retiro = scanner.nextDouble();
                       cajeroOperaciones.retiro(numCuenta, retiro);
                       break;

                   case 5:
                       System.out.println("Gracias por usar el cajero. ¡Hasta luego!");
                       salir = true;
                       break;

                   default:
                       System.out.println("Opción no válida. Intente de nuevo.");
               }
           } catch (Exception e) {
               System.out.println("Error: Entrada no válida. Intente de nuevo.");
              
           }
       }while(opcion !=5);
	}

      
            
      
    }

