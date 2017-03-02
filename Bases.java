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
import java.util.StringTokenizer;

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
        Persona p = new Persona();
        String c = "";
        int a = 0;
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
                            + "9.SALIR \n"
                    );
                    System.out.println("***************************************");

                    System.out.print("Digite la opción:\n ");

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
                            + "9.SALIR \n"
                    );
                    System.out.println("****************************************");

                    System.out.print("Digite la opción:\n ");

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
                            + "9.SALIR \n"
                    );
                    System.out.println("****************************************");

                    System.out.print("Digite la opción:\n");

                    opcion = sc.nextInt();
                    switch (opcion) {

                        case 1://ADICIONAR UN REGISTRO
                            System.out.println("ADICIONAR REGISTRO");
                            System.out.print("Digite el identificador: ");
                            a = sc.nextInt();
                            p.setIdentificador(a);
                            System.out.print("Digite la cedula: ");
                            c = sc.next();
                            p.setCedula(c);
                            System.out.print("Digite el nombre: ");
                            c = sc.next();
                            p.setNombre(c);
                            System.out.print("Digite el dia_nacimiento: ");
                            c = sc.next();
                            p.setDia_nacimiento(c);
                            System.out.print("Digite el mes_nacimiento: ");
                            c = sc.next();
                            p.setMes_nacimiento(c);
                            System.out.print("Digite el año_nacimiento: ");
                            a = sc.nextInt();
                            p.setAno_nacimiento(a);
                            System.out.print("Digite la ganancia_anual: ");
                            a = sc.nextInt();
                            p.setGanancia_anual(a);
                            System.out.println("Registros guardados \n");
                            break;
                        case 2://
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
                                    //Abro stream, crea el fichero si no existe

                                    //FileWriter fw = new FileWriter("D:\\Base_Datosc.txt");
                                    //Escribimos en el fichero un String y un caracter 97 (a)
                                    //fw.write("Esto es una prueb/n");
                                    // fw.write(97);
                                    //Cierro el stream
                                    //fw.close();
                                    //Abro el stream, el fichero debe existir
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
                            System.out.print("Digite dato:\n");
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

    
