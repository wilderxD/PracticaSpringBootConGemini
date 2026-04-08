#Usamos una imagen base ya que Java 21 instalado en un Linux muy ligero(Alpine)
FROM eclipse-temurin:21-jdk-alpine

#Le decimos a Docker: "Ponte a trabajar dentro  de la carperta /app"
WORKDIR /app

#Copiamos nuetro archivo .jar compilado desde nuetra computadora hacia adentro del contenedor
#Ojo: cambia el nombre del .jar si el tuyo se llama distinto en la carpeto 'target'
COPY target/aprendo-0.0.1-SNAPSHOT.jar app.jar

#Le avisamos a Doker que nuestra aplicacion usara el puerto 8080
EXPOSE 8080

#El comando exacto que docker debe escribir en la terminal para encender la api
ENTRYPOINT ["java", "-jar", "app.jar"]