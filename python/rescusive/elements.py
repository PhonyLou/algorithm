def elementNum(arr):
    if len(arr) == 0:
        return 0
    if len(arr) == 1:
        return 1
    else:
        del arr[0]
        return 1 + elementNum(arr)

print elementNum([1,2,3,4,5])