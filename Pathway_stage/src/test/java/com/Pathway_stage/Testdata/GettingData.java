package com.Pathway_stage.Testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.Pathway_stage.Pathwayconstants.PropertiesReader;


public class GettingData
{
	
PropertiesReader read = new PropertiesReader();
/*public String UserNameSheet =read.usernamesheet(); 
public String SiteSheet =read.sitedata();*/
	public String UserNameSheet ="F:\\stage\\Pathway_stage\\src\\Pathway_Satge\\Resources\\usernames.xlsx" ;
	 public String SiteSheet = "F:\\stage\\Pathway_stage\\src\\Pathway_Satge\\Resources\\stagesitedetails.xlsx";
	
		List<String>usernameslist = new ArrayList<String>();
		List<String>passwordlist = new  ArrayList<String>();
		int usernamePos = 1;
		int passwordPos = 2;
		 
		// Old site data
		List<String> rxid = new ArrayList<String>();
		List<String> txid= new ArrayList<String>();
		int column_1_Pos = 2;
		int column_2_Pos = 4;
		 
		 
		public void loadData_Userdata() {
		try {
		FileInputStream excelFile = new FileInputStream(UserNameSheet);
		            Workbook workbook = new XSSFWorkbook(excelFile);
		            Sheet datatypeSheet = workbook.getSheetAt(3);
		          
		            // Username and passwords
		            for(int i = 0;i<=datatypeSheet.getLastRowNum();i++  ) {
		            usernameslist.add(datatypeSheet.getRow(i).getCell(usernamePos).toString());
		            passwordlist.add(datatypeSheet.getRow(i).getCell(passwordPos).toString());
		            }          
		} catch (Exception e) {
		// TODO: handle exception
		}
		}
		 
		public void loadData_oldData() {
		try {
		FileInputStream excelFile = new FileInputStream(SiteSheet);
		            Workbook workbook = new XSSFWorkbook(excelFile);
		            Sheet datatypeSheet = workbook.getSheetAt(0);
		          
		            // Username and passwords
		            for(int i = 0;i<=datatypeSheet.getLastRowNum();i++  ) {
		            txid.add(datatypeSheet.getRow(i).getCell(column_1_Pos).toString());
		           rxid.add(datatypeSheet.getRow(i).getCell(column_2_Pos).toString());
		            }          
		} catch (Exception e) {
		
		}
		}
		 
		public String getUsername(int i) {
		return usernameslist.get(i);
		}
		 
		public String getPassword(int i) {
		return passwordlist.get(i);
		}
		 
		public String getColumn_1(int i) {
		return txid.get(i);
		}
		 
		public String getColumn_2(int i) {
		return rxid.get(i);
		}
		 
		 public GettingData() {
			 super();
				loadData_Userdata();
				loadData_oldData();
		}
		 

}
