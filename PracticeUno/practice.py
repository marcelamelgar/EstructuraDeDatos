def verificacionNotas(calificacion):

    if calificacion > 75:
        return 'O'
    elif calificacion >= 60 and calificacion <= 75:
        return 'A'
    elif calificacion >= 50 and calificacion <= 59:
        return 'B'
    elif calificacion >= 40 and calificacion <= 49:
        return 'C'
    elif calificacion < 40:
        return 'D'

alumno = input("ingrese el nombre del alumno:\n")
calificacion = int(input("ingrese la calificacion del alumno:\n"))

print(f"Estudiante: {alumno}\nNota: {verificacionNotas(calificacion)}")
