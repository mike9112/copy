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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://stage.bitsane.com/')

WebUI.maximizeWindow()

WebUI.waitForPageLoad(2)

WebUI.click(findTestObject('Page_Bitsane/a_Log in'))

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_login'), 'ax.kubitsky@gmail.com')

WebUI.setText(findTestObject('Page_Bitsane Exchange  Login/input_password'), '807a4F3f3')

WebUI.click(findTestObject('Page_Bitsane Exchange  Login/input_send'))

WebUI.click(findTestObject('Page_Bitsane Exchange  Bitcoin Cash/a_Balances'))

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_BTC'))

WebUI.waitForElementPresent(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Field is required', false)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0')

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Amount is less than minimal', false)

WebUI.verifyTextPresent('amount should be more than fee', false)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0.001')

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), 'фыва4й4цукйукафыафыа')

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

WebUI.verifyTextPresent('Address format is not valid', false)

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_amount_BTC'), '0.001')

WebUI.setText(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_address_BTC'), '3KrczCtV2fr37BC8eQsC7mBh6JxoBuJHyS')

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_button_proceed_BTC'))

WebUI.delay(1)

not_run: WebUI.waitForElementVisible(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_modal'), 2)

WebUI.click(findTestObject('Page_Bitsane_Balances/Wallets/Withdrawal_result_button'))

WebUI.delay(1)

WebUI.closeBrowser()
