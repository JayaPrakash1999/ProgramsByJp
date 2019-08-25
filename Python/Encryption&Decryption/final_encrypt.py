import random
r=random.randint(0,57)
print(r)
lis =input("enter your message ")
re, er, nw, nw1 = "", "", "", ""
# encryption
num=0
for i in lis:
    re = re + chr(ord(i)-(r+num))
    num+=1
# print(re)
p = len(re) - 1
while p >= 0:
    nw = nw + re[p]
    p -= 1
print("your encrypted msg is ",nw)
print("exit to leave")
fyjb=input("")
