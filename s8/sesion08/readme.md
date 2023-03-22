### Conectar a base de datos desde la terminal
```shell
mysql -u root -p
```

### Crear base de datos
```sql
create database bedu;
```

### Listar bases de datos
```sql
show databases;
```

### Borrar base de datos
```sql
drop database bedu;
```

### Seleccionar base de datos
```sql
use bedu;
```

### Mostrar tablas
```sql
show tables;
```

### Mostrar estructura de tabla
```sql
describe cliente;
```

### Consultar registro de la tabla
```sql
select * from cliente;
```

### Consultar registro de la tabla con id especifico
```sql
select * from cliente where id = 1;
```

### Eliminar registro de la tabla con id especifico
```sql
delete from cliente where id = 1;
```