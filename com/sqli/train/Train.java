package com.sqli.train;

import com.sqli.train.wagons.*;

import java.util.ArrayList;
import java.util.List;

public class Train implements ITrain {
    private List<Character> trainWagons;

    public Train(String trainWagons) {
        this.trainWagons= new ArrayList<Character>();
        for (char wagon:trainWagons.toCharArray()) {
            this.trainWagons.add(wagon);
        }
    }

    public String print() {
        ITrain decoratedTrain = this;
        for (char wagon:trainWagons) {
            decoratedTrain = decorateWith(decoratedTrain,wagon);
        }
        System.out.println(decoratedTrain.getRepresentation());
        return decoratedTrain.getRepresentation();
    }
    public String getRepresentation(){
        return "";
    }

    public ITrain decorateWith(ITrain train,char type) {
            switch (type){
                case 'H':{
                    return new Head(train);
                }
                case 'R':{
                    return new Restaurant(train);
                }
                case 'P':{
                    return new Passenger(train);
                }
                case 'C':{
                    return new Cargo(train);
                }
                case 'F':{
                    return new FullCargo(train);
                }
            }
            return train;
    }

    public void detachEnd() {
        trainWagons.remove(trainWagons.size()-1);
    }

    public void detachHead() {
        trainWagons.remove(0);
    }

    public boolean fill() {
        int indexOfFirstCargo = trainWagons.indexOf('C');
        System.out.println(indexOfFirstCargo);
        if(indexOfFirstCargo==-1) return false;
        trainWagons.set(indexOfFirstCargo,'F') ;

        return true;
    }
}
