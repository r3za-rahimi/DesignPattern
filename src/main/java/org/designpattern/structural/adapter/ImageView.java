package org.designpattern.structural.adapter;

import org.designpattern.structural.adapter.filter.Filter;

public class ImageView {

    private Image image;

    public ImageView(Image image) {
        this.image = image;
    }

    public void apply(Filter filter){
        filter.apply();
    }
}
