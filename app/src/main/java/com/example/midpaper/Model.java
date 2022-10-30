package com.example.midpaper;

public class Model {
    int image,star,design;
    String title,Arthur,rating,writer,noofwriter,description;

    public Model(int image, int star, int design, String title, String Arthur, String rating, String writer, String noofwriter, String description) {
        this.image = image;
        this.star = star;
        this.design = design;
        this.title = title;
        this.Arthur = Arthur;
        this.rating = rating;
        this.writer = writer;
        this.noofwriter = noofwriter;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public int getStar() {
        return star;
    }

    public int getDesign() {
        return design;
    }

    public String getTitle() {
        return title;
    }

    public String getArthur() {
        return Arthur;
    }

    public String getRating() {
        return rating;
    }

    public String getWriter() {
        return writer;
    }

    public String getNoofwriter() {
        return noofwriter;
    }

    public String getDescription() {
        return description;
    }
}
