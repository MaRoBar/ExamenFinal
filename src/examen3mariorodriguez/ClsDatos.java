
package examen3mariorodriguez;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClsDatos {
    static ArrayList<String> codigo = new ArrayList<>();  
    static ArrayList<String> descripcion = new ArrayList<>();
    static ArrayList<String> cantidad = new ArrayList<>();
    static ArrayList<String> tipo = new ArrayList<>();
    static ArrayList<Boolean> activo = new ArrayList<>();
    static ArrayList<Integer> precio = new ArrayList<>();

    public ClsDatos() {

    }
    
            public static void BuscarCodigo( String Nombre){
        Boolean encontrado = false;
        for (int i = 0; i < ClsDatos.codigo.size(); i++) 
        { 
            if (ClsDatos.codigo.get(i).toLowerCase().equals(Nombre.toLowerCase())) 
            {
                encontrado = true;
                if ( ClsDatos.activo.get(i)) {
                }
                JOptionPane.showMessageDialog(null, "Codigo: " + ClsDatos.codigo.get(i) +  "\n\nDescripcion: " + ClsDatos.descripcion.get(i) + "\n\nCantidad: " + ClsDatos.cantidad.get(i) + "\n\nTipo: " + ClsDatos.tipo.get(i) + "\n\nActivo: " + ClsDatos.activo.get(i) + "\n\nPrecio: " + ClsDatos.precio.get(i) );
               break;
            }  
        }
                 if (!encontrado) JOptionPane.showMessageDialog(null, "NO existe");
    }
            
        public static void SetSalvarDatos(String Codigo, String Descripcion, String Cantidad, Boolean Activo, int Precio){
        codigo.add(Codigo);
        descripcion.add(Descripcion);
        cantidad.add(Cantidad);
        activo.add(Activo);
        precio.add(Precio);
}
}