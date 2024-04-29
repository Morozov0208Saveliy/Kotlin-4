package ru.otus.homework.persons

/**
 * Отсортировать список персон по возрасту в порядке убывания
 */
fun List<Person>.sortByAge() = this.sortedBy { it.age }.reversed()

/**
 * Отсортировать список персон по фамилии
 * - Фамилии сортируются по алфавиту в порядке возрастания
 * - Если фамилии совпадают, персоны сортируются по имени в порядке возрастания
 */
fun List<Person>.sortByName() = this.sortedBy { it.name }.sortedBy { it.surname }