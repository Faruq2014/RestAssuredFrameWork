package com.APITestingFramework.testcases.paypal;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.APITestingFramework.APIs.OrderAPI;
import com.APITestingFramework.Base.BaseTest;

import io.restassured.response.Response;

public class CreateOrderTest extends BaseTest{
	
	
	@Test
	public void createOrder() {
		
		String accessToken = OrderAPI.getAccessToken();
		Response response = OrderAPI.createOrder(accessToken);
		Assert.assertEquals(response.jsonPath().get("status").toString(), "CREATED");
		response.prettyPrint();
	}

}
