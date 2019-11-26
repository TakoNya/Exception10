package exception10;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Exception10 {

        public static void main(String[] args) {
            String archivo = JOptionPane.showInputDialog("Introduce nombre del archivo:");
            String texto = JOptionPane.showInputDialog("Introduce el texto que quieras escribir en el archivo:");
            escribirArchivo(archivo,texto);
            leerArchivo(archivo);
        
    }
        public static void escribirArchivo(String archivo, String texto){
            try (FileWriter fw = new FileWriter(archivo);){
                fw.write(texto);
            } catch (IOException e){
                System.out.println("Problemas en la escritura del archivo " + e);
            }
        }
        public static void leerArchivo(String archivo){
            try (FileReader fr = new FileReader(archivo)){
                int valor = fr.read();
                while(valor!=-1){
                    char caracter =(char) valor;
                    System.out.print(caracter);
                    valor = fr.read();
                }
            } catch (IOException e){
                System.out.println("Problema con la lectura del archivo " + e);
            }
        }
    
}
