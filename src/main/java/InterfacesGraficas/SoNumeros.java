package InterfacesGraficas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//CLASSE UTILIZADA PARA QUE UMA TEXTFIELD SO RECEBA NUMEROS
public class SoNumeros extends PlainDocument{
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
        
        super.insertString(offs, str.replaceAll("[^0-9]", ""), a);
    }  
}
