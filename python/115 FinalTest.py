numbers = ["1", "2", "3", "4", "5"]

squares = map(lambda x: pow(int(x), 2), numbers)
total = sum(squares)

print(total)
