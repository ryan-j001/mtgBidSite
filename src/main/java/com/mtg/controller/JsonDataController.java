package com.mtg.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mtg.dto.Legalities;
import com.mtg.dto.MtgCard;
import org.json.JSONException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by ryanj on 5/18/2017.
 */

@RestController
public class JsonDataController {

    @RequestMapping(value = "/getSearchResults", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<JsonNode> getSearchResults() throws JSONException {
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> responseJson = new HashMap<String, String>();

        responseJson.put("status", "User created.");
        JsonNode jsonNode = objectMapper.valueToTree(responseJson);
        return new ResponseEntity<JsonNode>(jsonNode, HttpStatus.CREATED);

    }


    @RequestMapping(value = "/getCardLists/{cardSet}", method = RequestMethod.GET)
    public @ResponseBody
    ResponseEntity<JsonNode> getCardLists(@PathVariable("cardSet") String cardSet) {

        List<MtgCard> mtgCards = new ArrayList<MtgCard>();

        mtgCards.add(new MtgCard("normal", "Ancestral Recall", "{U}", "1", (Arrays.asList("Blue")),
                "Instant", (Collections.singletonList("Instant")), null,
                "Target player draws three cards.", null, null, "ancestral recall",
                Arrays.asList("LEA", "LEB", "2ED", "CED", "CEI", "VMA"),
                Arrays.asList(new Legalities("Commander", "Banned"),
                        new Legalities("Legacy", "Banned"), new Legalities("Vintage", "Restricted")),
                Collections.singletonList("U")));

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(mtgCards);
        return new ResponseEntity<JsonNode>(jsonNode, HttpStatus.CREATED);

    }


}
