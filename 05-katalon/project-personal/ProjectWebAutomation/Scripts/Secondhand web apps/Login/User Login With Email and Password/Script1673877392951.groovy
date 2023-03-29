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

'open browser'
WebUI.openBrowser('')

'navigate url to -> https//secondhand-store.herokuapp.com/'
WebUI.navigateToUrl('https://secondhand-store.herokuapp.com/')

'click button masuk on top right page'
WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/a_Masuk'))

'type registered user'
WebUI.setEncryptedText(findTestObject('Object Repository/Page_Secondhand Store/input_Password_exampleInputPassword1'), 'hXKlGQcFW3DQGyYWhom4MQ==')

'type correct password'
WebUI.setText(findTestObject('Object Repository/Page_Secondhand Store/input_Email_exampleInputEmail1'), 'asdadsadsads@mail.com')

'click button masuk'
WebUI.click(findTestObject('Object Repository/Page_Secondhand Store/button_Masuk'))

'user able to see notification button'
WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Secondhand Store/p_Akun tidak ditemukan'), 0)

'close browser'
WebUI.closeBrowser()

