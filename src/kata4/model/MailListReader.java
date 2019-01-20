package kata4.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import kata4.view.Mail;

public class MailListReader {
    
    public static List<Mail> read(String fileName){
        List<Mail> correos = new LinkedList<>();
        
        try (FileReader fr = new FileReader(fileName)) {
            BufferedReader br = new BufferedReader(fr);
            String linea;
            while((linea= br.readLine())!=null){
                if(linea.contains("@")){
                    correos.add(new Mail(linea));
                }
            }
            fr.close();
            
        }catch (IOException e){
            System.out.println("Error leyendo archivo" + e);
        }
        return correos;
    }
}
