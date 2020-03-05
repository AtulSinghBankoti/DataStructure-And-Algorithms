#https://www.hackerrank.com/challenges/equality-in-a-array/problem


#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the equalizeArray function below.
def equalize_array(arr):
    d = {i: arr.count(i) for i in arr}
    v, k, res = 0, -1, 0

    for c in d:
        if d[c] > v:
            v = d[c]
            k = c
    for c in d:
        if c != k:
            res += d[c]

    return res


if __name__ == '__main__':
    #l =[3, 3, 2, 1, 3]
    l=[1, 2, 3, 1, 2, 3, 3, 3]
    print(equalize_array(l))
