/**
 * 
 */
package com.cognizant.complianceapp.data;

import java.io.Serializable;

/**
 * @author Anoop
 *
 */
public class SmartContract implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3649655383302391205L;
	private String compaliantDescription;
	private String actionTaken;
	private String clientFeedback;
	public String getCompaliantDescription() {
		return compaliantDescription;
	}
	public void setCompaliantDescription(String compaliantDescription) {
		this.compaliantDescription = compaliantDescription;
	}
	public String getActionTaken() {
		return actionTaken;
	}
	public void setActionTaken(String actionTaken) {
		this.actionTaken = actionTaken;
	}
	public String getClientFeedback() {
		return clientFeedback;
	}
	public void setClientFeedback(String clientFeedback) {
		this.clientFeedback = clientFeedback;
	}

}
