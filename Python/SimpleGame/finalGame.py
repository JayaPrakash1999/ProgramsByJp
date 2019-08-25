import random
qa=True
ki=100
print("This is a simple game where you need to guess the random number. \nAnd if you need hint for -20 points you need to click yes and first you need to select level")
le=int(input('Enter level : "1"=EASY , "2"=MEDIUM , "3"=Hard.\n'))
if le==1:
    print("Random number is between 0 and 5\t")
    qw = random.randint(0, 5)
elif le==2:
    print("Random number is between 0 and 10\t")
    qw = random.randint(0, 10)
else:
    print("Random number is between 0 and 15\t")
    qw = random.randint(0, 15)
try:
    while(qa):

            ch = random.randint(3, 5)
            hi=(input("For hint enter press 'yes' or 'no' for yes u may lose (-) 20 points : "))
            if hi=='yes':
                if ch == 3:
                    print("Is Random no. is divisble by  ", ch,"? =>" ,qw % ch == 0)
                elif ch == 4:
                    print("Is Random no. is divisble by  ", ch,"?  =>", qw % ch == 0)
                else:
                    print("Is Random no. is divisble by   ", ch,"?  =>", qw % ch == 0)
                ki -= 20
                ass = int(input("enter the expected number : "))
                if ki > 0:
                    if(ass == qw):
                        print(" congrats you won!!!!!!!!!!!!!!!!!  and earned ", ki, "points")
                        qa = False
                    elif (ass > qw):
                        print("your no. is greater than random no.\t TRY AGAIN")
                    else:
                        print("your no. is less than random no.\t TRY AGAIN")
                else:
                     print(" I am giving u one more option try new game")
                     ki = 100
            elif hi=="no":
                ass = int(input("Enter the expected number :"))
                if ki > 0:
                    if (ass == qw):
                        print(" Congrats you won!!!!!!!!!!!!!!!!!  and earned ", ki, "points")
                        qa = False
                    elif(ass>qw):
                        print("your no. is greater than random no.\t TRY AGAIN")
                        ki -= 10
                    else:
                        print("your no. is less than random no.\t TRY AGAIN")
                        ki -= 10
                else:
                    print("we are giving u one more option try new game")
                    ki = 100

except:
        print("plz give the correct input")
qwer=input("enter exit to leave")

