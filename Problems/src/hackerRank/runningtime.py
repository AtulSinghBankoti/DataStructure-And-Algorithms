#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the runningTime function below.
def runningTime(arr):
    res=0
    for i in range(0, len(arr)):
        for j in range(0, len(arr)-1):
            if(arr[j] > arr[j+1]):
                t = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = t
                res+=1
    return res


if __name__ == '__main__':
    li = [2, 1, 3, 1, 2]

    result = runningTime(li)

    print(result)
