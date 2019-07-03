# PracticaSpinner01

Se utiliza un componente del tipo Spinner, el cual consistirá en elegir una opcion de la lista del spinner, y al darle seleccionar 
una, mediante un TextView estado, se visualizará la opción seleccionada y un Toast indicando también el dato que se eligió de la 
lista. En la actividad se hacen referencia de los componentes a manipular, para proseguir a almacenar varias opciones o items en 
un ArrayList, definir un arrarAdapter y especificar los párametros que pide su constructor y el adapter será el enlace o la conexión 
que tendrán entre ArrayList-Spinner.

se especifica la acción de item seleccionado del Spinner, con setOnItemSelectedListener() el cual agregamos depende de la selección
de la lista, se obtenga el dato de la posición del item, y se muestré en un TextView, seguido de un mensaje Toast.
