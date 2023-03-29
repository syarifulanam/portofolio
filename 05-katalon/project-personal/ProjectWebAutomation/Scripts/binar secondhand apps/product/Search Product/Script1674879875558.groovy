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

'open application'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/login page/start application'), null, FailureHandling.STOP_ON_FAILURE)

'tap search bar\r\n'
Mobile.tap(findTestObject('Object Repository/Secondhand_App/android.widget.EditText - Cari di Second Chance (2)'), 0)

'input makanan untuk makan siang'
Mobile.setText(findTestObject('Object Repository/Secondhand_App/android.widget.EditText - Cari di Second Chance (3)'), 'makanan untuk makan siang', 
    0)

'tap search result'
Mobile.tap(findTestObject('Object Repository/Secondhand_App/android.widget.ImageView (2)'), 0)

'search result should be same with input'
Mobile.verifyElementText(findTestObject('Object Repository/Secondhand_App/android.widget.TextView - Makanan Untuk Makan Siang (1)'), 
    'Makanan Untuk Makan Siang')

Mobile.closeApplication()

