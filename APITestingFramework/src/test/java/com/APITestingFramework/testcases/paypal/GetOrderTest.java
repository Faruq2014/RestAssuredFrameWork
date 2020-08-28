package com.APITestingFramework.testcases.paypal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITestingFramework.APIs.OrderAPI;
import com.APITestingFramework.Base.BaseTest;

import io.restassured.response.Response;

public class GetOrderTest extends BaseTest{
	
	
	@Test
	public void getOrder() {
		
		String accessToken = OrderAPI.getAccessToken();
		Response response = OrderAPI.getOrder(accessToken);
		response.prettyPrint();
		
		Assert.assertEquals(response.getStatusCode(),200);
	}

}
