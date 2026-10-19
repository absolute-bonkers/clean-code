# Code Smells

The initial design problem is a long parameter list made of unrelated
primitives: customer name, email, street, city, postal code, and several
amounts. The improved model groups related values into `Customer`, `Address`,
and `Money`, making invalid combinations harder to express. This is an example
of recognizing a smell; it is not a claim that every primitive is a problem.

Run this example's tests with `./gradlew :code-smells:test` from the repository root.
