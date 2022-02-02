import java.util.*;

public class Practica2{

static double[] Eliminar(double[] arr, int remove){
    arr[remove-1] = 0;
    return arr;
}

public static void main(String args[]){
    Scanner input = new Scanner (System.in);
    double[] creditos = new double[15];
    double[] debitos = new double[15];
    int counterC = 0;
    int counterD = 0;
    double sumaC = 0;
    double sumaD = 0;
    double saldo = 0;
    double promedioD = 0;
    double max = 0;

    
    boolean condition = true;
        while (condition == true) {
            System.out.print ("\n \n Si desea ingresar un:\n Credito ingrese :1 \n Debito ingrese :2 \n para remover un Credito :3 \n Y para salir 4 pero solo si ingreso un minimo de 10 creditos y 5 debitos: ");
            int dec = input.nextInt();
        
            switch (dec) {
                case 1:
                    System.out.print ("\n Ingrese un Credito: ");
                    double cred = input.nextInt();
                    creditos[counterC] = cred;
                    System.out.print (creditos[counterC]);
                    counterC++;
                    System.out.print ("\n Creditos ingresados: " + counterC);
                    break;

                case 2:
                    System.out.print ("\n Ingrese un Debito: ");
                    double deb = input.nextInt();
                    debitos[counterD] = deb;
                    System.out.print (debitos[counterD]);
                    counterD++;
                    System.out.print ("\n Debitos ingresados: " +counterD);
                    break;
            
                case 3: 
                    System.out.print("Que valor desea remover? ");
                    int elim = input.nextInt();
                    creditos = Eliminar(creditos, elim);

                case 4: 
                    if (counterC < 4 && counterD < 9){
                        condition = true;
                        break;
                    }
                    else if (counterC >= 4 && counterD >=9) {
                        condition = false;
                    }
            }
        }
        for (int a = 0; a < creditos.length; a++){
            sumaC += creditos[a];
            sumaD += debitos[a];

        }
        System.out.print ("\n La suma de los Creditos: "+ sumaC);
        System.out.print ("\n La suma de los Debitos: "+ sumaD);
        saldo = sumaD + sumaC;
        System.out.print ("\n Saldo total: " + saldo);

        
        promedioD = sumaD / counterD;
        System.out.print ("\n Promedio de Debito: " + promedioD);

        for (int b = 0; b < debitos.length; b++){
            if (max < debitos[b]){
                max = debitos[b];
            }
        }
        System.out.print ("\n Mayor monto de debito: " + max);

        System.out.print ("\n Cantidad total de Creditos: " + counterC);
        System.out.print ("\n Cantidad total de Debitos: " + counterD);

        for (int c = 0; c < debitos.length; c++){
            int lugar =0;
            lugar = c + 1;
            System.out.print ("\n Credito " + lugar + ": " + creditos[c]);
            System.out.print ("\n Debito " + lugar + ": " + debitos[c]);
        }

    }
}