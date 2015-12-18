info={}
def loadMFCSAM(lines):
    for line in lines.split('\n'):
        datas=line.split(': ')
        info[datas[0]] = datas[1]

def issue(datas):
    for d in datas:
        name, amount = d.split(': ')
        if not info[name] == amount:
            return False
    return True

def findsue(lines):
    for line in lines.split('\n'):
        if issue(line.split(' ', 2)[-1].split(', ')):
                 print(line)
