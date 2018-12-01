# Part 1: Installation, Set-Up, and "Hello World"

[Table of Contents](https://github.com/hjhuney/An-Intro-to-Scala#table-of-contents)<br>
**1-1:** [Installing Scala](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.md#installing-scala)<br>
**1-2:** [VS Code for Scala](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.md#vs-code-forscala)<br>
**1-3:** [Launching Spark Shell](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.mda#launching-spark-shell)<br>
**1-4:** ["Hello World" in Command Prompt](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.md#hello-world-in-commandprompt)<br>
**1-5:** ["Hello World" in VS Code](https://github.com/hjhuney/An-Intro-to-Scala/blob/master/Part-01-Installation-and-Setup.md#hello-world-in-vscode)

## Installing Scala

The first task is to download Scala. You'll need to go through several steps. If you're using Windows 10, I recommend the following tutorial on YouTube

[How to Install and Setup SBT + Scala on Windows 10](https://www.youtube.com/watch?v=uYcSYCGITeU)

You can decide on your own whether you want to install SBT, as well, as there are other options for running Scala (such as [IntelliJ](https://www.jetbrains.com/idea/)).

If you are using a Linux-based OS, here is a similar video for you. I cannot vouch for this, but it's by the same author.

[How to Install and Setup SBT on Ubuntu](https://www.youtube.com/watch?v=uYcSYCGITeU)

Finally, here are some Mac instructions.

[How to Install Scala on Mac](https://www.youtube.com/watch?v=OKiwZFMgnEk)

While I found installing Scala to be more difficult than Python or R, there are plenty of resources out on the web if you're struggling. The good news is this is probably the most challenging part for most people.


## VS Code for Scala

We'll use the command prompt for our early exercises, but we'll eventually need a code editor. I recommend VS Code and I'll walk you through how to download it.

You are obviously free to use other options, such as Atom or Sublime, as well. Alternatively, if you want to use a full IDE, [IntelliJ](https://www.jetbrains.com/idea/) is a good choice and there is a [Scala plug-in](https://plugins.jetbrains.com/plugin/1347-scala) for it.

If you want to use VS Code and do not have it yet, download it [here](https://code.visualstudio.com/).

Once you have VS Code on your computer, launch it. On the left hand side of the screen, you should see some icons. One of these icons is a square of sorts. If you hover it, it should say "Extensions." Click on that.

![SBT plugin installation](https://github.com/hjhuney/Intro-to-Scala/blob/master/Images/scala001.jpg "SBT plugin")

In the search bar, enter "Scala". You should see some plug-in options for Scala. Go to "Scala (sbt)" and install it. Screenshot below highlights the box and correct plug-in.

You might also consider some other Scala plug-ins. I haven't messed around much with the others, but I did download the Scala Syntax plug-in, as well.

In any case, now you should be configured for running Scala files.

## Getting Started

Once you have everything installed, you should be able to run Scala through your command prompt. If you follow the instructions successfully and you're running Windows, you can open the command prompt (shortcut: enter "cmd" in the search box at the "Start" menu) and type in:

```
spark-shell
```

This will launch Spark in local mode, which is what we'll use for learning the basics of Scala.

## "Hello World" in Command Prompt** 

Let's start with the simple print statement. Scala's print statements look similar to Java, but a bit more concise.

```
println("Hello world!")
```

And voila! You've now run your first Scala program.

## "Hello World" in VS Code**

We won't need a code editor till we're a few lessons in, but if you also want to make sure Scala works properly in VS Code, then go to File -> New File. Save your file as "hello_world.scala". Enter the correct code in the file and then save.

Now open your terminal: View -> Terminal. Enter "spark-shell" in the terminal just as we did in the command prompt. To run the program, enter:

```
:load hello_world.scala
```

With that, you should get your printout. Let's move onto data types. 
