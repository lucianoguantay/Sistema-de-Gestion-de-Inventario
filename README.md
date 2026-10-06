# *Sistema de Gestión de Inventario*

Sistema integral desarrollado en Java, diseñado para optimizar el control de stock.

## Hoja de Ruta

Este proyecto se desarrolla bajo un enfoque iterativo y escalable, aplicando buenas prácticas de ingeniería de software y separando estrictamente la interfaz visual de la lógica de negocio:

*   **Fase 1 - Prototipo Funcional (Estado Actual):** Implementación de la lógica central utilizando Programación Orientada a Objetos (POO) pura y estructuras de datos avanzadas en memoria. Esto permite validar la experiencia de usuario, las pantallas y las reglas algorítmicas con máxima velocidad y seguridad.
*   **Fase 2 - Base de Datos (En desarrollo):** Migración hacia un motor de base de datos relacional (SQL Server). Se aplicarán patrones de diseño arquitectónico para aislar las consultas SQL, garantizando que el sistema esté listo para entornos de producción reales.

## Componentes

*   **Backend & Lógica:** Java
*   **Interfaz de Usuario (UX/UI):** Java Swing (Diseño modular para aplicaciones de escritorio)
*   **Arquitectura:** POO / Separación en capas (Interfaz gráfica vs. Lógica)
*   **Control de Versiones:** Git & GitHub

## Instrucciones de Uso (Soporte a Medida)

Para desplegar este sistema en un entorno de desarrollo local:

1. Clona este repositorio en tu equipo:
   ```bash
   git clone https://github.com/lucianoguantay/Sistema-de-Gestion-de-Inventario.git
   ```

## Cómo probar el proyecto en tu computadora

Diseñé este proyecto para que puedas probarlo sin tener que hacer configuraciones complejas de base de datos. Solo seguí estos pasos:

### 1. Preparar la Base de Datos
1. Abrí **SQL Server Management Studio**.
2. Abrí el archivo `setup_database.sql` que viene incluido en este repositorio.
3. Presioná `F5` (Ejecutar). 
> **Nota:** Este script creará automáticamente la base de datos `proyecto_empresa_db`, las tablas necesarias, y un usuario local llamado `user_empresa` (con clave `123456`) para que el programa de Java pueda conectarse. Puede modificar el nombre de usuario y el de la DB pero debe hacerlo en el database.example.properties y tambien en el setup_database.sql

### 2. Configurar la conexión en Java

1. Abrí el proyecto en **NetBeans**.
2. Andá a la pestaña **Files (Archivos)** y buscá en la raíz del proyecto el archivo llamado `config.example.properties`.
3. Cambiale el nombre a `config.properties` (Borrar el ".example").
4. Asegurate de que tu SQL Server tenga habilitado el puerto TCP/IP 1433 (desde el SQL Server Configuration Manager).

### 3. ENTRAR!
 Para probar el inicio de sesión, podés usar el usuario administrador que el script creó por defecto:
* **Usuario:** Luciano08
* **Contraseña:** Luciano08123

