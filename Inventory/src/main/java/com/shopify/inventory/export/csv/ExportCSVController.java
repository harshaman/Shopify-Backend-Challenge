package com.shopify.inventory.export.csv;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import com.opencsv.CSVWriter;
import com.shopify.inventory.product.Product;
import com.shopify.inventory.service.InventoryService;

@Component
@Controller
public class ExportCSVController {
	
	@Autowired
	private InventoryService inventoryService;
	
	@RequestMapping( value="/export")
	public String writeToCSV(HttpServletResponse response, HttpServletRequest request) {
		File file = new File("Data.csv");
		List<Product> productList = inventoryService.fetchInventoryDetails();
		try {
	        FileWriter outputfile = new FileWriter(file);
	  
	        CSVWriter writer = new CSVWriter(outputfile);
	  
	        String[] header = { "Product ID", "Product Name", "Inventory Count", "Warehouse Code", "Total Price", "In stock" };
	        writer.writeNext(header);
	        for(Product product: productList) {
	        	
	        	String inStock = product.getCount()>0? "Yes": "No";
	        		
	        	String[] data = { String.valueOf(product.getId()), product.getName(), 
	        			String.valueOf(product.getCount()), product.getWarehouse_code(), 
	        			product.getPriceData().getCurrency().getSymbol() + " " + 
	        			product.getPriceData().getGrossPrice().toString() , inStock  };
	        	writer.writeNext(data);
	        }
	        
	  
	        writer.close();
	        String mimeType = "text/csv";
	        response.setContentType(mimeType);
	        String reportFileName = "report.csv";
	        response.setHeader("Content-Disposition", String.format("attachment; filename=\""+reportFileName+"\""));
	        response.setContentLength((int) file.length());
	        InputStream inputStream = new BufferedInputStream(new FileInputStream(file));

	        FileCopyUtils.copy(inputStream, response.getOutputStream());
	        response.flushBuffer();
	    }
	    catch (IOException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    }
		return "export.html";
	}

}
