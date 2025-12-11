def is_vowel(ch):
   return ch.lower() in "aeiou"

s=input()

cv=0
cc=0
for ch in s:
  if is_vowel(ch):
    cv+=1
  else:
    cc+=1
print(cv,cc)
