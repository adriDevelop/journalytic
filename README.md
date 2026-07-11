# Journalityc

Bienvenido/a a la documentación de Journalityc.

## ¿Qué es Journalityc?

¿Nunca has pensado en usar otra herramientas de analíticas, pero era demasiado tedioso el incorporarlo? Bueno pues eso se acabó con **Journalytic**.

Con **Journalytic** podrás tener un sistema de analíticas en tu aplicación sin necesidad de usar herramientas externas, y lo mejor de todo es que es muy fácil de implementar.

## Forma en la que está desarrollado

**Journalytic** consta de tres partes:

- El frontend:
  - Realizado con Angular 20.
  - Componentes reusables y claros. Puedes editarlos a tu gusto, pero para eso ya deberás acceder al código para editarlo a tu gusto.
  - Frontend claro con diseño simple en el que se detallan las métricas de tu aplicación.
- El backend:
  - Realizado con SpringBoot.
  - Claro, simple y fácil de entender.
  - Cuenta con un sistema de autenticación y autorización para que solo tú puedas acceder a tus métricas. (Este lo incializas tú cuando entras por primera vez a la aplicación).
- La base de datos:
  - Base de datos MySQL.
  - Simple y clara, con tablas bien definidas para que puedas entenderla sin problemas.

¿Algo más? Pues sí, hay algo que no te vas a encontrar en la aplicación y que vas a tener que agregar tú mismo, y es la base de datos que maneja las IP de las personas que se conectan a tu proyecto.

Y **¿por qué no está incluida?** Pues porque uso una base de datos externa para eso, y no se puede agregar a la base de datos de Journalytic, pero no te preocupes, es muy fácil de implementar y te lo explico en la sección de instalación.

## ¿Cómo funciona todo?

Bueno, toda la aplicación va a estar en un contenedor de Docker, así que no te preocupes por instalar nada, solo tendrás que ejecutar un comando y listo.

Eso sí, deberás tener ejecutado Docker en tu máquina, y si no lo tienes, puedes descargarlo desde [aquí](https://www.docker.com/products/docker-desktop/).

## Instalación

Para instalar Journalityc, lo primero que debes hacer es clonar el repositorio en tu máquina, para eso ejecuta el siguiente comando:

```bash
git clone https://github.com/adriDevelop/journalityc.git
```

Una vez clonado, entras dentro de la carpeta contenedora y ejecutas el siguiente comando para levantar la aplicación:

```bash
docker-compose up -d
```

Y si tienes docker instalado en tu sistema, la aplicación se levantará en el puerto 8080, así que para acceder a ella solo debes abrir tu navegador y entrar a la siguiente dirección:

```bash
http://localhost:8080
```

Y listo, ya podrás acceder a la aplicación y empezar a usarla.
