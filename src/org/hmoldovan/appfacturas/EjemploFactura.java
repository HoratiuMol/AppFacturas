package org.hmoldovan.appfacturas;

import org.hmoldovan.appfacturas.modelo.Cliente;
import org.hmoldovan.appfacturas.modelo.Factura;
import org.hmoldovan.appfacturas.modelo.ItemFactura;
import org.hmoldovan.appfacturas.modelo.Producto;

import java.util.Scanner;

public class EjemploFactura {

    public static void main(String[] args) {

        Cliente cliente =new Cliente();
        cliente.setNif("5555-5");
        cliente.setNombre("Horatiu");

        Scanner s=new Scanner(System.in);
        System.out.println("Ingrese la descirpción de la factura: ");
        String desc=s.nextLine();
        Factura factura=new Factura(desc, cliente);

        Producto producto;
        String nombre;
        float precio;
        int cantidad;

        System.out.println();

        for(int i=0;i<2;i++){
            producto = new Producto();
            System.out.print("Ingrese producto nº " + producto.getCodigo() + ": ");
            nombre=s.next();
            producto.setNombre(nombre);

            System.out.print("Ingrese el precio: ");
            precio=s.nextFloat();
            producto.setPrecio(precio);

            System.out.print("Ingrese la cantidad: ");
            cantidad=s.nextInt();


            ItemFactura item=new ItemFactura(cantidad, producto);
            factura.addItemFactura(item);

            System.out.println();
        }
        System.out.println(factura.generarDetalle());
    }
}
