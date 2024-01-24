# HashTables

#1 x % n with a large prime number on the bottom would be easier to compute bc there are less chances for collisions than the large number with many factors

x % 17 = a set number of numbers. It would reset every time you pass a set of 17 and the larger you get with the prime the larger and larger the time gets to reset the hash codes
but
x % 18 = a very small set of numbers because every time you pass an even number the mod will reduce the numerator more which will decraese the output and therefore cause more collisions

#2 Yes because if you sum up all of the char values in a string and place it above 599, a large prime number, you will end up with very specifc hash values for every single input with few over laps (collisions)

#3 The HashCode function uses iteration through an array and then sums all of these numbers that were returned and finally returns the large summed number



