package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class Utilities {
	public static Properties prop;

	public static Properties getProperty() throws IOException {

		prop = new Properties();
		
				String propertiesPath = System.getProperty("user.dir") 
		        + java.io.File.separator + "src"
		        + java.io.File.separator + "test"
		        + java.io.File.separator + "resources"
		        + java.io.File.separator + "config.properties";
		FileInputStream file = new FileInputStream(propertiesPath);
		prop.load(file);
		return prop;
	}
	
	 @DataProvider(name = "leaveData")
	 public Object[][] leaveData() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("Leave");
	     Object[][] data = new Object[rows][4];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Leave",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Leave",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("Leave",i, 2); // FromDate
	         data[i - 1][3] = ExcelUtility.getData("Leave",i, 3); // ToDate
	     }

	     return data;
	 }
	 @DataProvider(name = "HalfDayleaveData")
	 public Object[][] HalfDayleaveData() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("HalfDayLeave");
	     Object[][] data = new Object[rows][5];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("HalfDayLeave",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("HalfDayLeave",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("HalfDayLeave",i, 2); // FromDate
	         data[i - 1][3] = ExcelUtility.getData("HalfDayLeave",i, 3); // ToDate
	         data[i - 1][4] = ExcelUtility.getData("HalfDayLeave",i, 4); // Session
	     }

	     return data;
	 }
	 @DataProvider(name = "PermissionData")
	 public Object[][] PermissionData() throws Exception {

	     int rows = ExcelUtility.getRowCount("Permission");

	     Object[][] data = new Object[rows][3];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Permission",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Permission",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("Permission",i, 2); // PermissionDate
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "SingleClaimData")
	 public Object[][] SingleClaimData() throws Exception {

	     int rows = ExcelUtility.getRowCount("Claim");

	     Object[][] data = new Object[rows][4];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Claim",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Claim",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("Claim",i, 2); // ClaimDate
	         data[i - 1][3] = ExcelUtility.getData("Claim",i, 3); // ReceiptDate
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "MultipleClaimData")
	 public Object[][] MultipleClaimData() throws Exception {

	     int rows = ExcelUtility.getRowCount("Claim");

	     Object[][] data = new Object[rows][5];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Claim",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Claim",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("Claim",i, 2); // ClaimDate
	         data[i - 1][3] = ExcelUtility.getData("Claim",i, 3); // ReceiptDate
	         data[i - 1][4] = Integer.parseInt(ExcelUtility.getData("Claim",i, 4)); // Amount
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "SignInDatas")
	 public Object[][] SignInDate() throws Exception {

	     int rows = ExcelUtility.getRowCount("Signin");

	     Object[][] data = new Object[rows][2];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Signin",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Signin",i, 1); // Password
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "SignInDatas1")
	 public Object[][] SignInDate1() throws Exception {

	     int rows = ExcelUtility.getRowCount("Signin1");

	     Object[][] data = new Object[rows][2];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("Signin1",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("Signin1",i, 1); // Password
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "RequestEntrySignInDatas")
	 public Object[][] RequestEntrySignInDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("RequestSignIn");

	     Object[][] data = new Object[rows][6];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("RequestSignIn",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("RequestSignIn",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("RequestSignIn",i, 2); // Attendance Date
	         data[i - 1][3] = ExcelUtility.getData("RequestSignIn",i, 3); // Hours
	         data[i - 1][4] = ExcelUtility.getData("RequestSignIn",i, 4); // Mins
	         data[i - 1][5] = ExcelUtility.getData("RequestSignIn",i, 5); // Duration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "RequestEntryStepOutDatas")
	 public Object[][] RequestEntryStepOutDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("RequestStepOut");

	     Object[][] data = new Object[rows][6];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("RequestStepOut",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("RequestStepOut",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("RequestStepOut",i, 2); // Attendance Date
	         data[i - 1][3] = ExcelUtility.getData("RequestStepOut",i, 3); // Hours
	         data[i - 1][4] = ExcelUtility.getData("RequestStepOut",i, 4); // Mins
	         data[i - 1][5] = ExcelUtility.getData("RequestStepOut",i, 5); // Duration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "RequestEntryStepInDatas")
	 public Object[][] RequestEntryStepInDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("RequestStepIn");

	     Object[][] data = new Object[rows][6];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("RequestStepIn",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("RequestStepIn",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("RequestStepIn",i, 2); // Attendance Date
	         data[i - 1][3] = ExcelUtility.getData("RequestStepIn",i, 3); // Hours
	         data[i - 1][4] = ExcelUtility.getData("RequestStepIn",i, 4); // Mins
	         data[i - 1][5] = ExcelUtility.getData("RequestStepIn",i, 5); // Duration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "RequestEntrySignOutDatas")
	 public Object[][] RequestEntrySignOutDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("RequestSignOut");

	     Object[][] data = new Object[rows][6];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("RequestSignOut",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("RequestSignOut",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("RequestSignOut",i, 2); // Attendance Date
	         data[i - 1][3] = ExcelUtility.getData("RequestSignOut",i, 3); // Hours
	         data[i - 1][4] = ExcelUtility.getData("RequestSignOut",i, 4); // Mins
	         data[i - 1][5] = ExcelUtility.getData("RequestSignOut",i, 5); // Duration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "LeaveCancelData")
	 public Object[][] LeaveCancelData() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("LeaveCancel");
	     Object[][] data = new Object[rows][4];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("LeaveCancel",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("LeaveCancel",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("LeaveCancel",i, 2); // FromDate
	         data[i - 1][3] = ExcelUtility.getData("LeaveCancel",i, 3); // ToDate
	     }

	     return data;
	
}
	 @DataProvider(name = "OverTimeData")
	 public Object[][] OverTimeData() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("OverTime");
	     Object[][] data = new Object[rows][4];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("OverTime",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("OverTime",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("OverTime",i, 2); // FromDate
	         data[i - 1][3] = ExcelUtility.getData("OverTime",i, 3); // ToDate
	     }

	     return data;
	 }
	 @DataProvider(name = "LocumEntryDatas")
	 public Object[][] LocumEntryDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("LocumEntry");

	     Object[][] data = new Object[rows][9];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("LocumEntry",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("LocumEntry",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("LocumEntry",i, 2); // locum Date
	         data[i - 1][3] = ExcelUtility.getData("LocumEntry",i, 3); // InHours
	         data[i - 1][4] = ExcelUtility.getData("LocumEntry",i, 4); // InMins
	         data[i - 1][5] = ExcelUtility.getData("LocumEntry",i, 5); // InDuration AM/PM
	         data[i - 1][6] = ExcelUtility.getData("LocumEntry",i, 6); // OutHours
	         data[i - 1][7] = ExcelUtility.getData("LocumEntry",i, 7); // OutMins
	         data[i - 1][8] = ExcelUtility.getData("LocumEntry",i, 8); // OutDuration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "ContractTimeEntryDatas")
	 public Object[][] ContractTimeEntryDatas() throws Exception {

	     int rows = ExcelUtility.getRowCount("ContractTimeEntry");

	     Object[][] data = new Object[rows][15];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("ContractTimeEntry",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("ContractTimeEntry",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("ContractTimeEntry",i, 2); // locum Date
	         data[i - 1][3] = ExcelUtility.getData("ContractTimeEntry",i, 3); // InHours
	         data[i - 1][4] = ExcelUtility.getData("ContractTimeEntry",i, 4); // InMins
	         data[i - 1][5] = ExcelUtility.getData("ContractTimeEntry",i, 5); // InDuration AM/PM
	         data[i - 1][6] = ExcelUtility.getData("ContractTimeEntry",i, 6); // OutHours
	         data[i - 1][7] = ExcelUtility.getData("ContractTimeEntry",i, 7); // OutMins
	         data[i - 1][8] = ExcelUtility.getData("ContractTimeEntry",i, 8); // OutDuration AM/PM
	         data[i - 1][9] = ExcelUtility.getData("ContractTimeEntry",i, 9); // BreakOutHours
	         data[i - 1][10] = ExcelUtility.getData("ContractTimeEntry",i, 10); // BreakOutMins
	         data[i - 1][11] = ExcelUtility.getData("ContractTimeEntry",i, 11); // BreakOutDuration AM/PM
	         data[i - 1][12] = ExcelUtility.getData("ContractTimeEntry",i, 12); // BreakInHours
	         data[i - 1][13] = ExcelUtility.getData("ContractTimeEntry",i, 13); // BreakInMins
	         data[i - 1][14] = ExcelUtility.getData("ContractTimeEntry",i, 14); // BreakInDuration AM/PM
	        
	     }

	     return data;
	 }
	 @DataProvider(name = "ReplacementleaveData")
	 public Object[][] ReplacementleaveData() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("ReplacementLeave");
	     Object[][] data = new Object[rows][7];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("ReplacementLeave",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("ReplacementLeave",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("ReplacementLeave",i, 2); // WorkedOnDays
	         data[i - 1][3] = ExcelUtility.getData("ReplacementLeave",i, 3); // Days
	         data[i - 1][4] = ExcelUtility.getData("ReplacementLeave",i, 4); // WorkedDuration
	         data[i - 1][5] = ExcelUtility.getData("ReplacementLeave",i, 5); // WorkedOnDate
	         data[i - 1][6] = ExcelUtility.getData("ReplacementLeave",i, 6); // LeaveSession
	     }

	     return data;
	 }
	 @DataProvider(name = "CancelReplacementLeaveDatas")
	 public Object[][] CancelReplacementLeaveDatas() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("CancelReplacementLeave");
	     Object[][] data = new Object[rows][4];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("CancelReplacementLeave",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("CancelReplacementLeave",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("CancelReplacementLeave",i, 2); // Type
	         data[i - 1][3] = ExcelUtility.getData("CancelReplacementLeave",i, 3); // LeaveDays
	     }

	     return data;
	 }
	 @DataProvider(name = "ClaimReplacementLeaveDatas")
	 public Object[][] ClaimReplacementLeaveDatas() throws Exception {

	  
	     int rows = ExcelUtility.getRowCount("ClaimReplacementLeave");
	     Object[][] data = new Object[rows][6];

	     for (int i = 1; i <= rows; i++) {
	         data[i - 1][0] = ExcelUtility.getData("ClaimReplacementLeave",i, 0); // UserName
	         data[i - 1][1] = ExcelUtility.getData("ClaimReplacementLeave",i, 1); // Password
	         data[i - 1][2] = ExcelUtility.getData("ClaimReplacementLeave",i, 2); // Replacement Date
	         data[i - 1][3] = ExcelUtility.getData("ClaimReplacementLeave",i, 3); // Replacement Date DropDown
	         data[i - 1][4] = ExcelUtility.getData("ClaimReplacementLeave",i, 4); // Claim Date
	         data[i - 1][5] = ExcelUtility.getData("ClaimReplacementLeave",i, 5); // Leave Session
	         
	     }

	     return data;
	 }
}
