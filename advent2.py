#!/usr/bin/python
from itertools import combinations
def total_paper(pres):
    pre = pres.split('\n')
    count = 0
    for line in pres.split('\n'):
        dims = [int(i) for i in line.split('x')]
        sqr = [b*c for b,c in combinations(dims, 2)]
        count += 2*sum(sqr) + min(sqr)
    return count
