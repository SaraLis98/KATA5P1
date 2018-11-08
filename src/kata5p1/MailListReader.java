
package kata5p1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class MailListReader {
    public static List<String> read(String fileName) throws FileNotFoundException, IOException {
        List<String> lista = new ArrayList<>();
        String ar ="@";
        
        try {
            FileReader fr = new FileReader (fileName);
            BufferedReader br = new BufferedReader(fr);
             String linea;
            while((linea=br.readLine())!=null) {;
                if(linea.contains(ar)){
                    lista.add(new String(linea));
                } 
            }
            br.close();
            fr.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        return lista;
    }
}
