def con(*string:str)-> str:
    res=""
    for i in string:
        res+=i
    return res

result1 = con("Hello", " ", "World", "!")
print(result1)