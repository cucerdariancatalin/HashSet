# HashSet in Kotlin

This is an implementation of a HashSet in Kotlin. A HashSet is a collection that contains no duplicate elements. This implementation uses a HashMap to store its elements. 

## Usage

To use this HashSet, you can create an instance of the `HashSet` class and then add, remove, or check if an element is contained in the set using the `add`, `remove`, and `contains` methods, respectively.

## Example

Here is an example of how to use the HashSet in Kotlin:

val set = HashSet<Int>()
set.add(1)
set.add(2)
println(set.contains(1)) // outputs "true"
println(set.contains(2)) // outputs "true"
println(set.contains(3)) // outputs "false"
