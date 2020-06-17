
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        //Declarando al programa que usare un objeto tipo tarjeta
        Tarjetas tarjeta;

        Scanner dato = new Scanner(System.in);
        int nCuenta, nip, opcion;

        System.out.print("Número de Cuenta: ");
        nCuenta = dato.nextInt();

        System.out.print("Nip: ");
        nip = dato.nextInt();

        //Instanciando llamo al metodo verificarCuenta
        tarjeta = new Tarjetas().verificarCuenta(nCuenta, nip);

        do {

            System.out.println("Elegir una opción de Menu.\n");
            System.out.println("\t\t 1.-Hacer un deposito. ");
            System.out.println("\t\t 2.-Hacer un Retiro. ");
            if (tarjeta.apartado > 0 ){
            System.out.println("\t\t 3.-Eliminar apartado ");
            }else{            
            System.out.println("\t\t 3.Crear apartado. ");
            }
            System.out.println("\t\t 4.-Imprimir datos de la cuenta ");
            System.out.println("\t\t 5.-Salir.\n");
            System.out.print("Elija una opción: ");

            opcion = dato.nextInt();

            switch (opcion) {

                case 1:
                    //double deposito;
                    System.out.print("Ingrese la cantidad que desea depositar: ");
                    //deposito = dato.nextDouble();
                    //tarjeta.depositar(deposito);
                    tarjeta.depositar(dato.nextDouble());
                    break;
                case 2:
                    double retiro;
                    System.out.print("Ingrese la cantidad que deseas retirar: ");
                    retiro = dato.nextDouble();
                    tarjeta.retirar(retiro);
                    break;
                case 3:
                    if (tarjeta.apartado > 0 ){
                        tarjeta.eliminarApartado();
                        System.out.println("Eliminando apartado...");
                    }else {
                        System.out.print("Ingrese la Cantidad que desea apartar: ");
                        tarjeta.crearApartado(dato.nextDouble());
                    }
                    break;
                case 4:
                    System.out.println(tarjeta.toString());
                    break;
                case 5:
                    System.out.println("Asigne la cantidad que desea apartar: ");
                    tarjeta.crearApartado(dato.nextDouble());
                    break;
                
            }

        } while (opcion != 5);
    }

}

/*
Si se dan cuenta el método solo hizo la accion y no imprimio nada 
Lo que si es que en el modelo vista controlador 
Existe una clase que se usa como intermediaria 
y esa si podrá " imprimir " todo lo que quieran 
 */
