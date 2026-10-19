# Refactoring

The example extracts the cart's total calculation into a named operation and
models each line as `CartItem`. Its public behavior is still the same: an empty
cart totals zero, and a populated cart totals the sum of each price times its
quantity. The tests characterize that behavior.

Run this example's tests with `./gradlew :refactoring:test` from the repository root.
