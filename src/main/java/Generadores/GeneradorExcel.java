/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generadores;
import java.io.File;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.Border;
import jxl.format.BorderLineStyle;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

/**
 *
 * @author marti
 */
public class GeneradorExcel implements Serializable {
    public void generarExcel(String[][] entrada, String salida) throws WriteException{
        try{
            WorkbookSettings conf = new WorkbookSettings();
            conf.setEncoding("ISO-8859-1");
            WritableWorkbook woorBook = Workbook.createWorkbook(new File(salida),conf);
        
            WritableSheet sheet = woorBook.createSheet("Consultas", 0);
            WritableFont h = new WritableFont(WritableFont.ARIAL,10,WritableFont.NO_BOLD);
            WritableCellFormat hFormat = new WritableCellFormat(h);
            hFormat.setBorder(Border.ALL, BorderLineStyle.MEDIUM);
            
            for(int i=1; i<entrada.length;i++){
                for(int j=1; j<entrada.length;j++){
                    try{
                    sheet.addCell(new jxl.write.Label(j,i,entrada[i][j],hFormat));
                    }
                    catch(WriteException ex){
                        Logger.getLogger(GeneradorExcel.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }
            woorBook.write();
            try {
                woorBook.close();
            } catch (WriteException ex) {
                Logger.getLogger(GeneradorExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        catch(IOException ex){
            Logger.getLogger(GeneradorExcel.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
}
