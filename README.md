# Kotlin Collection Modification Functions: Unexpected Behavior

This repository demonstrates a potential source of confusion when using Kotlin's collection modification functions: `removeIf`, `removeAll`, and `retainAll`. These functions modify the list *in place*, which can lead to unexpected results if not handled properly.

The example shows that `removeIf` and `removeAll` produce the same result when checking for a condition, but `retainAll` offers a different approach, retaining only elements that satisfy the given predicate.

Understanding the difference and in-place nature of these functions is crucial for writing correct and predictable Kotlin code.