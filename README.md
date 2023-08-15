## Calculadora Complejos
#### 📚 Homework for university

## Resultados:
Suma             |  Resta
:-:|:-:
![Suma](preview/preview-1.png?raw=true "Suma")  |  ![Resta](preview/preview-2.png?raw=true "Resta")
Multiplicacion | Division
![Multiplicacion](preview/preview-3.png?raw=true "Multiplicacion")  |  ![Division](preview/preview-4.png?raw=true "Division")



## Requerimientos:
#### Implemente su código acorde a las directrices siguientes:

- Su código debe usar de manera correcta el paradigma de la Orientación a Objetos.
- Parta confeccionando una Clase que modele ser un numero Complejo (Par de números
  reales). Llámela Complejo y defina sus atributos.
- Confeccione un constructor de modo que permita la inicialización de la parte real y la parte
  imaginaria del número complejo a cero.
- Agregue los métodos de instancia necesarios para los mecanismos de sumar, restar,
  multiplicar y dividir. Estos métodos deben devolver un objeto( instancia) de la clase
  Complejo, es decir un tipo Complejo.
- Confeccione otro constructor de modo que permita la inicialización de la parte real y la parte
  imaginaria del número complejo con valores(números) reales cualesquiera
  respectivamente.
- Confeccione los métodos setter’s y/o getter’s que considere realmente necesarios.
- Sobreescriba(Override) el método toString() para mostrar los números complejos en la
  pantalla de una forma “más natural”. Entiéndase como par ordenado, por ejemplo, el
  número complejo nulo uNumeroComplejoNulo= (0,0), el numero complejo neutro
  uNumeroComplejoNeutro= (1,0), etc.
- Trabaje de forma correcta el modelo orientado a objeto haciendo uso de más de una clase,
  que operan de forma colaborativa (colaboración entre clases).
- Comente mínimamente su código a través de uso de comentarios explicativos de lo más
  relevante o medular.
- Agregue los comentarios que indiquen el por qué su código seria 100% Orientado a
  Objetos. (recuerde: `Clase` > `instancia(s)` > `mensaje(s)`).
- A modo de ejemplo para los números complejos `UnComplejo1 = (1.0, 1.0)` y `UnComplejo2 = (2.0, 2.0)` su programa debe permitir operaciones tales como:

```
  (1.0, 1.0) + (2.0, 2.0) = (3.0, 3.0)
  (1.0, 1.0) - (2.0, 2.0) = (-1.0, -1.0)
  (1.0, 1.0) / (2.0, 2.0) = (0.5, 0.0)
  (1.0, 1.0) * (2.0, 2.0) = (0.0, 4.0)
```

En otras palabras, tu código debe reflejar en Java, algo como
``` java
    UnComplejo1.sumar(UnComplejo2);
    UnComplejo1.restar(UnComplejo2);
    UnComplejo1.multiplicar(UnComplejo2);
    UnComplejo1.dividir(UnComplejo2)
```

- La aplicación comienza desplegando un menú para luego permitir ingresar y definir los
valores de números reales que se usaran para cada parte del numero complejo (por
ejemplo, para UnComplejo1, UnComplejo2, etc.) y después decidir qué operación realizar
con ellos (sumar, restar, multiplicar o dividir) para que finalmente entregue el resultado
correcto.

### Operaciones:

- Sumar dos números complejos:

  `(a, b) + (c, d) = (a + c, b + d);`


- Restar dos números complejos:

  `(a, b) - (c, d) = (a - c, b - d);`


- Multiplicar dos números complejos:

  `(a, b) * (c, d) = (a*c – b*d, a*d + b*c)`


- Dividir dos números complejos:

  `(a, b) / (c, d) = ((a*c + b*d) / (c2 + d2) , (b*c – a*d) / (c2 + d2))`
