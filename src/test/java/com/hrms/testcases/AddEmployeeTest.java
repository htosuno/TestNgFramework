package com.hrms.testcases;

import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.hrms.utils.CommonMethods;
import com.hrms.utils.ConfigsReader;
import com.hrms.utils.Constants;
import com.hrms.utils.ExcelUtility;

public class AddEmployeeTest extends CommonMethods {
	@Test(groups = "regression", dataProvider = "getData")
	public void addEmployee(String firstName, String lastName, String username, String password) {
		sendText(login.userNameTextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

		jsClick(dash.pimLinkBtn);
		jsClick(dash.addEmpButton);

		sendText(addEmp.firstNameField, firstName);
		sendText(addEmp.lastName, lastName);
		click(addEmp.createLoginDetailsCheckbox);
		sendText(addEmp.userName, username);
		sendText(addEmp.userPassword, password);
		sendText(addEmp.confirmPassword, password);
		click(addEmp.saveButton);

		Assert.assertEquals(persDetails.profileName.getText(), firstName + " " + lastName);
	}

	@Test(groups = "regression")
	public void addMutipleEmployees() {
		sendText(login.userNameTextBox, ConfigsReader.getPropValue("username"));
		sendText(login.passwordTextBox, ConfigsReader.getPropValue("password"));
		click(login.btnLogin);

		jsClick(dash.pimLinkBtn);

		List<Map<String, String>> employeeList = ExcelUtility.excelToListMap(Constants.TESTDATA_FILEPATH,
				"AddEmployee");
		SoftAssert soft = new SoftAssert();

		for (Map<String, String> map : employeeList) {
			jsClick(dash.addEmpButton);

			String firstName = map.get("FirstName");
			String middleName = map.get("MiddleName");
			String lastName = map.get("LastName");

			sendText(addEmp.firstNameField, firstName);
			sendText(addEmp.middleName, middleName);
			sendText(addEmp.lastName, lastName);
			click(addEmp.saveButton);

			soft.assertEquals(persDetails.profileName.getText(), firstName + " " + middleName + " " + lastName);

		}
		soft.assertAll();

	}

	@DataProvider
	public static String[][] getData() {
		String[][] data = { 
				{ "Alice", "Silve", "Alstydfisil4x4", "!K!ters1Duzf" },
				{ "Asal", "Siasaf", "Alisiasal4x5", "!K!ters1Duz" }, 
//				{ "Alan", "Sil", "Alishtyifl4x6", "!K!ters1Duz" },
//				{ "Ali", "Si3", "Atyufrulisil4x7", "!K!ters1Duz" }, 
//				{ "Alfi", "Sil", "Alisil4fx8", "!K!tefrs1Duz" } 
				};
		return data;
	}

}
