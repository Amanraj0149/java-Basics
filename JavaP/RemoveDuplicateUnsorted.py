arr= list(map(int,input().split()))
seen =set()
unique=[]
for x in arr:
  if x not in seen:
    set.add(x)
    unique.append(x)
print(unique)
