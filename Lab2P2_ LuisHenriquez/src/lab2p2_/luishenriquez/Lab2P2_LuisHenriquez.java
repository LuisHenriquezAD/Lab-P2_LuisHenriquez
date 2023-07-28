package lab2p2_.luishenriquez;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Lab2P2_LuisHenriquez {

    public static void main(String[] args) {
        ArrayList<Clase> CHEF = new ArrayList<>();
        ArrayList<Mesero> Meseros = new ArrayList<>();
        ArrayList<Bartender> bartender = new ArrayList<>();
        ArrayList<Mesa> Mesas = new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        System.out.println("Crear el usuario del Gerente con su contrasena");
        System.out.println("USUARIO:");
        String usuario = leer.nextLine();
        System.out.println("PASSWORD:");
        String contra = leer.nextLine();

        int opc = 0;

        while (opc != 2) {

            opc = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n"
                    + "1-Manager del restaurante\n"
                    + "2- Salir\n"));

            if (opc == 1) {

                System.out.println("USUARIO:");
                String us = leer.nextLine();
                System.out.println("PASSWORD:");
                String con = leer.nextLine();

                if (us.equals(usuario) && con.equals(contra)) {
                    int opcion = 0;

                    while (opcion != 5) {
                        opcion = Integer.parseInt(JOptionPane.showInputDialog("MENU PRINCIPAL\n"
                                + "1-Chefs \n"
                                + "2- Meseros\n"
                                + "3- Bartenders\n"
                                + "4- Mesas\n"
                                + "5- salir"));

                        if (opcion == 1) {

                            int vchefs = 0;

                            while (vchefs != 5) {
                                System.out.println("CHEFS");
                                System.out.println("1.Crear");
                                System.out.println("2.Listar");
                                System.out.println("3.Modificar");
                                System.out.println("4.Eliminar");
                                System.out.println("5.SALIR");
                                vchefs = leer.nextInt();
                                int total = 0;
                                if (vchefs == 1 && total <= 14) {

                                    System.out.print("Nombre del chef =");
                                    String nombre = leer.nextLine();
                                    leer.nextLine();

                                    System.out.print("Edad del chef = ");
                                    int edad = leer.nextInt();
                                    leer.nextLine();

                                    System.out.print("Turno matutino o vespertino = ");
                                    String turno = leer.nextLine();

                                    System.out.print("Estrellas Michelin = ");
                                    int Michelin = leer.nextInt();
                                    leer.nextLine();

                                    System.out.print("Sueldo: ");
                                    double sueldo = leer.nextDouble();
                                    leer.nextLine();

                                    String matutino = "matutino";
                                    String vespertino = "vespertino";
                                    int desper = 0;
                                    int matu = 0;

                                    if (turno.equalsIgnoreCase(vespertino)) {
                                        desper++;
                                        total++;
                                    }

                                    if (turno.equalsIgnoreCase(matutino)) {
                                        matu++;
                                        total++;
                                    }

                                    if (matu > 7) {
                                        System.out.println("TURNO LLENO");
                                        System.out.print("Turno matutino o vespertino = ");
                                        turno = leer.nextLine();
                                    }

                                    if (desper > 7) {
                                        System.out.println("TURNO LLENO");
                                        System.out.print("Turno matutino o vespertino = ");
                                        turno = leer.nextLine();
                                    }

                                    CHEF.add(new Clase(nombre, edad, turno, Michelin, sueldo));

                                }

                                if (vchefs == 2) {
                                    String salida = " ";
                                    System.out.println("Chefs ingresados:");

                                    for (Object cosa : CHEF) {

                                        if (cosa instanceof Clase) {
                                            salida += CHEF.indexOf(cosa) + "- " + cosa + "\n";
                                        }

                                    }

                                    JOptionPane.showMessageDialog(null, salida);
                                }

                                if (vchefs == 3) {

                                    System.out.println("Ingrese posicion del chef a modificar");
                                    int posi = leer.nextInt();

                                    if (posi >= 0 && posi <= CHEF.size()) {

                                        System.out.print("Nombre del chef =");
                                        String nombre = leer.nextLine();
                                        leer.nextLine();

                                        System.out.print("Edad del chef = ");
                                        int edad = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Turno matutino o vespertino = ");
                                        String turno = leer.nextLine();

                                        System.out.print("Estrellas Michelin = ");
                                        int Michelin = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Sueldo: ");
                                        double sueldo = leer.nextDouble();
                                        leer.nextLine();

                                        CHEF.set(posi, new Clase(nombre, edad, turno, Michelin, sueldo));
                                        System.out.println("Chef modificado correctamente.");
                                    }

                                    // m = JOptionPane.showInputDialog("Ingrese la nueva marca");
                                    //((Televisor) cosas.get(p)).setMarca(m);
                                }

                                if (vchefs == 4) {
                                    System.out.println("Ingrese posicion del chef a eliminar");
                                    int posi = leer.nextInt();

                                    if (posi >= 0 && posi <= CHEF.size()) {
                                        CHEF.remove(posi);
                                        System.out.println("Chef eliminado.");
                                    } else {
                                        System.out.println("No se pudo eliminar.");
                                    }

                                }

                            }

                        }

                        if (opcion == 2) {

                            int OPC = 0;
                            int ok = 0;

                            while (ok == 0) {
                                System.out.println("Opciones disponibles:");
                                System.out.println("1. Crear mesero");
                                System.out.println("2. Listar meseros");
                                System.out.println("3. Modificar mesero");
                                System.out.println("4. Eliminar mesero");
                                System.out.println("5. Salir");
                                OPC = leer.nextInt();
                                leer.nextLine();

                                switch (OPC) {
                                    case 1:
                                        System.out.print("Nombre: ");
                                        String nombre = leer.nextLine();

                                        System.out.print("Edad: ");
                                        int edad = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Turno matutino o vespertino ");
                                        String turno = leer.nextLine();

                                        System.out.print("Sueldo ");
                                        double sueldo = leer.nextDouble();
                                        leer.nextLine();

                                        System.out.print("Propina ");
                                        double propina = leer.nextDouble();
                                        leer.nextLine();

                                        Meseros.add(new Mesero(nombre, edad, turno, sueldo, propina));
                                        break;

                                    case 2:
                                        String salida = " ";
                                        System.out.println("Listar los meseros:");
                                        for (Mesero mesero : Meseros) {
                                            salida += CHEF.indexOf(mesero) + "- " + mesero + "\n";
                                        }
                                        System.out.println(salida);
                                        break;

                                    case 3:
                                        // Modificar mesero
                                        System.out.print("Ingrese el numero del mesero a cambiar: ");
                                        int lista = leer.nextInt();
                                        leer.nextLine();

                                        if (lista >= 0 && lista <= Meseros.size()) {
                                            System.out.print("Nombre: ");
                                            nombre = leer.nextLine();

                                            System.out.print("Edad: ");
                                            edad = leer.nextInt();
                                            leer.nextLine();

                                            System.out.print("Turno matutino o despertino ");
                                            turno = leer.nextLine();

                                            System.out.print("Sueldo ");
                                            sueldo = leer.nextDouble();
                                            leer.nextLine();

                                            System.out.print("Propina ");
                                            propina = leer.nextDouble();
                                            leer.nextLine();

                                            Mesero modi = new Mesero(nombre, edad, turno, sueldo, propina);
                                            Meseros.set(lista, modi);

                                        }
                                        break;

                                    case 4:

                                        System.out.print("Ingrese el numero del mesero que va a eliminar: ");
                                        int meselimi = leer.nextInt();
                                        leer.nextLine();

                                        if (meselimi >= 1 && meselimi <= Meseros.size()) {
                                            Meseros.remove(meselimi);
                                            System.out.println("Mesero eliminado correctamente.");
                                        }
                                        break;

                                    case 5:
                                        ok = 1;
                                        break;
                                }
                            }

                        }

                        if (opcion == 3) {

                            int salir = 0;
                            while (salir == 0) {
                                int entrar = 0;

                                System.out.println("1. Crear bartender");
                                System.out.println("2. Listar bartenders");
                                System.out.println("3. Modificar bartender");
                                System.out.println("4. Eliminar bartender");
                                System.out.println("5. Salir");
                                entrar = leer.nextInt();
                                leer.nextLine();
                                switch (entrar) {

                                    case 1:

                                        System.out.print("Nombre: ");
                                        String nombre = leer.nextLine();

                                        System.out.print("Edad: ");
                                        int edad = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Turno matutino o vespertino ");
                                        String turno = leer.nextLine();

                                        System.out.print("Sueldo ");
                                        double sueldo = leer.nextDouble();
                                        leer.nextLine();

                                        System.out.print("licores disponibles: ");
                                        int licor = leer.nextInt();
                                        leer.nextLine();

                                        bartender.add(new Bartender(nombre, edad, turno, sueldo, licor));
                                        break;

                                    case 2:
                                        String bar = " ";
                                        for (Bartender bartenders : bartender) {
                                            bar += bartender.indexOf(bartenders) + "- " + bartenders + "\n";
                                        }
                                        System.out.println(bar);
                                        break;

                                    case 3:

                                        System.out.print("Ingrese el numero del bartender que desea modificar ");
                                        int modif = leer.nextInt();
                                        leer.nextLine();

                                        if (modif >= 1 && modif <= bartender.size()) {
                                            System.out.print("Nombre: ");
                                            nombre = leer.nextLine();

                                            System.out.print("Edad: ");
                                            edad = leer.nextInt();
                                            leer.nextLine();

                                            System.out.print("Turno matutino o vespertino ");
                                            turno = leer.nextLine();

                                            System.out.print("Sueldo ");
                                            sueldo = leer.nextDouble();
                                            leer.nextLine();

                                            System.out.print("licores disponibles: ");
                                            licor = leer.nextInt();
                                            leer.nextLine();

                                            Bartender modifi = new Bartender(nombre, edad, turno, sueldo, licor);
                                            bartender.set(modif, modifi);
                                        }
                                        break;

                                    case 4:

                                        System.out.print("Ingrese el numero del bartender a eliminar: ");
                                        int eliminar = leer.nextInt();
                                        leer.nextLine();

                                        if (eliminar >= 1 && eliminar <= bartender.size()) {
                                            bartender.remove(eliminar - 1);

                                        }
                                        break;

                                    case 5:
                                        salir = 1;
                                        break;

                                }
                            }
                        }

                        if (opcion == 4) {
                            int cos = 0;
                            while(cos == 0){
                            System.out.println("1. Crear mesa");
                            System.out.println("2. Listar mesas");
                            System.out.println("3. Modificar mesa");
                            System.out.println("4. Eliminar mesa");
                            System.out.println("5. Salir");
                            int entrar = leer.nextInt();
                            leer.nextLine();

                            switch (entrar) {
                                case 1:

                                    System.out.print("Numero de platos: ");
                                    int plato = leer.nextInt();
                                    leer.nextLine();

                                    System.out.print("Numero de utensilios: ");
                                    int utensilios = leer.nextInt();
                                    leer.nextLine();

                                    System.out.print("Precio total: ");
                                    double total = leer.nextDouble();
                                    leer.nextLine();

                                    Mesas.add(new Mesa(plato, utensilios, total));
                                    break;

                                case 2:
                                    String mesa = " ";
                                    for (Mesa mesas : Mesas) {
                                        mesa += Mesas.indexOf(mesas) + "- " + mesas + "\n";
                                    }
                                    System.out.println(mesa);
                                    break;

                                case 3:
                            
                                    System.out.print("Ingrese el numero de la mesa que desea modificar: ");
                                    int memodi = leer.nextInt();
                                    leer.nextLine();

                                    if (memodi >= 0 && memodi <= Mesas.size()) {
                                        System.out.println("Ingrese los nuevos datos para la Mesa:");

                                        System.out.print("Numero de platos: ");
                                         plato = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Numero de utensilios: ");
                                         utensilios = leer.nextInt();
                                        leer.nextLine();

                                        System.out.print("Precio total: ");
                                         total = leer.nextDouble();
                                        leer.nextLine();

                                        Mesa mesamod = new Mesa(plato, utensilios, total);
                                        Mesas.set(memodi , mesamod);
                                        
                                    }
                                    break;

                                case 4:
                                  
                                    System.out.print("Ingrese el numero de la mesa a eliminar: ");
                                    int meliminar = leer.nextInt();
                                    leer.nextLine(); 
                                    
                                    if (meliminar >= 0 && meliminar <= Mesas.size()) {
                                        Mesas.remove(meliminar - 1);
                                        System.out.println("Mesa eliminada");
                                    } 
                                    break;
                                    
                                case 5:
                                    cos = 1;
                                    break;
                            }
                            }

                        }

                    }

                } else {
                    System.out.println("USUARIO O PASSWORD INCORRECTAS");
                }
            } else {
                System.out.println("Si quiere salir ingrese 2");
                opc = leer.nextInt();
            }
        }
    }

}
