def candidate(num: int) -> bool:
    if num <= 1:
        return False
    for i in range(2, num):
        if num % i == 0:
            return False
    return True

print(candidate(12))
print(candidate(13))
