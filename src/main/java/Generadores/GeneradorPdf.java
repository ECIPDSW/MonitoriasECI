/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generadores;

import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;



/**
 *
 * @author marti
 */
public class GeneradorPdf {
    private Font fuenteBold = new Font(Font.FontFamily.COURIER,8,Font.BOLD);
    private Font fuenteGold = new Font(Font.FontFamily.TIMES_ROMAN,8,Font.NORMAL);
    
    
    public void generarPDF(String encabezado,String info,String info2,String info3,String info4,String rutaImagen1,String rutaImagen2,String rutaImagen3,String rutaImagen4,String NOMBRE){
        try{
            Document documento = new Document(PageSize.A7 ,36,36,10,10);
            PdfWriter.getInstance(documento,new FileOutputStream(NOMBRE));
            documento.open();
            documento.add(getEncabezado(encabezado));
            documento.add(getInfo(info));
            Image grafica1 = Image.getInstance(rutaImagen1);
            grafica1.scaleAbsolute(200,100);
            grafica1.setAlignment(Element.ALIGN_CENTER);
            documento.add(grafica1);
            documento.add(getInfo(info2));
            Image grafica2 = Image.getInstance(rutaImagen2);
            grafica2.scaleAbsolute(200,100);
            grafica2.setAlignment(Element.ALIGN_CENTER);
            documento.add(grafica2);
            documento.add(getInfo(info3));
            Image grafica3 = Image.getInstance(rutaImagen3);
            grafica3.scaleAbsolute(200,100);
            grafica3.setAlignment(Element.ALIGN_CENTER);
            documento.add(grafica3);
            documento.add(getInfo(info4));
             Image grafica4 = Image.getInstance(rutaImagen4);
            grafica4.scaleAbsolute(200,100);
            grafica4.setAlignment(Element.ALIGN_CENTER);
            documento.add(grafica4);
            documento.close();
        }
        catch(Exception e){
        }
    }
    
    public void generarPdfv2(String encabezado,String info,String info2,String info3,String info4,String salida){
        try{
            Document documento = new Document(PageSize.A7 ,36,36,10,10);
            PdfWriter.getInstance(documento,new FileOutputStream(salida));
            documento.open();
            documento.add(getEncabezado(encabezado));
            documento.add(getInfo(info));
            documento.add(getInfo(info2));
            documento.add(getInfo(info3));
            documento.add(getInfo(info4));
            documento.close();
        }
        catch(Exception e){
        }
    }
    
    private Paragraph getInfo(String texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_LEFT);
        c.append(texto);
        c.setFont(fuenteGold);
        p.add(c);
        return p;
    }
    private Paragraph getEncabezado(String texto){
        Paragraph p = new Paragraph();
        Chunk c = new Chunk();
        p.setAlignment(Element.ALIGN_CENTER);
        c.append(texto);
        c.setFont(fuenteBold);
        p.add(c);
        return p;
    }
    
}
