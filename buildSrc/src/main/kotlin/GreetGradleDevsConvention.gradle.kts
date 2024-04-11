tasks {
    withType<GreetingTask> {
        who.add(provider { "Gradle Devs" })
    }
}
