package RepositorioParaGitHub;

import java.util.ArrayList;
import java.util.Scanner;

public class GestorTareas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tareas = new ArrayList<>();
        boolean salir = false;

        while (!salir){
            System.out.println("\n---DESPLIEGUE MENÚ---");
            System.out.println("1. Añadir tarea" + "\n2. Mostrar tareas" + "\n3. Eliminar tarea" + "\n4. Salir");
            System.out.println("Ingrese el número de tarea que quiere realizar");
            int tarea = sc.nextInt();
            sc.nextLine();

            switch (tarea){
                case 1:
                    System.out.println("Añada la tarea que desee");
                    tareas.add(sc.nextLine());
                    System.out.println("Tarea añadida correctamente");
                    break;
                case 2:
                    if (tareas.isEmpty()){
                        System.out.println("No hay tareas en la lista");
                    } else{
                        System.out.println("-----LISTA DE TAREAS----");
                        for (int i = 0; i < tareas.size(); i++){
                            System.out.println("Tarea número " + (i+1) + ": " + tareas.get(i));
                        }
                    }
                    break;
                case 3:
                    System.out.println("Dime el número de la tarea que desea eliminar");
                    int num = sc.nextInt();
                    sc.nextLine();
                    if ( num < 1 || num > tareas.size()){
                        System.out.println("Error al introducir valor. El valor debe de ser un número de la lista de tareas");
                    } else {
                        tareas.remove(num-1);
                        System.out.println("La tarea ha sido eliminada");
                    }
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Ha ocurrido un error");
            }
        }
    }


}
