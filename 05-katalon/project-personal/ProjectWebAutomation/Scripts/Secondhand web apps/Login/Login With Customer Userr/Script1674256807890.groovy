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

Mobile.startApplication('C:\\Users\\Anam\\Downloads\\app-release(1).apk', true)

Mobile.tap(findTestObject('Object Repository/Secondhand_App/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/Secondhand_App/android.widget.Button - Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Secondhand_App/android.widget.EditText - Masukkan email'), 'studentqa3@binar.id', 
    0)

Mobile.setEncryptedText(findTestObject('Object Repository/Secondhand_App/android.widget.EditText - Masukkan password'), 
    'sqrGCS8Hs40dHFxdETyn+Q==', 0)

Mobile.tap(findTestObject('Object Repository/Secondhand_App/android.widget.Button - Masuk (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Secondhand_App/android.widget.TextView - Students QA 3'), 0)

Mobile.closeApplication()

