/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bases;

import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


/*
 *
 * @author Alejandra
 */
public class Bases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic her

        Scanner sc = new Scanner(System.in);//Capturar el dato desde la pantalla de tipo string
        Scanner tecladoLine = new Scanner(System.in);////Capturar el dato sin espacios
        Persona p = new Persona();//creo una nueva persona

        //Declaro las varibles locales que voy a utilizar para insertar los registros
        String identificador = "";
        String cedula = "";
        String nombre = "";
        String dia_nacimiento = "";
        String mes_nacimiento = "";
        String anio_nacimiento = "";
        String ganancia_anual = "";

// Realizo  el menú y submenu ,con switch y case.
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n\n***************** MENU ********************");
            System.out.println("[1] ARCHIVO LONGITUD VARIABLE");
            System.out.println("[2] ARCHIVO LONGITUD FIJA");
            System.out.println("[3] ARCHIVO TIPO TEXTO");

            System.out.println("*******************************************");

            System.out.print("Digite la opción: ");

            opcion = sc.nextInt();
            switch (opcion) {

                case 1:
                    System.out.println("***************** SUBMENU **************\n"
                            + "1.INSERTAR REGISTRO\n"
                            + "2.ELIMINAR REGISTRO \n"
                            + "3.ACTUALIZAR REGISTRO \n"
                            + "4.LISTAR REGISTRO \n"
                            + "5.BUSCAR REGISTRO \n"
                            + "6.IR A UN REGISTRO \n"
                            + "7.IMPORTAR ARCHIVO \n"
                            + "8.EXPORTAR ARCHIVO \n"
                    );
                    System.out.println("***************************************");

                    System.out.print("Digite la opción:");
                    break;
                case 2:
                    System.out.println("***************** SUBMENU **************\n"
                            + "1.INSERTAR REGISTRO\n"
                            + "2.ELIMINAR REGISTRO \n"
                            + "3.ACTUALIZAR REGISTRO \n"
                            + "4.LISTAR REGISTRO \n"
                            + "5.BUSCAR REGISTRO \n"
                            + "6.IR A UN REGISTRO \n"
                            + "7.IMPORTAR ARCHIVO \n"
                            + "8.EXPORTAR ARCHIVO \n"
                    );
                    System.out.println("****************************************");

                    System.out.print("Digite la opción:");
                    break;

                case 3:
                    System.out.println("***************** SUBMENU **************\n"
                            + "1.INSERTAR REGISTRO\n"
                            + "2.ELIMINAR REGISTRO \n"
                            + "3.LISTAR REGISTRO \n"
                            + "4.ACTUALIZAR REGISTRO \n"
                            + "5.BUSCAR REGISTRO \n"
                            + "6.IR A UN REGISTRO \n"
                            + "7.IMPORTAR ARCHIVO \n"
                            + "8.EXPORTAR ARCHIVO \n"
                    );
                    System.out.println("****************************************");

                    System.out.print("Digite la opción:");

                    opcion = sc.nextInt();
                    switch (opcion) {

                        case 1://INSERTARMOS LOS REGISTROS

                            System.out.print("Digite el identificador: ");
                            identificador = sc.next();
                            p.setIdentificador(identificador);
                            System.out.print("Digite la cedula: ");
                            cedula = sc.next();
                            p.setCedula(cedula);
                            System.out.print("Digite el nombre: ");
                            nombre = tecladoLine.nextLine();//Lee una cadena hasta el final de la linea
                            p.setNombre(nombre);
                            System.out.print("Digite el dia_nacimiento: ");
                            dia_nacimiento = sc.next();
                            p.setDia_nacimiento(dia_nacimiento);
                            System.out.print("Digite el mes_nacimiento: ");
                            mes_nacimiento = sc.next();
                            p.setMes_nacimiento(mes_nacimiento);
                            System.out.print("Digite el año_nacimiento: ");
                            anio_nacimiento = sc.next();
                            p.setAno_nacimiento(anio_nacimiento);
                            System.out.print("Digite la ganancia_anual:");
                            ganancia_anual = sc.next();
                            p.setGanancia_anual(ganancia_anual);

                            //Abro stream, crea el fichero si no existe 
                            File TextFile = new File("D:\\Base_Datosc.txt");
                            FileWriter TextOut = new FileWriter(TextFile, true);

                            //Escribimos en el fichero un String 
                            TextOut.write("\r\n");
                            TextOut.write("\r\n" + p.getIdentificador());
                            TextOut.write("|");
                            TextOut.write(p.getCedula());
                            TextOut.write("|");
                            TextOut.write(p.getNombre());
                            TextOut.write("|");
                            TextOut.write(p.getDia_nacimiento());
                            TextOut.write("|");
                            TextOut.write(p.getMes_nacimiento());
                            TextOut.write("|");
                            TextOut.write(p.getAno_nacimiento());
                            TextOut.write("|");
                            TextOut.write(p.getGanancia_anual());
                            TextOut.write("\n");

                            TextOut.close();

                            System.out.println("Registros guardados \n");
                            break;

                        case 2://ELIMINAR REGISTROS
                            System.out.println("INGRESE DATO A ELIMINAR");
                            String dat = sc.next();
                            System.out.print("Dato eliminado \n");
                            break;

                        case 3:
                            System.out.println("LISTAR DATOS");
                            // Abrir fichero
                            //BufferedReader bf = new BufferedReader(new FileReader("C:\\Base_Datosc.txt"));
                             {
                                //Lee el archivo
                                //String sCadena;
                                //String dato = null;
// while ((sCadena = bf.readLine()) != null) {
                                // System.out.println(sCadena);
                                //System.out.println(sCadena.length());
                                // String st = sCadena;

                                // sCadena = dato;
                                //System.out.println(dato);
                                try {

                                    FileReader fr = new FileReader("D:\\Base_Datosc.txt");
                                    //Leemos el fichero y lo mostramos por pantalla

                                    int valor = fr.read();
                                    int paso = 1;
                                    while (valor != -1) {
                                        if ((char) valor == '|') {
                                            System.out.print("\n ");
                                            boolean sal = false;

                                            if (paso == 1 && sal == false) {
                                                System.out.print("Cedula: ");
                                                paso++;
                                                sal = true;
                                            }
                                            if (paso == 2 && sal == false) {
                                                System.out.print("Nombre: ");
                                                paso++;
                                                sal = true;
                                            }
                                            if (paso == 3 && sal == false) {
                                                System.out.print("Dia nacimiento: ");
                                                paso++;
                                                sal = true;
                                            }
                                            if (paso == 4 && sal == false) {
                                                System.out.print("Mes  nacimiento: ");
                                                paso++;
                                                sal = true;
                                            }
                                            if (paso == 5 && sal == false) {
                                                System.out.print("Anio nacimiento: ");
                                                paso++;
                                                sal = true;
                                            }
                                            if (paso == 6 && sal == false) {
                                                System.out.print("Ganancia anual:  ");
                                                sal = true;
                                                paso = 1;
                                            }
                                        } else {
                                            System.out.print((char) valor);
                                            boolean sal = false;
                                        }
                                        //System.out.print((char) valor);
                                        valor = fr.read();

                                    }
                                    //Cerramos el stream
                                    fr.close();
                                } catch (IOException e) {
                                    System.out.println("Error E/S: " + e);
                                }
                            }

                            break;

                        case 4:
                            System.out.println("ACTUALIZAR DATO");
                            System.out.print("Digite dato: \n");

                            System.out.print("Dato actualizado \n");
                            break;

                        case 5:
                            System.out.println("BUSCAR DATO ");
                            System.out.print("Digite el numero de cedula:\n ");

                            String ced = null;
                            ced = sc.next();
                            char[] Buscar = new char[ced.length()];
                            
                            char[] cedula2=new char[100];
                            for (int i = 0; i < ced.length(); i++) {
                                Buscar[i] = ced.charAt(i);

                            }

                            try {

                                FileReader fr = new FileReader("D:\\Base_Datosc.txt");
                                //Leemos el fichero y lo mostramos por pantalla

                                int valor2 = fr.read();
                                
                                int i = 1;
                                int nuevo = 1;
                                int N = 0;
                                boolean nuevoi = false;
                                boolean saltar = false;
                                int volver = 0;
                                boolean encontra = false;

                                while (valor2 != -1) {

                                    if ((char) valor2 == '\n') {
                                        i = 0;

                                    } else {

                                       cedula2[1] = (char)valor2;
                                        i++;

                                    }

                                    if (Buscar[volver] == (char) valor2) {
                                        volver++;
                                        if (volver == Buscar.length) {

                                            System.out.println("\n\n\n  PERSONA ENCONTRADA \n\n\n");
                                            System.out.println("\n\n*************************************************************************************************************\n\n");

                                        }
                                    } else if (encontra != true) {
                                        volver = 1;
                                    } else 
                                        
                                        if ((char) valor2== '|') {
                                        System.out.println("\n");
                                        
                                        if (nuevo == 1 && nuevoi == false) {
                                            i = 1;
                                            N = 1;

                                            while (true) {

                                                if (cedula2[i] == '|') {
                                                    break;
                                                } else {
                                                    i++;
                                                }
                                            }
                                            System.out.println("Id:  ");

                                            while (true) {
                                                if (i == N) {
                                                    System.out.println("\n");
                                                    System.out.println("cedula: ");
                                                    break;
                                                } else {
                                                    System.out.println(cedula2[N]);
                                                    N++;
                                                }

                                            }
                                            N = 1;
                                            System.out.println("\nNombre:  ");
                                            nuevo++;
                                            nuevoi = true;

                                        }
                                        if (nuevo == 2 && nuevoi == false) {
                                            System.out.println("Dia de nacimiento:  ");
                                            nuevo++;
                                            nuevoi = true;
                                        }
                                        if (nuevo == 3 && nuevoi == false) {
                                            System.out.println("Mes de nacimiento:  ");
                                            nuevo++;
                                            nuevoi = true;
                                        }
                                        if (nuevo == 4 && nuevoi == false) {
                                            System.out.println("Anio de nacimiento:  ");
                                            nuevoi = true;
                                            nuevo++;
                                        }
                                        if (nuevo == 5 && nuevoi == false) {
                                            System.out.println("Ganancia anual:  ");
                                            nuevoi = true;
                                            nuevo++;
                                        }

                                    } else if ((char) valor2 == '\n') {
                                        saltar = true;
                                        break;
                                    } else if (saltar != true) {
                                        System.out.println(valor2);
                                        nuevoi = false;
                                    }

                                }

                                //Cerramos el stream
                                fr.close();
                            } catch (IOException e) {
                                System.out.println("Error E/S: " + e);
                            }

                            break;

                        case 6:
                            System.out.println("IR A UN NUMERO DE REGISTRO");
                            break;
                        case 7:
                            System.out.println("IMPORTAR ARCHIVO");
                            break;
                        case 8:
                            System.out.println("EXPORTAR ARCHIVO");
                            break;
                        case 9:
                            System.out.println("SALIR");
                            break;

                    }

            }

        }
    }
}
