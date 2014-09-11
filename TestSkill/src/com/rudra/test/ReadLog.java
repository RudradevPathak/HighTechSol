package com.rudra.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

public class ReadLog {

	public static void main(String[] args) throws IOException, ParserConfigurationException, TransformerException {
		//Excel
		  Map<String, Object[]> data = new HashMap<String, Object[]>();
		  data.put("1", new Object[] {"DateTime", "Type", "PinCode"});
		  
		//xml
		 DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder dBuilder;
	        
	            dBuilder = dbFactory.newDocumentBuilder();
	            Document doc = dBuilder.newDocument();
	            //add elements to Document
	            Element rootElement =
	                doc.createElementNS("Trackid", "Log");
	            //append root element to document
	            doc.appendChild(rootElement);
	            //
	
		BufferedReader br  = new BufferedReader(new FileReader("C://Users/User/Desktop/logs/trackidLive.txt"));
		String line ;
		int i = 0;
		
		
		 FileWriter writer = new FileWriter("C://Users/User/Desktop/logs/LogData.txt");
		while ((line = br.readLine()) != null) {
			
			//give your input here to read your content line
			if(line.contains("pincode")){
				i++;
				line = line + "\n";
	            // Writes the content to the file
	            writer.write(line); 
	            //In xml 
	           String newL=  line.replace("{", "");
	           String fl = newL.replace("}", "");
	           String data0 = String.valueOf(fl.subSequence(0, 17));
	           String data1 = String.valueOf(fl.subSequence(47, 54));
	           String data2 = String.valueOf(fl.subSequence(56, fl.length()-1));
	         //  if(data2 != null && data2.trim() != ""){
	           //append first child element to root element
	            rootElement.appendChild(getData(doc, String.valueOf(i), "9", data0, data1, data2));
	 
	           
	            //for output to file, console
	            TransformerFactory transformerFactory = TransformerFactory.newInstance();
	            Transformer transformer = transformerFactory.newTransformer();
	            //for pretty print
	            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
	            DOMSource source = new DOMSource(doc);
	 
	            //write to console or file
	            StreamResult console = new StreamResult(System.out);
	            StreamResult file = new StreamResult(new File("C://Users/User/Desktop/logs/TrackidLogData.xml"));
	 
	            //write data
	            transformer.transform(source, console);
	            transformer.transform(source, file);
	            //xml
	            
	            //Excel 
	           
	   		   data.put(String.valueOf(i+1), new Object[] {data0, data1, data2});
	   		
	           //}
	         
		}
		}
		String total = "Total pincode line : " + String.valueOf(i);
		  writer.write(total);
		  br.close();
		  writer.close();
		   ExcelData(data,i );
		 
	 
	       
	 
	}
	private static Node getData(Document doc, String count, String Command, String date, String type,
            String pin) {
        Element trackidlog = doc.createElement("TrackidLog");
 
     
        trackidlog.setAttribute("Count", count);
        trackidlog.appendChild(getDataElements(doc, trackidlog, "DateTime", date));
        
        trackidlog.appendChild(getDataElements(doc, trackidlog, "Command", Command));
 
    
        trackidlog.appendChild(getDataElements(doc, trackidlog, "Type", type));
 
   
        trackidlog.appendChild(getDataElements(doc, trackidlog, "Pin", pin));
 
        return trackidlog;
    }
	 private static Node getDataElements(Document doc, Element element, String trackid, String value) {
	        Element node = doc.createElement(trackid);
	        node.appendChild(doc.createTextNode(value));
	        return node;
	    }
	 
	 private static void ExcelData(Map<String, Object[]> data, int i ){
		 
		 HSSFWorkbook workbook = new HSSFWorkbook();
		 HSSFSheet sheet = workbook.createSheet("Log sheet");
		  
		
		
		 Set<String> keyset = data.keySet();
		 int rownum = 0;
		 for (int j = 1; j<= i ; j++) {
		     Row row = sheet.createRow(rownum++);
		     Object [] objArr = data.get(String.valueOf(j));
		     int cellnum = 0;
		     for (Object obj : objArr) {
		         Cell cell = row.createCell(cellnum++);
		         if(obj instanceof Date) 
		             cell.setCellValue((Date)obj);
		         else if(obj instanceof Boolean)
		             cell.setCellValue((Boolean)obj);
		         else if(obj instanceof String)
		             cell.setCellValue((String)obj);
		         else if(obj instanceof Double)
		             cell.setCellValue((Double)obj);
		     }
		 }
		  
		 try {
		     FileOutputStream out = 
		             new FileOutputStream(new File("C://Users/User/Desktop/logs/logExcel.xls"));
		     workbook.write(out);
		     out.close();
		     System.out.println("Excel written successfully..");
		      
		 } catch (FileNotFoundException e) {
		     e.printStackTrace();
		 } catch (IOException e) {
		     e.printStackTrace();
		 }
	 }

}
