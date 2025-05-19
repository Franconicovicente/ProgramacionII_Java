/*
Ejercicio Integrador Hotel
Enunciado General
Nos contratan para desarrollar un sistema de un hotel para gestionar sus habitaciones, clientes y reservas.
El sistema será utilizado por recepcionistas para registrar y confirmar reservas.
Clases y Estructuras
 Clase abstracta: Persona
Atributos privados:
• nombre: String
• dni: String
• notificaciones: ArrayList<String>
Constructores:
• Persona()
Inicializa la lista de notificaciones.
• Persona(nombre: String, dni: String)
Métodos:
• Método abstracto:
notificar(notificacion: String): void
• getNombre(): String
• getDni(): String
• getNotificaciones(): ArrayList<String>
• agregarNotificacion(mensaje: String): void (protegido)
• toString(): String
 Clase: Cliente (hereda de Persona)
Atributos privados:
• mail: String
• reservas: ArrayList<Reserva>
Constructor:
• Cliente(nombre: String, dni: String, email: String)
Métodos públicos:
• getReservas(): ArrayList<Reserva>
• getEmail(): String
• realizarReserva(hotel: Hotel, habitacion: Habitacion, inicio: LocalDate, fin:
LocalDate): void
o Realiza una reserva si la habitación está disponible.
o Notifica a los recepcionistas si se realiza.
o Si no es posible, imprime mensaje de error.
• notificar(notificacion: String): void
 Clase: Recepcionista (hereda de Persona)
Atributo privado:
• legajo: String
Constructor:
• Recepcionista(nombre: String, dni: String, legajo: String)
Métodos públicos:
• getReservas(): ArrayList<Reserva>
• getLegajo(): String
• confirmarReserva(reserva: Reserva, hotel: Hotel): void
o Confirma la reserva si aún no lo está.
o Notifica al cliente implicado.
o Si no puede confirmar, imprime mensaje de error.
• notificar(notificacion: String): void
 Clase: Habitacion
Atributos privados:
• numero: int
• tipo: TipoHabitacion
• precioPorNoche: double
Constructor:
• Habitacion(numero: int, tipo: TipoHabitacion, precioPorNoche: double)
Métodos públicos:
• getNumero(): int
• getTipo(): TipoHabitacion
• getPrecioPorNoche(): double
• toString(): String
Retorna los datos de la habitación.
 Clase: Reserva
Atributos privados:
• cliente: Cliente
• habitacion: Habitacion
• fechaInicio: LocalDate
• fechaFin: LocalDate
• confirmada: boolean
Constructor:
• Reserva(cliente: Cliente, habitacion: Habitacion, fechaInicio: LocalDate,
fechaFin: LocalDate)
Métodos públicos:
• getFechaInicio(): LocalDate
• getFechaFin(): LocalDate
• getHabitacion(): Habitacion
• getCliente(): Cliente
• isConfirmada(): boolean
• confirmar(): void
Establece confirmada = true si aún no lo está.
• calcularTotal(): double
• toString(): String
Muestra detalles de la reserva.
 Clase: Hotel
Atributos privados:
• nombre: String
• direccion: String
• habitaciones: ArrayList<Habitacion>
• recepcionistas: ArrayList<Recepcionista>
• reservas: ArrayList<Reserva>
Constructores:
• Hotel()
Inicializa las listas.
• Hotel(nombre: String, direccion: String)
Métodos públicos:
• getReservas(): ArrayList<Reserva>
• getRecepcionistas(): ArrayList<Recepcionista>
• getHabitaciones(): ArrayList<Habitacion>
• getDireccion(): String
• getNombre(): String
• agregarHabitacion(habitacion: Habitacion): void
• agregarRecepcionista(recepcionista: Recepcionista): void
• agregarReserva(reserva: Reserva): void
• buscarHabitacionesDisponibles(inicio: LocalDate, fin: LocalDate, tipo:
TipoHabitacion): ArrayList<Habitacion>
Retorna habitaciones disponibles para el rango de fechas y tipo solicitado.
• toString(): String
 Enum: TipoHabitacion
• SIMPLE
• DOBLE
• SUITE
Reglas de Negocio
• Los clientes pueden registrar reservas solo si las habitaciones están disponibles (sin solapamiento de
fechas).
• Al registrar una reserva:
o Se notifica a todos los recepcionistas del hotel.
• Al confirmar una reserva:
o Se notifica al cliente.
• Una reserva no puede ser confirmada más de una vez.
• Solo se agregan reservas al hotel cuando están confirmadas.
main - Simulación
1. Crear un hotel.
2. Agregar dos habitaciones: una de tipo SIMPLE y otra DOBLE.
3. Agregar dos recepcionistas.
4. Crear cuatro clientes.
5. Simular los siguientes escenarios:
 Escenario A – Cliente 1
• Registra una reserva válida.
• Recepcionista 1 la confirma.
 Escenario B – Cliente 2
• Registra una reserva en la misma habitación que Cliente 1, pero en fechas posteriores (no se
solapan).
• Recepcionista 2 la confirma.
 Escenario C – Cliente 3
• Intenta reservar una habitación en fechas solapadas con una reserva existente.
• La reserva no se registra. Se imprime un mensaje de error.
 Escenario D – Cliente 4
• Intenta reservar una habitación sin disponibilidad.
• La reserva no se registra. Se imprime un mensaje de error.
Informes a Mostrar
• Notificaciones de cada cliente (enviadas por recepcionistas).
• Notificaciones de cada recepcionista (reservas registradas por clientes).
• Detalle de las reservas confirmadas del hotel.
*/