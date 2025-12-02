s=input()
ans=s[::-1]
print(ans)

s=input()
rev=""
for ch in s:
  rev=ch+rev

print(rev);


s=list(input())

left=0
right=len(s)-1
while left<right:
  s[left], s[right]=s[right],s[left]
  left+=1
  right-=1

print("".join(s))
