#!/usr/bin/python
vals = {
    '<':[-1, 0],
    '>':[1, 0],
    '^':[0, 1],
    'v':[0, -1],
    }
def count_houses(s):
    [x, y] = [0, 0]
    visited = {}
    for c in s:
        visited[str(x) + ',' + str(y)] = 'X'
        [x, y] = [a+b for a,b in zip([x, y], vals[c])]
    visited[str(x) + ',' + str(y)] = 'X'
    return len(visited)
