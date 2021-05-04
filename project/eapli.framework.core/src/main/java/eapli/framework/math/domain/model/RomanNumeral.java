/*
 * Copyright (c) 2013-2021 the original author or authors.
 *
 * MIT License
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify, merge, publish, distribute,
 * sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or
 * substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT
 * NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eapli.framework.math.domain.model;

import eapli.framework.domain.model.ValueObject;

/**
 * A Roman numeral representation of an integer number. An object of type RomanNumeral is an integer
 * between 1 and 3999. It can be constructed either from an integer or from a string that represents
 * a Roman numeral in this range. The function {@link #toString()} will return a standardized Roman
 * numeral representation of the number. The function {@link #toInt()} will return the number as a
 * value of type {@code int}.
 *
 * <p>
 * This code is based on <a href=
 * "http://math.hws.edu/eck/cs124/javanotes6/c8/ex3-ans.html">http://math.hws.edu/eck/cs124/javanotes6/c8/ex3-ans.html</a>
 *
 * @author David J. Eck eck@hws.edu
 * @author Paulo Gandra de Sousa
 */
public class RomanNumeral implements ValueObject {

    private static final long serialVersionUID = -2871632714426865406L;

    /*
     * The following arrays are used by the toString() function to construct the standard Roman
     * numeral representation of the number. For each i, the number numbers[i] is represented by the
     * corresponding string, letters[i].
     */
    private static int[] numbers = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

    private static String[] letters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
    private final int num; // The number represented by this Roman numeral.

    /**
     * Creates the Roman number with the integer value specified by the parameter.
     *
     * @param arabic
     *            the number we want to express as a Roman literal
     * @throws NumberFormatException
     *             if arabic is not in the range 1 to 3999 inclusive.
     *
     */
    public RomanNumeral(final int arabic) {
        if (arabic < 1) {
            throw new NumberFormatException("Value of RomanNumeral must be positive.");
        }
        if (arabic > 3999) {
            throw new NumberFormatException("Value of RomanNumeral must be 3999 or less.");
        }
        num = arabic;
    }

    /**
     * Constructor. Creates the Roman number with the given representation. For example,
     * RomanNumeral("xvii") is 17. If the parameter is not a legal Roman numeral, a
     * NumberFormatException is thrown. Both upper and lower case letters are allowed.
     *
     * @param roman
     *            a roman literal, e.g., "xvii". Both upper and lower case letters are allowed.
     * @throws NumberFormatException
     *             If the parameter is not a legal Roman numeral
     */
    public RomanNumeral(String roman) {
        if (roman.length() == 0) {
            throw new NumberFormatException("An empty string does not define a Roman numeral.");
        }

        roman = roman.toUpperCase(); // Convert to upper case letters.

        int i = 0; // A position in the string, roman
        // Arabic numeral equivalent of the part of the string
        // that has been converted so far.
        int arabic = 0;

        while (i < roman.length()) {
            // Letter at current position in string.
            final char letter = roman.charAt(i);
            // Numerical equivalent of letter.
            final int number = letterToNumber(letter);
            i++; // Move on to next position in the string

            if (i == roman.length()) {
                // There is no letter in the string following the one we have
                // just processed.
                // So just add the number corresponding to the single letter to
                // arabic.
                arabic += number;
            } else {
                // Look at the next letter in the string. If it has a larger
                // Roman numeral
                // equivalent than number, then the two letters are counted
                // together as
                // a Roman numeral with value (nextNumber - number).
                final int nextNumber = letterToNumber(roman.charAt(i));
                if (nextNumber > number) {
                    // Combine the two letters to get one value, and move on to
                    // next position in string.
                    arabic += (nextNumber - number);
                    i++;
                } else {
                    // Don't combine the letters. Just add the value of the one
                    // letter onto the number.
                    arabic += number;
                }
            }

        } // end while

        if (arabic > 3999) {
            throw new NumberFormatException("Roman numeral must have value 3999 or less.");
        }

        num = arabic;
    }

    /**
     * Factory method. constructs a Roman Numeral from a string literal.
     *
     * @param roman
     *            a roman literal
     * @return a RomanNumeral object
     */
    public static RomanNumeral valueOf(final String roman) {
        return new RomanNumeral(roman);
    }

    /**
     * Find the integer value of letter considered as a Roman numeral.
     *
     * @throws NumberFormatException
     *             if letter is not a legal Roman numeral. The letter must be upper
     *             case.
     */
    private int letterToNumber(final char letter) {
        switch (letter) {
        case 'I':
            return 1;
        case 'V':
            return 5;
        case 'X':
            return 10;
        case 'L':
            return 50;
        case 'C':
            return 100;
        case 'D':
            return 500;
        case 'M':
            return 1000;
        default:
            throw new NumberFormatException("Illegal character \"" + letter + "\" in Roman numeral");
        }
    }

    /**
     * Return the standard representation of this Roman numeral.
     *
     * @return the standard representation of this Roman numeral
     */
    @Override
    @SuppressWarnings("squid:S00117")
    public String toString() {
        final var roman = new StringBuilder("");
        int N = num; // N represents the part of num that still has
        // to be converted to Roman numeral representation.
        for (int i = 0; i < numbers.length; i++) {
            while (N >= numbers[i]) {
                roman.append(letters[i]);
                N -= numbers[i];
            }
        }
        return roman.toString();
    }

    /**
     * Return the value of this Roman numeral as an int.
     *
     * @return the int value of this Roman numeral
     */
    public int toInt() {
        return num;
    }
}
