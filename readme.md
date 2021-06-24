GCD aka Greatest Common Divisor is an integer that has highest value among all the divisors of both the numbers. GCD of (8,12) is 4.

#Euclid's algorithm to find GCD.

1. Neither integer that are input can be 0.
2. If both the integers are equal the GCD is same as the input integer.
3. If both the integers are inequal, mod the greater integer by the smaller integer.
4. If result is 0, the smaller integer is the GCD.
5. If result is not 0, replace greater integer with the smaller integer and smaller integer with the mod result.
6. Repeat until mod returns 0. 

**The value of the smaller integer (only for integers that are inequal) when mod returns 0 is the GCD.**
