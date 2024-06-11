# Web App con JAX-WS para Saludar y Gestión de Cursos con Jakarta EE y WildFly

En este proyecto, utilizamos JAX-WS (Java API for XML Web Services) para desarrollar servicios web SOAP (Simple Object Access Protocol). JAX-WS es una tecnología estándar de Java que facilita la creación de servicios web basados en XML.

La aplicación web que implementa operaciones básicas como `saludar()`, así como operaciones CRUD (Crear, Listar) para una clase `Curso`, utilizando JAX-WS (Java API for XML Web Services) y desplegado en un servidor WildFly. La aplicación está construida con Jakarta EE 10 y utiliza Maven para la gestión de dependencias y la construcción del proyecto.

## Características principales

- Implementación de servicios web utilizando **JAX-WS** y Jakarta EE 10.
- Métodos básicos como `saludar()`, y para la clase `Curso`: `listar()` y `crear()`.
- Gestión de dependencias y construcción del proyecto facilitada con Maven.
- Despliegue en el servidor de aplicaciones WildFly.

## Tecnologías utilizadas

[![Jakarta EE](https://img.shields.io/badge/Jakarta%20EE-10.0.0-blue)](https://jakarta.ee/)
[![Maven](https://img.shields.io/badge/Maven-3.9.6-yellow)](https://maven.apache.org/)
[![WildFly](https://img.shields.io/badge/WildFly-32.0.0.Final-red)](https://www.wildfly.org/)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-2024.1.1-blue)](https://www.jetbrains.com/idea/)

## Requisitos previos

- JDK 21 instalado.
- Maven 3.9.6 instalado.
- Servidor de aplicaciones WildFly 32.0.0.Final configurado y ejecutándose.
- IntelliJ IDEA 2024.1.1 instalado.

## Configuración del entorno de desarrollo

1. Clona este repositorio en tu máquina local.
2. Importa el proyecto en tu IDE de Java preferido.
3. Configura tu servidor de aplicaciones WildFly en el IDE.
4. Compila y despliega la aplicación en el servidor WildFly.

## Uso de JAX-WS en el Proyecto
1. **Definición de Servicios Web**: Utilizamos anotaciones proporcionadas por JAX-WS para definir nuestros servicios web en clases Java. Por ejemplo, la anotación @WebService se utiliza para marcar una clase como un servicio web.
2. **Implementación de Métodos del Servicio**: Dentro de la clase del servicio web, implementamos métodos que serán expuestos como operaciones del servicio. Estos métodos pueden tomar parámetros y devolver valores que se serializan/deserializan automáticamente a XML.
3. **Generación del WSDL**: Cuando el proyecto se despliega en un servidor de aplicaciones, JAX-WS genera automáticamente un archivo WSDL (Web Services Description Language) que describe los servicios web disponibles, incluyendo las operaciones, parámetros y tipos de datos.
4. **Acceso al WSDL**: El archivo WSDL generado se puede acceder a través de una URL específica, que generalmente sigue la convención http://hostname:port/webapp-context/ServiceName?wsdl. Por ejemplo, si el servicio se llama MiServicio, la URL del WSDL sería algo como http://localhost:8080/my-webapp/MiServicio?wsdl.

Una vez que la aplicación esté desplegada, puedes acceder a ella desde tu navegador web favorito utilizando la URL proporcionada por tu servidor de aplicaciones WildFly.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-caracteristica`).
3. Realiza tus cambios y haz commit (`git commit -am 'Agrega una nueva característica'`).
4. Haz push a la rama (`git push origin feature/nueva-caracteristica`).
5. Crea un nuevo Pull Request.

## Licencia

Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).
