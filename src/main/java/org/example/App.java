package org.example;

import java.util.Scanner;
import java.util.logging.Logger;

public class App
{
    private static final Logger LOGGER= Logger.getLogger(App.class.getName());
    public static void main( String[] args )
    {
        CustomList<Integer> newList = new CustomList<Integer>();
        Scanner sc = new Scanner(System.in);
        LOGGER.info("Enter Size : ");
        int n;
        n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            newList.add(sc.nextInt());
        }
        newList.display();
        LOGGER.info("Enter index you want to remove :");
        newList.remove(sc.nextInt());
        newList.display();
        LOGGER.info("Enter number you want to add :");
        newList.add(sc.nextInt());
        newList.display();
        System.out.println(newList.get(3));
        newList.display();
    }
}
