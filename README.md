# Web-API-de-Libro
Basado en la tarea anterior se debe de hacer una modificación a los API, lo primero seria crear una nueva carpeta "utils" para crear las clases que necesitaremos para los mensajes de error y del estado esta seria la muestra

![Captura de pantalla (2213)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura1.PNG)

Ahora vamos con la modificación del codigo para lograr lo que se pide en la parte del controlador.

![Captura de pantalla (2219)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura2.PNG)

1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado
- LibroException

  ![Captura de pantalla (2213)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura3.PNG)

- ExceptionResponse

  ![Captura de pantalla (2220)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura4.PNG)

- RestResponseEntityExceptionHandler
  ![Captura de pantalla (2217)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura5.PNG)

- Ejecución
  ![Captura de pantalla (2212)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura6.PNG)

2. Creación de un libro, debe de enviar el estado CREATED
![Captura de pantalla (2214)](https://github.com/Guerrero2403/Tarea3_API/blob/main/Capturas/Captura7.PNG)

