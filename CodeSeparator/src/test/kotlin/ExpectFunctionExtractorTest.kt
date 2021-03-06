import com.intellij.psi.PsiElement
import com.spbpu.mppconverter.kootstrap.PSICreator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

const val res = "src/test/resources"

class ExpectFunctionExtractorTest {
    
    private fun assertPsi(expectedPsi: PsiElement, actualPsi: PsiElement) {
        assertEquals(expectedPsi.text.trim(), actualPsi.text.trim())
    }

    private val psiCreator = PSICreator()

    @Test
    fun simpleFunctionTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleFunction/simpleFunction.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleFunction/simpleFunctionExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleFunctionWithReturnTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleFunctionWithReturn/simpleFunction.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleFunctionWithReturn/simpleFunctionExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleFunctionWithPrivateModifierTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleFunctionWithPrivateModifier/simpleFunction.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleFunctionWithPrivateModifier/simpleFunctionExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleFunctionWithAccessModifierTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleFunctionWithAccessModifier/simpleFunction.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleFunctionWithAccessModifier/simpleFunctionExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }

    @Test
    fun simpleFunctionWithParametersTest() {
        val psi = psiCreator.getPSIForFile("$res/simpleFunctionWithParameters/simpleFunction.kt")
        val expectPsi = psiCreator.getPSIForFile("$res/simpleFunctionWithParameters/simpleFunctionExpect.kt")

        assertPsi(expectPsi, psi.getExpect())
    }
}