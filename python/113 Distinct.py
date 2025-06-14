numbers = [1, 2, 3, 2, 5, 3, 4, 6, 2]

distinct_numbers = []
seen = set()
for num in numbers:
    if num not in seen:
        distinct_numbers.append(num)
        seen.add(num)

print(numbers)
print(distinct_numbers)
