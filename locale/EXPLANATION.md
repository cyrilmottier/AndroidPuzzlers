# Locale resolution

## Answer

C: [en\_US,fr\_FR,es\_ES], en\_US, Bonjour monde !

## Explanations

The system normally goes through the list of user-defined locale settings in order to do locale resolution. So user’s settings set to `[de_DE,fr_FR,es_ES]`, we will look at values in that order:

  1. `de_DE`, `de` and children of `de` => No match
  2. `fr_FR`, `fr` and children of `fr` => No match because the system doesn't know default values contains French translations.
  3. `es_ES`, `es` and children of `es` => `values-es` matches 

We could expect the same output when having `[en_US,fr_FR,es_ES]` but that's not the case because the system will always consider an app as handling English if English is in the user's settings. In other words, we get:

  1. `en_US`, `en` and children of `en` => We have a matching but because there's no `values-en` or `values-en-XX`, the system will use `values` hence displaying French in this case.

## Misc

If you want more exemples, here are other combinations:

  - [it\_IT,fr\_FR,es\_ES] / es_ES / ¡Hola mundo!
  - [it\_IT,fr\_FR,es\_ES,en\_US] / es_ES / ¡Hola mundo!
  - [it\_IT,en\_US,fr\_FR,es\_ES] / en_US / Bonjour monde !
