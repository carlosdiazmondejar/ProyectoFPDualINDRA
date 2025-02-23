/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.retoprogramacion;

import java.util.Scanner;

/**
 *
 * @author Carlo
 */
public class RetoProgramacion {
    static Scanner teclado=new Scanner (System.in);
    
    //Vectores para almacenar los datos
    
    //Eventos
    static String[] nombre_evento=new String[100];
    static String[] fecha_evento=new String[100];
    static String[] ubicacion_evento=new String[100];
    static int contadorEvento=0;
    static String[] categoria_evento=new String[100];
    
    //Usuario
    static String[] nombre_usuario=new String[100];
    static String[] correo_usuario=new String[100];
     static int contadorUsuario=0;
     
     //Inscripciones
     static String[] evento_inscripcion=new String[100];
     static String[] usuario_inscripcion=new String[100];
     static int contadorInscripcion=0;
     
     //Organizadores
     static String[] nombre_organizador=new String[100];
     static String[] telefono_organizador=new String[100];
     static String[] correo_organizador=new String[100];
     static int contadorOrganizador=0;
     
     
     

     
    public static void main(String[] args) {
        int opcionPerfil=0;
        do{
        mostrarMenuPrincipal();
        opcionPerfil=teclado.nextInt();
        if(opcionPerfil==1){
            int opcion=0;
            do{
                mostrarMenuOrganizador();
                opcion=teclado.nextInt();
                teclado.nextLine();
                switch(opcion){
                    case 1:
                        crearEvento();
                        break;
                    case 2:
                        mostrarEventos();
                        break;
                    case 3:
                        cancelarEvento();
                        break;
                    case 4:
                        registrarOrganizador();
                        break;
                    case 5:
                        mostrarOrganizador();
                        break;
                    default:
                        System.out.println("Introduzca una opción válida");
                }
                
            } while(opcion!=6);
            
        }else if (opcionPerfil==2){
            int opcion=0;
            do{
                mostrarMenuUsuario();
                opcion=teclado.nextInt();
                teclado.nextLine();
                switch(opcion){
                    case 1:
                        registrarUsuario();
                        break;
                    case 2:
                        mostrarUsuario();
                        break;
                    case 3:
                        inscribirUsuario();
                        break;
                    case 4:
                        mostrarInscripcion();
                        break;
                    case 5:
                        cancelarInscripcion();
                        break;
                    case 6:
                        buscarporCategoria();
                        break;
                    default:
                        System.out.println("Introduzca una opción válida");
                } 
                
            } while(opcion!=6);
        } else {
            System.out.println("Introduzca una opción válida");
        }
        } while (opcionPerfil !=3);
        
    }
   
