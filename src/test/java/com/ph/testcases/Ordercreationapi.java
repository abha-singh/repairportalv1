package com.ph.testcases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;
import org.testng.annotations.Test;

import com.google.gson.Gson;

import APIautomate.APIautomate.MyPojo;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Ordercreationapi{
	public static Logger logs;
	
	public void createrepairorder() throws Exception {
		RequestSpecification request=RestAssured.given();
		request.header("Content-Type","application/json");
		request.header("Authorization","Bearer  eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhcmNfcGgiLCJwZXJtaXNzaW9uTGlzdCI6eyJ1c2VySWQiOjEzMSwidXNlck5hbWUiOiJhcmNfcGgiLCJwb3J0YWwiOiJSZXBhaXIgcG9ydGFsIiwiYXJjSWQiOjQ1LCJjb3VudHJ5IjoiUGhpbGlwcGluZXMiLCJyb2xlIjoiYXJjIiwicmVzcG9uc2VTdGF0dXMiOiJzdWNjZXNzIiwiZmVhdHVyZUxpc3QiOltdfSwiZXhwIjoxNTU1NTAwNDIwLCJpYXQiOjE1NTQ4OTU2MjB9.g5TslD9XOvzEkNRrpHF1Ytkv3ibusZVCF495z1qKjx0K_a-MixbxxcZdXryHh_xE186zRak3QjkQMfBskcf3lA");
		request.header("x-api-key", "jRU5w2vlQ5kmSlLuOO8d4tDovBm8QcI45N7wDgA5");
		
	
		JSONObject main1=new JSONObject();
		main1.put("countryId", "3");
		main1.put("orderState", "");
		
		JSONArray logistics=new JSONArray();
		JSONObject logisticsInfo=new JSONObject();
		logisticsInfo.put("awbNo", "");
		logisticsInfo.put("logisticName", "");
		logisticsInfo.put("aliasName", "");
		logisticsInfo.put("pickUpDateTime", "");
		logisticsInfo.put("estimatedDeliveryDate", "");
		logistics.put(logisticsInfo);
		main1.put("logisticsInfo",logistics );
	
		JSONArray customerAddressInfo1=new JSONArray();
		JSONObject customerAddressInfo=new JSONObject();
		customerAddressInfo.put("policyHolderState", "Jawa Tengah");
		customerAddressInfo.put("policyHolderPincode", "0559");
		customerAddressInfo.put("policyHolderCountry", "Indonesia");
		customerAddressInfo.put("policyHolderCity", "Pekalongan");
		customerAddressInfo.put("policyHolderAddress", "JL Damar II No 77 RT 004/009 Krapyak Pekalongan Utara Pekalongan 51147 (dekat dengan SDN Krapiak 5)");
		customerAddressInfo.put("policyHolderContact", "09051234567");
		customerAddressInfo.put("type", "customer address");
		customerAddressInfo1.put(customerAddressInfo);
		main1.put("customerAddressInfo",customerAddressInfo1 );
		
		main1.put("claimId", "CLAIM230942");
		main1.put("shipmentType", "R");
		
		JSONArray dispatchAddInfo=new JSONArray();
		JSONObject dispatchAddressInfo=new JSONObject();
		dispatchAddressInfo.put("dispatchPincode","0559");
		dispatchAddressInfo.put("dispatchState","Caloocan City");
		dispatchAddressInfo.put("dispatchAddress","37 Silver Street Camella Homes Phase 4 Pamplona 3 Las Pinas City 34 B Topas Road Barangay Pilar Village Las Pinas City 69C Everlasting St. San Roque Navotas City 551 M Naval Street Bangkulasi Navotas");
		dispatchAddressInfo.put("dispatchCity","Bagong Silang");
		dispatchAddressInfo.put("dispatchCountry","Philippines");
		dispatchAddressInfo.put("type","dispatch address");
		dispatchAddInfo.put(dispatchAddressInfo);
		main1.put("dispatchAddressInfo",dispatchAddInfo );
		
		
		JSONArray deviceInfo1=new JSONArray();
		JSONObject deviceInfo=new JSONObject();
		deviceInfo.put("model","A7");
		deviceInfo.put("color","Gold");
		deviceInfo.put("imei","865720041497659");
		deviceInfo.put("brand","Nokia");
		deviceInfo1.put(deviceInfo);
		main1.put("deviceInfo",deviceInfo1 );
		
		JSONArray pickupAddressInfo=new JSONArray();
		JSONObject pickupAddressInfo1=new JSONObject();
		pickupAddressInfo1.put("pickupCity","Bagong Silang");
		pickupAddressInfo1.put("pickupState","Caloocan City");
		pickupAddressInfo1.put("pickupCountry","Philippines");
		pickupAddressInfo1.put("pickupPincode","0559");
		pickupAddressInfo1.put("pickupAddress","Tecprotec Service Center G/F Robinsons Cybergate Plaza, EDSA, Barangka Ilaya, Mandaluyong City Raycon Cainta. San Isidro, Cainta, Rizal 1900 Henry's Camera 3rd floor HEAD OFFICE RM 711B,Freedom Park 3, Batasan Hills, Quezon City");
		pickupAddressInfo1.put("pickupContact","09051234567");
		pickupAddressInfo1.put("type","pick up address");
		pickupAddressInfo.put(pickupAddressInfo1);
		main1.put("pickupAddressInfo",pickupAddressInfo );
		
		
		JSONArray customerPolicyInfo=new JSONArray();
		JSONObject customerPolicyInfo1=new JSONObject();
		customerPolicyInfo1.put("policyHolderName","GALANG PAMBUDI HIDAYAT");
		customerPolicyInfo1.put("policyEndDate","2020-01-10");
		customerPolicyInfo1.put("claimClassification","New Claim");
		customerPolicyInfo1.put("subject", "Online Claim");
		customerPolicyInfo1.put("chronology","Home Credit-ProClassic 12 Months Band 1\\n\\nWaktu kejadian jam 8 malam, waktu itu malam minggu...\\nSaya dan teman-teman nongkrong di Lapangan Jetayu sambil ngopi dan maen game dari jam 7 malam, sampai akhirnya sekitar jam 8 malam terjadi hujan yang deras.\\nHp saya taruh di saku belakang dan saya mencari tempat berteduh, tetapi karena jalan licin karena hujan sayapun jatuh dijalan dan hp saya ketindih badan saya\\nHp saya sekarang kondisi layar dan LCD nya rusak\\nDari kemarin-kemarin mau pengajuan klaim tapi kurang paham buat pengajuan klaimnya, mohon dibantu untuk proses pengajuan klaim hp saya\\nTerimakasih");
		customerPolicyInfo1.put("policyNumber","POLICY1565174");
		customerPolicyInfo1.put("claimType","Accidental Damage");
		customerPolicyInfo1.put("claimDate","2019-04-09 17:31:00");
		customerPolicyInfo.put(customerPolicyInfo1);
		main1.put("customerPolicyInfo",customerPolicyInfo );
		
		JSONArray damageInfo=new JSONArray();
		JSONObject damageInfo1=new JSONObject();
		damageInfo1.put("damageValue","No");
		damageInfo1.put("damageDesc","Any Liquid Damage");
		damageInfo1.put("damageCode","damage_q1");
		
		damageInfo.put(damageInfo1);
		main1.put("damageInfo",damageInfo );
		
		request.body(main1.toString());
		Response response=request.post("https://ndtq1iqqee.execute-api.ap-southeast-1.amazonaws.com/processClaim");
		int code=response.getStatusCode();
		System.out.println(code);
	//	import org.json.JSONArray;
	//	import org.json.JSONObject;
		System.out.println("Before response: "+main1.toString());
		System.out.println("response body-"+response.getBody().asString());
		
		String claim=response.getBody().asString();
	    System.out.println(claim);
	    MyPojo myPojo=new Gson().fromJson(claim, MyPojo.class);
	    String claimnum=myPojo.getResponse().getDetails().get(0).getRepairOrder().getClaimNumber();
	    System.out.println("myPojo:"+ claimnum);
	    DBconnect dbData=new DBconnect();
	    dbData.connect(claimnum);
	    //Get claimno. from response body
		/*JSONObject job=new JSONObject(response.getBody().asString());
		String response1=job.optString("response");
		System.out.println("response1:"+ response1);
		JSONObject job1=new JSONObject(response1);
		System.out.println("job1:"+ job1);
		JSONArray jar=job1.optJSONArray("Details");
		System.out.println("Details "+ jar);
		String claimnum=jar.getJSONObject(0).optString("repairOrder");
		
		System.out.println("Claim Details "+claimnum);
		JSONObject claimnumobj=new JSONObject(claimnum);
		String claimnumber=claimnumobj.optString("claimNumber");
		System.out.println(claimnumber);*/	
	}
       
}

