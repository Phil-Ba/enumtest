package at.bayava.entity

import java.util.*
import javax.persistence.*

@Entity
@Table(name = "Test")
class Test(
    @Enumerated(EnumType.STRING)
    val test: TestEnum,
//    val day: DayOfWeek,
) {
    @Id
    val uuid: UUID = UUID.randomUUID()
}
