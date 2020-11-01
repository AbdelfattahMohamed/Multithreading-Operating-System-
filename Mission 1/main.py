"""
Task desc:
1- Continue the greating program
" I will continue it and add another function

"""
from time import sleep
import multiprocessing as mp
# First Function : Time function with counter
def hello_function():
    for i in range(1,11):
        sleep(1)
        print(i)
    return
# Function 2: print parameter with time and counter
def par_function2(par):
    print(par)
    for n in range(10,21):
        sleep(1)
        print(n)
    return
# Define our processes
process1 = mp.Process(target = hello_function, args = ())                                # Target get the function
process2 = mp.Process(target = par_function2, args = (['Hello par_function2']))          # Target get the function
# Start threading
process1.start()
process2.start()
# For check the start of the progeam only
print("\nHello First Task \n")



# Sample of the run at some time
"""
Hello First Task 

Hello par_function2
101

2
11
3
12
413

14
5
15
6
16
7
17
8
189

10
19
20

"""
