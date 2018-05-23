# Escuela Colombiana de Ingeniería

## Nombre del proyecto : Monitorias ECI
## Periodo Academico : 2018 -I
## Nombre del Curso : Procesos de Desarrollo de Software - PDSW
## Nombre de los Integrantes : 
* Nicolas Rey: Scrum master
* Oscar Pinto: Team 
* David Rodrieguez: Team
* Martin Cantor: Team
## Profesor: Francisco Cháves (Dueño del producto)
## Descripcion del producto:
### Descripcion general:
La Plataforma de Monitorias Académicas, es una herramienta que busca contribuir a una mejora significativa en el desempeño de los estudiantes la Escuela Colombiana de Ingenieria Julio Garavito. El sistema, más allá de facilitar el seguimiento de la labor de los monitores, es una valiosa base de conocimiento con la que los docentes de las diferentes asignaturas puedan identificar aquellas falencias de los estudiantes haciendo posible organizar, de forma más estratégica, la tomar acciones a nivel pedagógico, didáctico y administrativo enfocado al desarrollo de los estudiantes.

### Funcionalidades mas importantes:
1. Registro de las Asesorias y sus asistentes
2. Consulta de la informacion de las asesorias y de los asistentes de las mismas
3. Consultar informacion estadistica de los cursos y de las asesorias
4. Descargar la informacion de las consultas
5. Horario de monitorias para el publico, filtrado por la busqueda solicitada

## Arquitectura y Diseño detallado:
### Modelo E-R:
![ER1](https://github.com/ECIPDSW/MonitoriasECI/blob/master/src/main/java/img/ER1.png)
![ER2](https://github.com/ECIPDSW/MonitoriasECI/blob/master/src/main/java/img/ER2.png)

### Diagrama de clases:
![modelo](https://github.com/ECIPDSW/MonitoriasECI/blob/master/src/main/java/img/modelo.png)
### Descripcion de la arquitectura:
1.CAPAS:
* El proyecto de MonitoriasECI cuenta con diferentes capas:
la capa de Modelo donde se encuentra las clases principales con sus atributos y metodos.
la capa de Mappers donde estan los mappers donde se encuentran las consultas en SQL y las interfaces relacionadas. 
la capa de DAOS
la capa de Beans donde estan los Beans de cada actor dentro del sistema de monitorias, con sus respectivas funcionalidades.
la capa de servicios donde se encuentran las Fabricas necesarias.
la capa de presentacion donde se encuentran los xhtml que interactuan con los diferentes Beans y que permiten mostrarle al usuario la plataforma funcional.

2.STACK DE TECNOLOGIAS:
* PrimeFaces
* Maven
* Tomcat
* Postgres SQL
* Heroku
* MyBatis

### Enlace Heroku:
https://monitorias.herokuapp.com/

## Descripcion del proceso:
### Metodologia:
Para el desarrollo del proyecto se establecio la metodologia de Pair-Programming, se dividieron las responsabilidades individuales y por pareja para el desarrollo de las historias de uso, cada pareja se rotaba en cada sprint , permitiendonos trabajar todos en conjunto.
Se utilizaban las videollamadas para concretar puntos en comun del grupo.

### Link de Trello:
https://trello.com/b/AicP7uJU/2018-1-proypdsw-666-industries

### Release-burndown chart:
![burndownchart](https://github.com/ECIPDSW/MonitoriasECI/blob/master/src/main/java/img/burndownchart.png)

### Sprint 1:
#### Sprint-backlog 
https://docs.google.com/spreadsheets/d/1WEUOlERuPfXWPF6eRPfDeVycVD_PAhvCEwJLcxxpSsg/edit#gid=0
#### Sprint-burndown chart
https://drive.google.com/file/d/1a2J8WGpmNNLTs4p2sJHBTf8RHzPYNKBr/view

### Sprint 2:
#### Sprint-backlog 
https://docs.google.com/spreadsheets/d/1gugeWG-cO_8jd1oXYELwnuO3ZsJZGAAAWs1h0QQLFig/edit#gid=0
#### Sprint-burndown chart
https://drive.google.com/file/d/1d-FJysGdsxiI0jaWZSdpJcMU2WRFGm6v/view

### Sprint 3:
#### Sprint-backlog 
https://docs.google.com/spreadsheets/d/13HJfLaWX3yVZJ7_ddrqEkzZP5nxgykTa1EiR5WG392g/edit#gid=0

### Reporte de pruebas:

