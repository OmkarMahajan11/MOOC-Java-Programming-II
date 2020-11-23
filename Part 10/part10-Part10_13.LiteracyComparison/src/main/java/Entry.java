/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Omkar
 */
public class Entry implements Comparable<Entry> {
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private String year;
    private double literacyPercent;

    public Entry(String theme, String ageGroup, String gender, String country, String year, String literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender.split(" ")[1].trim();
        this.country = country;
        this.year = year.trim();
        this.literacyPercent = Double.parseDouble(literacyPercent);
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.split(" ").length > 1) {
            gender = gender.split(" ")[0].trim();
        }
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public double getLiteracyPercent() {
        return literacyPercent;
    }

    public void setLiteracyPercent(double literacyPercent) {
        this.literacyPercent = literacyPercent;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;  
    }
    
    @Override
    public int compareTo(Entry e) {
        if (this.literacyPercent > e.getLiteracyPercent()) {
            return 1;
        } else if (this.literacyPercent < e.getLiteracyPercent()) {
            return -1;
        }
        return 0;
    }
}
