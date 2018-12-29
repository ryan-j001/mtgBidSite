package com.mtg.dto;

import java.util.List;

/**
 * Created by RyanLeno on 2017-05-30.
 */
public class MtgCard {

    private String layout;
    private String name;
    private String manaCost;
    private String cmc;
    private List<String> colors;
    private String type;
    private List<String> types;
    private List<String> subTypes;
    private String text;
    private String power;
    private String toughness;
    private String imageName;
    private List<String> printings;
    private List<Legalities> legalities;
    private List<String> colorIdentity;

    public MtgCard(String layout, String name, String manaCost, String cmc, List<String> colors, String type, List<String> types, List<String> subTypes, String text, String power, String toughness, String imageName, List<String> printings, List<Legalities> legalities, List<String> colorIdentity) {
        this.layout = layout;
        this.name = name;
        this.manaCost = manaCost;
        this.cmc = cmc;
        this.colors = colors;
        this.type = type;
        this.types = types;
        this.subTypes = subTypes;
        this.text = text;
        this.power = power;
        this.toughness = toughness;
        this.imageName = imageName;
        this.printings = printings;
        this.legalities = legalities;
        this.colorIdentity = colorIdentity;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public List<String> getColors() {
        return colors;
    }

    public void setColors(List<String> colors) {
        this.colors = colors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<String> getSubTypes() {
        return subTypes;
    }

    public void setSubTypes(List<String> subTypes) {
        this.subTypes = subTypes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public List<String> getPrintings() {
        return printings;
    }

    public void setPrintings(List<String> printings) {
        this.printings = printings;
    }

    public List<Legalities> getLegalities() {
        return legalities;
    }

    public void setLegalities(List<Legalities> legalities) {
        this.legalities = legalities;
    }

    public List<String> getColorIdentity() {
        return colorIdentity;
    }

    public void setColorIdentity(List<String> colorIdentity) {
        this.colorIdentity = colorIdentity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MtgCard mtgCard = (MtgCard) o;

        if (!getLayout().equals(mtgCard.getLayout())) return false;
        if (!getName().equals(mtgCard.getName())) return false;
        if (!getManaCost().equals(mtgCard.getManaCost())) return false;
        if (!getCmc().equals(mtgCard.getCmc())) return false;
        if (!getColors().equals(mtgCard.getColors())) return false;
        if (!getType().equals(mtgCard.getType())) return false;
        if (!getTypes().equals(mtgCard.getTypes())) return false;
        if (!getSubTypes().equals(mtgCard.getSubTypes())) return false;
        if (!getText().equals(mtgCard.getText())) return false;
        if (!getPower().equals(mtgCard.getPower())) return false;
        if (!getToughness().equals(mtgCard.getToughness())) return false;
        if (!getImageName().equals(mtgCard.getImageName())) return false;
        if (!getPrintings().equals(mtgCard.getPrintings())) return false;
        if (!getLegalities().equals(mtgCard.getLegalities())) return false;
        return getColorIdentity().equals(mtgCard.getColorIdentity());
    }

    @Override
    public int hashCode() {
        int result = getLayout().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getManaCost().hashCode();
        result = 31 * result + getCmc().hashCode();
        result = 31 * result + getColors().hashCode();
        result = 31 * result + getType().hashCode();
        result = 31 * result + getTypes().hashCode();
        result = 31 * result + getSubTypes().hashCode();
        result = 31 * result + getText().hashCode();
        result = 31 * result + getPower().hashCode();
        result = 31 * result + getToughness().hashCode();
        result = 31 * result + getImageName().hashCode();
        result = 31 * result + getPrintings().hashCode();
        result = 31 * result + getLegalities().hashCode();
        result = 31 * result + getColorIdentity().hashCode();
        return result;
    }
}
