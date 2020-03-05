#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the cavityMap function below.
def cavityMap(grid):
    res = []
    for i in range(1, len(grid) - 1):
        for j in range(1, len(grid) - 1):
            #print(grid[i][j])
            if grid[i - 1][j] < grid[i][j] and grid[i][j-1] < grid[i][j] and grid[i][j+1] < grid[i][j] and \
                    grid[i + 1][j] < grid[i][j]:
                res.append(f'{i}{j}')

    res2= []
    for i in range(0, len(grid)):
        t = ''
        for j in range(0, len(grid)):
            if res.count(f'{i}{j}') > 0:
                t += 'X'
            else:
                t += str(grid[i][j])
        res2.append(t)

    return res2



if __name__ == '__main__':
    grid = [
            [1,1,1,2],
            [1,9,1,2],
            [1,8,9,2],
            [1,2,3,4]
            ]

    result = cavityMap(grid)
    print(result)