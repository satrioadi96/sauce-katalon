import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url_testing)

WebUI.setViewPortSize(1200, 700)

WebUI.click(findTestObject('Object Repository/SAP6-02/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'))

for (def rowNum = 1; rowNum <= findTestData('Data Files/Raw Data/Login').getRowNumbers(); rowNum++) {
	
	WebUI.setText(findTestObject('Object Repository/SAP6-02/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_db77ac'),
		 findTestData('Data Files/Raw Data/Login').getValue(1, rowNum))
	
	WebUI.setEncryptedText(findTestObject('Object Repository/SAP6-02/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_3423e9'),
		findTestData('Data Files/Raw Data/Login').getValue(2, rowNum))
	
	WebUI.click(findTestObject('Object Repository/SAP6-02/Page_Swag Labs/input_standard_userlocked_out_userproblem_u_0dff71'))
}



WebUI.closeBrowser()

