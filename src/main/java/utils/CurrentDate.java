
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
         String data = "";
        public String verificarData(){
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = (formato.format(dataAtual));
        return data;
        }
        
        
        public String verificarDataCompleta(){
        Date current = new Date();
        DateFormat dateFull = DateFormat.getDateInstance(DateFormat.FULL);
        data = (dateFull.format(current));
        return data; 
    }
}
