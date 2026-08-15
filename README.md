# Módulo de Ventas

Proyecto simple en HTML + Bootstrap para practicar control de versiones con Git.

## Estructura

```
index.html          Login (usuario: admin / contraseña: admin)
css/style.css        Estilos compartidos
pages/
  ├── menu.html          Menú principal
  ├── productos.html      Listado de productos
  ├── clientes.html        Listado de clientes
  ├── ventas.html          Registrar venta
  ├── reportes.html        Reporte de ventas
  ├── proveedores.html     Listado de proveedores
  ├── categorias.html      Listado de categorías
  └── empleados.html       Listado de empleados
```

## Cómo ejecutarlo

Al ser un sitio estático, basta con abrir `index.html` en el navegador,
o levantar un servidor local:

```
python -m http.server 8000
```

Y entrar a `http://localhost:8000/index.html`.

## Historial de cambios

| Fecha | Autor | Commit | Descripción |
|-------|-------|--------|-------------|
| 2026-08-15 | Juan Duel | `a3b2d44` | Módulo de ventas inicial en Java (Producto, Cliente, Venta, DetalleVenta, Main) |
| 2026-08-15 | Juan Duel | `d9e8f83` | Reemplazo por versión web estática en HTML + Bootstrap |
| 2026-08-15 | Juan Duel | `033726c` | Se agrega login y se separa el menú en su propia página |
| 2026-08-15 | Juan Duel | `48a785e` | Rediseño visual (iconos, degradados, tarjetas) y reorganización en carpetas `css/` y `pages/` |
| 2026-08-15 | Juan Duel | `7ab4e73` | Se agrega la página de Proveedores |
| 2026-08-15 | Juan Duel | `81e3f19` | Se agrega la página de Categorías |
| 2026-08-15 | Juan Duel | `64d2f80` | Se agrega la página de Empleados |
| 2026-08-15 | Juan Duel | `966a15d` | Se enlazan las páginas nuevas en el menú y la navegación |
| 2026-08-15 | Juan Duel | `5790302` | Se agrega el producto "Audífonos" al listado de Productos |
| 2026-08-15 | Juan Duel | `b584694` | Se agrega README con estructura del proyecto e historial de cambios |
| 2026-08-15 | Juan Duel | `4ac520d` | Se agrega campo "Método de Pago" y opción de Audífonos al formulario de Ventas |

> Este historial se arma a partir de `git log`. Para ver el detalle real de quién
> hizo cada commit (con fecha y hora exactas), corre:
> ```
> git log --pretty=format:"%h | %ad | %an | %s" --date=short
> ```
