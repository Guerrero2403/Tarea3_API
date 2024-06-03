# Web-API-de-Libro
Basado en la tarea anterior se debe de hacer una modificación a los API, lo primero seria crear una nueva carpeta "utils" para crear las clases que necesitaremos para los mensajes de error y del estado esta seria la muestra

![Captura de pantalla (2213)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/c8c89bc7-600b-43be-8d01-8e3d2a00c884)

Ahora vamos con la modificación del codigo para lograr lo que se pide en la parte del controlador.

![Captura de pantalla (2219)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/08cb687d-3108-403b-ac68-c5c3590e2feb)

1. Si no existe un libro, se debe de lanzar una clase LibroException (GET /libros/{id_libro}). El estado que se debe enviar es un NOT_FOUND con un mensaje personalizado
- LibroException

  ![Captura de pantalla (2213)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/1571150a-948a-4cf3-b9bd-c69c6912d3d6)

- ExceptionResponse

  ![Captura de pantalla (2220)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/fc4c3132-8c53-40de-bb04-49cac4f2ac6e)

- RestResponseEntityExceptionHandler
  ![Captura de pantalla (2217)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/1aa967b9-97d7-44d6-bd37-a0173064ddd5)

- Ejecución
  ![Captura de pantalla (2212)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/52082449-0829-454f-9f88-4fb7d34b51a5)

2. Creación de un libro, debe de enviar el estado CREATED
![Captura de pantalla (2214)](https://github.com/AbarcaBryan/Web-API-de-Libro/assets/169930464/2710e54e-d241-4bb5-948e-447b32312ac0)

