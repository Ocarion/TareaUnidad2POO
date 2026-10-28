# TareaUnidad2POO
# Sistema de Gestión de Contenido Audiovisual

## Descripción del proyecto

Este proyecto fue desarrollado como parte de la Unidad 2 de la asignatura de Programación Orientada a Objetos. Su objetivo es aplicar los conceptos de relaciones entre clases y herencia mediante un sistema que permite representar diferentes tipos de contenido audiovisual.

## Objetivos

- Aplicar los conceptos de programación orientada a objetos en Java.
- Implementar relaciones entre clases mediante asociación, agregación y composición.
- Crear nuevas clases que hereden de una clase abstracta.
- Utilizar constructores, atributos, métodos y sobrescritura de métodos.
- Representar las clases y sus relaciones mediante un diagrama UML.

## Clases del proyecto

### Clases originales

- **ContenidoAudiovisual:** clase abstracta que contiene los atributos y métodos generales del contenido audiovisual.
- **Pelicula:** representa una película y contiene información sobre su estudio.
- **SerieDeTV:** representa una serie de televisión y almacena la cantidad de temporadas.
- **Documental:** representa un documental y contiene información sobre su tema.

### Clases nuevas

- **Actor:** representa a un actor relacionado con una película.
- **Temporada:** representa una temporada de una serie de televisión, incluyendo su número y cantidad de episodios.
- **Investigador:** representa a un investigador relacionado con un documental.
- **VideoYouTube:** representa un video de YouTube y almacena información sobre su canal.
- **Cortometraje:** representa un cortometraje y almacena información sobre su director.

## Funcionalidades

- Crear objetos de diferentes tipos de contenido audiovisual.
- Mostrar los detalles de cada contenido mediante el método `mostrarDetalles()`.
- Aplicar herencia para reutilizar los atributos y métodos de `ContenidoAudiovisual`.
- Representar las relaciones entre películas, actores, series, temporadas, documentales e investigadores.
- Probar el funcionamiento de las clases desde el método principal del programa.

## Tecnologías utilizadas

- Java
- Eclipse IDE for Java Developers
- Git
- GitHub
- UML para el diseño del diagrama de clases

## Requisitos

Para ejecutar el proyecto se necesita:

- Tener instalado el JDK de Java.
- Tener instalado Eclipse IDE for Java Developers.
- Tener instalado Git para clonar el repositorio.

## Instalación y ejecución

1. Clonar el repositorio desde GitHub:

   ```bash
   git clone URL_DE_TU_REPOSITORIO
   ```

2. Abrir Eclipse.

3. Seleccionar **File → Import → Existing Projects into Workspace**.

4. Seleccionar la carpeta del proyecto clonado y finalizar la importación.

5. Abrir la clase que contiene el método `main`.

6. Ejecutar el programa con **Run → Run As → Java Application**.

## Diagrama UML

El diagrama UML representa la estructura del sistema, sus clases, atributos, métodos y relaciones.

Se incluye la herencia entre `ContenidoAudiovisual` y sus clases derivadas, además de las relaciones entre `Pelicula` y `Actor`, `SerieDeTV` y `Temporada`, y `Documental` e `Investigador`.

## Mejoras realizadas

- Incorporación de nuevas clases para representar actores, temporadas e investigadores.
- Creación de dos nuevos tipos de contenido audiovisual: videos de YouTube y cortometrajes.
- Aplicación de herencia y sobrescritura de métodos.
- Elaboración de un diagrama UML para representar las clases y sus relaciones.
- Pruebas de creación de objetos y visualización de sus detalles.

## Autor

Estudiante de la asignatura de Programación Orientada a Objetos.

## Asignatura

Programación Orientada a Objetos — Unidad 2.
