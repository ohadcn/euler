from re import compile
nums = r=compile('[0-9]+')
def dist(line, time):
    ns = [int(i) for i in nums.findall(line)]
    return (ns[0]*ns[1])*(time/(ns[1]+ns[2])) + ns[0]*min(ns[1], time%(ns[1]+ns[2]))

def fastest(lines, time):
    return max([dist(line, time) for line in lines.split('\n')])
