# Drawable tags

## Answer

C: LevelListDrawable, LayerDrawable, GradientDrawable

## More info

In general, the tags used in XML (in lisp-case) are associated to their upper-camel-case Java class equivalent. For instance, `<bitmap />` inflates a `BitmapDrawable`, `<animated-vector />` an `AnimatedVectorDrawable`, etc.

There are several several edge-cases:

  - `<selector />` inflates a `StateListDrawable`
  - `<animated-selector />` inflates a `AnimatedStateListDrawable`
  - `<animation-list />` inflates a `AnimationDrawable`
  - `<layer-list />` inflates a `LayerDrawable`
  - `<shape />` inflates a `GradientDrawable` (although `ShapeDrawable` does exist in the Android SDK)


# Misc

There is even an XML-only `Drawable` you can inflate with `<animated-rotate />`. The API is private but it is exposed via XML… The only evidence in the documentation are `R.styleable.AnimatedRotateDrawable` values.

Starting API 24, you can also inflate your own Drawables in XML. Simply implement the `inflate` method.
