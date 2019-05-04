package com.mtg.dto;

import java.util.List;

public class MtgCardBuilder {

    private MtgCard mtgCard;

    public MtgCardBuilder() {
        mtgCard = new MtgCard();
    }


    public MtgCardBuilder withLayout(String layout) {
        mtgCard.setLayout(layout);
        return this;
    }

    public MtgCard getMtgCard() {
        return mtgCard;
    }

    public MtgCardBuilder withName(String name) {
        mtgCard.setName(name);
        return this;
    }

    public MtgCardBuilder withManaCost(String manaCost) {
        mtgCard.setManaCost(manaCost);
        return this;
    }

    public MtgCardBuilder withCmc(String cmc) {
        mtgCard.setCmc(cmc);
        return this;
    }

    public MtgCardBuilder withColors(List<String> colors) {

        mtgCard.setColors(colors);
        return this;
    }

    public MtgCardBuilder withType(String type) {
        mtgCard.setType(type);
        return this;
    }

    public MtgCardBuilder withTypes(List<String> types) {
        mtgCard.setTypes(types);
        return this;
    }

    public MtgCardBuilder withText(String text) {
        mtgCard.setText(text);
        return this;
    }

    public MtgCardBuilder withImageName(String imageName) {
        mtgCard.setImageName(imageName);
        return this;
    }

    public MtgCardBuilder withPrintings(List<String> printings) {
        mtgCard.setPrintings(printings);
        return this;

    }

    public MtgCardBuilder withLegalities(List<Legalities> legalities) {
        mtgCard.setLegalities(legalities);
        return this;
    }

    public MtgCardBuilder withColorIdentity(List<String> colorIdentity) {
        mtgCard.setColorIdentity(colorIdentity);
        return this;
    }
}
