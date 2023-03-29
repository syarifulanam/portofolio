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

'start application'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/login page/start application'), null, FailureHandling.STOP_ON_FAILURE)

'go to daftar page'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/login page/go to daftar page'), null, FailureHandling.STOP_ON_FAILURE)

'input user data'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/register page/input user data'), [('email') : getRandomEmail()], FailureHandling.STOP_ON_FAILURE)

'scroll sudah punya akun?'
Mobile.scrollToText('sudah punya akun?')

'apply registration'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/register page/apply registration'), null, FailureHandling.STOP_ON_FAILURE)

'verify name'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/register page/verify name'), null, FailureHandling.STOP_ON_FAILURE)

'close apps'
Mobile.callTestCase(findTestCase('Test Cases/binar secondhand apps/Page/login page/close application'), null, FailureHandling.STOP_ON_FAILURE)

protected String getRandomEmail() {
    String SALTCHARS = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890'

    StringBuilder salt = new StringBuilder()

    Random rnd = new Random()

    while (salt.length() < 10) {
        int index = ((rnd.nextFloat() * SALTCHARS.length()) as int)

        salt.append(SALTCHARS.charAt(index))
    }
    
    String saltStr = salt.toString()

    return saltStr + '@mail.com'
}

