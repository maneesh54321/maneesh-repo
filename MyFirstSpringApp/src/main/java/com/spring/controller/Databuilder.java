package com.spring.controller;

import java.io.File;
import java.io.FileOutputStream;

public class Databuilder {

	public static void main(String[] args) {
		try {
			File file =new File("/home/maneesh/Work/data.txt");
			FileOutputStream fos=new FileOutputStream(file);
			String content="";
			for(int i=1;i<=20000;i++) {
				content=content+"INSERT INTO testdb.iap_anlt_resource (id,resource_id,resource_name,resource_type,propagation_type,lob,service_area) \n" + 
						"VALUES("+i+",'resource"+i+"','resource"+i+"','processStep','rollup','OM','test');\n";
				if(i%50==0) {
					fos.write(content.getBytes("UTF-8"));
					fos.flush();
					content="";
				}
			}
			
			System.out.println("Done!!!!");
			fos.close();
		} catch (Exception e) {
			System.err.println("Exception occured!!!");
		}

	}

}
