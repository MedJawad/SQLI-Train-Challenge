package com.sqli.train.wagons;

import com.sqli.train.ITrain;
import com.sqli.train.Representation;

public class Head extends TrainDecorator  {
    public Head(ITrain train) {
        super(train);
    }

    @Override
    public String getRepresentation() {
        if(train.getRepresentation().isEmpty())
            return train.getRepresentation()+ Representation.LHEAD;
        return train.getRepresentation()+Representation.SEPARATOR+ Representation.RHEAD;
    }

}
