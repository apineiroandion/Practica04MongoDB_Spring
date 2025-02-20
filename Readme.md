# Practica04MongoDB

## Descripción
Este proyecto es una aplicación Spring Boot que gestiona una colección de pingüinos almacenados en una base de datos MongoDB. Proporciona endpoints RESTful para realizar operaciones CRUD en los datos de los pingüinos e incluye funcionalidad para cargar datos desde un archivo XML en la base de datos.

## Tecnologías Utilizadas
- Java 17
- Spring Boot 3.4.2
- Spring Data MongoDB
- Jakarta XML Binding (JAXB)
- Maven

## Estructura del Proyecto
- `src/main/java/com/dam/practica04mongodb/controller`: Contiene los controladores REST.
- `src/main/java/com/dam/practica04mongodb/model`: Contiene las clases modelo.
- `src/main/java/com/dam/practica04mongodb/repository`: Contiene las interfaces de repositorio.
- `src/main/java/com/dam/practica04mongodb/service`: Contiene las clases de servicio.
- `src/main/resources`: Contiene el archivo XML con los datos de los pingüinos.

## Configuración e Instalación
1. **Clonar el repositorio:**
   ```sh
   git clone <repository-url>
   cd Practica04MongoDB
   ```

2. **Construir el proyecto:**
   ```sh
   mvn clean install
   ```

3. **Ejecutar la aplicación:**
   ```sh
   mvn spring-boot:run
   ```

## Endpoints
La aplicación proporciona los siguientes endpoints RESTful:

- **GET /pinguins**: Recuperar todos los pingüinos.
- **GET /pinguins/{id}**: Recuperar un pingüino por su ID.
- **POST /pinguins**: Crear un nuevo pingüino.
- **PUT /pinguins/{id}**: Actualizar un pingüino existente.
- **DELETE /pinguins/{id}**: Eliminar un pingüino por su ID.

## Carga de Datos
La aplicación incluye un componente `DataLoader` que carga datos de pingüinos desde un archivo XML (`src/main/resources/pinguinos.xml`) en la base de datos MongoDB cuando la aplicación se inicia.

## Ejemplo de Uso
1. **Recuperar todos los pingüinos:**
   ```sh
   curl -X GET http://localhost:8080/pinguins
   ```

2. **Recuperar un pingüino por ID:**
   ```sh
   curl -X GET http://localhost:8080/pinguins/{id}
   ```

3. **Crear un nuevo pingüino:**
   ```sh
   curl -X POST http://localhost:8080/pinguins -H "Content-Type: application/json" -d '{"nome": "Nombre del Pingüino", "nomeCientifico": "Nombre Científico", "habitat": "Hábitat", "descripcion": "Descripción", "alimentacion": "Alimentación", "tamaño": "Tamaño", "peso": "Peso", "caracteristicas": "Características"}'
   ```

4. **Actualizar un pingüino existente:**
   ```sh
   curl -X PUT http://localhost:8080/pinguins/{id} -H "Content-Type: application/json" -d '{"nome": "Nombre Actualizado", "nomeCientifico": "Nombre Científico Actualizado", "habitat": "Hábitat Actualizado", "descripcion": "Descripción Actualizada", "alimentacion": "Alimentación Actualizada", "tamaño": "Tamaño Actualizado", "peso": "Peso Actualizado", "caracteristicas": "Características Actualizadas"}'
   ```

5. **Eliminar un pingüino por ID:**
   ```sh
   curl -X DELETE http://localhost:8080/pinguins/{id}
   ```

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulte el archivo `LICENSE` para más detalles.

## Autor
Angel Jose Piñeiro Andion

## Agradecimientos
- Documentación de Spring Boot
- Documentación de MongoDB
- Documentación de Jakarta XML Binding (JAXB)