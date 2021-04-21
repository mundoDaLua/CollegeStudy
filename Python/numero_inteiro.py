numero = input('Digite um numero inteiro)

try:
    numero = int(numero)

    if numero % 2 == 0:
        print(f'O numero {numero} é par')
    else:
        print(f'O numero {numero} é impar')

except:
    print('Não foi digitado um numero inteiro!')

print('Fim')
