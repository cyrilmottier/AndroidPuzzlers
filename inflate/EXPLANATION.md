# Inflation result

## Answer

B: parent and child

## More info

Contrary to what you could expect, `LayoutInflater#inflate(int, ViewGroup)` doesn't always return the inflated `View`. Instead it returns the root of the inflated `View` which might be either the inflated `View` or, if non null, the provided parent `ViewGroup`.

In practice, we generally favor `LayoutInflater#inflate(int, ViewGroup, boolean)` as the third argument allows for a clearer and more understandable code.
