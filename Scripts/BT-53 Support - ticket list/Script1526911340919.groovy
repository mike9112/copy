import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

not_run: WebUI.maximizeWindow()

WebUI.setViewPortSize(1920, 1080)

WebUI.click(findTestObject('Page_Bitsane (7)/a_Sign up'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup/a_Log In'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup/a_Log In'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Signup/input_login'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Signup/input_password'), '807a4F3f3')

WebUI.click(findTestObject('Page_Bitsane Exchange  Signup/input_send'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Ripple (XRP)/a_Support'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (6)/a_create a ticket.'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (6)/a_Tickets'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Cryptocurren (6)/i_fa fa-times'))

WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Support/Tickets/support_yes_button_modal'), 0)

WebUI.click(findTestObject('Page_Bitsane_Support/Tickets/support_yes_button_modal'))

WebUI.closeBrowser()

