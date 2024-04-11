import org.gradle.api.DefaultTask
import org.gradle.api.provider.ListProperty
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction

abstract class GreetingTask : DefaultTask() {

    @get:Input
    abstract val who: ListProperty<String>

    @TaskAction
    fun action() {
        logger.warn("Hello ${who.get().joinToString(", and ")}!")
    }
}
