# Web-API-de-Libro_MANUEL_GUERRERO
DATOS DE LO QUE PIDE LA TAREA
Basado en la tarea anterior Se debe modificar , lo primero que realice pue crear una carpeta "utils" para poder crear las respectivas clases que necesite para los mensajes de error y el estado de la muestra para crear las clases que necesitaremos para los mensajes de error y esto seria la muestra 

![Captura de pantalla (2213)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura1.PNG)

Ahora modificaremos  el codigo para lograr lo que se pide en la parte del controlador.

![Captura de pantalla (2219)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura2.PNG)

1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado
- LibroException

  ![Captura de pantalla (2213)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura3.PNG)

- (ExceptionResponse)

  ![Captura de pantalla (2220)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura4.PNG)

- (RestResponseEntityExceptionHandler)
  ![Captura de pantalla (2217)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura5.PNG)

- resultado de la Ejecución en postman del error 
  ![Captura de pantalla (2212)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura6.PNG)

2. Creación de un libro, debe de enviar el estado CREATED y no da error.
![Captura de pantalla (2214)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura7.PNG)

