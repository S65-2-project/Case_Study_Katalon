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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.fhict.nl/adfs/ls?version=1.0&action=signin&realm=urn%3AAppProxy%3Acom&appRealm=8b805ef6-038a-e811-838a-005056a77cc4&returnUrl=https%3A%2F%2Ffhict.nl%2F&client-request-id=44522EC4-E571-0000-42D7-9A4571E5D501')

WebUI.setText(findTestObject('Object Repository/Page_Sign In/input_Sign in with your organizational acco_d4c899'), 'henk@fhict.nl')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign In/input_Sign in with your organizational acco_04b8f7'), 
    'YsxTccsmuDp4EzH3f/epjg==')

WebUI.click(findTestObject('Object Repository/Page_Sign In/span_Sign in'))

varA = WebUI.verifyTextPresent("De gebruikers-id of het wachtwoord is onjuist. Voer de gebruikers-id en het wachtwoord opnieuw in.", true)
assert varA == true

WebUI.closeBrowser()

