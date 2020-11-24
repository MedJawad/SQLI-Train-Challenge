package com.sqli.train.wagons;

import com.sqli.train.ITrain;
import com.sqli.train.Representation;

public class FullCargo extends TrainDecorator  {
    public FullCargo(ITrain train) {
        super(train);
    }

    @Override
    public String getRepresentation() {
        if (train.getRepresentation().isEmpty())
            return train.getRepresentation()+ Representation.LOADED_CARGO;
        return train.getRepresentation()+ Representation.SEPARATOR+Representation.LOADED_CARGO;
    }
}
