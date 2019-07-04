def chop_list(array, target):
    if len(array) == 0:
        return chop_empty_list(array, target)
    elif len(array) == 1:
        return chop_single_value_list(array, target)
    else:
        return chop_multi_value_list(array, target)


def chop_empty_list(array, target):
    return -1


def chop_single_value_list(array, target):
    if array[0] == target:
        return 0
    else:
        return -1


def chop_multi_value_list(array, target):
    start = 0
    end = len(array) - 1
    while start <= end:
        middle = int((start+end) / 2)
        if array[middle] > target:
            end = middle - 1
        elif array[middle] < target:
            start = middle + 1
        else:
            return middle
    return -1

