# Mission 2:
"""
Matrix Multiplication
"""
# Import my libraries
import threading
import time
import numpy as np


import multipplication_class


def Matrix_Multiplication(start, end):
    for i in range(start, end):
        for j in range(multipplication_class.Dime):
            for p in range(multipplication_class.Dime):
                multipplication_class.Matrix_Z[i][j] += int(multipplication_class.Matrix_X[i][p] * multipplication_class.Matrix_Y[p][j])


def ThreadingMethod():
    thread_list = []
    for j in range(0, multipplication_class.N_Threads):
        # Initialize thread
        t = threading.Thread(target=Matrix_Multiplication,
                             args=(int((multipplication_class.Dime / multipplication_class.N_Threads) * j),
                                   int((multipplication_class.Dime / multipplication_class.N_Threads) * (j + 1))))
        # Append it in the list
        thread_list.append(t)
        # Start threading
        t.start()

    for j in range(0, multipplication_class.N_Threads):
        thread_list[j].join()


if __name__ == "__main__":
    multipplication_class.dimensions()
    multipplication_class.initialize_matrices()

    start_time = time.time()
    ThreadingMethod()
    end_time = time.time()

    print("The multiplication of matrices is: \n {}" .format(multipplication_class.Matrix_Z))
    print("Time had been taken to multiply two matrices is: " + str(end_time - start_time))

"""
©Abdelfattah Mohamed
"""