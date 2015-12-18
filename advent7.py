#!/usr/bin/python
def resolve(s, cir):
    parts = s.split(' ')
    if len(parts) == 1:
        return exp(s, cir)

    if len(parts) == 2:
        if parts[0] == 'NOT':
            return 0xffff^exp(parts[1], cir)
    
    if len(parts) == 3:
        try:
            return getattr(exp(parts[0], cir), '__'+parts[1].lower()+'__')(exp(parts[2], cir))
        except:
            pass
    raise Exception()
    
def exp(s, cir):
    try:
        return int(s)
    except:
        pass

    try:
        return cir[s]
    except:
        pass
    raise Exception()

    

def solve(desc):
    cir = {}
    fullcir = desc.split('\n')
    for line in fullcir:
        try:
            parts = line.split(' -> ')
            cir[parts[1]] = resolve(parts[0], cir)
            if not cir[parts[1]] or cir[parts[1]] == NotImplemented:
                raise Exception()
        except:
            fullcir.append(line)
        if cir.get('a') and cir.get('a') != NotImplemented:
            return cir['a']
    return cir

