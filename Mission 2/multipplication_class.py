# Import Packages and libraries
import math
import random
import numpy as np
# initialize our matrices
Matrix_X = []
Matrix_Y = []
Matrix_Z = []
# Initialize dimension
Dime = 2
# Fill the matrices
vector_size = [int(math.pow(10,2)),
        int(math.pow(10,3)),
        int(math.pow(10,4))]
# Number of threads
N_Threads = 1
"""
Function 1: 
function for get dimensions and number of threads.
why?
- To make the program more active and to test it more and more to know the concept of threads
- Easy to use!
"""
def dimensions():
    # Make our variables globally for our program
    global Dime
    global N_Threads
    Dime = int(input("Enter one value for dimensions which be M x M : \n"))
    N_Threads = int(input("Enter number of threads: \n"))

"""
function 2:
function for initializing the matrices
"""
def initialize_matrices():
    # GLobally
    global Matrix_X
    global Matrix_Y
    global Matrix_Z
    # NUMPY FOR GENERATION
    Matrix_X = np.random.random((Dime, Dime))
    Matrix_X = Matrix_X * 10
    Matrix_X = Matrix_X.astype(int)

    Matrix_Y = np.random.random((Dime, Dime))
    Matrix_Y = Matrix_Y * 10
    Matrix_Y = Matrix_Y.astype(int)

    Matrix_Z = np.zeros((Dime, Dime))
    Matrix_Z = Matrix_Z.astype(int)