#What the F*** is this?
The goal of this project is document my learning on Test Driven Development. So far, my knowledge about that topic comes mostly from [Clean Code Lesson 4 - Uncle bob](https://www.youtube.com/watch?v=58jGpV2Cg50).
One of the most important tips He told on that talk was: "If you decide that you will do Test Driven Development in your work, you will fail".

So here I am, trying to learn on my spare time. Lets see how that goes.


#Rules of Test Driven Development
1) You are not allowed to write production code, until you have first written a test that fails because the production code doesn't exist.
2) You are not allowed to write more of a test than is sufficient to fail (not compiling is falling).
3) You are not allowed to write any more production code than is sufficient to past the currently failing test.
4) You are not allowed to make the production code more specific than the test. 
   1) Every new test you created, should make tests more specific(constraint)
   2) Everything you do to the production code, make it more general
5) You are not allowed to go directly for THE GOLD
   1) Avoid the central behavior as much as possible
   2) Test all the outside behavior for as long as possible

#The Steps of Learning
To start learning this ability, the first step I'm going to do is replicate the Demo done by Uncle Bob in the video. It is the implementation of a stack. I'm not going to finish the hole implementation just what he did.

The second step is to implement the exercises suggested by [this post](https://medium.com/@marlenac/learning-tdd-with-katas-3f499cb9c492)

the third step is to implement all data structure using TDD (including the stack began by Uncle Bob Demo).

And that all I've planned so far :)

#The process
1) Create a test class and write a nothing test
2) Write the test that forces you to write the production code you want to write
3) Write the code to make the test pass AND ONLY THAT! Engage as few braincells as possible
4) Remember: Can only refactor when you have a passing test
5) Don't keep duplicate code: REFACTOR RIGHT AWAY!