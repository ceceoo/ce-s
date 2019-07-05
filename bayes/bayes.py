def bayes(p1, p2):
    p = p1 * p2 / ((p1 * p2) + (1 - p1) * (1 - p2))
    p = round(p, 5)
    return p


