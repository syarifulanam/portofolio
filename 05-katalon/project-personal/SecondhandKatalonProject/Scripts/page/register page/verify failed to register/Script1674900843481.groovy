import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.AppiumDriver

import org.openqa.selenium.Keys as Keys

// test case ini untuk mengecek apakah ada pesan error pada android "email sudah digunakan"
'Verify Email already used'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

def toast = driver.findElementsByXPath("//android.widget.Toast[@text='Email sudah digunakan']")
if (toast == null) {
	KeywordUtil.markFailed('ERROR: Toast object not found!') // kalau tidak ada pesan tersebut maka hasil test case akan menjadi merah
} else {
	KeywordUtil.markPassed(toast.toString()) // kalau ada pesan tersebut maka hasil test case akan menjadi hijau
}