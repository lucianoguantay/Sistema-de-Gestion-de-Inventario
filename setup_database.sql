/*
USE master;
GO

-- Crear la base de datos si no existe
IF NOT EXISTS (SELECT name FROM sys.databases WHERE name = N'proyecto_empresa_db')
BEGIN
    CREATE DATABASE proyecto_empresa_db;
    PRINT 'Base de datos [proyecto_empresa_db] creada exitosamente.';
END;
GO

-- Crear el Login (Acceso al servidor)
IF NOT EXISTS (SELECT * FROM sys.server_principals WHERE name = N'user_empresa')
BEGIN
    CREATE LOGIN user_empresa WITH PASSWORD = '123456', CHECK_POLICY = OFF;
    PRINT 'Login de servidor [user_empresa] creado.';
END;
GO

-- Entrar a la base de datos recién creada
USE proyecto_empresa_db;
GO

-- Asignar el usuario y darle poder de dueño (db_owner)
IF NOT EXISTS (SELECT * FROM sys.database_principals WHERE name = N'user_empresa')
BEGIN
    CREATE USER user_empresa FOR LOGIN user_empresa;
    ALTER ROLE db_owner ADD MEMBER user_empresa;
    PRINT 'Permisos de db_owner asignados al usuario.';
END;
GO

-- CREACIÓN DE TABLAS (Blindadas)

CREATE TABLE Marcas (
        Id_Marca     INT             IDENTITY(1,1),
        Nombre      VARCHAR(50)     NOT NULL,
        
        CONSTRAINT PK_IDMARCA_MARCA PRIMARY KEY (Id_Marca)
)


IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'Usuarios')
BEGIN
    CREATE TABLE Usuarios (
        Id_Usuario       INT             IDENTITY(1,1),
        Nombre          VARCHAR(40)     NOT NULL,
        Password        VARCHAR(40)     NOT NULL,
        Rol             VARCHAR(40)     NOT NULL,

        CONSTRAINT PK_USUARIOID_USUARIOS PRIMARY KEY(Id_Usuario),
        CONSTRAINT CK_NOMBRE_USUARIOS   CHECK (Nombre<>''),
        CONSTRAINT CK_PASSWORD_USUARIOS CHECK(Password<>'')
    );
END;
GO





IF NOT EXISTS (SELECT * FROM sys.tables WHERE name = 'Productos')
BEGIN
    CREATE TABLE Productos (
        Id_Producto         INT             IDENTITY(1,1),
        Id_Marca            INT             NOT NULL,
        Id_Usuario          INT             NOT NULL,
        Nombre              VARCHAR(50)     NOT NULL,
        Precio              DECIMAL(10,3)   NOT NULL,
        Stock               INT             NOT NULL,
        Informacion         VARCHAR(200)    NOT NULL,
        FechaRegistro       DATE            NOT NULL,

        CONSTRAINT PK_IDPRODUCTO_PRODUCTOS PRIMARY KEY (Id_Producto),
        CONSTRAINT FK_PRODUCTOS_MARCAS     FOREIGN KEY(Id_Marca) REFERENCES Marcas(Id_Marca),
        CONSTRAINT FK_PRODUCTOS_USUARIOS    FOREIGN KEY(Id_Usuario) REFERENCES Usuarios(Id_Usuario),
        CONSTRAINT CK_NOMBRE_PRODUCTOS      CHECK(Nombre<>''),
        CONSTRAINT CK_PRECIO_PRODUCTOS      CHECK(Precio>0)
    );
END;
GO


-- PROCEDIMIENTOS ALMACENADOS (CREATE)

CREATE PROCEDURE dbo.usp_InsertarUsuario
    @nombre VARCHAR(50),
    @Password VARCHAR(50),
    @Rol      VARCHAR(50)
AS
BEGIN
    INSERT INTO Usuarios (Nombre,Password,Rol)
    VALUES (@nombre,@Password,@Rol);
END;
GO

CREATE PROCEDURE dbo.usp_BuscarUsuario 
    @Nombre VARCHAR(50),
    @Password VARCHAR(50)
AS
BEGIN 
    SELECT * FROM Usuarios
    WHERE Nombre = @Nombre AND Password = @Password;
END;
GO

-- DATOS POR DEFECTO (Evitando duplicados)

INSERT INTO Usuarios (Nombre,Password,Rol) 
    VALUES  ('Luciano08','Luciano08123','Administrador'),
            ('Lionel08','Lionel08123','Control de Stock'),
            ('Ragnarock08','123456789','Control de Notificaciones'),
            ('Boby','200820','Control de Objetos');
GO



*/

USE proyecto_empresa_db;
GO

/*
CREATE PROCEDURE dbo.usp_MostrarProductos
AS
BEGIN
    SELECT TOP 50 * FROM Productos;
END;
GO


CREATE PROCEDURE dbo.usp_MostrarNombreProducto
AS
BEGIN
    SELECT * FROM Productos;
END;
GO




CREATE PROCEDURE dbo.usp_BuscarProductoxNombre
                @Nombre VARCHAR(50),
                @Existe BIT OUTPUT
AS
BEGIN
    IF EXISTS (SELECT Nombre FROM Productos WHERE Nombre=@Nombre)
        SET @Existe = 1
    ELSE
        SET @Existe = 0
END;
GO




DECLARE @Variable BIT;

EXEC dbo.usp_BuscarProductoxNombre @Nombre='RE', @Existe = @Variable OUTPUT;
SELECT (@Variable);
GO


CREATE PROCEDURE dbo.usp_BuscarProductoxNombre
    @Nombre VARCHAR(50),
    @Existe BIT OUTPUT
AS
BEGIN
    --Impide que el servidor mande msj sobre filas o columnas afectadas
    SET NOCOUNT ON; 

    IF EXISTS (SELECT 1 FROM Productos WHERE Nombre=@Nombre)
        SET @Existe = 1;
    ELSE
        SET @Existe = 0;
END;
GO



*/





