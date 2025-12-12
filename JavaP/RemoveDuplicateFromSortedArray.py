arr= list(map(int,input().split()))

rd=0
for i in range(1, len(arr):
  if arr[rd]!=arr[i]:
    rd+=1
    arr[rd]=arr[i]

for i in range(0,rd+1):
  print(arr[i])
    
