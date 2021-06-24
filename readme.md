GCD aka Greatest Common Divisor is an integer that has highest value among all the divisors of both the numbers. GCD of (8,12) is 4.

#Euclid's algorithm to find GCD.

Neither integer that are input can be 0.
If both the integers are equal the GCD is same as the input integer.
If both the integers are inequal, mod the greater integer by the smaller integer.
If result is 0, the smaller integer is the GCD.
If result is not 0, replace greater integer with the smaller integer and smaller integer with the mod result.
repeat until mod returns 0.
The value of the smaller integer (only for integers that are inequal) when mod returns 0 is the GCD.