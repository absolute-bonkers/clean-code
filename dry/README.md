# Don't Repeat Yourself (DRY)

Tax rules belong in one `TaxCalculator`, rather than being copied into every
checkout or quote flow. Both callers delegate to the same rule, so a rate or
rounding change has one source of truth.

Run this example's tests with `./gradlew :dry:test` from the repository root.
