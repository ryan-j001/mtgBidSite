package com.mtg.dto;

/**
 * Created by RyanLeno on 2017-05-30.
 */
public class Legalities {

    private String format;
    private String legality;

    public Legalities(String format, String legality) {
        this.format = format;
        this.legality = legality;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getLegality() {
        return legality;
    }

    public void setLegality(String legality) {
        this.legality = legality;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Legalities that = (Legalities) o;

        if (getFormat() != null ? !getFormat().equals(that.getFormat()) : that.getFormat() != null) return false;
        return getLegality() != null ? getLegality().equals(that.getLegality()) : that.getLegality() == null;
    }

    @Override
    public int hashCode() {
        int result = getFormat() != null ? getFormat().hashCode() : 0;
        result = 31 * result + (getLegality() != null ? getLegality().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Legalities{" +
                "format='" + format + '\'' +
                ", legality='" + legality + '\'' +
                '}';
    }
}
