package com.cognizant.complianceapp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cognizant.complianceapp.data.SmartContract;

@Controller
@RequestMapping(value = "/compliance")
public class ComplianceAppController {

	@RequestMapping(value = "/getSmartContracts", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<SmartContract> getSmartContracts(@RequestParam(value = "userId", required = false) String userId) {
		List<SmartContract> smartContracts = new ArrayList<SmartContract>();
		SmartContract smartContract = new SmartContract();
		for (int i = 0; i < 5; i++) {
			smartContract = new SmartContract();
			smartContract.setCompaliantDescription("Description" + i);
			smartContract.setActionTaken("actionTaken" + i);
			smartContract.setClientFeedback("Client Feedback" + i);
			smartContracts.add(smartContract);
		}
		return smartContracts;

	}
}
