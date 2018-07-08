/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package salarios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hhs_9
 */
public class Salarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int a;
        
        String input = JOptionPane.showInputDialog(null, "Que quieres hacer?: "+
                "\n1: Para agregar un cliente."+
                "\n2: Para eliminar un cliente."+
                "\n3: Para eliminar a todos los clientes."+
                "\n4: Para leer la lista de clientes.", "Menu de opciones",
                JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(input);
        switch(a) {
            case 1:
        try{
	ArrayList<Object> ejempli = new ArrayList<Object>();
	/*
	ejempli.add("Clientes.txt");
	for(int i = 0; i <= ejempli.size() - 1; i++)
	    System.out.println(ejempli.get(i));


	Iterator<String> it = ejempli.iterator();
	while(it.hasNext())
	    System.out.println(it.next());
	ejempli.set(2,"joaquin");
	*/
	
	File fileClientes = new File("Clientes.txt");
	if(fileClientes.exists()) {
	    System.out.println("El archivo Clientes.txt no puede ser eliminado");
	    System.out.println("Esta es la lista de cleintes hasta el momento" +
                    "\nDeseas registrar un nuevo cliente?: ");
	}
        int lolipop = JOptionPane.showConfirmDialog(null, "Deseas registrar un nuevo cliente?");
        if(lolipop == 1) {
            System.out.println("caray");
        } else {

        
	BufferedReader lecturaMenu = new BufferedReader(new FileReader("Clientes.txt"));
	String str;
	while((str = lecturaMenu.readLine()) != null) {
	    System.out.println(str);
	    ejempli.add(str);
	    System.out.println(ejempli.size());
	}
	lecturaMenu.close();
	System.out.println("Recuerda ingresar tu nombre completo: ");
	Scanner inputtt = new Scanner(System.in);
        
	//int borrador = input.nextInt();
        System.out.println("Ingresa el nombre: ");
        String nombrador = inputtt.next();
        System.out.println("Ingresa el apellido paterno: ");
        String apeidador = inputtt.next();
        System.out.println("Ingresa el apellido materno: ");
        String apiadador = inputtt.next();
        String nonombrador = nombrador + " " + apeidador + " " + apiadador;
        

	//ejempli.add(nonombrador);
        System.out.println("Ingresa el sueldo del nuevo empleado: ");
        double sueldo = inputtt.nextDouble();
        Object sujeto = nonombrador + "-" + sueldo + "-"; 
        ejempli.add(sujeto);
//	        Collections.sort(ejempli,String.CASE_INSENSITIVE_ORDER);





	/*
	FileWriter hope = new FileWriter("Clientes.txt");
	for(String strr: ejempli) {
	    hope.write(strr);
	}
	hope.close();
	*/
	FileWriter stt = new FileWriter("Clientes.txt");
	int tam = ejempli.size();
	for(int i = 0; i < tam; i++){
	    String strr = ejempli.get(i).toString();
	    stt.write(strr);
	    if(i < tam - 1)
		stt.write("\n");
	}
	stt.close();
	System.out.println("Empleado: " + ejempli + " Mxn de sueldo");
        }
    } catch(Exception e){
        System.out.println("Ha ocurrido un error con el archivo");
    }
        break;
        
            case 2:
                    	ArrayList<Object> ejempli = new ArrayList<Object>();
                        try{
	/*
	ejempli.add("Clientes.txt");
	for(int i = 0; i <= ejempli.size() - 1; i++)
	    System.out.println(ejempli.get(i));


	Iterator<String> it = ejempli.iterator();
	while(it.hasNext())
	    System.out.println(it.next());
	ejempli.set(2,"joaquin");
	*/
	
	File fileClientes = new File("Clientes.txt");
	if(fileClientes.exists()) {
	    System.out.println("El archivo Clientes.txt no puede ser eliminado");
	    System.out.println("Elige el indice del cliente que quieres eliminar");
	}

        
	BufferedReader lecturaMenu = new BufferedReader(new FileReader("Clientes.txt"));
	String str;
	while((str = lecturaMenu.readLine()) != null) {
	    System.out.println(str);
	    ejempli.add(str);
	    System.out.println(ejempli.size());
	}
	lecturaMenu.close();
	System.out.println("cual quieres borrar?");
	Scanner inputt = new Scanner(System.in);
	int borrador = inputt.nextInt();
	if(borrador > ejempli.size()) {
	    System.out.println("No hay tantos indices");
	    return;
	} else {
	    
	ejempli.remove(borrador-1);
	

	/*
	FileWriter hope = new FileWriter("Clientes.txt");
	for(String strr: ejempli) {
	    hope.write(strr);
	}
	hope.close();
	*/
	FileWriter stt = new FileWriter("Clientes.txt");
	int tam = ejempli.size();
	for(int i = 0; i < tam; i++){
	    String strr = ejempli.get(i).toString();
	    stt.write(strr);
	    if(i < tam - 1)
		stt.write("\n");
	}
	stt.close();
	System.out.println(ejempli);
	}
        }catch(Exception e){
            System.out.println("Ha ocurrido un error con el archivo");
        }
                break;
                
                
            case 3:
                //System.out.println("Jod");
        try{
	//ArrayList<String> ejempli = new ArrayList<String>();
        Object trabajos[][];
        trabajos = new Object[10][5];
	/*
	ejempli.add("Clientes.txt");
	for(int i = 0; i <= ejempli.size() - 1; i++)
	    System.out.println(ejempli.get(i));


	Iterator<String> it = ejempli.iterator();
	while(it.hasNext())
	    System.out.println(it.next());
	ejempli.set(2,"joaquin");
	*/
	
	File fileClientes = new File("Clientes.txt");
	if(fileClientes.exists()) {
	    System.out.println("El archivo Clientes.txt no puede ser eliminado");
            System.out.println("Pero tú eres el administrador ");
	    System.out.println("Esta es la lista de cleintes hasta el momento" +
                    "\nEstas seguro de eliminar la lista de clientes??: ");
	}
        int lolipop = JOptionPane.showConfirmDialog(null, "Eliminar Lista de clientes?",
                "Atencion", JOptionPane.WARNING_MESSAGE);
        if(lolipop == 1) {
            System.out.println("Que bueno que no lo hiciste.");
        } else {

        
	BufferedReader lecturaMenu = new BufferedReader(new FileReader("Clientes.txt"));
	String str;
        /*
	while((str = lecturaMenu.readLine()) != null) {
	    System.out.println(str);
	    //ejempli.add(str);
            int o = 0;
            trabajos[str][o];
            o++;
            
	    //System.out.println(ejempli.size());
	}
        */
        
        System.out.println("Leí el documento");
        
        for(int i = 0; i < 5; i++)
        {
            for(int z = 0; z < 1; z++)
            {
                str = lecturaMenu.readLine();
                z = 0;
                
                trabajos[i][z] = str;
                System.out.println(str);
            }
        }
                System.out.println("Al parecer ya puedo acceder a los clientes");
        
        
        
	lecturaMenu.close();
	/*System.out.println("Recuerda ingresar tu nombre completo: ");
	Scanner inputtt = new Scanner(System.in);
        
	//int borrador = input.nextInt();
        System.out.println("Ingresa el nombre: ");
        String nombrador = inputtt.next();
        System.out.println("Ingresa el apellido paterno: ");
        String apeidador = inputtt.next();
        System.out.println("Ingresa el apellido materno: ");
        String apiadador = inputtt.next();
        String nonombrador = nombrador + " " + apeidador + " " + apiadador;
        trabajos[3][0] = nonombrador;
        
        System.out.println(trabajos[3][0]);

	//ejempli.add(nonombrador);
//	        Collections.sort(ejempli,String.CASE_INSENSITIVE_ORDER);


	/*
	FileWriter hope = new FileWriter("Clientes.txt");
	for(String strr: ejempli) {
	    hope.write(strr);
	}
	hope.close();
	*/
	FileWriter stt = new FileWriter("Clientes.txt");
	//int tam = ejempli.size();
	for(int i = 0; i < 1; i++){
            for (int z = 0; z < 1; z++){
	    //String strr = ejempli.get(i).toString()
            Object strrr = "";
            z = 0;
            strrr = trabajos[3][0];
            String strr = strrr.toString();
            String borrar = "";
	    stt.write(borrar);
	//    if(i < 11 - 1)
	//	stt.write("\n");
	}
        }
	stt.close();
        System.out.println("Lista eliminada");
	//System.out.println(ejempli);
        }
    } catch(Exception e){
        System.out.println("No encontré el archivo");
    }
                
                break;
                
            case 4:
                
                try{
                
                    JOptionPane.showMessageDialog(null, "Has elegido leer la lista");
                                              
        		
	ArrayList<Object> ejemplii = new ArrayList<Object>();
	/*
	ejempli.add("Clientes.txt");
	for(int i = 0; i <= ejempli.size() - 1; i++)
	    System.out.println(ejempli.get(i));


	Iterator<String> it = ejempli.iterator();
	while(it.hasNext())
	    System.out.println(it.next());
	ejempli.set(2,"joaquin");
	*/
	
	File fileClientess = new File("Clientes.txt");
	if(fileClientess.exists()) {
	    System.out.println("Esta es la lista de clientes: ");
	}

        
	BufferedReader lecturaMenuu = new BufferedReader(new FileReader("Clientes.txt"));
	String strr;
	while((strr = lecturaMenuu.readLine()) != null) {
	    System.out.println(strr);
	    ejemplii.add(strr);
	    System.out.println(ejemplii.size());
	}
	lecturaMenuu.close();
                                                
                                                
                } catch(Exception e)
                {
                    System.out.println("Hubo un error");
                }
                break;
                
                
            case 5:
                    	ArrayList<Object> ejemplito = new ArrayList<Object>();
                        try{
	/*
	ejempli.add("Clientes.txt");
	for(int i = 0; i <= ejempli.size() - 1; i++)
	    System.out.println(ejempli.get(i));


	Iterator<String> it = ejempli.iterator();
	while(it.hasNext())
	    System.out.println(it.next());
	ejempli.set(2,"joaquin");
	*/
	
	File fileClientes = new File("Clientes.txt");
	if(fileClientes.exists()) {
	    System.out.println("El archivo Clientes.txt no puede ser eliminado");
	    System.out.println("Elige el indice del cliente que quieres eliminar");
	}

        
	BufferedReader lecturaMenu = new BufferedReader(new FileReader("Clientes.txt"));
	String str;
        String[] sep;
	while((str = lecturaMenu.readLine()) != null) {
            
            
	    System.out.println(str);
            
            //sep = str.split("-");
            /*
                for(String aaa: sep)
                System.out.println(aaa);
            */
            //ejemplito.spliterator();
	    ejemplito.add(str);
	    System.out.println(ejemplito.size());
	}
	lecturaMenu.close();
	System.out.println("cual quieres borrar?");
	Scanner inputt = new Scanner(System.in);
	int borrador = inputt.nextInt();
	if(borrador > ejemplito.size()) {
	    System.out.println("No hay tantos indices");
	    return;
	} else {
	
        String jeje = ejemplito.get(borrador - 1).toString();
        System.out.println(jeje);
        
        sep = jeje.split("-");
        for(String aaa:sep)
            System.out.println(aaa);
        
        System.out.println(sep[1]);
        String vgaro = sep[1];
        double varo = Double.parseDouble(vgaro);
        //ejemplito.remove(borrador-1);
        
        System.out.println("Cuánto dinero quieres sacar?: ");
        
        Scanner varador = new Scanner(System.in);
        
        double varr = varador.nextDouble();
        
        double varoF = varo - varr;
        
        
        String nombreee = sep[0];
        
        Object completo = nombreee + "-" + varoF;
        
        ejemplito.set(borrador-1, completo);
        
        
        
        
        
        /*
        double dd = 0;
        dd = (double) jeje;
        
        System.out.println("Saca varo");
        
        double sacador = inputt.nextDouble();
        double money = dd - sacador;
        System.out.println(money);
        */
        //double converse = Double.parseDouble(jeje);
	//ejemplito.remove(borrador-1);
	

	/*
	FileWriter hope = new FileWriter("Clientes.txt");
	for(String strr: ejempli) {
	    hope.write(strr);
	}
	hope.close();
	*/
	FileWriter stt = new FileWriter("Clientes.txt");
	int tam = ejemplito.size();
	for(int i = 0; i < tam; i++){
	    String strr = ejemplito.get(i).toString();
	    stt.write(strr);
	    if(i < tam - 1)
		stt.write("\n");
	}
	stt.close();
	System.out.println(ejemplito);
	}
        }catch(Exception e){
            System.out.println("Ha ocurrido un error con el archivo");
        }                break;
                
            default:
                System.out.println("Ha ocurrido un error al elegir opciones");
}         
}            
    }
    

