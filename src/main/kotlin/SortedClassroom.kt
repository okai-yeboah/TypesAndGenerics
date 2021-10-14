class SortedClassroom(vararg sts: Student) : Classroom<Student>(*sts) {

    class StudentSorter  : Comparator<Student> {

        override fun compare(o1: Student?, o2: Student?): Int = when {
            o1!!.averageGrade() > o2!!.averageGrade() -> 1
            o1.averageGrade() < o2.averageGrade() -> -1
            else -> 0
        }

    }

    override fun iterator(): Iterator<Student> {
       return students.sortedWith(StudentSorter()).iterator()
    }
}