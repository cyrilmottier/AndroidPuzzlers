# Padding precedence

## Answer

D: start=11 top=5 end=7 bottom=5

## More info

Android offers a bunch of padding-related XML attributes. And there is obviously a precedence table for them. This order of precedence actually depends on whether the app supports RTL or not. In our case it does so the order if (from the lowest precedence to the highest one):

 1. background `Drawable` padding
 2. `paddingLeft` / `paddingTop` / `paddingRight` / `paddingBottom`
 3. `paddingHorizontal` / `paddingVertical`
 4. `padding`
 5. `paddingStart` / `paddingEnd`

When `android:supportsRtl="false"`, the order table is as follows:

 1. background `Drawable` padding
 2. `paddingStart` / `paddingEnd`
 3. `paddingLeft` / `paddingTop` / `paddingRight` / `paddingBottom`
 4. `paddingHorizontal` / `paddingVertical`
 5. `padding`

## Misc

  - `android:paddingHorizontal` and `android:paddingVertical` have been introduced in API 26 and are backported thanks to AAPT2 (v2.16) to `android:paddingLeft` and `android:paddingRight`. You can take a look at https://github.com/aosp-mirror/platform_frameworks_base/blob/6bebb8418ceecf44d2af40033870f3aabacfe36e/tools/aapt2/cmd/Link.cpp#L369-L420
