import com.intellij.psi.PsiElement
import com.spbpu.mppconverter.kootstrap.PSICreator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class ExpectClassExtractorTest {
    
    private fun assertPsi(expectedPsi: PsiElement, actualPsi: PsiElement) {
        assertEquals(expectedPsi.text.trim(), actualPsi.text.trim())
    }

    private val psiCreator = PSICreator()

    @Test
    fun simpleClassTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleClass/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleClass/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleDataClassTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleDataClass/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleDataClass/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleEnumClassTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleEnumClass/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleEnumClass/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleClassWithPropertiesTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleClassWithProperties/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleClassWithProperties/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleClassWithConstructorTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleClassWithConstructor/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleClassWithConstructor/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleClassWithSecondaryConstructorTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleClassWithSecondaryConstructor/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleClassWithSecondaryConstructor/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleClassWithNestedClass() {
        val psi = psiCreator.getPSIForFile("$res/simpleClassWithNestedClass/simpleClass.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleClassWithNestedClass/simpleClassExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }
}