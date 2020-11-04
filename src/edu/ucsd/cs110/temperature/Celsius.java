package edu.ucsd.cs110.temperature;
public class Celsius extends Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float CasFloat = getValue();
        Celsius C;
        C = new Celsius(CasFloat);
        return C;
    }

    @Override
    public Temperature toFahrenheit() {
        float CasFloat = getValue();
        float FasFloat;
        FasFloat = ((CasFloat*9)/5) + 32;
        Fahrenheit F;
        F = new Fahrenheit(FasFloat);
        return F;
    }

    public String toString()
    {
        float CasFloat = getValue();
        String stringToReturn = Float.toString(CasFloat);
        stringToReturn = stringToReturn + " C";
        return stringToReturn;
    }
}
