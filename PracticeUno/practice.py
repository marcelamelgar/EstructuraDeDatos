alumno = input("ingrese el nombre del alumno:\n")
calificacion = int(input("ingrese la calificacion del alumno:\n"))

if calificacion > 75:
    nota = 'O'
elif calificacion >= 60 and calificacion < 75:
    nota = 'A'
elif calificacion >= 50 and calificacion < 59:
    nota = 'B'
elif calificacion >= 40 and calificacion < 49:
    nota = 'C'
elif calificacion < 40:
    nota = 'D'

print(f"Estudiante: {alumno}\nNota: {nota}")