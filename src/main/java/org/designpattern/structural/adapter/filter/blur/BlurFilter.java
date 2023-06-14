package org.designpattern.structural.adapter.filter.blur;

import org.designpattern.structural.adapter.filter.Filter;

public class BlurFilter implements Filter {
    @Override
    public void apply() {
        System.out.println("blur filter apply");
    }
}
