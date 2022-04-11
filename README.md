# spockito-issue-10

Running the `tests` task with any --tests filter will always run the Spockito Unroll test whereas the other tests are
ignored successfully.

```shell
./gradlew test --tests *NoSuchTest*
```
