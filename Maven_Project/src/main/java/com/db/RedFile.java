package com.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class RedFile {
	
	
		
		public static Properties redFile(String path) throws IOException{
			
			FileInputStream f=new FileInputStream(new File (path));
			Properties p = new Properties();
			p.load(f);
			return p;
			
		}

	}



