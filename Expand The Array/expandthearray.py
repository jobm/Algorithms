def expand(lis):
    return ''.join(list(map(lambda a: a[0] * int(a[1]), [ list(lis)[i:i+2] for i in range(0, len(lis), 2) ])))
print(expand('a3b1c1d2e3f9'))
