# Part 3: Arithmetic Operators

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**3-1:** [Addition](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#addition)<br>
**3-2:** [Subtraction](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#subtraction)<br>
**3-3:** [Multiplication](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#multiplication)<br>
**3-4:** [Division](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#division)<br>
**3-5:** [Modulus](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#modulus)<br>
**3-6:** [Exponents](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#exponents)<br>
**3-7:** [Square Roots](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#square-roots)<br>
**3-8:** [Absolute Value](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#absolute-value)<br>
**3-9:** [Math Library](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#math-library)<br>
**3-10:** [Order of Operations](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-03-Arithmetic-Operators.md#order-of-operations)<br>

## Addition

*input*

```
2+7
```

*output*

```
res1: Int=9
```

## Subtraction

*input*

```
4–2
```

*output*

```
res1: Int=2
```

## Multiplication

Multiplication uses the asterisk (“*”) symbol.

*input*

```
4 * 5
```

*output*

```
res1: Int=20
```

## Division

Division is a bit less straight-forward.

*input*

```
9 / 4
```

*output*

```
res6: Int=2
```

Note that 9/4 = 2.25, but Scala rounds down our result. This is because we divided two integers and the result will also be an integer. In order to get a floating point number, we need to make at least one of the numbers a “double.”

*input*

```
9.0/4
```

*output*

```
res1: Double = 2.25
```

We can see now that we get the proper result. Let’s move onto remainders.

## Modulus

To find the remainder of a number after division, we use the “%” operator.

*input*

```
7 % 2
```

*output*

```
res1: Int = 1
```

Since 7 divided by 2 is equal to 3 with a remainder of 1, we get an output of “1”.

## Exponents

Exponents are a bit less simple in Scala than in Python. We need to access the math library and use the “.pow” method.

*input*

```
math.pow(3,3)
```

*output*

```
res1: Double=27.0
```

## Square Roots

Similar process for square roots.

*input*

```
math.sqrt(64)
```

*output*

```
res1: Double = 8.0
```

## Absolute Value

Absolute value is another good one.

*input*

```
math.abs(-7.8)
```

*output*

```
res1: Double = 7.8
```

## Math Library

You can check out more mathematical operations in the [math library](https://www.scala-lang.org/api/2.12.3/scala/math/index.html). Other features include rounding, logarithms, and trigonometric operations (e.g. sin, cos, tan).

## Order of Operations

Finally, order of operations are pretty straight-forward.

*input*

```
3+4*1+1
```

*output*

```
res10: Int=9
```

*input*

```
(3+4)*(1+1)
```

*output*

```
res11: Int=14
```
