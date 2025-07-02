# Proyecto SuperMercado

## Descripción

Sistema de gestión de productos para un supermercado desarrollado en Java. El proyecto implementa una jerarquía de clases que permite manejar diferentes tipos de productos (Bebidas, Frutas y Shampoo) con sus respectivas características.

## Estructura del Proyecto

```
SuperMercado/
├── src/
│   ├── App.java                 # Clase principal
│   ├── Producto/
│   │   └── Producto.java        # Clase abstracta base
│   ├── Bebida/
│   │   └── Bebida.java          # Clase para bebidas
│   ├── Fruta/
│   │   └── Fruta.java           # Clase para frutas
│   └── Shampoo/
│       └── Shampoo.java         # Clase para shampoo
├── lib/                         # Dependencias
├── .vscode/                     # Configuración VS Code
└── README.md                    # Este archivo
```

## Funcionalidades

- Gestión de diferentes tipos de productos
- Comparación de precios (más caro/barato)
- Herencia y polimorfismo
- Encapsulamiento de datos
- Interfaz Comparable para ordenamiento
- Stream API para operaciones funcionales

## Características Técnicas

- **Lenguaje**: Java
- **Paradigma**: Orientado a Objetos
- **Patrones**: Herencia, Polimorfismo, Encapsulamiento
- **Interfaces**: Comparable
- **API**: Stream API

## Cómo Ejecutar

### Prerrequisitos
- Java JDK 8 o superior
- VS Code con extensión Java (recomendado)

### Ejecución Rápida
1. Abrir el proyecto en VS Code
2. Navegar a `src/App.java`
3. Presionar F5 o hacer clic en "Run"

## Ejemplo de Salida (lo pedido para el ejercicio)

```
Marca: Cola Cola, Litros: 1.5, Precio: $20.0
Marca: Coca Cola Zero, Litros: 1.5, Precio: $18.0
Marca: Frutilla, Unidad de venta: kilo, Precio: $64.0
Marca: Shampoo_Sedal, Contenido: 500ml, Precio: $19.0

El producto mas caro es: Frutilla
El producto mas barato es: Coca Cola Zero
```

## Patrones de Diseño

- **Herencia**: Jerarquía de clases de productos
- **Polimorfismo**: Tratamiento uniforme de diferentes tipos
- **Encapsulamiento**: Control de acceso a atributos
- **Interfaz Comparable**: Ordenamiento por precio

