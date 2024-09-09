from abc import ABC,abstractmethod
import os 

os.system("cls||clear")

class Endereco:
    def __init__(self, logradouro:str,numero:str,cidade:str):
        self.logradouro = logradouro
        self.numero = numero
        self.cidade = cidade 

class Funcionario(ABC):
    def __init__ (self,nome:str,email:str,salario:float, endereco:Endereco):
        self.nome = nome  
        self.email = email  
        self.salario = salario  
        self.endereco = endereco  
    @abstractmethod
    def salario_final(self)--float 
        pass
    def __str__ (self):
        return (f"\nNome:{self.nome}"
                f"\nEmail:{self.email}"
                f"\nSalario:{self.salario}"
                f"\nEndereco:{self.endereco}"
        )    

class Motoboy(Funcionario):
    def __init__ (self,nome:str,idade:str,):
