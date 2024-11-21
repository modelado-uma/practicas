# Generating the required text with 2000 iterations starting from 0

# Open and write to the text file
with open("/home/scrpt/Escritorio/TERCERO/PrimerCuatri/ModDisSof/practicas/practicas/docGen.txt", "w") as file:
    for i in range(2000):
        file.write(f"!new Vuelo('vuelo_secundario_{i}')\n")
        file.write(f"!insert(pilotoMigue, vuelo_secundario_{i}) into pilotadoSecundario\n")

"/home/scrpt/Escritorio/TERCERO/PrimerCuatri/ModDisSof/practicas/practicas/"  # Return the path of the generated file
