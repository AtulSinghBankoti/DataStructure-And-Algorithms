#!/bin/python3

import math
import os
import random
import re
import sys


# Complete the marsExploration function below.
def marsExploration(s):
    c = 'SOS'
    p = 0
    res = 0
    for i in s:
        if i != c[p]:
            print(f'c: {c}')
            print(f'i: {i}')
            res += 1
        if p == len(c)-1:
            p = 0
        else:
            p += 1

    return res


if __name__ == '__main__':

    s = 'SOSSOSSOS'
    result = marsExploration(s)
    print(result)
