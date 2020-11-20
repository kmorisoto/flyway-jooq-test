package flyway.jooq.db.gen

import org.jooq.codegen.DefaultGeneratorStrategy
import org.jooq.codegen.GeneratorStrategy
import org.jooq.meta.Definition

open class CustomNamingGeneratorStrategy : DefaultGeneratorStrategy() {

    override fun getJavaClassName(definition: Definition, mode: GeneratorStrategy.Mode): String {

        val name = super.getJavaClassName(definition, mode)

        return when (mode) {
            GeneratorStrategy.Mode.POJO -> "${name}VO"
            GeneratorStrategy.Mode.DEFAULT -> "${name}Table"
            else -> name
        }
    }
}
