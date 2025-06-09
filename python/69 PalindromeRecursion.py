def isPalindrome(string,end,start=0):
    if start>=end:
        return True
    elif string[start]==string[end]:
        return isPalindrome(string,end-1,start+1)
    else:
        return False
string=input("Enter your string: ")
end=len(string)-1
print(isPalindrome(string,end))