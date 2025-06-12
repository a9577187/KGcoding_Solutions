from collections import Counter

arr = [1,2,3,4,3,3,1,2,4,4,3,2,1,3,4,4,2,2,2,1,1,3,3,2,4]
counts = Counter(arr)
print(counts)
for key in sorted(counts):
    print(f"{key} occurs {counts[key]} times")

