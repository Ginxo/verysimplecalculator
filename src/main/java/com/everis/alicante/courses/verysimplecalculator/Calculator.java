package com.everis.alicante.courses.verysimplecalculator;

/**
 * The type Calculator.
 */
public class Calculator {

    /**
     * Sum integer.
     *
     * @param a the a
     * @param b the b
     *
     * @return the integer
     */
    public Integer sum(Integer a, Integer b) {
        return a + b;
    }

    /**
     * Subtract integer.
     *
     * @param a the a
     * @param b the b
     *
     * @return the integer
     */
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    /**
     * Multiply integer.
     *
     * @param a the a
     * @param b the b
     *
     * @return the integer
     */
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    /**
     * Divide double.
     *
     * @param a the a
     * @param b the b
     *
     * @return the double
     */
    public Double divide(Integer a, Integer b) {
        return Double.valueOf(a / b);
    }


    /**
     * Pow double.
     *
     * @param a the a
     * @param b the b
     *
     * @return the double
     */
    public Double pow(Integer a, Integer b) {
        return Math.pow(a, b);
    }


}
