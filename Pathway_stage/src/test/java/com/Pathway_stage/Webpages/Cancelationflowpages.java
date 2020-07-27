package com.Pathway_stage.Webpages;


import org.openqa.selenium.By;

import com.Pathway_stage.Base.Basepage;

public class Cancelationflowpages extends Basepage {

	private By createNewcancelationbutton = By
			.xpath(".//*[@class='btn-grid approve create-cancel ml-0 mr-0 button-margin']");
	private By partialcancelation = By.xpath("//label[contains(text(),'Partial Cancellation')]");
	private By fullCancelation = By.xpath("//label[contains(text(),'Full Cancellation')]");
	private By txidfieldbox = By.xpath("//input[@placeholder='Enter TX Site ID']");
	private By rxidfieldbox = By.xpath("//input[@placeholder='Enter RX Site ID']");
	private By searchaccountforcancelation = By.cssSelector("#search-button");
	private By CancelationchecklistboxforMU = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
	private By reasonlbl = By.className("reject-text");
	private By selectreasondropdown = By.xpath("//select[@class='ng-untouched ng-pristine ng-valid']");
	private By proceedbutton = By.xpath("//button[contains(text(),'PROCEED')]");
	private By confirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	private By requestOKbutton = By.xpath("(.//*[text()='OK'])[1]");
	private By RPMuserchecklistbox = By.xpath("//input[@type='checkbox']");
	private By approvebutton = By.xpath("(.//*[@class='btn-grid approve'])[1]");
	private By rejectbutton = By.xpath("(.//*[@class='btn-grid reject'])[1]");
	private By selectreasonforrejection = By.xpath("//select[@class='w-100 ng-untouched ng-pristine ng-valid']");
	private By rejectconfirmationbutton = By.xpath("//div[@class='modal-dialog reject-modal']//button[@class='btn-grid approve'][contains(text(),'YES')]");
	private By RRMuserchecklistbox = By.xpath("//input[@type='checkbox']");
	private By NOCuserchecklistbox = By.xpath("//div[@class='slick-cell l0 r0 true']//label");
	private By Leagluserchecklistbox = By.xpath("//input[@type='checkbox']");
	private By sendtoFCCbutton = By.xpath("(.//*[@class='btn-grid approve'])[1]");
	private By legaluserconfirmationbutton = By.xpath("(.//*[text()='YES'])[1]");
	RequestViewPage view = new RequestViewPage();

	public void riseCancelationRequestWithMUuser(String Txid, String Rxid) {
		click(createNewcancelationbutton);
		sleep();
		click(fullCancelation);
		sleep();
		enterText(txidfieldbox, Txid);
		sleep();
		enterText(rxidfieldbox, Rxid);
		sleep();
		click(searchaccountforcancelation);
		sleep();
		explicitWaitClickable(CancelationchecklistboxforMU);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(selectreasondropdown, "Link no longer needed");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(confirmationbutton);
		sleep();
		explicitWaitClickable(requestOKbutton);
		sleep();
		refreshthepage();

	}

	public void partialcancelationrequestmitMUuser(String Txid, String Rxid) {
		click(createNewcancelationbutton);
		sleep();
		click(partialcancelation);
		sleep();
		enterText(txidfieldbox, Txid);
		sleep();
		enterText(rxidfieldbox, Rxid);
		sleep();
		click(searchaccountforcancelation);
		sleep();
		explicitWaitClickable(CancelationchecklistboxforMU);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(selectreasondropdown, "Link no longer needed");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(confirmationbutton);
		sleep();
		explicitWaitClickable(requestOKbutton);
		sleep();
		refreshthepage();

	}

	public void fullcancelationwithRPM(String Txid, String Rxid) {
		click(createNewcancelationbutton);
		sleep();
		click(fullCancelation);
		sleep();
		enterText(txidfieldbox, Txid);
		sleep();
		enterText(rxidfieldbox, Rxid);
		sleep();
		click(searchaccountforcancelation);
		sleep();
		explicitWaitClickable(CancelationchecklistboxforMU);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(selectreasondropdown, "Link no longer needed");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(confirmationbutton);
		sleep();
		explicitWaitClickable(requestOKbutton);
		sleep();
		refreshthepage();
	}

	public void partialcancelationwithRPM(String Txid, String Rxid) {
		click(createNewcancelationbutton);
		sleep();
		click(partialcancelation);
		sleep();
		enterText(txidfieldbox, Txid);
		sleep();
		enterText(rxidfieldbox, Rxid);
		sleep();
		click(searchaccountforcancelation);
		sleep();
		explicitWaitClickable(CancelationchecklistboxforMU);
		sleep();
		scrollintoelement(reasonlbl);
		sleep();
		select(selectreasondropdown, "Link no longer needed");
		sleep();
		scrollintoelement(proceedbutton);
		sleep();
		click(proceedbutton);
		sleep();
		click(confirmationbutton);
		sleep();
		explicitWaitClickable(requestOKbutton);
		sleep();
		refreshthepage();
	}

	public void approvecancelationwithRPMuser() {

		// explicitWaitClickable(RPMuserchecklistbox);
		elementclickbyjs(RPMuserchecklistbox);
		sleep();
		explicitWaitClickable(approvebutton);
		sleep();
		explicitWaitClickable(confirmationbutton);
	}

	public void rejectcancelationwithRPMuser() {
		elementclickbyjs(RPMuserchecklistbox);
		click(rejectbutton);
		sleep();
		select(selectreasonforrejection, "Link no longer needed");
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}

	public void approvecancelationwithRRMuser() {
		elementclickbyjs(RPMuserchecklistbox);
		click(approvebutton);
		sleep();
		click(confirmationbutton);
		sleep();
	}

	public void rejectcancelationwithRRMuser() {
		click(RRMuserchecklistbox);
		sleep();
		click(rejectbutton);
		sleep();
		select(selectreasonforrejection, "Link no longer needed");
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}

	public void approvecancelationwithNOCuser() {
		elementclickbyjs(RPMuserchecklistbox);
		click(approvebutton);
		sleep();
		click(confirmationbutton);
		sleep();
	}

	public void rejectcancelationwithNOCuser() {
		elementclickbyjs(RPMuserchecklistbox);
		click(rejectbutton);
		sleep();
		select(selectreasonforrejection, "Link no longer needed");
		sleep();
		click(rejectconfirmationbutton);
		sleep();
	}

	public void sendtoFCCwithLegaluser() {
		elementclickbyjs(RPMuserchecklistbox);
		click(sendtoFCCbutton);
		sleep();
		click(legaluserconfirmationbutton);
		sleep();
	}
}
