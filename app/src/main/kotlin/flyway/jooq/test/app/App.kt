/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package flyway.jooq.test.app

import flyway.jooq.db.gen.Tables
import flyway.jooq.test.utilities.StringUtils

fun main() {
    println(Tables.CUSTOMER)

    val tokens = StringUtils.split(MessageUtils.getMessage())
    println(StringUtils.join(tokens))
}
