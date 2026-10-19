# You Aren't Gonna Need It (YAGNI)

The current requirement is to send an order confirmation by email. The example
does just that; it avoids speculative channel registries, plugin systems, and
configuration for channels that do not exist yet. Add those only when a real
requirement calls for them.

Run this example's tests with `./gradlew :yagni:test` from the repository root.
