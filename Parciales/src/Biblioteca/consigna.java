//Sistema Biblioteca
//Se desea implementar un sistema básico de gestión para una Biblioteca.
//
//En la biblioteca se administra la información de diferentes tipos de materiales: libros, revistas y documentales.
//Cada material cuenta con un título, año de publicación, y un estado de conservación (BUENO, REGULAR, MALO).
//
//Los libros, además, tienen un autor principal y un número de páginas.
//Las revistas cuentan con un número de edición y un mes de publicación.
//Los documentales poseen una duración en minutos y un tema principal.
//
//Tanto los libros como los documentales deben poder ser digitalizados a través de un método digitalizar() que retorna un mensaje indicando el inicio del proceso. Las revistas no se digitalizan.
//
//Se debe permitir:
//
//agregarMaterial(Material m) : El bibliotecario debe poder agregar nuevos materiales. Si ya existe un material (mismo título y año), se debe lanzar una excepción personalizada MaterialYaExisteException.
//
//mostrarMateriales() : Muestra todos los materiales almacenados, mostrando todos sus atributos y su tipo.
//
//digitalizarMateriales() : Llamar al método digitalizar() solo en los materiales que lo permiten, e informar cuáles no son digitalizables.
//
