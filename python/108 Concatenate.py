strs = [
    "Prashant Jain", "bad",
    "is teaching java", "ghatiya", "ganda",
    "on KG Coding", "Best Youtube programming channel"
]

filtered = [s for s in strs if len(s) > 10]
result = " ".join(filtered)
print(result)
