def sum(arr):
    if len(arr) == 0:
        return 0
    if len(arr) == 1:
        return arr[0]
    else:
        curVal = arr[0]
        del arr[0]
        return curVal + sum(arr)

print sum([1,2,10])