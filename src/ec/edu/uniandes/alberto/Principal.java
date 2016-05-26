package ec.edu.uniandes.alberto;
import ec.edu.uniandes.alberto.clsProducto;
import java.util.ArrayList;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BRAYAN
 */
public class Principal {
    public static void main(String[] args) {
        ArrayList<clsProducto> producto = new ArrayList<clsProducto>();
        clsProducto p0= new clsProducto(1,"clavo",20,clsProducto.unidad.litros);
        clsProducto p1= new clsProducto(2,"zinc",10,clsProducto.unidad.litros);
        clsProducto p2= new clsProducto(3,"lija",5,clsProducto.unidad.litros);
        clsProducto p3= new clsProducto(4,"martillo",6,clsProducto.unidad.litros);
        clsProducto p4= new clsProducto(5,"brocha",8,clsProducto.unidad.litros);
        
        producto.add(p0);
        producto.add(p1);
        producto.add(p2);
        producto.add(p3);
        producto.add(p4);
        imprimir(producto);
        
        }
    
        public static void imprimir(ArrayList<clsProducto>p)
        {
            for (clsProducto producto : p) {
                
        System.out.println("******************"); 
        System.out.println("Id: " + producto.getId());    
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Valor: " + producto.getValor());
        System.out.println("Unidad: " + producto.getUnidad());
        
        
        }
    }
}
