#!/usr/bin/python
def say(seq, times = 1):
    if not times:
        return seq
    nseq=''
    zero=ord('0')
    rep = 1
    bef = seq[0]
    for i in range(1, len(seq)):
        if seq[i] == bef:
            rep+=1
        else:
            nseq += chr(rep+zero) + bef
            bef = seq[i]
            rep = 1
    nseq += chr(rep+zero) + bef
    return say(nseq, times - 1)
