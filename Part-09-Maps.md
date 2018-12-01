# Part 9: Sets

A set is a collection with no duplicate elements. In Scala, we can create both immutable and mutable sets. First, let's create an empty set. 

*input*

```
val set1 = Set()
```

*output*

```
set1: scala.collection.immutable.Set[Nothing] = Set()
```

By default, we can see that this set is immutable. Now, let's give the set some data. 

*input*

```
val set1 = Set(1,5,9)
```

*output*

```
set1: scala.collection.immutable.Set[Int] = Set(1, 5, 9)
```

## Mutable Sets

Now, let's create a mutable set. 

*input*

```
val mutable_set1 = collection.mutable.Set(1,5,9)
```

*output*

```
mutable_set1: scala.collection.mutable.Set[Int] = Set(9, 1, 5)
```

We can now add an integer to the mutable set. 

*input*

```
mutable_set1 += 27
```

*output*

```
res1: mutable_set1.type = Set(9, 27, 1, 5)
```

We can also use ".add" to add an integer to a mutable set.

*input*

```
mutable_set1.add(77)
```

*output*

```
res1: Boolean = true
```

Notice that in this case, adding an integer to the set gives us a return value of "Boolean = true" rather than the set itself, but we can simply call the set and get this result. 

```
res1: scala.collection.mutable.Set[Int] = Set(9, 27, 1, 5, 77)
```

## Cast a List to a Set

There are many instances where we might want to turn a list into a set. Let's first create a list. 

```
val listy_mcgillicuddy = List(6, 8, 8, 12, 13, 13, 19)
```

Now, we'll cast it to a set with the .toSet method. 

```
val set_mcgillicuddy = listy_mcgillicuddy.toSet
```

*output*

```
set_mcgillicuddy: scala.collection.immutable.Set[Int] = Set(6, 13, 12, 8, 19)
```

Note that the set eliminates the duplicates since a set can only contain unique values. Also remember that a set is unordered so we can not slice or index it.
