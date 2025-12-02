s=input()
ans=s[::-1]
print(ans==s)


s=input()

ispalin=True

left=0
right=len(s)-1
while(left<right):
   if s[left]!=s[right]:
       ispalin=False
       break
   left+=1
   right-=1
    
print(ispalin)
