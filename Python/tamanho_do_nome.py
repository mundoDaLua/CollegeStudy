nome = input('Digite seu nome')
tamanho_nome = len(nome)

if tamanho_nome <= 4:
    print(f'O nome {nome} é curto, e tem {tamanho_nome} letras')
elif tamanho_nome <= 6:
    print(f'O nome {nome} tem um tamanho normal, sendo {tamanho_nome} letras')
else:
    print(f'O nome {nome} é bem grande... Ele tem {tamanho_nome} letra')

print('Fim')
