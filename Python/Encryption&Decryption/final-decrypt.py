qw=int(input("enter the value"))
nw=list(input("enter your encrypted message"))
nw1,er,re=[],[],[]
p=len(nw)-1
while p>= 0:
    nw1.append(nw[p])
    p-= 1
# print(nw)
num=0
for i in nw1:
    er.append(chr(ord(i)+(qw+num)))
    num += 1
print("decrypted message is: ")
for i in er:
    print(i,end='')
print("\n")
sjhg=input("enter exit to leave")
