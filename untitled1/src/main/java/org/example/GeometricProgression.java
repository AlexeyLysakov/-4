package org.example;

public class  GeometricProgression extends Progression
{
    public GeometricProgression(double first_element, double coefficient)
    {
        super(first_element, coefficient);
    }

    public double findingProgression(int number)
    {
        return first_element * Math.pow(coefficient, number);
    }

    public double sumProgression(int number)
    {
        double S = (first_element - findingProgression(number) * coefficient) / (1 - coefficient);
        return S;
    }
}