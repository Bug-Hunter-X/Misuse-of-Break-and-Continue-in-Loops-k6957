# Java Loop Control Misuse

This repository demonstrates a common error in Java programming: the misuse of `break` and `continue` statements within loops.  The example highlights the difference between how `break` terminates the loop completely and how `continue` proceeds to the next iteration.

## Bug Description
The `BuggyLoop.java` file contains code that uses `break` and `continue` incorrectly, potentially leading to unexpected loop behavior. The intended logic might not be accurately reflected in the output.

## Solution
The `FixedLoop.java` file provides a corrected version of the loop, ensuring the `break` and `continue` statements work as intended.