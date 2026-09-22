
package logica;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class  EncuestaUsuario {
    
    
    public void escribirArchivo(String texto){
        String rutaArchivo = "ArchivosEncuesta/EncuestasUsuarios.txt";
        try (FileWriter archivo = new FileWriter (rutaArchivo, true);
             BufferedWriter bw = new BufferedWriter(archivo)) {
            bw.write(texto);
            bw.newLine();
            bw.newLine();
        }catch (IOException e) {
            System.out.println("Error al guardar la encuesta: " + e.getMessage());
        }
    }
}
