package PracticeCuatro;

import java.util.*;
import java.util.Scanner;

public class Lorem 
{
    
    public static void inOrder(int[] arr)
    {
        if (arr == null)
        {
            return;
        }
        int f = 0;
        int q = arr.length - 1;
        int cant;
        while(q > f)
        {
            cant = arr[q];
            arr[q] = arr[f];
            arr[f] = cant;
            q--;
            f++;
        }
    }

    public static String histograma(int numero)
    {
        String a = "*";
        for (int r = 0; r<= numero; r++)
        {
            a = a + "*";
        }
        return a;
    }

    public static void main(String args [])
    {
        String Uno = "Lorem ipsum dolor sit amet, nec ad dicat abhorreant intellegebat. Sit an tale inani honestatis. Eu elitr menandri lobortis per. Vis eu ferri oblique. Vocibus voluptatum scribentur ne cum, possim tibique mel et, sale modus errem has te. Eum numquam dignissim no, cum populo labores civibus no.";
        String Dos = "Nam liber alterum lobortis et, sea id clita definiebas, in sed postea volutpat scripserit. Ex ius vivendo tractatos, usu tota probo euismod id. Oblique rationibus interesset mei te. Sea te tota dissentiunt necessitatibus, vel recteque gloriatur ea, primis audiam dissentias eu qui.";
        String LoremIpsum;
        String par;

        System.out.println("Ingrese la cantidad de Parrafos que desea");
        Scanner cant = new Scanner(System.in);
        String parrafos = cant.nextLine();

        if (parrafos == "Uno")
        {
            LoremIpsum = Uno;
        }
        else
        {
            LoremIpsum = Uno.concat(Dos);
        }
    
        Ipsum[] each = new Ipsum[27];
        char caracter;
        int num = 0;

        for  (caracter = 'a'; caracter <= 'z'; caracter++)
        {
            int contador = 0;

            for (int i = 0; i < LoremIpsum.length(); i++)
            {
                if (Character.toLowerCase(LoremIpsum.charAt(i)) == caracter)
                {
                    contador ++;
                }
            }
            each[num] = new Ipsum(caracter, contador);
            num++;
        }
        
        int[] arreglo = new int[each.length];
        for (int m = 0; m < each.length; m++)
        {
            try 
            {
                arreglo[m] = each[m].cont;
            }
            catch(NullPointerException e)
            {
                continue;
            }
        }
        Arrays.sort(arreglo);
        inOrder(arreglo);  

        for (int d = 0; d < 10; d++)
        {
            for (int w = 0; w < each.length; w++)
            {
                try
                {
                    if(arreglo[d] == each[w].cont)
                    {
                        System.out.println(each[w].letra + " " + histograma(arreglo[d]));
                    }
                }
                catch (NullPointerException e)
                {
                    continue;
                }
            }
            
        }
    }
}
