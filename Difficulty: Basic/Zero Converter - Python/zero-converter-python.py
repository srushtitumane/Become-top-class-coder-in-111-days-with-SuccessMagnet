
def pos(n):
    # Print from n-1 down to 0
    for i in range(n-1, -1, -1):
        print(i, end=" ")

def neg(n):
    # Print from n up to -1 and finally 0
    for i in range(n, 0, 1):
        print(i, end=" ")
    print(0, end=" ")



