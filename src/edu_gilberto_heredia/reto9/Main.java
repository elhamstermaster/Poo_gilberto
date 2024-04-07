package edu_gilberto_heredia.reto9;

import edu_gilberto_heredia.reto9.ui.CLI;


public class Main {
    public static void main(String[] args) {
        try{
            CLI.launchApp();
        }catch (Exception e ){
            System.out.println("Error etc" +e);
        }
    }
}
