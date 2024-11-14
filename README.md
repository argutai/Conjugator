# Spanish Verb Conjugator

I’m currently developing this REST API to practice functional programming and Spring Boot and as a learning device to study Spanish. This can be used as a REST API or as a microservice connected to another frontend microservice.

## How to use

Start REST API with:

```bash
mvn spring-boot:run
```

Send a request by creating a request.json and pinging API:

```json
{
    "verb": "ir",
    "tense": "imperfect",
    "mood": "indicative",
    "aspect": "simple",
    "form": "1s",
}
```

```bash
curl -X POST http://localhost:8080/conjugate -H "Content-Type: application/json" -d @request.json
```

This will return payload of:

```json
{
"conjugatedVerb": "iba"
}
```

## Language Logic

Each verb can be expressed in 6 tenses (present, preterite, imperfect, future, near future, conditional), across 3 different moods (indicative, subjunctive, imperative), across 4 aspects (simple, continuous, perfect, perfect continuous), for 6 forms (1s, 2s, 3s, 1p, 2p, 3p). This totals 36 expressions.

The perfect is considered both a tense and an aspect, but due to its reliance on an auxiliary verb and its use across most tenses, I have chosen to organise it here as an aspect.

Constraints:

- The preterite is not generally used in the perfect, where it is substituted for the pluperfect progressive (combination of imperfect with perfect continuous) or the imperfect progressive
- The subjunctive does not exist in the preterite, near future, or conditional
- The Indicative mood exists only in simple present, is split by affirmative and negative, and does not exist in the first person

|  | Simple | Continuous / Progressive | Perfect | Perfect Continuous / Progressive |
| --- | --- | --- | --- | --- |
| Present | hablo | estoy hablando | he hablado | he estado hablando |
| Preterite | hablé | estuve hablando | - | - |
| Imperfect | hablaba | estaba hablando | había hablado | había estado hablando |
| Future | hablaré | estaré hablando | habré hablado | habré estado hablando |
| Near Future | voy a hablar | voy a estar hablando  | voy a haber hablado | voy a haber estado hablando |
| Conditional | hablaría | estaría hablando | hubiera hablado | hubiera estado hablando |
| Present Subjunctive | hable | esté hablando | haya hablado | haya estado hablando |
| Imperfect Subjunctive | hablara / hablase | estuviera hablando / hablase | hubiera hablado | hubiera estado hablando |
| Future Subjunctive | hablare | estuviere hablando | hubiere hablado | hubiere estado hablando |
| Affirmative Imperative | (not for 1st person) | - | - | - |
| Negative Imperative | (not for 1st person) | - | - | - |

## Application logic

Receive request JSON

- tense defaults present
- mood defaults indicative
- aspect defaults simple
- form must be defined

- If combination not possible, send ‘combination invalid’
- If code not complete for one option, send ‘tense not supported’

Check if simple or non-simple aspect:

for non-simple:

- the pronoun is always at the beginning, except for in the near future and the affirmative imperative
- if irregular, return
- conjugate auxiliary verbs and add gerund or participle
- find auxiliary verb(s)
- return pronoun + auxiliary verb(s) + gerund or participle

for the simple:

- check if reflexive, store pronoun
- check if irregular, return
- check if stem changing, store stem in var
- find get regular ending, store in var
- return pronoun + stem + ending