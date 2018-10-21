package com.company;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        String inp, sp[];
        while(true)
        {
            System.out.println("Type a sentence and press Enter!");
            inp = kb.nextLine();
            inp = (inp + "X").toUpperCase();

            sp=inp.split("S\\s*A");
            if(inp.equals("EXITX"))
            {
                break;
            }

            if(sp.length==2)
            {
                System.out.println("There is one occurrence.\n");
            }
            else
            {
                System.out.println("There are " + (sp.length-1) + " occurrences.\n" );
            }
        }

        System.out.println("Finished!");
    }
}
