def biggestNum(arr, maxVal):
    if len(arr) < 1:
        return maxVal
    if arr[0] > maxVal:
        maxVal = arr[0]
    del arr[0]
    return biggestNum(arr, maxVal)

print biggestNum([2,1,5], 0)