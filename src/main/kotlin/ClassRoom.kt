open class Classroom<T : Student>(vararg sts: T) : Iterable<T> {
    val students: MutableList<T> = mutableListOf()

    init {
        for (s in sts) students.add(s)
    }

    override fun iterator(): Iterator<T> {
        return students.iterator()
    }

    fun addBetter(vararg stds: T) {
        val prevBestStudent = students.sortedWith(compareBy { student -> student.averageGrade() }).last()
        val bestStudents = stds.filter { it.averageGrade() > prevBestStudent.averageGrade() }.toMutableList()
        bestStudents.forEach { students.add(it) }
    }
}