package com.sqli.train.wagons;

import com.sqli.train.ITrain;
import com.sqli.train.Representation;

public class Passenger  extends TrainDecorator {
    public Passenger(ITrain train) {
        super(train);
    }

    @Override
    public String getRepresentation() {
        if(train.getRepresentation().isEmpty())
            return train.getRepresentation()+ Representation.PASSENGER;
        return train.getRepresentation()+ Representation.SEPARATOR+ Representation.PASSENGER;
    }

}
