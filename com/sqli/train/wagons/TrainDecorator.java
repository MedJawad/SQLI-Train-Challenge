package com.sqli.train.wagons;

import com.sqli.train.ITrain;
import com.sqli.train.Train;

public abstract class TrainDecorator implements ITrain {
    protected ITrain train;

    public TrainDecorator(ITrain train) {
        this.train = train;
    }

    public String getRepresentation() {
        return train.getRepresentation();
    }

}
