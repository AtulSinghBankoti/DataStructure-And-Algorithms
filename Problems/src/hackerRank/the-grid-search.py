#!/bin/python3

#https://www.hackerrank.com/challenges/the-grid-search/problem

# Complete the gridSearch function below.
def gridSearch(G, P):
    for i in range(0, G.__len__()):
        for j in range(0, G[0].__len__()):
            if P[0].__len__()+j <= G[0].__len__() and P.__len__()+i <= G.__len__():
                pr=0
                matched = True
                for r in range(i, i+P.__len__()):
                    pc=0
                    for c in range(j, j+P[0].__len__()):
                        #print(f'r:{r}, c:{c}')
                        if G[r][c] != P[pr][pc]:
                            matched = False
                            break
                        else:
                            pc += 1
                    if not matched:
                        break
                    else:
                        pr += 1
                if matched:
                    return 'YES'
    return 'NO'


if __name__ == '__main__':

    G = [
        [1,2,3,4,5,6,7,8,9,0],
        [0,9,8,7,6,5,4,3,2,1],
        [1,1,1,1,1,1,1,1,1,1],
        [1,1,1,1,1,1,1,1,1,1],
        [2,2,2,2,2,2,2,2,2,2]
    ]

    P=[
       [8,7,6,5,4,3],
       [1,1,1,1,1,1],
       [1,1,1,1,1,1]
    ]
    result = gridSearch(G, P)
    print(result)