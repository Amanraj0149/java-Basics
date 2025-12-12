arr= list(map(int,input().split()))
largest=arr[0]

for x in arr:
  if x> largest:
    largest=x
print("Largest element:",largest)





# Second method:

arr= list(map(int,input().split()))
print("Largest Element:",max(arr))
