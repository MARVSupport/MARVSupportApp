
package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentDate {
    //variável local
         String data = "";
         //metodo que verifica e retorna a data no formado dia/mês/ano
        public String verificarData(){
        Date dataAtual = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        data = (formato.format(dataAtual));
        return data;
        }
        //metodo que verifica e retorna a data no formado dia/mês/ano por extenso
        public String verificarDataCompleta(){
        Date current = new Date();
        DateFormat dateFull = DateFormat.getDateInstance(DateFormat.FULL);
        data = (dateFull.format(current));
        return data; 
    }
}
