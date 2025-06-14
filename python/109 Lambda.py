numbers = [1,2,3,4,5,6,7,8,9,10]

odd_numbers = filter(lambda num: num % 2 == 1, numbers)
for num in odd_numbers:
    print(num)
filter.