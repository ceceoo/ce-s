def chop_list(array, target):
    if len(array) == 0:
        return chop_empty_list(array, target)


def chop_empty_list(array, target):
    return -1