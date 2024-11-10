import org.junit.Test;
import testIdentifier.Identifier;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IdentifierTest {
    private final Identifier identifier = new Identifier();

    @Test
    public void caracteresEspeciaisInvalidos() {
        assertFalse( "Identificadores com caracteres especiais devem ser inválidos", identifier.validateIdentifier("te.ste"));
    }

    @Test
    public void identificadorVazio() {
        assertFalse("Identificador vazio deve ser inválido", identifier.validateIdentifier(""));
    }

    @Test
    public void minimoUmCaracteresInvalido() {
        assertTrue( "Identificadores com no mínimo de 1 caractere devem ser válidos", identifier.validateIdentifier("y"));
    }

    @Test
    public void maximoSeisCaracteresValido() {
        assertTrue( "Identificadores com até 6 caracteres devem ser válidos", identifier.validateIdentifier("yasmin"));
    }

    @Test
    public void maximoSeisCaracteresInvalido() {
        assertFalse("Identificadores com mais de 6 caracteres devem ser inválidos", identifier.validateIdentifier("alskndalksndksa"));
    }

    @Test
    public void primeiroCaractereNaoENumeroInvalido() {
        assertFalse("O primeiro caractere não pode ser um número, logo o identificador deve ser inválido", identifier.validateIdentifier("9an"));
    }
}
