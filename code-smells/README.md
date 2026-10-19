# Code Smells

`LegacyOrderSummary` shows a long parameter list made of unrelated primitives:
customer name, email, street, city, postal code, and total. The improved model
groups related values into `Customer`, `Address`, and `Money`, making invalid
combinations harder to express. The test compares both outputs to show the
behavior stays the same while the API gets clearer. This is not a claim that
every primitive is a problem.

Run this example's tests with `./gradlew :code-smells:test` from the repository root.
