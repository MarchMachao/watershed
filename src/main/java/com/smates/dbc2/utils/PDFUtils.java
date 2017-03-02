package com.smates.dbc2.utils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;

import org.xhtmlrenderer.pdf.ITextFontResolver;
import org.xhtmlrenderer.pdf.ITextRenderer;
import org.xml.sax.SAXException;

import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.BaseFont;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

public class PDFUtils {

	public static void toPdfWithMap()
			throws IOException, TemplateException, SAXException, ParserConfigurationException, DocumentException {
		Configuration cfg = new Configuration();
		cfg.setDefaultEncoding("UTF-8");
		Template temp = cfg.getTemplate("/home/page/index.ftl");
		Map<String, String> root = new HashMap<String, String>();
		root.put("userName", "白江伟");
		root.put("age", ((int) (Math.random() * 100)) + "");

		// 合并模板和数据模型
		
		String file1 = "/home/page/pdf/contractTemplate.html";  
        File file = new File(file1);  
        if (!file.exists())  
            file.createNewFile();  
        // Writer out = new FileWriter(file);  
        Writer out = new BufferedWriter(new OutputStreamWriter(  
                new FileOutputStream(file), "utf-8")); 
		temp.process(root, out);
		out.flush();
		
		
		String url = new File(file1).toURI().toURL().toString();  
        String outputFile = "/home/page/pdf/Test.pdf";  
		OutputStream os = new FileOutputStream(outputFile);
		
//		DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//		Document doc = builder.parse(new ByteArrayInputStream(out.toString().getBytes()));
//
//		renderer.setDocument(doc, null);
		
		ITextRenderer renderer = new ITextRenderer();
		renderer.setDocument(url);
		

		// 解决中文支持问题
		ITextFontResolver fontResolver = renderer.getFontResolver();
		fontResolver.addFont("/home/page/SIMHEI.TTF", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);

		// 解决图片的相对路径问题
		renderer.getSharedContext().setBaseURL("file:/home/page/");

		renderer.layout();
		renderer.createPDF(os);

		os.close();

	}

}
