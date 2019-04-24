# Activity Lifecyle

## Answer

D: onCreate, finish, onDestroy

## More info

Android always ensures duality of the callbacks. So whenever an entering/creating method is called you can expect its exiting/destroying counterpart to be called too. As a consequence, you will never get `onCreate` without `onDestroy`.

While the regular `Activity` lifecycle is `onCreate` -> `onStart` -> `onResume`, there's a special fast track when calling `finish` directly in `onCreate`: the system will be immediately calling `onDestroy` without any of the rest of the `Activity` lifecycle executing.

## Misc.

This has been the case for at least Cupcake…