    public static void mostrarMenuPrincipal(){
        System.out.println("Bienvenido! por favor , elige el tipo de perfil");
        System.out.println("1. Organizador");
        System.out.println("2. Usuario");
        System.out.println("3. Salir");
    }
    public static void mostrarMenuOrganizador(){
        System.out.println("Bienvenido! por favor , elige el tipo de usuario");
        System.out.println("1.Crear evento");
        System.out.println("2.Ver eventos");
        System.out.println("3.Cancelar evento");
        System.out.println("4.Registrar organizador");
        System.out.println("5.Ver organizadores");
        System.out.println("6.Salir");
    }
        public static void mostrarMenuUsuario(){
        System.out.println("Bienvenido! por favor , elige el tipo de usuario");
        System.out.println("1.Registrar usuario");
        System.out.println("2.Ver usuarios");
        System.out.println("3.Inscribirse a evento");
        System.out.println("4.Ver inscripciones");
        System.out.println("5.Cancelar inscripcion");
        System.out.println("6.Buscar ecento por categoria");
        System.out.println("7.Salir");
    }
    public static void crearEvento(){
        if(contadorEvento>=100){
            System.out.println("Ya no se pueden crear más eventos");
        }else{
            System.out.println("Introduce el nombre del evento");
            nombre_evento[contadorEvento]=teclado.nextLine();
            System.out.println("Introduce la fecha del evento");
            fecha_evento[contadorEvento]=teclado.nextLine();
            System.out.println("Introduce la ubicación del evento");
            ubicacion_evento[contadorEvento]=teclado.nextLine();
            System.out.println("Introduce la categoria del evento");
            categoria_evento[contadorEvento]=teclado.nextLine();
            contadorEvento++;
        }
    }
    public static void mostrarEventos(){
        if(contadorEvento==0){
            System.out.println("No hay eventos");
        }else{
            for(int i=0;i<=contadorEvento-1;i++){
                System.out.println("Numero:"+ i);
                System.out.println("Nombre Evento:"+ nombre_evento[i]);
                System.out.println("Fecha Evento:"+ fecha_evento[i]);
                System.out.println("Ubicacion Evento:"+ ubicacion_evento[i]);
                System.out.println("Categoria Evento:"+ categoria_evento[i]);
            }
                    
                 
        }
    }
      public static void registrarUsuario(){
           if(contadorUsuario>=100){
            System.out.println("Ya no se pueden registrar más usuarios");
        }else{
            System.out.println("Introduce el nombre del usuario");
            nombre_usuario[contadorUsuario]=teclado.nextLine();
            System.out.println("Introduce el correo del usuario");
            correo_usuario[contadorUsuario]=teclado.nextLine();
            contadorUsuario++;
        }
      }
       public static void mostrarUsuario(){
        if(contadorUsuario==0){
            System.out.println("No hay usuarios");
        }else{
            for(int i=0;i<=contadorUsuario-1;i++){
                System.out.println("Numero:"+ i);
                System.out.println("Usuario:"+ nombre_usuario[i]);
                System.out.println("Correo:"+ correo_usuario[i]);
                
                
            }
                    
                 
        }
    }
    public static void inscribirUsuario(){
        if(contadorInscripcion>=100){
            System.out.println("Ya no se pueden inscribir más usuarios");
        }else{
            System.out.println("Pon el numero del evento:");
               int numero_evento=teclado.nextInt();
               teclado.nextLine();
               if(numero_evento>=contadorEvento){
                   System.out.println("El evento no existe");
                   return;
               }
               System.out.println("Pon el numero de usuarios:");
               int numero_usuario=teclado.nextInt();
               teclado.nextLine();
               if(numero_usuario>=contadorUsuario){
                   System.out.println("El usuario no existe");
                   return;
               }
               evento_inscripcion[contadorInscripcion]=nombre_evento[numero_evento];
               usuario_inscripcion[contadorInscripcion]=nombre_usuario[numero_usuario];
               contadorInscripcion++;
            }
                  
                 
        }
    public static void mostrarInscripcion(){
        if(contadorInscripcion==0){
            System.out.println("No hay inscripciones");
        }else{
            for(int i=0;i<=contadorInscripcion-1;i++){
                System.out.println("Numero:"+ i);
                System.out.println("Evento:"+ evento_inscripcion[i]);
                System.out.println("Usuario:"+ usuario_inscripcion[i]);
                
                
            }
                 
        }
    }
        public static void cancelarEvento(){
            System.out.println("Introduce el numero del evento que quieres cancelar:");
            int evento_cancelado=teclado.nextInt();
            teclado.nextLine();
            if(evento_cancelado>=contadorEvento){
                System.out.println("El evento no existe");
                return;
            }
            for(int i = evento_cancelado; i<contadorEvento-1;i++){
            nombre_evento[i]=nombre_evento[i+1];
            fecha_evento[i]=fecha_evento[i+1];
            ubicacion_evento[i]=ubicacion_evento[i+1];
            }
            contadorEvento--;
    }
            public static void cancelarInscripcion(){
            System.out.println("Introduce el numero de la inscripcion que quieres cancelar:");
            int inscripcion_cancelado=teclado.nextInt();
            teclado.nextLine();
            if(inscripcion_cancelado>=contadorInscripcion){
                System.out.println("La inscripcion no existe");
                return;
            }
            for(int i = inscripcion_cancelado; i<contadorInscripcion-1;i++){
            evento_inscripcion[i]=evento_inscripcion[i+1];
            usuario_inscripcion[i]=usuario_inscripcion[i+1];
            }
            contadorInscripcion--;
    }
            public static void registrarOrganizador(){
           if(contadorOrganizador>=100){
            System.out.println("Ya no se pueden registrar más organizadores");
        }else{
            System.out.println("Introduce el nombre del organizador");
            nombre_organizador[contadorOrganizador]=teclado.nextLine();
            System.out.println("Introduce el numero de telefono del organizador");
            telefono_organizador[contadorOrganizador]=teclado.nextLine();
            System.out.println("Introduce el correo del organizador");
            correo_organizador[contadorOrganizador]=teclado.nextLine();
            contadorOrganizador++;
        }
      }
            public static void mostrarOrganizador(){
        if(contadorOrganizador==0){
            System.out.println("No hay organizadores");
        }else{
            for(int i=0;i<=contadorOrganizador-1;i++){
                System.out.println("Numero:"+ i);
                System.out.println("Organizador:"+ nombre_organizador[i]);
                 System.out.println("Organizador:"+ telefono_organizador[i]);
                 System.out.println("Organizador:"+ correo_organizador[i]);
                
            }
                    
                 
        }
      }
            public static void buscarporCategoria(){
                System.out.println("Introduce la categoria por la que desea buscar");
                String categoria=teclado.nextLine();
                for(int i =0; i<contadorEvento;i++){
                 if(categoria_evento[i].equals(categoria)){
                    System.out.println("Numero:"+ i);
                    System.out.println("Nombre Evento:"+ nombre_evento[i]);
                    System.out.println("Fecha Evento:"+ fecha_evento[i]);
                    System.out.println("Ubicacion Evento:"+ ubicacion_evento[i]);
                    System.out.println("Categoria Evento:"+ categoria_evento[i]);
                }
                }
      }  
}  

