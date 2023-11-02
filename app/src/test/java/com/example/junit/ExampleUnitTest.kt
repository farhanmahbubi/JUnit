package com.example.junit

import org.junit.Test // Mengimpor anotasi @Test dari JUnit.
import org.junit.Assert.* // Mengimpor metode asser JUnit untuk pengujian.

class ExampleUnitTest {
    @Test // Anotasi @Test digunakan untuk menandai metode pengujian.
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2) // Memeriksa apakah 2 + 2 sama dengan 4.

        // Metode `assertEquals` digunakan untuk membandingkan hasil ekspresi (2 + 2) dengan nilai yang diharapkan (4).
        // Jika hasil dan nilai yang diharapkan sama, tes dianggap berhasil. Jika tidak, tes dianggap gagal.
    }
}
