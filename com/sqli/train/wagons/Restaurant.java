package com.sqli.train.wagons;


import com.sqli.train.ITrain;
import com.sqli.train.Representation;

public class Restaurant extends TrainDecorator {
    public Restaurant(ITrain train) {
        super(train);
    }

    @Override
    public String getRepresentation() {
        if(train.getRepresentation().isEmpty())

            return train.getRepresentation()+Representation.RESTAURANT;
        return train.getRepresentation()+Representation.SEPARATOR+ Representation.RESTAURANT;
    }
}
