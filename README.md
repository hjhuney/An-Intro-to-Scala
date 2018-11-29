# An Intro to Scala

**Part 1:**  [Installation, Set-Up, and "Hello World"](https://github.com/hjhuney/Intro-to-Scala#part-1-installation-setup-and-hello-world)

**Part 2:**  [Data Types + Arithmetic Operators](https://medium.com/@hjhuney/an-intro-to-scala-part-2-data-types-arithmetic-operators-eb54911c3fc7)

**Part 3:**  [Variables vs Values + String Operations](https://medium.com/@hjhuney/an-intro-to-scala-part-3-variables-vs-values-string-operations-2a5c7b612163)

**Part 4:** [Lists + Tuples](https://medium.com/@hjhuney/an-intro-to-scala-part-4-lists-tuples-85e023f15e75)

**Part 5:**

**Part 6:**

**Part 7:**


# Part 1: Installation, Setup, and "Hello World"

Welcome to the first article in my multi-part series on Scala. This tutorial is designed as a precursor to learning Apache Spark.

Spark is an open-source cluster-computing framework designed for big data processing. It is written in Scala. Spark can be run in Python (PySpark) and R (SparkR and sparklyr); however, the best performance with Spark can be achieved in Scala.

Scala is an object-oriented and functional programming language. It’s is most closely related to Java, so Java programmers should have a leg up on learning it. However, Scala is designed to be more concise and have features of functional programming languages.

**References and Resources** 

I will offer some other sources as both alternatives to my own blogs as well as references. Jose Portilla's Udemy courses are great and my blog will series will loosely follow the structure for his "Scala and Spark for Big Data and Machine Learning" course. If you learn better in video format, I highly recommend that course.
Marius Eriksen of Twitter has published "Effective Scala", which is available online for free. That's a great resource, as well.
If you're coming from a Python background, you might also check out this Python to Scala e-book, written by Rob Story. It's pretty short and sweet and serves as a good quick reference for all you Pythoners and Pythonistas out there!

**Learning Assumptions for this Series**

Before we start, let's get some assumptions out of the way. Scala is rarely one's first programming language, so while I try to start out pretty basic, I assume you have basic knowledge of at least one language, whether it be Python, R, Java, JavaScript, etc.

I come more from a Python background so I probably think more like a 'Python programmer'. That may come through at times.

I am also using a Windows 10 machine, which probably won't impact too much in this tutorial beyond installation and setup, but it's worth noting. Your experience may vary slightly.

Finally, I'll note that through these early articles, I will follow a format that labels input code and output. For instance:

*input*

```
Scala code goes here
```

*output*

```
res0: this is the output in the shell resulting from the code
```

With that, let's get started.

**Download Scala**

The first task is to download Scala. Admittedly, this can be one of the more challenging parts of the process. You'll need to go through several steps. If you're using Windows 10, I recommend the following tutorial on YouTube

[How to Install and Setup SBT + Scala on Windows 10](https://www.youtube.com/watch?v=uYcSYCGITeU)

You can decide on your own whether you want to install SBT, as well, as there are other options for running Scala (such as IntelliJ).

If you are using a Linux-based OS, here is a similar video for you. I cannot vouch for this, but it's by the same author.

How to Install and Setup SBT on Ubuntu

Finally, here are some Mac instructions.

How to Install Scala on Mac

While I found installing Scala to be more difficult than Python or R, there are plenty of resources out on the web if you're struggling. The good news is this is probably the most challenging part for most people.

**VS Code for Scala** 

We'll use the command prompt for our early exercises, but we'll eventually need a code editor. I recommend VS Code and I'll walk you through how to download.

You are obviously free to use other options, such as Atom or Sublime, as well. Alternatively, if you want to use a full IDE, IntelliJ is a good choice and there is a Scala plug-in for it.

If you want to use VS Code and do not have it yet, download it here.

Once you have VS Code on your computer, launch it. On the left hand side of the screen, you should see some icons. One of these icons is a square of sorts. If you hover it, it should say "Extensions." Click on that.

![SBT plugin installation](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/scala001.jpg "SBT plugin")


In the search bar, enter "Scala". You should see some plug-in options for Scala. Go to "Scala (sbt)" and install it. Screenshot below highlights the box and correct plug-in.
You might also consider some other Scala plug-ins. I haven't messed around much with the others, but I did download the Scala Syntax plug-in, as well.
In any case, now you should be configured for running Scala files.
Getting Started
Once you have everything installed, you should be able to run Scala through your command prompt. If you follow the instructions successfully and you're running Windows, you can open the command prompt (shortcut: enter "cmd" in the search box at the "Start" menu) and type in:
spark-shell
This will launch Spark in local mode, which is what we'll use for learning the basics of Scala.
"Hello World" in Command Prompt
Let's start with the simple print statement. Scala's print statements look similar to Java, but a bit more concise.
println("Hello world!")
And voila! You've now run your first Scala program.
"Hello World" in VS Code
We want need a code editor till we're a few lessons in, but if you also want to make sure Scala works properly in VS Code, then go to File -> New File. Save your file as "hello_world.scala". Enter the correct code in the file and then save.
Now open your terminal: View -> Terminal. Enter "spark-shell" in the terminal just as we did in the command prompt. To run the program, enter:
:load hello_world.scala
With that, you should get your printout.
Part 2
That's it for this blog. We'll get started with data types and arithmetic operators in Part 2.
An Intro to Scala, Part 2: Data Types + Arithmetic Operators
Resources
I'll keep a list of resources at the bottom of this intro blog. Feel free to comment with other good resources on Scala, so I can add them to the list in the future.
Marius Eriksen. Effective Scala, Link
Rob Story, Python to Scala, Link
Jose Portilla, Scala and Spark for Bit Data & Machine Learning (Udemy course), Link
