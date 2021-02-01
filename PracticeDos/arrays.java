import java.util.Scanner;

public class arrays
{
    public static void main (String args[])
    {
        int d = 0;
        int c = 0;
        int count = 0;
        int mostrar = 0;
        int opcion = 1;
        int option = 3;
        int totalD = 0;
        int totalC = 0;
        float[] debits = new float[15];
        float[] credits = new float[15];
        Scanner choice = new Scanner (System.in);

        while(option != 4)
        {
            System.out.println("Presione la opcion que desea realizar\n 1. Debito\n 2. Credito");
            opcion = choice.nextInt();

            if (opcion == 1)
            {
                System.out.println("Ingrese la cantidad que desea debitar:");
                float debito = choice.nextFloat();
                debits[d] = debito;
                d++;
            }

            if (opcion == 2)
            {
                System.out.println("Ingrese la cantidad que desea acreditar:");
                float credito = choice.nextFloat();
                credits[c] = credito;
                c++;
            }

            if (d == 10 && c == 5)
            {
                System.out.println("Desea relizar mas transacciones?\n 3. si\n 4. no");
                option = choice.nextInt();
            }

            if (d > 10 || c > 5)
            {
                System.out.println("Desea relizar mas transacciones?\n 3. si\n 4. no");
                option = choice.nextInt();                
            }
        }

        while(mostrar != 9){

            System.out.println("\n1. Total Debitado\n2. Total Acreditado\n3. Saldo\n4. Promedio Debitos\n5. Debito Mayor\n6. Cantidad de Ejecuciones\n7. Elementos de Arreglos\n8. Eliminar Creditos");
            mostrar = choice.nextInt();

            if (mostrar == 1)
            {
                for(int i = 0; i < debits.length; i++)
                {
                    totalD += debits[i];
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(totalD);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 2)
            {
                for(int j = 0; j < credits.length; j++)
                {
                    totalC += credits[j];
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(totalC);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 3)
            {
                totalC = 0;
                totalD = 0;
                for(int i = 0; i < debits.length; i++)
                {
                    totalD += debits[i];
                }
                for(int j = 0; j < credits.length; j++)
                {                                                                 
                    totalC += credits[j];
                }
                int saldo = totalC - totalD;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(saldo);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 4)
            {
                totalC = 0;
                totalD = 0;
                for(int i = 0; i < debits.length; i++)
                {
                    totalD += debits[i];
                    if (debits[i] != 0)
                    {
                        count++;
                    }
                }
                float promedioD = (totalD/count);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println(promedioD);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 5)
            {
                float mayor = debits[0];
                for(int i = 0; i < debits.length; i++)
                {
                    if (mayor < debits[i])
                    {
                        mayor =  debits[i];
                    }
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"); 
                System.out.println(mayor);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if(mostrar == 6)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Se realizaron " + d + " debitos");
                System.out.println("Se realizaron " + c + " creditos");
                int ejecuciones = d + c;
                System.out.println("Se realizaron " + ejecuciones + " ejecuciones en total");
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 7)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Los debitos realizados fueron: ");
                for(int k = 0; k < debits.length; k++)
                {
                    if(debits[k] != 0)
                    {
                    System.out.println(debits[k]);
                    }
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Los creditos realizados fueron: ");
                for(int p = 0; p < credits.length; p++)
                {
                    if(credits[p] != 0)
                    {
                    System.out.println(credits[p]);
                    }
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }

            if (mostrar == 8)
            {
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Ingrese el index para eliminar un credito: ");
                int eliminar = choice.nextInt();

                if (credits == null || eliminar >= credits.length || eliminar < 0)
                {
                    System.out.println("No se ha podido eliminar ninguna acreditacion");
                }

                float [] newCredits = new float[credits.length - 1];
                
                for (int m = 0, n = 0; m < credits.length; m++)
                {
                    if (m == eliminar)
                    {
                        continue;
                    }
                    newCredits[n++] = credits[m];
                }
                totalD = 0;
                totalC = 0;
                for(int i = 0; i < debits.length; i++)
                {
                    totalD += debits[i];
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Debitos: " + totalD);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                for(int j = 0; j < newCredits.length; j++)
                {
                    totalC += newCredits[j];
                }
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Acreditaciones: "+ totalC);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                totalC = 0;
                totalD = 0;
                for(int i = 0; i < debits.length; i++)
                {
                    totalD += debits[i];
                }
                for(int j = 0; j < newCredits.length; j++)
                {                                                                 
                    totalC += newCredits[j];
                }
                int saldo = totalC - totalD;
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("Nuevo saldo:"+ saldo);
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            }
        }
    }    
}