tasks {
    register<GreetingTask>("sayHello") {
        group = "reproducer"
        description = "Says hello"
        who.add(provider { "Myself" })
    }
}
