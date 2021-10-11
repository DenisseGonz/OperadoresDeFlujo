package com.generation;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {

        //Estructura if
        Scanner sc = new Scanner(System.in);
        //System.out.println("Ingresa tu edad");
        //int edad = sc.nextInt();
        //System.out.println("Ingresa tu nombre");
        //sc.nextLine();
        //String nombre = sc.nextLine();

        //if(edad>18){
            //System.out.println("Felicidades "+ nombre +", puedes votar");
        //}else{
            //System.out.println("Lo siento "+ nombre +", Aún no puedes votar");
        //}

        /*
        Solicitar al usuario 3 ángulos de un triangulo y determinar si el triangulo es válido
        */
        /*System.out.println("Ingresa el primer ángulo");
        int angulo1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el segundo ángulo");
        int angulo2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa el tercer ángulo");
        int angulo3 = sc.nextInt();
        sc.nextLine();
        if(angulo1==0||angulo2==0||angulo3==0){
            System.out.println("No se puede realizar la operación, uno de los ángulos es cero y no hay triangulos con un angulo interno igual a cero");
        }else {
            int axioma1 = angulo1 + angulo2 + angulo3;
            if (axioma1 == 180) {
                System.out.println("Tu triangulo es válido");
            } else {
                System.out.println("Las medidas de los angulos no son de un triangulo");
            }
        }*/
        //Pedir un año al usuario por consola, y determinar si el
        //            año es bisiesto.
        /*
        System.out.println("Ingresa un año");
        int anio=sc.nextInt();
        sc.nextLine();
        int primerFiltro=anio%4;
        int segundoFiltro=anio%100;
        int tercerFiltro=anio%400;
        if(primerFiltro==0){
            if(segundoFiltro==0&&tercerFiltro==0){
                System.out.println("El año es bisiesto");
            }else{
                System.out.println("No es necesariamente un año bisiesto");
            }
        }else{
            System.out.println("No es año bisiesto");
        }*/
        //control de flujo switch
        /*switch(condicion){
            case 1:
                codigo;
            break;
            case 2:
                codigo;
            break;
            default:
                codigo;
            break;
        }*/
        /*System.out.println("Ingresa un número");
        int num1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingresa otro número");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Selecciona una operación: \n 1)Suma \n 2)Resta \n 3)Multiplicación \n 4)División");
        int index = sc.nextInt();
        sc.nextLine();
        float resul = 0;
        switch(index){
            case 1:
                resul=num1+num2;
                System.out.println("Escogiste la suma de "+num1+" y "+num2);
                System.out.println("El resultado es: "+resul);
            break;
            case 2:
                resul=num1-num2;
                System.out.println("Escogiste la resta de "+num1+" y "+num2);
                System.out.println("El resultado es: "+resul);
            break;
            case 3:
                resul=num1*num2;
                System.out.println("Escogiste la multiplicación de "+num1+" y "+num2);
                System.out.println("El resultado es: "+resul);
            break;
            case 4:
                if(num2==0){
                    System.out.println("No se puede realizar la operación porque no se puede dividir por cero");
                }else{
                    resul= (float) num1 / num2;
                    System.out.println("Escogiste la división de "+num1+" y "+num2);
                    System.out.println("El resultado es: "+resul);
                }
            break;
            default:
                System.out.println("No escogiste bien el número");
            break;
        }*/
        // Pedir un número al usuario y dependiendo la respuesta
        // mostrar un dia de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sabado
        // Si elige un numero fuera de ese rango mostar un mensaje de error;

        System.out.println("Buenos días alegrííííía");
        System.out.println("Escoge un número del 1 al 7 para mostrarte un día de la semana");
        int index = sc.nextInt();
        switch (index){
            case 1:
                System.out.println("Hoy es Lunes");
            break;
            case 2:
                System.out.println("Mañana es Martes");
            break;
            case 3:
                System.out.println("Pasado mañana es Miercoles");
            break;
            case 4:
                System.out.println("Pasado, pasado mañana es Jueves");
            break;
            case 5:
                System.out.println("Hace unos días fue Viernes");
            break;
            case 6:
                System.out.println("Anteayer fue Sábado");
            break;
            case 7:
                System.out.println("Ayer fue Domingo");
            break;
            default:
                System.out.println("Error 404: Hola, soy un día imaginario.");
            break;
        }
    }
}
