# Algorithms
Solution of different kind of algorithms challenges

1. SumElementsOfArray
   
   Given an array T of n positive integers and a positive integer value k, sum and copy the values of T into a new array R such that the sums of consecutive entries in T are less than or equal to the value of k. If an entry of T by itself is greater than or equal to k, it is simply copy into R.
    
   For example:
    
       T = [3, 2, 7, 4, 5, 2, 8, 1, 3, 2, 6] and k = 7
    
   The result should be 
           
       R = [3+2, 7, 4, 5+2, 8, 1+3+2, 6] = [5, 7, 4, 7, 8, 6, 6]

2. FindMaxElementInUnimodalArray

   Definition: an unimodal array is one that has a sequence of increasing integers followed by a sequence of decreasing integers. All elements in the array must be unique.
   
   Problem: given an unimodal array find its maximum element.
   
   For example:

       increasingAndDecreasing = [2, 3, 4, 21, 43, 52, 51, 18, 11, 9, 6, 1]. Max = 52
       increasing = [2, 3, 4, 21, 43, 52, 67, 101, 211]. Max = 211
       decreasing = [73, 52, 51, 18, 11, 9, 6, 1]. Max = 73