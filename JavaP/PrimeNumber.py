import math

n=int(input())
isprime=True

if n<=1:
    isprime=False
else:
    for i in range(2,int(math.sqrt(n))+1):
        if n%i==0:
           isprime=False
           break
    
print(isprime)
