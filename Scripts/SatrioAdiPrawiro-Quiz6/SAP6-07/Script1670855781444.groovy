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

WebUI.navigateToUrl('https://www.saucedemo.com')

WebUI.setText(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_user-name'), 'problem_user')

WebUI.setEncryptedText(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_password'), 'qcu24s4901FyWDTwXGr6XA==')

WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_login-button'))

WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/button_Add to cart_1'))

WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/a_shopping_cart_link'))

WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/button_Checkout'))

for (def rowNum = 1; rowNum <= findTestData('Data Files/Raw Data/CO').getRowNumbers(); rowNum++) {
    WebUI.setText(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_firstName'), findTestData('Data Files/Raw Data/CO').getValue(
            1, rowNum))

    WebUI.setText(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_lastName'), findTestData('Data Files/Raw Data/CO').getValue(
            2, rowNum))

    WebUI.setText(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_postalCode'), findTestData('Data Files/Raw Data/CO').getValue(
            3, rowNum))

    WebUI.click(findTestObject('Object Repository/SAP6-06/Page_Swag Labs/input_continue'))
}

WebUI.closeBrowser()

