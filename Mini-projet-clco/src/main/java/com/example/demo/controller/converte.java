package com.example.demo.controller;


import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.ImageType;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.tools.imageio.ImageIOUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.URL;
@Service
public class converte {
    private static String uploadDirectory=System.getProperty("user.dir")+ "/uplode";
    @Autowired
    Mycontroller mycontroller;

    @ResponseBody
    public void generatePDFFromTxt(String filename) {
        try {
            Document pdfDoc = new Document(PageSize.A4);
            PdfWriter.getInstance(pdfDoc, new FileOutputStream(uploadDirectory + "/" + filename+"PDF" + ".pdf"))
                    .setPdfVersion(PdfWriter.PDF_VERSION_1_7);
            pdfDoc.open();
            Font myfont = new Font();
            myfont.setStyle(Font.NORMAL);
            myfont.setSize(11);
            pdfDoc.add(new Paragraph("\n"));
            BufferedReader br = new BufferedReader(new FileReader(uploadDirectory + "/" + filename));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                Paragraph para = new Paragraph(strLine + "\n", myfont);
                para.setAlignment(Element.ALIGN_JUSTIFIED);
                pdfDoc.add(para);
            }
            pdfDoc.close();
            br.close();
            mycontroller.deleteFile(filename);
           // uploadFileController.deleteFile(filename);
         //   downloadFile.Download("uploeadtheme2 .pdf", uploadDirectory, response);
        } catch (Exception e) {

        }
    }

}
