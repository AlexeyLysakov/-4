package org.example;

public abstract class Progression {
    double first_element;
    double coefficient;
    public Progression(double first_element, double coefficient)
    {
        this.first_element = first_element;
        this.coefficient = coefficient;
    }

    public abstract double findingProgression(int number);
    public abstract double sumProgression(int number);
}