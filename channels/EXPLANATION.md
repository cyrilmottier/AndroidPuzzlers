# Notification channels

## Answer

D: Another name, 3, 0xffff0000

## More info

There are two non-natural behaviors in this app:

  1. `NotificationManager`'s `deleteNotificationChannel(String)` doesn't really delete channels. It rather "hide" them. Indeed, if you create a channel with the same ID, the deleted channel will-deleted with all of the same settings it had before it was deleted.
  2. Modification of a channel is only for some specific parts and only in certain circumstances:
    - Name & description can always be modified
    - Importance can only be modified if 1) the new importance is lower than the current value and 2) the use has not altered any setting on this channel
    - Group can only be modified if the channel has no group yet
    - Other fields are never ever modified

## Misc

Although counter-intuitive, this behavior is here to prevent abuse with notifications channels. In general, choose you channels wisely and always try to limit the number of modification to a minimum. If you do so, consider new IDs and make sure to never ever reuse the old ones.

