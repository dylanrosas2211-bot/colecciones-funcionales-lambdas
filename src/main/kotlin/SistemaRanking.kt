/**
 * Ejercicio 3: SortBy y Lambdas
 * 
 * Implementa los métodos de esta clase para que pasen todos los tests
 * del archivo Ejercicio3SortByLambdaTest.kt
 * 
 * IMPORTANTE: No modifiques la firma de los métodos, solo implementa su lógica.
 */

data class Empleado(
    val id: Int,
    val nombre: String,
    val departamento: String,
    val salario: Double,
    val anosExperiencia: Int,
    val evaluacionDesempeno: Double, // 0.0 a 5.0
    val proyectosCompletados: Int
)
class SistemaRanking {
    
    // Parte A: Ordenamiento Simple con sortBy
    
    fun ordenarPorSalario(empleados: List<Empleado>): List<Empleado> {
        val salarioempleado = empleados.sortedBy { it.salario }
        return salarioempleado
        TODO("Implementar: Debe ordenar empleados por salario de menor a mayor")
    }
    
    fun ordenarPorExperienciaDesc(empleados: List<Empleado>): List<Empleado> {
        val experienciaempleado = empleados.sortedByDescending { it.anosExperiencia }
        return experienciaempleado
        TODO("Implementar: Debe ordenar por años de experiencia de mayor a menor")
    }
    
    fun ordenarPorNombre(empleados: List<Empleado>): List<Empleado> {
        val nombresalfabeticamente = empleados.sortedBy { it.nombre}
        return nombresalfabeticamente
        TODO("Implementar: Debe ordenar alfabéticamente por nombre")
    }
    
    // Parte B: Lambdas Complejas
    
    fun ordenarPorEficiencia(empleados: List<Empleado>): List<Empleado> {
        val eficienciaDeEmpleados = empleados.sortedByDescending({ it.proyectosCompletados / it.anosExperiencia })
        return eficienciaDeEmpleados
        TODO("Implementar: Debe ordenar por eficiencia (proyectosCompletados / añosExperiencia) descendente")
    }
    
    fun ordenarPorPuntuacionCompuesta(empleados: List<Empleado>): List<Empleado> {
        val puntuacionEmpleados = empleados.sortedByDescending { (it.evaluacionDesempeno * 2.0) + (it.proyectosCompletados * 0.1) }
        return puntuacionEmpleados
        TODO("Implementar: Debe ordenar por puntuación = (evaluacionDesempeño * 2) + (proyectosCompletados * 0.1) descendente")

    }
    
    fun ordenarITPrimero(empleados: List<Empleado>): List<Empleado> {
        val ordenarEmpleados = empleados.sortedBy { it.departamento }
        val salarioEmpleadoAsc = ordenarEmpleados.sortedBy { it.salario }
        return salarioEmpleadoAsc
        TODO("Implementar: Debe ordenar con empleados de IT primero, luego por salario ascendente")
    }

    // Parte C: Ordenamiento Múltiple
    
    fun ordenarPorDepartamentoYSalario(empleados: List<Empleado>): List<Empleado> {
        TODO("""
            Implementar: Debe ordenar por:
            1) Departamento alfabéticamente
            2) Dentro del mismo departamento, por salario descendente
            3) Si mismo departamento y salario, por experiencia ascendente
        """)
    }
    
    fun ordenarSegunSeniority(empleados: List<Empleado>): List<Empleado> {
        TODO("""
            Implementar: 
            - Juniors (experiencia < 5): ordenar por evaluación descendente
            - Seniors (experiencia >= 5): ordenar por proyectos completados descendente
            - Mantener juniors antes que seniors en la lista final
        """)
    }
    
    // Parte D: Lambdas como Parámetros de Configuración
    
    fun <T : Comparable<T>> ordenarConEstrategia(
        empleados: List<Empleado>,
        estrategia: (Empleado) -> T
    ): List<Empleado> {
        TODO("Implementar: Debe ordenar usando la estrategia proporcionada descendentemente")
    }
    
    fun obtenerTopEmpleados(
        empleados: List<Empleado>,
        filtro: (Empleado) -> Boolean,
        ordenamiento: (Empleado) -> Double,
        limite: Int
    ): List<Empleado> {
        TODO("""
            Implementar: 
            1) Filtrar empleados según el predicado
            2) Ordenar por el criterio dado (descendente)
            3) Tomar solo los primeros 'limite' empleados
        """)
    }
}