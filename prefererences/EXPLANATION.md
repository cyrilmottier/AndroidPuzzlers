# Preferences read/write

## Answer

A: Go to heaven!

## More info

`SharedPreferences` `apply()` writes info on disk asynchronously but the system always assures that reads are always done returning the current value in memory (i.e. the latest value applied). So answer D is not an option.

The system also assures that SharedPreferences are always saved regardless of the process lifecycle. For instance, if the process is killed, the system will first ensure in-memory data is written on disk.

Finally, `SharedPreferences` accepts "null" as a value but always consider null values as inexistant. Hence, if a value is `null`, it will returns the provided default if any.
