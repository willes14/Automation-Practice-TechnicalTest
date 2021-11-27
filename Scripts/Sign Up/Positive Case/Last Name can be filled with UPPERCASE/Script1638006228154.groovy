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

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=authentication&back=my-account')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Email address_email_create'), 'emailuntuktesting56@gmail.com')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Create an account'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Mr_id_gender'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_firstname'), 'Testing')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__customer_lastname'), 'COBA')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login - My Store/input__passwd'), 'EV3JxIEo5cBNUHzFsZVFE38r9/l4bdqU')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-12345678910111213141516171819202122_51e29d'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-JanuaryFebruaryMarchAprilMayJuneJul_702766'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-20212020201920182017201620152014201_28b437'), 
    '1990', true)

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_December_newsletter'))

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/input_Sign up for our newsletter_optin'))

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Company_company'), 'Perusahaan Testing')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__address1'), 'Jl. Testing coba no.55')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Address (Line 2)_address2'), 'Apartement Test')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__city'), 'Jakarta')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Login - My Store/select_-AlabamaAlaskaArizonaArkansasCalifor_c52141'), 
    '11', true)

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__postcode'), '15566')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/textarea_Additional information_other'), 'Test additional information 123456 !@#$%^')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input_Home phone_phone'), '021345678')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__phone_mobile'), '08987654321')

WebUI.setText(findTestObject('Object Repository/Page_Login - My Store/input__alias'), 'Testing Coba')

WebUI.click(findTestObject('Object Repository/Page_Login - My Store/span_Register'))

