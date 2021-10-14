fun main(args: Array<String>) {
//    val clrm = Classroom(
//        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
//        Student("Bob", listOf(40.0, 10.0, 20.0, 25.0)),
//        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
//    )
//
//    for (s: Student in clrm) {
//        println("Student ${s.name} with grade ${s.averageGrade()}")
//    }
//


//
//    clrm.addBetter(
//        Student("Kloy", listOf(30.0, 100.0, 90.0, 70.0)),
//        Student("Eve", listOf(20.0, 70.0, 60.0, 30.0))
//    )

    val clrm = SortedClassroom(
        Student("Charlie", listOf(40.0, 80.0, 90.0, 55.0)),
        Student("Bob", listOf(40.0,10.0,20.0,25.0)),
        Student("Alice", listOf(20.0, 70.0, 60.0, 30.0))
    )

    for (s : Student in clrm) {
        println("Student ${s.name} with grade ${s.averageGrade()}")
    }
}