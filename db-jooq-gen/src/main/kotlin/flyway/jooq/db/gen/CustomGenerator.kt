package flyway.jooq.db.gen

import org.jooq.codegen.GeneratorStrategy
import org.jooq.codegen.JavaGenerator
import org.jooq.codegen.JavaWriter
import org.jooq.meta.Definition

class CustomGenerator : JavaGenerator() {

    override fun printClassAnnotations(out: JavaWriter, definition: Definition, mode: GeneratorStrategy.Mode) {
        super.printClassAnnotations(out, definition, mode)
        if (mode == GeneratorStrategy.Mode.DAO) out.println("@%s", out.ref("javax.inject.Singleton"))
    }
}
