package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float FasFloat = getValue();
        float CasFloat;
        CasFloat = ((FasFloat - 32) * 5)/9;
        Celsius C;
        C = new Celsius(CasFloat);
        return C;
    }

    @Override
    public Temperature toFahrenheit() {
        float FasFloat = getValue();
        Fahrenheit F;
        F = new Fahrenheit(FasFloat);
        return F;
    }

    public String toString()
    {
        float FasFloat = getValue();
        String stringToReturn = Float.toString(FasFloat);
        stringToReturn = stringToReturn + " F";
        return stringToReturn;
    }
}
