from re import compile

vowels = compile('[aeiou]')
conseq = compile('(.)\\1')
forbid = compile('(ab|cd|pq|xy)')

def isnice(s):
    return 1 if ((len(vowels.findall(s)) >=3 ) and
                 (len(conseq.findall(s)) >= 1) and
                 (len(forbid.findall(s)) == 0)) else 0

def countnice(lines):
    s=0
    for line in lines.split('\n'):
        s += isnice(line)
    return s
