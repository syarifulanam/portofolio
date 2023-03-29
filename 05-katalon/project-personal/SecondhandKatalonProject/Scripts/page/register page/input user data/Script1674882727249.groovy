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

Mobile.setText(findTestObject('Object Repository/secondhand app/android.widget.EditText - Masukkan nama lengkap (3)'), 'syariful', 
    0)

Mobile.setText(findTestObject('secondhand app/android.widget.EditText - Masukkan email (4)'), email, 0)

Mobile.setText(findTestObject('secondhand app/android.widget.EditText - Masukkan password (2)'), '123456789', 0)

Mobile.setText(findTestObject('secondhand app/android.widget.EditText - Contoh 08123456789 (2)'), '08912782437895', 0)

Mobile.setText(findTestObject('secondhand app/android.widget.EditText - Masukkan kota (2)'), 'jakarta', 0)

Mobile.scrollToText('Sudah punya akun?')

Mobile.setText(findTestObject('Object Repository/secondhand app/android.widget.EditText - Masukkan alamat (3)'), 'jakarta', 
    0)

