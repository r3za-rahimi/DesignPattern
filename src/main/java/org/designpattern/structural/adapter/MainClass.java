package org.designpattern.structural.adapter;

import org.designpattern.structural.adapter.filter.blur.BlurFilter;
import org.designpattern.structural.adapter.filter.sketch.Sketch;
import org.designpattern.structural.adapter.filter.sketch.SketchFilter;

public class MainClass {
    public static void main(String[] args) {

    ImageView imageView = new ImageView(new Image());
    imageView.apply(new BlurFilter());

    imageView.apply(new SketchFilter(new Sketch()));
    }

}
