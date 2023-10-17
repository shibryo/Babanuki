package org.example;

public class Card {
    private Sute _sute;
    private int _number;
    public Card(Sute sute, int number)
    {
        this._sute = sute;
        this._number = number;
    }
    private void setNumber(int number) throws Exception {
        if(number<0 || 13<number){
            throw new Exception("cant input above 0 to 13");
        }
        this._number = number;
    }
    public int getNumber(){
        return this._number;
    }

    @Override
    public String toString() {
        switch(this._number){
            case 0:
                return "JK";
            case 1:
                return this._sute.name() + "A";
            case 11:
                return this._sute.name() + "J";
            case 12:
                return this._sute.name() + "Q";
            case 13:
                return this._sute.name() + "K";
        }
        return this._sute.name() + this._number;
    }
}
