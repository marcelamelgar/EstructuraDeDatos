from flask import Flask
from random import randint

app = Flask(__name__)

def randomArr(long):
    randomArray= []
    for i in range(0, long):
        randomArray.append((randint(0,100)))
    return randomArray

def linear(array, num):
    for i in range(len(array)):
        if (array[i] == num):
            return True
    return False

def binary(arr, l, r, x): 
    x=int(x)
    while l <= r: 
        mid = l + (r - l) // 2; 
        if arr[mid] == x: 
            return True
        elif arr[mid] < x: 
            l = mid + 1                 #sacado de geeksforgeeks
        else: 
            r = mid - 1
    return False

@app.route('/linear/<int:array>/<int:num>/')
def linearSearch(array, num):
    elementos = randomArr(array)
    if (linear(elementos, num)) == True:
        return 'se ha hallado el valor en el arreglo\n'
    else:
        return 'no se ha hallado el valor en el arreglo\n'

@app.route('/binary/<int:array>/<int:num>/')
def binarySearch(array, num):
    elementos = randomArr(array)
    if (binary(elementos, 0, len(elementos)-1, num)) == True:
        return 'se ha hallado el valor en el arreglo\n'
    else:
        return 'no se ha hallado el valor en el arreglo\n'

if __name__ == "__main__":
    app.run(host="0.0.0.0", debug = True)
