package ase.ProjTestingSomeShitAtWork;

public class BeerObject {
     private String about;
     private String alcohol;
     private String maker;
     private String name;
     private String screen;
     private String type;

    public BeerObject(String about, String alcohol, String maker, String name, String screen, String type) {
        this.about = about;
        this.alcohol = alcohol;
        this.maker = maker;
        this.name = name;
        this.screen = screen;
        this.type = type;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
