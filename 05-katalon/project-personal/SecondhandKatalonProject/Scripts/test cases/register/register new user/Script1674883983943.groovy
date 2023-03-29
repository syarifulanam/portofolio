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

'Buka app'
Mobile.callTestCase(findTestCase('Test Cases/page/general page/start app'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/page/login page/go to daftar page'), null, FailureHandling.STOP_ON_FAILURE)

newEmail = Mobile.callTestCase(findTestCase('Test Cases/page/register page/generate random email'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/page/register page/input user data'), [('email') : newEmail], FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/page/register page/apply registration'), null, FailureHandling.STOP_ON_FAILURE)

Mobile.callTestCase(findTestCase('Test Cases/page/register page/verify name'), null, FailureHandling.STOP_ON_FAILURE)

'close app'
Mobile.callTestCase(findTestCase('Test Cases/page/general page/close app'), null, FailureHandling.STOP_ON_FAILURE)
