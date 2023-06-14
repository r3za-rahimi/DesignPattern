package org.designpattern.structural.adapter.filter.sketch;

import org.designpattern.structural.adapter.filter.Filter;

public class
SketchFilter implements Filter {

    private Sketch sketch;

    public SketchFilter(Sketch sketch) {
        this.sketch = sketch;
    }

    @Override
    public void apply() {
        sketch.apply();
    }
}
