def chop_list(array, target):
    if len(array) == 0:
        return chop_empty_list(array, target)
    elif len(array) == 1:
        return chop_single_value_list(array, target)


def chop_empty_list(array, target):
    return -1


def chop_single_value_list(array, target):
    if array[0] == target:
        return 0
    else:
        return -1