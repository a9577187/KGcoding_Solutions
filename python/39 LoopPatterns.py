
def printRightHalfPyramid(rows):
    for i in range(rows):
        for j in range(i+1):
            print("*",end="")
        print("")
def printReverseRightHalfPyramid(rows):
    for i in range(rows):
        for j in range(rows-i,0,-1):
            print("*",end="")
        print("")
def printLeftHalfPyramid(rows):
    for i in range(rows):
        for j in range(rows-i,1,-1):
            print(" ",end="")
        for k in range(i+1):
            print("*",end="")
        print("")

rows = int(input("Enter number of rows: "))
print("Right Half Pyramid:")
printRightHalfPyramid(rows)
print("Reverse Right Half Pyramid:")
printReverseRightHalfPyramid(rows)
print("Left Half Pyramid:")
printLeftHalfPyramid(rows)