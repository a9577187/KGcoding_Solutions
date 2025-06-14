def to_optional(s):
    if s is None or s == "":
        return None
    return s.upper()

print(to_optional(None))
print(to_optional(""))
print(to_optional("pop"))
