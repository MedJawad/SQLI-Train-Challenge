package com.sqli.train.wagons;

import com.sqli.train.ITrain;
import com.sqli.train.Representation;

public class Cargo extends TrainDecorator  {
    public Cargo(ITrain train) {
        super(train);
    }

    @Override
    public String getRepresentation() {
        if (train.getRepresentation().isEmpty())
            return train.getRepresentation()+ Representation.EMPTY_CARGO;
        return train.getRepresentation()+ Representation.SEPARATOR+Representation.EMPTY_CARGO;
    }

}
