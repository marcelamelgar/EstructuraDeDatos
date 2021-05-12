from numpy import random

def ordenBurbuja(Arr):
    for i in range(1, len(Arr)):
        for j in range(0, len(Arr)-i):
            if (Arr[j+1] < Arr[j]):
                aux = Arr[j]
                comp = Arr[j+1]
                print(aux)
                print(comp)
                Arr[j]= Arr[j+1]
                Arr[j+1] = aux
                print("NUEVO CAMBIO EN LA LISTA:")
                print(Arr)
    print ("\n~~~~~ LISTA ORDENADA CON METODO BURBUJA: ~~~~~")
    print(Arr)

Array = random.randint(50, size=(10))
print("~~~~~ LISTA INICIAL ~~~~~")
print(Array)
ordenBurbuja(Array)