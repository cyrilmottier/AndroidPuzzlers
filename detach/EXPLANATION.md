# Fragment lifecyle

## Answer

B: onAttach, onCreate, onCreateView, onDestroyView

## More info

Contrary to what we could expect, `FragmentTransaction#detach` is not tight to the `onAttach`/`onDetach` callback but to the creation/destruction of the `Fragment`’s `View`. As a consequence, calling `detach` results in having the `Fragment`’s `View` destroyed and hence `onDestroyView()` called. We’re really facing a naming issue here.
