package org.example;

public class ArithmeticProgression extends Progression
{
    public ArithmeticProgression(double first_element, double coefficient)
    {
        super(first_element, coefficient);
    }

    public double findingProgression(int number)
    {
        return first_element + number * coefficient;
    }

    public double sumProgression(int number)
    {
        double S = (number + 1) * ((first_element * findingProgression(number))/2);
        return S;
    }
}