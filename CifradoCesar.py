class CifradoCesar:

    def main(self):
        mensaje = input("Ingrese un mensaje: > _ ")
        llave = int(input("Ingrese la llave : > _ "))

        print(self.cifrado_cesar(mensaje, llave))

    def cifrado_cesar(self, mensaje, llave):
        alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
        m = len(alfabeto)

        # Mensaje en mayusculas
        mensaje = mensaje.upper()
        t = len(mensaje)

        # Crear resultado desde primera letra
        resultado = ""
        i = 0
        while (i < t):
            # busca letra en alfabeto
            encontre = -1
            j = 0
            while (j < m):
                if (mensaje[i] == alfabeto[j]):
                    encontre = j
                j = j + 1
            # Cambia letra de alfabeto con llave
            if (encontre >= 0):
                nueva = encontre + llave
                if (nueva > m):
                    nueva = nueva - m
                if (nueva < 0):
                    nueva = nueva + m
                letra = alfabeto[nueva]
            else:
                letra = alfabeto[encontre]
            # Añade letra al resultado
            resultado = resultado + letra
            i = i + 1
        return resultado

nuevo_mensaje = CifradoCesar()
nuevo_mensaje.main()

