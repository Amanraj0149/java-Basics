arr= list(map(int,input().split()))

largest=float('-inf')
seclargest=float('-inf')

for x in arr:
  if x>largest:
    largest=x

for x in arr:
  if x!=largest and x>seclarge:
    seclarge=x

print("LargestNumber:",largest)
print("seclarge:",seclarge)
