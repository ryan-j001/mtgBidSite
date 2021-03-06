package com.mtg.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mtg.dto.Legalities;
import com.mtg.dto.MtgCard;
import com.mtg.dto.MtgCardBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * Created by ryanj on 5/18/2017.
 */

@RestController
public class JsonDataController {

    @GetMapping(value = "/getSearchResults")
    public @ResponseBody
    ResponseEntity<JsonNode> getSearchResults() {
        ObjectMapper objectMapper = new ObjectMapper();

        Map<String, String> responseJson = new HashMap<>();

        responseJson.put("status", "User created.");
        JsonNode jsonNode = objectMapper.valueToTree(responseJson);
        return new ResponseEntity<>(jsonNode, HttpStatus.CREATED);

    }


    @GetMapping(value = "/cardSet/{cardSet}")
    public @ResponseBody
    ResponseEntity<JsonNode> getCardLists(@PathVariable("cardSet") String cardSet) {

        List<MtgCard> mtgCards = new ArrayList<>();

        mtgCards.add(
                new MtgCardBuilder()
                        .withLayout("normal")
                        .withName("Ancestral Recall")
                        .withManaCost("{U}")
                        .withCmc("1")
                        .withColors(Arrays.asList("Blue"))
                        .withType("Instant")
                        .withTypes(Collections.singletonList("Instant"))
                        .withText("Target player draws three cards.")
                        .withImageName("ancestral recall")
                        .withPrintings(Arrays.asList("LEA", "LEB", "2ED", "CED", "CEI", "VMA"))
                        .withLegalities(Arrays.asList(
                                new Legalities("Commander", "Banned"),
                                new Legalities("Legacy", "Banned"),
                                new Legalities("Vintage", "Restricted")))
                        .withColorIdentity(Collections.singletonList("U")).getMtgCard());


        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.valueToTree(mtgCards);
        return new ResponseEntity<>(jsonNode, HttpStatus.CREATED);

    }


}
