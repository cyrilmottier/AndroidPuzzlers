# LinearLayout weight

## Answer

A: LL: 400px, TV1: 267px, TV2: 133px

## More info

LinearLayout uses the following formula to compute children width: 

```
finalWidth = computedWidth + delta * weight / weightSum
```

So we have `delta` defined as `400 - 500 = -100`. `weightSum` being `3`, TV1 width will be `300 - 100 * 1/3 = 267` and TV2 width will be `200 - 100 * 2/3 = 133`
