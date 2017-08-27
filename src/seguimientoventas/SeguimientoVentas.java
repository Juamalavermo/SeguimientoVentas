/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimientoventas;

/**
 *
 * @author
 */
import java.util.Date;
import java.util.Scanner;

public class SeguimientoVentas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha = new Date();
        //System.out.println(fecha);

        Scanner in = new Scanner(System.in);

        //Productos en la base de datos
        Producto producto[] = new Producto[20];
        producto[0] = new Producto(1234, "Pan Bimbo", 3250);
        producto[1] = new Producto(1235, "Mermelada Comapan", 1890);
        producto[2] = new Producto(1236, "Salsa de tomate Fruco 600g", 6320);
        producto[3] = new Producto(1237, "Arroz Diana", 2540);
        producto[4] = new Producto(1238, "Carne de cerdo 500g", 8760);

        //Vendedores en la base de datos
        Vendedor vendedor[] = new Vendedor[10];
        vendedor[0] = new Vendedor(1001, "Julian", "Malaver");
        vendedor[1] = new Vendedor(1002, "Camilo", "Chaparro");
        vendedor[2] = new Vendedor(1003, "Camilo", "Peña");
        vendedor[3] = new Vendedor(1004, "Guillermo", "Ospino");
        vendedor[4] = new Vendedor(1005, "Gustavo", "Berdugo");

        //Ventas en la base de datos
        Venta venta[] = new Venta[8];
        venta[0] = new Venta(10, producto[0]);
        venta[1] = new Venta(5, producto[4]);
        venta[2] = new Venta(8, producto[2]);
        venta[3] = new Venta(2, producto[3]);
        venta[4] = new Venta(2, producto[1]);
        venta[5] = new Venta(15, producto[1]);
        venta[6] = new Venta(4, producto[4]);
        venta[7] = new Venta(1, producto[3]);
        
        //Métodos de pago
        FormaPago efectivo = new FormaPago("1","0","0");
        FormaPago debito = new FormaPago("0","1","0");
        FormaPago credito = new FormaPago("0","0","1");

        //Factura No 1 Guardada en el registro
        System.out.println("BIENVENIDO AL SEGUIDOR DE VENTAS");
        System.out.println("Digite 1 si desea agregar un producto a la base de productos, en otro caso digite 0:");
        int a = in.nextInt();
        if (a == 1) {
            do {
                int i = 5;
                System.out.println("Ingrese el código del producto a registrar:");
                int codigo = in.nextInt();
                System.out.println("Ingrese la descripción del producto a registrar:");
                String descripcion = in.next();
                System.out.println("Ingrese el precio del producto a registrar:");
                double precio = in.nextDouble();
                producto[i] = new Producto(codigo, descripcion, precio);
                System.out.println(producto[i]);
                i++;
                System.out.println("Digite 1 si desea agregar otro producto a la base de productos, en otro caso digite 0:");
                a = in.nextInt();
                System.out.println();
                System.out.println();
            } while (a == 1);
        }
        if (a == 0) {
            System.out.println("Digite 1 si desea agregar un Vendedor a la base de vendedores, en otro caso digite 0:");
            int b = in.nextInt();
            if (b == 1) {
                do {
                    int j = 5;
                    System.out.println("Ingrese el ID del Vendedor:");
                    int id = in.nextInt();
                    System.out.println("Ingrese el nombre del Vendedor:");
                    String nombreVendedor = in.next();
                    System.out.println("Ingrese el apellido del Vendedor:");
                    String apellido = in.next();
                    vendedor[j] = new Vendedor(id, nombreVendedor, apellido);
                    System.out.println(vendedor[j]);
                    j++;
                    System.out.println("Digite 1 si desea agregar otro Vendedor a la base de datos, en otro caso digite 0:");
                    b = in.nextInt();
                    System.out.println();
                    System.out.println();
                } while (b == 1);
            }
            if (b==0) {
            Factura factura[] = new Factura[10];
            factura[0]= new Factura(fecha, vendedor[0], venta[3], efectivo );
            factura[1]= new Factura(fecha, vendedor[1], venta[1], debito );
            factura[2]= new Factura(fecha, vendedor[2], venta[2], debito );
            factura[3]= new Factura(fecha, vendedor[3], venta[4], efectivo );
            factura[4]= new Factura(fecha, vendedor[4], venta[2], credito );
            System.out.println("1"+factura[0]);
            System.out.println("2"+factura[1]);
            System.out.println("3"+factura[2]);
            System.out.println("4"+factura[3]);
            System.out.println("5"+factura[4]);
            
            }

        }
    }
}
