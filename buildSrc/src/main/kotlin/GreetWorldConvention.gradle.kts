tasks {
    withType<GreetingTask> {
        who.add(provider { "World" })
    }
}
