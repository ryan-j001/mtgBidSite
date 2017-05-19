package com.mtg;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ryanj on 5/18/2017.
 */

@RestController
public class JsonDataController {

	@RequestMapping(value = "/getSearchResults", method = RequestMethod.GET)
	public @ResponseBody
	ResponseEntity<JsonNode> getSearchResults() throws JSONException {
		ObjectMapper objectMapper = new ObjectMapper();

		Map<String, String> responseJson = new HashMap<String,String>();

		responseJson.put("status", "User created.");
		JsonNode jsonNode = objectMapper.valueToTree(responseJson);
		return new ResponseEntity<JsonNode>(jsonNode, HttpStatus.CREATED);

	}


}
