from enum import Enum
import os 

os.system("cls||clear")
class Sexo(Enum):
    MASCULINO="Masculino"
    FEMININO="Feminino"

class Pessoa:
    """Este é o construtor"""
    def __init__(self,nome:str,idade:int,sexo:Sexo) -> None:
        self.nome = nome 
        self.idade = idade 
        self.sexo = sexo 

    def __str__(self) -> str:
        """Equivale ao toString"""
        return (f"\nNome:{self.nome}"
                f"\nIdade:{self.idade}"
                f"\nSexo:{self.sexo.value}"
                )         
"""Estanciando um objt"""    
pessoa_1 = Pessoa ("Marta",18,Sexo.FEMININO)
pessoa_2 = Pessoa ("Pedro",20,Sexo.MASCULINO)

print(pessoa_1)
print(pessoa_2)
