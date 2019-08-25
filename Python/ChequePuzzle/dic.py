s=int(input("amount spent in cents/paisa\n"))
for i in range(100):
    for j in range(100):
        #if left money is twice
        if((98*j-199*i-s)==0):
            print ("original price is ",i ,j)

        #if left money is thrice
        #if((299*j-97*i+s)==0):
        #    print(i,j)
