package InterfacesGraficas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteIText {

    public static void main(String[] args) {
        String dataInicial = "27/05/2021";
        String dataFinal = "30/05/2021";
        SimpleDateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
        Date inipadBR = formatBR.parse(dataInicial);
        Date finpadBR = formatBR.parse(dataFinal);
        
        long dt = (finpadBR.getTime() - inipadBR.getTime())/86400000;
        
            System.out.println(dt);            
        
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
